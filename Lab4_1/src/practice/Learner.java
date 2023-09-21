package practice;

public abstract class Learner {
    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private String status;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.name = age;
    }

    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
