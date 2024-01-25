/**
 * A person class that can move and print its information
 */
public class Person {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    /**
     * Constructor for objects of class Person
     * 
     * @param   name Name of the person.
     * @param   score Score of the person.
     * @param   positionX Position of the person on the x axis.
     * @param   positionY Position of the person on the y axis.
     */
    public Person() {
        name = "undefined";
        score = 0;
        positionX = 0;
        positionY = 0;
    }

    /**
     * Change the position of the person
     * @param   horizantalDistance The distance to move horizontally
     * @param   verticalDistance The distance to move vertically
     */
    public void move(int horizantalDistance, int verticalDistance) {
        positionX = positionX + horizantalDistance;
        positionY = positionY + verticalDistance;
        score = score + 5;
    }

    /**
     * Get the name of the person
     * @return  the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the person
     * @param   name The name of the person 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the score of the person
     * @param   score The score of the person 
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Print the information of the person
     */
    public void showInfo() {
        System.out.println("My postion is at x: " + positionX +
                " and y: " + positionY + " score: " + score);
    }
}
