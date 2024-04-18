package biblio.metier;


public class Membre {
   private int id_memeber;
   private String First_name;
   private String Last_name;
   private int Num_tele;
   private String email;


   public Membre(int id_memeber, String first_name, String last_name, int num_tele, String email) {
	super();
	First_name = first_name;
	Last_name = last_name;
	Num_tele = num_tele;
	this.email = email;
	}

	public String getFirst_name() {
	return First_name;
	}

	public void setFirst_name(String first_name) {
	First_name = first_name;
	}

	public String getLast_name() {
	return Last_name;
	}

	public void setLast_name(String last_name) {
	Last_name = last_name;
	}

	public int getNum_tele() {
	return Num_tele;
	}

	public void setNum_tele(int num_tele) {
	Num_tele = num_tele;
	}

	public String getEmail() {
	return email;
	}

	public void setEmail(String email) {
	this.email = email;
	}

}



