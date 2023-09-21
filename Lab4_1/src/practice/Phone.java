package practice;

public class Phone {

    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "; номер " + number);
    }

    public void sendMessage(String[] numbers){
        System.out.println("Send message to:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public float getWeight() {
        return this.weight;
    }
}
