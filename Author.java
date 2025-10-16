public class Author {
    public Author(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    private String name;
    private Date dob;

    //returns name
    public String getName() {
        return name;
    }
    //returns Date of Birth
    public Date getDob() {
        return dob;
    }
    // precondition: 
    //postcondition: sets objects name as the input
    public void setName(String name) {
        this.name = name;
    }
    // precondition: 
    //postcondition: sets objects date of birth as the input
    public void setDob(Date dob) {
        this.dob = dob;
    }
}
