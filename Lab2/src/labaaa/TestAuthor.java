package labaaa;

public class TestAuthor extends Author {
   public TestAuthor(String person_name, String person_email, char person_gender) {
      super(person_name, person_email, person_gender);

      System.out.println("TESTING get-Methods:\n" + this.getName() + " " + this.getEmail() + " " + this.getGender());
      this.setEmail("NEW EMAIL HAS BEEN SET");
      System.out.println(this.toString());
   }


}
