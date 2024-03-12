package stud.kea.dk.projekt3_gruppe_4.model;


public class ContactData {
    int id;
    String firstName;
    String lastName;
    String studentMail;
    String githubmail;

    public ContactData(int id, String firstName, String lastName, String studentMail, String githubmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentMail = studentMail;
        this.githubmail = githubmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public String getGithubmail() {
        return githubmail;
    }

    public void setGithubmail(String githubmail) {
        this.githubmail = githubmail;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentMail='" + studentMail + '\'' +
                ", githubmail='" + githubmail + '\'' +
                '}';
    }
}
