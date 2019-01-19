package pl.mavenproject2;

public class WiecznyStudent extends Student{
    @Override
    String getName() {
        return null;

    }



    public static void main(String[] args) {
        Student Heniu = new Student() {
            @Override
            String getName() {
                return "Heniu";
            }

        };
        System.out.println(Heniu.getName());
    }
}
