package componentes.personas;

import java.util.Date;

public class Condecorados extends Persona{

    private String lastName;
    private String firstName;
    private String officerOrEnlistedIndividual;
    private String typeOfActionCommendedByOriginator;
    private String nameofApprovedAward;

    public Condecorados(String lastName, String firstName, String officerOrEnlistedIndividual, String typeOfActionCommendedByOriginator, String nameofApprovedAward) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officerOrEnlistedIndividual = officerOrEnlistedIndividual;
        this.typeOfActionCommendedByOriginator = typeOfActionCommendedByOriginator;
        this.nameofApprovedAward = nameofApprovedAward;
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

    public String getOfficerorenlistedindividual() {
        return typeOfActionCommendedByOriginator;
    }

    public void setOfficerorenlistedindividual(String officerorenlistedindividual) {
        this.typeOfActionCommendedByOriginator = officerorenlistedindividual;
    }

    public String getTypeOfActionCommendedByOriginator() {
        return typeOfActionCommendedByOriginator;
    }

    public void setTypeOfActionCommendedByOriginator(String typeOfActionCommendedByOriginator) {
        this.typeOfActionCommendedByOriginator = typeOfActionCommendedByOriginator;
    }

    public String getNameofapprovedaward() {
        return nameofApprovedAward;
    }

    public void setNameofapprovedaward(String nameofapprovedaward) {
        this.nameofApprovedAward = nameofapprovedaward;
    }

    @Override
    public String toString() {
        return "Condecorados{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", recommendedAward='" + typeOfActionCommendedByOriginator + '\'' +
                ", typeOfActionCommendedByOriginator='" + typeOfActionCommendedByOriginator + '\'' +
                ", dateAwardApproved=" + nameofApprovedAward +
                '}';
    }
}
