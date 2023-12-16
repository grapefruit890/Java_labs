package laba;

public class MyException {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        else {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        MyException demo = new MyException();
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}