package IMC;

public class Person {
    float weight;
    float height;

    // public Person(float weight, float height) {
    //     // this.weight = weight;
    //     // this.height = height;
    //     System.out.println("Person created");
    // }

    public float calculateIMC() {
        float imc = weight / (height * height);
        return imc;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }
}
