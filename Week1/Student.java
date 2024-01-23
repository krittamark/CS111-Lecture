public class Student {
    private String name = "";

    public float GPA1 = 0.0F;
    public Double GPA2 = 0.0;

    private String id = "6600000000";

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Jiafei");
        System.out.println("ID:\t"  + s1.getId());
        System.out.println("Name:\t"  + s1.getName());
        System.out.println("Grade:\t" + s1.getGrade());

        Student s2 = new Student();
        s2.setName("Krittamark");
        s2.setGrade(5.0F);

        //System.out.print("\n" + s2.getName() + " " + s2.getGrade().floatValue());
        System.out.printf("\nHello %.50f", s2.getGrade());
    }

    public String getId() {
        return id;
    }
    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setGrade(float grade) {
        GPA1 = grade;
    }

    public float getGrade() {
        return GPA1;
    }

}

class Mark {
    public static void main(String args[]) {

    }
}