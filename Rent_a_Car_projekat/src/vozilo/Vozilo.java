package vozilo;

/*Program simulira rentakar firmu 
 *objekti su dva glavna tipa vozila, benzinci i dizelasi
 *svako vozilo poseduje karakteristike: prosecnu brzinu, potrosnju, tip goriva,snagu motora i model
 *korisnik usluga rentakar-a moze da iskristi par metoda za laksi odabir vozila kao sto su:
 *uporedjivanje vozila po snazi, uporedjivanje po prosecnoj brzini i potrosnji, pun ispis informacija
 *o izabranom vozilu
 *takodje je omogucen unos zeljene kilometraze koje korisnik zeli da predje, a program mu
 *izbacuje koliko ce mu litara goriva biti potrebno */

public class Vozilo {
	
	protected String model;
	protected double prosecnaBrzina; //izrazena u km/h
	protected double potrosnja;  //prosecna,izrazena u l/100km
	protected String gorivo;  //tip goriva:benzin ili dizel
	protected int snaga;   //izrazena u kW
	
	//konstruktori vozila
	
	protected Vozilo(String model, double prosecnaBrzina, double potrosnja, int snaga){
		this.model=model;
		this.prosecnaBrzina=prosecnaBrzina;
		this.potrosnja=potrosnja;
		this.snaga=snaga;
		this.gorivo="nedefinisano";
	}
	
	protected Vozilo(String model, double prosecnaBrzina, double potrosnja,int snaga,String gorivo){
		this.model=model;
		this.prosecnaBrzina=prosecnaBrzina;
		this.potrosnja=potrosnja;
		this.snaga=snaga;
		this.gorivo=gorivo;
	}
	protected Vozilo(){
		this.model="nepoznat";
		this.prosecnaBrzina=0;
		this.potrosnja=0;
		this.gorivo="nedefinisano";
		this.snaga=0;
	}
	
	//setter i getter metode
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public double getProsecnaBrzina() {
		return prosecnaBrzina;
	}

	public void setProsecnaBrzina(int prosecnaBrzina) {
		this.prosecnaBrzina = prosecnaBrzina;
	}

	public double getPotrosnja() {
		return potrosnja;
	}

	public void setPotrosnja(int potrosnja) {
		this.potrosnja = potrosnja;
	}

	public String getGorivo() {
		return gorivo;
	}

	public void setGorivo(String gorivo) {
		this.gorivo = gorivo;
	}
	
	//g=broj kilometara za prelazenje, metoda vraca potrebno goriva za taj put
	/*u potklasama se nalaze metode pod istim imenom koje*/
	/*stampaju i vrstu goriva da korisnik ne bi sipao pogresno*/
	
	public double potrebnoGoriva(double g){ 
		return g/100*potrosnja;                                             
	}
	public double potrebnoVremena(double k){
		return k*60/this.prosecnaBrzina;
	}
	
	public void uporediSnagu(Vozilo vozilo2){
		if (this.snaga > vozilo2.snaga){
			System.out.println("Возило " + this.model + " је снажније од возила " + vozilo2.model + ".\n");
		}
		else if (this.snaga < vozilo2.snaga){
			System.out.println("Возило " + this.model + " је слабије од возила " + vozilo2.model + ".\n");
		}
		else 
			System.out.println("Возила су исте снаге.\n");
		
	}
	
	public void infoVozilo(){
		System.out.println("Назив модела: " + this.model);
		System.out.println("Просечна брзина возила износи " + this.prosecnaBrzina + "km/h");
		System.out.println("Потрошња возила износи " + this.potrosnja + "l/100km");
		System.out.println("Снага возила износи " + this.snaga + "kW");
		System.out.println("Ово возило иде на " + this.gorivo + "\n");
	}
}
