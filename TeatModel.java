import java.util.Random;

public class TeatModel {

    private Random rand = new Random();

    // ตรวจสอบจำนวนเต้าของวัว
    public boolean hasFourTeats(Cow cow) {
        return cow.getNumTeats() == 4;
    }

    public boolean hasThreeTeats(Cow cow) {
        return cow.getNumTeats() == 3;
    }

    // ปรับจำนวนเต้าของวัว
    public String adjustTeats(Cow cow) {
        int originalTeats = cow.getNumTeats();
        String message = "";

        if (originalTeats == 4 && rand.nextDouble() < 0.05) { /*มีโอกาสเปลี่ยนเป็น3เต้า 5% */
            cow.setNumTeats(originalTeats - 1);
            message = "Number of teats decreased from 4 to 3.";
        } else if (originalTeats == 3 && rand.nextDouble() < 0.2) { /*มีโอกาสเปลี่ยนเป็น4 เต้า 20% */
            cow.setNumTeats(originalTeats + 1);
            message = "Number of teats increased from 3 to 4.";
        } else {
            message = "Number of teats remained unchanged.";
        }

        return message;
    }
}
