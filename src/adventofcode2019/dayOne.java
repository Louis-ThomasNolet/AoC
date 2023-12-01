package adventofcode2019;

import java.nio.file.Files;
import java.nio.file.Paths;

public class dayOne {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\louis\\Documents\\Cegep\\3e session\\Programmation Objet II\\Workspace\\adventofcode2019\\src\\adventofcode2019\\puzzle_input_day_one.txt";
		
		try {
			var lines = Files.readAllLines(Paths.get(filePath));
			
			int total = 0;
			for(String line : lines) {
				System.out.println("line : " + line);
				
		
				for(int i = 0; true; i++) {
					System.out.println("New Line : " + line);
					if(line.startsWith("one")) {//check if number text ex: "one"
						break;
					}
					else if(line.startsWith("two")) {
						break;
					}
					else if(line.startsWith("three")) {
						break;
					}
					else if(line.startsWith("four")) {
						break;
					}
					else if(line.startsWith("five")) {
						break;
					}
					else if(line.startsWith("six")) {
						break;
					}
					else if(line.startsWith("seven")) {
						break;
					}
					else if(line.startsWith("eight")) {
						break;
					}
					else if(line.startsWith("nine")) {
						break;
					}
					else if(Character.isDigit(line.toCharArray()[0])) {
						break;
					}
					String newLine = line.substring(1);
					line = newLine;
				}
				
				for(int i = 0; true; i++) {
					System.out.println("New Line : " + line);
					if(line.endsWith("one")) {//check if number text ex: "one"
						break;
					}
					else if(line.endsWith("two")) {
						break;
					}
					else if(line.endsWith("three")) {
						break;
					}
					else if(line.endsWith("four")) {
						break;
					}
					else if(line.endsWith("five")) {
						break;
					}
					else if(line.endsWith("six")) {
						break;
					}
					else if(line.endsWith("seven")) {
						break;
					}
					else if(line.endsWith("eight")) {
						break;
					}
					else if(line.endsWith("nine")) {
						break;
					}
					else if(Character.isDigit(line.toCharArray()[line.length() - 1])) {
						break;
					}
					String newLine = line.substring(0, line.length() - 1);
					line = newLine;
				}

				
				int[] digits = new int[2];

				String newNumber = "0";
		
				if(line.startsWith("one")) {//check if number text ex: "one"
					digits[0] = 1;
				}
				else if(line.startsWith("two")) {
					digits[0] = 2;
				}
				else if(line.startsWith("three")) {
					digits[0] = 3;
				}
				else if(line.startsWith("four")) {
					digits[0] = 4;
				}
				else if(line.startsWith("five")) {
					digits[0] = 5;
				}
				else if(line.startsWith("six")) {
					digits[0] = 6;
				}
				else if(line.startsWith("seven")) {
					digits[0] = 7;
				}
				else if(line.startsWith("eight")) {
					digits[0] = 8;
				}
				else if(line.startsWith("nine")) {
					digits[0] = 9;
				}
				else {
					digits[0] = Integer.parseInt(line.valueOf(line.toCharArray()[0]));
				}
				
				if(line.endsWith("one")) {
					digits[1] = 1;
				}
				else if(line.endsWith("two")) {
					digits[1] = 2;
				}
				else if(line.endsWith("three")) {
					digits[1]  = 3;
				}
				else if(line.endsWith("four")) {
					digits[1]  = 4;
				}
				else if(line.endsWith("five")) {
					digits[1]  = 5;
				}
				else if(line.endsWith("six")) {
					digits[1]  = 6;
				}
				else if(line.endsWith("seven")) {
					digits[1]  = 7;
				}
				else if(line.endsWith("eight")) {
					digits[1]  = 8;
				}
				else if(line.endsWith("nine")) {
					digits[1]  = 9;
				}
				else {
					digits[1] = Integer.parseInt(line.valueOf(line.toCharArray()[line.length() - 1]));
				}
				
				newNumber = "" + digits[0] + digits[1];
				System.out.println("Digit[0] : " + digits[0]);
				System.out.println("Digit[nbDigit - 1] : " + digits[1]);
				
				System.out.println("newNumber : " + newNumber + "\n");
				int number = Integer.parseInt(newNumber);
				total += number;
			}
			System.out.println(total);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
