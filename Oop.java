class Oop {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String num) {
        name = num;
    }
}

public class InnerOoP {
    public static void main(String[] args) {
        Oop obj = new Oop();
        obj.setAge(12);
        obj.setName("eric");
        System.out.println(obj.getAge() + obj.getName());

    }
    
}