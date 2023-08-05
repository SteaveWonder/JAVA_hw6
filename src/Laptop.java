import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private List<Brand> brands;
    private String model;
    private float diagonal;
    private String screenResolution;
    private boolean dvdRom;
    private int hardDisk;
    private String RAM;
    private String operatingSystem;
    private String color;
    public Laptop() {
    }
    public Laptop(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
                  String RAM, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.RAM = RAM;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }
    public String getModel() {return model;}
    public float getDiagonal() {return diagonal;}
    public String getScreenResolution() {return screenResolution;}
    public boolean isDvdRom() {return dvdRom;}
    public int getHardDisk() {return hardDisk;}
    public String getRAM() {return RAM;}
    public String getOperatingSystem() {return operatingSystem;}
    public String getColor() {return color;}
    public void addBrand(Brand brand) {
        brands.add(brand);
    }
    public List<Laptop> filter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Приветствую! Укажите какие параметры вам нужны." +
                "\nУкажите размер жёсткого диска в Гб\nВ наличии : 500,1000,2000,3000,4000");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВ наличии : 4, 8, 16 ");
        String enterOperativeMemory = scan.nextLine();
        System.out.println("Укажите операционную систему\nВ наличии : Linux, IOS, Windows");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВ наличии : black, white");
        String enterColor = scan.nextLine();

        List<Laptop> listLaptop = new ArrayList<>();
        for (Laptop tempLaptop : laptop) {
            if (intParseEnterHardDisk == tempLaptop.hardDisk) {
                if (enterOperativeMemory.equals(tempLaptop.RAM)) {
                    if (enterOperatingSystem.equals(tempLaptop.operatingSystem)) {
                        if (enterColor.equals(tempLaptop.color)) {
                            listLaptop.add(tempLaptop);
                        }
                    }
                }
            }
        }
        return listLaptop;
    }

    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Приветствую, Укажите номер или номера комплектации ноутбуков," +
                "\n1. Size hard disk\n2. Size RAM memory\n3. Operating system\n4. Color");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if(1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВ наличии : 500,1000,2000,3000,4000");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Laptop tempLaptop : laptop) {
                    if (intParseEnterHardDisk != tempLaptop.hardDisk){
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(2 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите количество оперативной памяти в Гб\nВ наличии : 4, 8, 16 ");
                String enterOperativeMemory = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperativeMemory.equals(tempLaptop.RAM)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(3 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите операционную систему\nВ наличии : Linux, IOS, Windows");
                String enterOperatingSystem = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterOperatingSystem.equals(tempLaptop.operatingSystem) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if(4 == Character.getNumericValue(userRequest.charAt(i))){
                System.out.println("Укажите цвет ноутбука\nВ наличии : Black, White");
                String enterColor = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((enterColor.equals(tempLaptop.color)) == false) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        return listLaptop;
    }

    @Override
    public String toString() {
        return "\nLaptop  ->  " + model + "\nbrands = " + brands + ",\ndiagonal = " + diagonal + ",\nscreenResolution = "
                + screenResolution
                + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + hardDisk + ",\nRAM = " + RAM
                + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }

}
