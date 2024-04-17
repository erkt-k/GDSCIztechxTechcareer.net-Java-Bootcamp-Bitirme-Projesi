package newPackage;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//mainde kullanılacak variable'ları ve scanner'ı burada çağırıyorum.

		Scanner scanner = new Scanner(System.in);
		boolean isPerson = true;
		String name, telNum, idNum;

		//Sistemde bulunan araçları kayıt etmek için arrayler.

		Hatchback[] hatchbacks = new Hatchback[5]; 
		Sedan[] sedans = new Sedan[5];
		SUV[] suvs = new SUV[5];


		//SİSTEMDEKİ ARAÇLAR
		// Hatchbacks
        hatchbacks[0] = new Hatchback("Ford", "Fiesta", "Hatchback", "Automatic", 270, "Red", 2, "Gasoline", 200, 0.1);
        hatchbacks[1] = new Hatchback("Honda", "Civic", "Hatchback", "Manual", 300, "Blue", 5, "Gasoline", 180, 0.05);
        hatchbacks[2] = new Hatchback("Toyota", "Yaris", "Hatchback", "Automatic", 286, "Black", 3, "Hybrid", 250, 0.15);
        hatchbacks[3] = new Hatchback("Kia", "Rio", "Hatchback", "Automatic", 250, "White", 1, "Gasoline", 190, 0.08);
        hatchbacks[4] = new Hatchback("Peugeot", "208", "Hatchback", "Manual", 290, "Gray", 4, "Diesel", 220, 0.12);

        // Sedans
        sedans[0] = new Sedan("Toyota", "Corolla", "Sedan", "Automatic", 470, "Silver", 1, "Gasoline", 220, 0.1);
        sedans[1] = new Sedan("Hyundai", "Elantra", "Sedan", "Manual", 428, "Gray", 4, "Gasoline", 190, 0.08);
        sedans[2] = new Sedan("Volkswagen", "Jetta", "Sedan", "Automatic", 510, "White", 3, "Diesel", 240, 0.12);
        sedans[3] = new Sedan("Skoda", "Octavia", "Sedan", "Automatic", 480, "Blue", 2, "Gasoline", 210, 0.09);
        sedans[4] = new Sedan("Nissan", "Sentra", "Sedan", "Manual", 435, "Black", 5, "Gasoline", 180, 0.07);

        // SUVs
        suvs[0] = new SUV("Kia", "Sportage", "SUV", "Automatic", 530, "Black", 2, "Gasoline", 280, 0.1);
        suvs[1] = new SUV("Honda", "CR-V", "SUV", "Automatic", 640, "Blue", 4, "Hybrid", 320, 0.18);
        suvs[2] = new SUV("Ford", "Escape", "SUV", "Automatic", 492, "Gray", 3, "Gasoline", 250, 0.13);
        suvs[3] = new SUV("Peugeot", "3008", "SUV", "Automatic", 520, "White", 1, "Diesel", 270, 0.15);
        suvs[4] = new SUV("Mitsubishi", "Outlander", "SUV", "Automatic", 580, "Red", 4, "Gasoline", 290, 0.12);

		System.out.println("Hoşgeldiniz");
		System.out.println("Lütfen Müşteri Tipini Seçin:" + "\n1. Bireysel Müşteri" + "\n2. Şirket");
		System.out.print("Müşteri Tipi (1/2): ");
		String type = scanner.next();
		
		//Güvenli bir şekilde müşteri tipini öğreniyorum.

		while (!type.equals("1") && !type.equals("2")) {
			System.out.println("Müşteri tipi için 1 ya da 2 yazınız.");
			System.out.print("Müşteri Tipi (1/2): ");
			type = scanner.nextLine();
		}
		
		//scannerın ileride alacağım inputlarda hata vermemesi için koyduğum line.
		scanner.nextLine();

		//Ayrımı yapabilmek ve okunurluk için isPerson bool umu ayarlıyorum.
		if (type.equals("2")) {
			isPerson = false;
		} else {
			isPerson = true;
		}
		
		//Bireylerin sisteme girişi
		if(isPerson) {
			System.out.print("Ad Soyad:");
			name = scanner.nextLine();
			System.out.print("Telefon No:");
			telNum = scanner.nextLine();
			int telNumint = Integer.parseInt(telNum);
			System.out.print("T.C. Kimlik No:");
			idNum = scanner.nextLine();
			int idNumint = Integer.parseInt(idNum);

			Customer newCustomer = new Customer("Bireysel", name, telNumint, idNumint);

		} else { //Şirketlerin sisteme girişi
			System.out.print("Şirket İsmi:");
			name = scanner.nextLine();
			System.out.print("Şirket Telefon No:");
			telNum = scanner.nextLine();
			int telNumint = Integer.parseInt(telNum);
			System.out.print("Vergi No:");
			idNum = scanner.nextLine();
			int idNumint = Integer.parseInt(idNum);

			Customer newCustomer = new Customer("Şirket", name, telNumint, idNumint);
		}

		//Bireysel müşteriler araba seçiyor
		if (isPerson) {
			System.out.println("Lütfen Araba Türü Seçin:\n" 
			+ "	1. Sedan\n"
			+ "	2. Hatchback\n");
			
			String carType = scanner.nextLine();

			if (carType.equals("1")) {
				System.out.println("Sedan Araçlar:");
				for (int i = 0 ; i < sedans.length ; i++) {
					System.out.print((i + 1) + ". ");
					sedans[i].printSedan();
				}
			} else {
				System.out.println("Hatchback Araçlar:");
				for (int i = 0 ; i < hatchbacks.length ; i++) {
					System.out.print("	" + (i+1) + ". ");
					hatchbacks[i].printHatchback();
				}
	
			}

			System.out.println("Lütfen istediğiniz aracı seçin: ");
			int selected = scanner.nextInt();
			scanner.nextLine();
			if (carType.equals("1")) {
				System.out.println("Seçtiğiniz araç:");
				sedans[selected-1].printSedan(); 
			} else {
				System.out.println("Seçtiğiniz araç:");
				hatchbacks[selected-1].printHatchback();
			}
		} else { //Şirketler araba seçiyor
			
			System.out.println("Lütfen Araba Türü Seçin:\n" 
			+ "	1. Sedan\n"
			+ "	2. Hatchback\n"
			+ "	3. SUV\n");

			String carType = scanner.nextLine();

			if (carType.equals("1")) {
				System.out.println("Sedan Araçlar:");
				for (int i = 0 ; i < sedans.length ; i++) {
					System.out.print((i + 1) + ". ");
					sedans[i].printSedan();
				}
			} else if (carType.equals("2")) {
				System.out.println("Hatchback Araçlar:");
				for (int i = 0 ; i < hatchbacks.length ; i++) {
					System.out.print("	" + (i+1) + ". ");
					hatchbacks[i].printHatchback();
				}
			} else {
				System.out.println("SUV Araçlar:");
				for (int i = 0 ; i < suvs.length ; i++) {
					System.out.print("	" + (i+1) + ". ");
					suvs[i].printSUV();
				}
			}
			
			System.out.println("Lütfen istediğiniz aracı seçin: ");
			int selected = scanner.nextInt();
			scanner.nextLine();
			if (carType.equals("1")) {
				System.out.println("Seçtiğiniz araç:");
				sedans[selected-1].printSedan(); 
			} else if (carType.equals("2")) {
				System.out.println("Seçtiğiniz araç:");
				hatchbacks[selected-1].printHatchback();
			} else {
				System.out.println("Seçtiğiniz araç:");
				suvs[selected-1].printSUV();
			}
			
		}
		


		scanner.close(); 
	}
	
	

}
