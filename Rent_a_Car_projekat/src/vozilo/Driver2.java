package vozilo;
import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		
		Vozilo[] vozila={new Vozilo("VW_Golf",90,5,50,"dizel"),new Vozilo("Opel_Astra",100,6,70,"dizel"),
				new Vozilo("BMW_320d",120,9,105,"dizel"),new Vozilo("Citroen_C4",85,8,50,"benzin"),
				new Vozilo("Renault_Megane",95,8.5,65,"benzin")};	
		
		while(true){
			int povratak=1;
			System.out.println("Преглед доступних модела:");
			for(int v=0;v<vozila.length;v++){
				System.out.println(v+1 + "." + vozila[v].model);
			}
			System.out.println("Унесите број за листу опција.");
			Scanner in = new Scanner(System.in);
			int indeks = in.nextInt();
			if(indeks>vozila.length || indeks<1){
				System.out.println("Грешка у уносу.\n"); 
				continue;
			}
			System.out.println("Изабрали сте " + vozila[indeks-1].model + "\n");

				while(povratak!=0){
					System.out.println("Списак опција за " + vozila[indeks-1].model + ":");
					System.out.println("1.Информације о возилу");
					System.out.println("2.Упоредите са другим возилом");
					System.out.println("3.Унесите жељену километражу");
					System.out.println("4.Изнајмите возило\n");
					System.out.println("0.Повратак на почетак");
					int unos1=in.nextInt();
			
			
					switch(unos1){
					case 0: {
						System.out.println("Враћени сте на почетак.\n");
						povratak=0;
						continue;
					}
					case 1:{
						vozila[indeks-1].infoVozilo();
						break;
					}
					case 2:{
						System.out.println("Изаберите возило за упоређивање:");
						for (int i=0;i<vozila.length;i++){
							if(i==indeks-1){
								i++;
							}
							System.out.println(i+1 + "." + vozila[i].model);
						}
						int unos2=in.nextInt();
						if(unos2>0 && unos2-1<vozila.length){
						if (indeks-1!=unos2-1){
							vozila[indeks-1].uporediSnagu(vozila[unos2-1]);
							continue;
						}
						else 
							System.out.println("Покушали сте да упоредите са истим возилом.\n");
						continue;
					}
					else
						System.out.println("Грешка у уносу!\n");
						continue;
						}
					case 3:{
						System.out.println("Унестите број km које планирате да пређете:");
						double kilometraza=in.nextDouble();
						if (vozila[indeks-1].gorivo=="benzin"){
							System.out.println("За " + kilometraza + "km потребно је " + vozila[indeks-1].potrebnoGoriva(kilometraza) + "l бензина.");
							System.out.println("Жељену километражу можете прећи за " + vozila[indeks-1].potrebnoVremena(kilometraza) + "min.\n");
						}
						else{
							System.out.println("За " + kilometraza + "km потребно је " + vozila[indeks-1].potrebnoGoriva(kilometraza) + "l дизела.");
							System.out.println("Жељену километражу можете прећи за " + vozila[indeks-1].potrebnoVremena(kilometraza) + "min.\n");}
						break;
						
					}
					case 4:{
						System.out.println("Успешно сте изнајмили возило!\n");
						povratak=0;
						break;
					}
					default:{
						System.out.println("Грешка у уносу!\n");
						break;
					}
				}
		}
	}
}
}