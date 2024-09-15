import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private AnimalTypeModel animalTypeModel;
    private TeatModel teatModel;
    private View view;
    private CowView cowView;
    private GoatView goatView;

    public Controller(AnimalTypeModel animalTypeModel, TeatModel teatModel, View view, CowView cowView, GoatView goatView) {
        this.animalTypeModel = animalTypeModel;
        this.teatModel = teatModel;
        this.view = view;
        this.cowView = cowView;
        this.goatView = goatView;

        this.view.addSubmitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleIDSubmission();
            }
        });

        this.goatView.addRemoveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRemoveGoat();
            }
        });

        this.cowView.addCloseButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cowView.frame.dispose(); // Close CowView window
            }
        });
    }

    private void handleIDSubmission() {
        String id = view.getAnimalID();
        /*ตรวจสอบรูปแบบID*/
        if (!id.matches("\\d{8}") || id.startsWith("0")) {
            view.setResult("Invalid ID format.");
            return;
        }
        /*ตรวจสอบว่ามีIDในdatabaseไหม*/
        Animal animal = animalTypeModel.getAnimal(id);
        if (animal == null) {
            view.setResult("Animal ID not found.");
            return;
        }
        /*ถ้าเป็นGoatให้เรียกใช้หน้าViewของGoat */
        if (animalTypeModel.isGoat(animal)) {
            goatView.show();
        } else if (animalTypeModel.isCow(animal)) {/*ถ้าเป็นCowให้เช็คจำนวนเต้าและเรียกใช้หน้าViewของCow */
            Cow cow = (Cow) animal;
            String adjustmentMessage = teatModel.adjustTeats(cow);
            if (teatModel.hasFourTeats(cow)) {
                cowView.setMessage("Cow has 4 teats. Milk output:" + cow.milkOutput()+" liters."+ adjustmentMessage);
                cowView.show();
            } else if (teatModel.hasThreeTeats(cow)) {
                cowView.setMessage("Cow has only 3 teats. Cannot Milk. " + adjustmentMessage);
                cowView.show();
            }
        }
    }

    private void handleRemoveGoat() {
        String id = view.getAnimalID();
        if (animalTypeModel.isGoat(animalTypeModel.getAnimal(id))) {
            view.setResult("Goat removed from the machine.");
            goatView.frame.dispose();
        }
    }
}
