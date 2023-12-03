package AoC;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DayTwo {
    public static int[] bag = { 12, 13, 14 }; // red, green, blue
    public static String line;

    public static void main(String[] args) {
        String filePath = "C:\\Users\\louis\\Documents\\Cegep\\3e session\\Programmation Objet II\\Workspace\\Aoc\\src\\AoC\\inputs\\puzzle_input_day_two.txt";

        try {
            var lines = Files.readAllLines(Paths.get(filePath));
            int total = 0;
            int powerTotal = 0;
            int id = 1;
            for (String row : lines) {
                int blue = 0;
                int green = 0;
                int red = 0;
                int currentNb;
                int power;
                line = row;
                boolean isGood = true;

                System.out.println(line);
                line = line.replaceAll("\s", "");
                System.out.println(line);
                line = readyLineForNextColor(line);
                line = getColor(line);
                line = readyLineForNextColor(line);
                System.out.println(line);

                int i = 0;
                while (line.length() > 0) {
                    currentNb = getNumber(line);
                    line = getColor(line);
                    System.out.println(line);
                    String color = checkColor(line);

                    if (color == "red" && currentNb > red) {
                        red = currentNb;
                    } else if (color == "green" && currentNb > green) {
                        green = currentNb;
                    } else if (color == "blue" && currentNb > blue) {
                        blue = currentNb;
                    }
                    i++;
                    line = readyLineForNextColor(line);

                    if(red > bag[0] || green > bag[1] || blue > bag[2])
                        isGood = false;
                }

                System.out.println("\n");
                if (isGood) {
                    total += id;
                }
                id++;
                System.out.println("Total: " + total);
                power = blue * red * green;
                powerTotal += power;
                System.out.println("TotalPower: " + powerTotal);
            }

            System.out.println("Final total: " + total);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getNumber(String line) {
        String nbString = "";
        while (Character.isDigit(line.toCharArray()[0])) {
            nbString += line.toCharArray()[0];
            line = line.substring(1);
        }
        return Integer.parseInt(nbString);
    }

    public static String checkColor(String line) {
        if (line.startsWith("red"))
            return "red";
        else if (line.startsWith("blue"))
            return "blue";
        else
            return "green";
    }

    public static String getColor(String line) {
        String newLine = line;
        while (Character.isDigit(line.toCharArray()[0])) {
            newLine = line.substring(1);
            line = newLine;
        }
        return newLine;
    }

    public static String readyLineForNextColor(String line) {
        String newLine = line;
        while ( !line.isEmpty() && !Character.isDigit(line.toCharArray()[0])) {
            newLine = line.substring(1);
            line = newLine;
        }
        return newLine;
    }
}