public class TenisShoes {
    private String mark;
    private String model;
    private int size;
    private String color;
    private double price;
    private char gender;
    private int age;
    private float height;

    public TenisShoes(String mark, String model, int size, String color, double price, char gender, int age, float height) {
        this.mark = mark;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public String toString() {

        System.out.println("Marca: "+getMark());
        System.out.println("Modelo: "+getModel());
        System.out.println("Color: "+getColor());
        System.out.println("Precio: "+getPrice()+" pesos");
        System.out.println("Genero: "+getGender());
        System.out.println("Edad: "+getAge());
        System.out.println("Altura: "+getHeight()+" metros");

        return"";
    }
}
