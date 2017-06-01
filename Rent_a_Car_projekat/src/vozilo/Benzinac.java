package vozilo;

public class Benzinac extends Vozilo {
	
	protected Benzinac(String model, double prosecnaBrzina, double potrosnja, int snaga){
		super(model,prosecnaBrzina,potrosnja,snaga,"benzin");
	}
	
	protected Benzinac(){
		super("nedefinisan",0,0,0,"benzin");
	}
	
	public void boljiBenzinac(Benzinac benzinac2){
		if(this.prosecnaBrzina > benzinac2.prosecnaBrzina){
			System.out.println("Возило " + this.model + " је боље од возила " + benzinac2.model);
			}
		else if(this.prosecnaBrzina==benzinac2.prosecnaBrzina && this.potrosnja<benzinac2.potrosnja){
			System.out.println("Возило " + this.model + " је боље од возила " + benzinac2.model);
			}
		else{
			System.out.println("Возило " + this.model + " је боље од возила " + benzinac2.model);
			}
	}
	
}
