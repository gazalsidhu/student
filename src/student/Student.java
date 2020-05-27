

package student;

/**
 *This class +++Insert Discription Here+++
 *
 * @author gazal -- may 2020
 */
public class Student {

    /**
     * @param args the command line arguments
     */
  private String name;
    public Student (String name)
    {
        this.name = name;
    }
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
}
