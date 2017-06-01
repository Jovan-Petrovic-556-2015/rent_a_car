package vozilo;

public class Dizelas extends Vozilo {
	
	protected Dizelas(){
		super("nedefinisan",0,0,0,"dizel");
	}
	
	protected Dizelas(String model, double prosecnaBrzina, double potrosnja,int snaga){
		super(model,prosecnaBrzina,potrosnja,snaga,"dizel");
	}
	
	public void boljiDizelas(Dizelas dizelas2){
		if(this.prosecnaBrzina > dizelas2.prosecnaBrzina){
			System.out.println("Возило " + this.model + " је боље од возила " + dizelas2.model);
			}
		else if(this.prosecnaBrzina==dizelas2.prosecnaBrzina && this.potrosnja<dizelas2.potrosnja){
			System.out.println("Возило " + this.model + " је боље од возила " + dizelas2.model);
			}
		else{
			System.out.println("Возило " + this.model + " није боље од возила " + dizelas2.model);
			}
	}
	
}