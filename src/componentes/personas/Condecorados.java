package componentes.personas;

import java.util.Date;

public class Condecorados {
    private String lastName;
    private String firstName;
    private String recommendedAward;
    private String typeOfActionCommendedByOriginator;
    private Date dateAwardApproved;

    public Condecorados(String lastName, String firstName, String recommendedAward, String typeOfActionCommendedByOriginator, Date dateAwardApproved) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.recommendedAward = recommendedAward;
        this.typeOfActionCommendedByOriginator = typeOfActionCommendedByOriginator;
        this.dateAwardApproved = dateAwardApproved;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRecommendedAward() {
        return recommendedAward;
    }

    public void setRecommendedAward(String recommendedAward) {
        this.recommendedAward = recommendedAward;
    }

    public String getTypeOfActionCommendedByOriginator() {
        return typeOfActionCommendedByOriginator;
    }

    public void setTypeOfActionCommendedByOriginator(String typeOfActionCommendedByOriginator) {
        this.typeOfActionCommendedByOriginator = typeOfActionCommendedByOriginator;
    }

    public Date getDateAwardApproved() {
        return dateAwardApproved;
    }

    public void setDateAwardApproved(Date dateAwardApproved) {
        this.dateAwardApproved = dateAwardApproved;
    }

    @Override
    public String toString() {
        return "Condecorados{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", recommendedAward='" + recommendedAward + '\'' +
                ", typeOfActionCommendedByOriginator='" + typeOfActionCommendedByOriginator + '\'' +
                ", dateAwardApproved=" + dateAwardApproved +
                '}';
    }
}
