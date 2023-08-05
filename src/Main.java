import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop HP_EliteBook_843 = new Laptop("HP_EliteBook_843", 16, "4k",
                true, 1000, "16", "Windows", "black");
        Brand brandHp = new Brand("HP", "U.S.A.", "AmericaLanguage");
        HP_EliteBook_843.addBrand(brandHp);
        Laptop HP_Chromebook_Laptop = new Laptop("HP_Chromebook_Laptop", 14, "FullHD",
                true, 1000, "8", "Windows", "white");
        HP_Chromebook_Laptop.addBrand(brandHp);
        Laptop Samsung_GalaxyUltra = new Laptop("Samsung_GalaxyUltra", 18, "FullHD",
                true, 500, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        Samsung_GalaxyUltra.addBrand(brandSamsung);
        Laptop Samsung_GalaxyPRO = new Laptop("Samsung_GalaxyPRO", 16, "4k",
                false, 1000, "16", "Linux", "black");
        Samsung_GalaxyPRO.addBrand(brandSamsung);
        Laptop Lenovo_Legion5 = new Laptop("Lenovo_Legion5", 16, "FullHD",
                true, 2000, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        Lenovo_Legion5.addBrand(brandLenovo);
        Laptop MacBook_14pro = new Laptop("MacBook_14pro", 17, "4k",
                false, 3000, "8", "IOS", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        MacBook_14pro.addBrand(brandMacbook);
        Laptop Asus_VivobookS = new Laptop("Asus_VivobookS", 17, "FullHD",
                true, 500, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        Asus_VivobookS.addBrand(brandAsus);
        Laptop Acer_Aspire3 = new Laptop("Acer_Aspire3", 19, "FullHD",
                true, 1000, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        Acer_Aspire3.addBrand(brandAcer);
        Laptop Acer_Nitro18 = new Laptop("Acer_Nitro18" ,18, "4k",
                false, 4000, "16", "Windows", "black");
        Acer_Nitro18.addBrand(brandAcer);
        Laptop Acer_Spin = new Laptop("Acer_Spin", 16, "FullHD",
                true, 1000, "8", "Windows", "black");
        Acer_Spin.addBrand(brandAcer);

        Set <Laptop> laptop = new HashSet<>();
        laptop.add(HP_EliteBook_843);
        laptop.add(HP_Chromebook_Laptop);
        laptop.add(Samsung_GalaxyUltra);
        laptop.add(Samsung_GalaxyPRO);
        laptop.add(Lenovo_Legion5);
        laptop.add(MacBook_14pro);
        laptop.add(Asus_VivobookS);
        laptop.add(Acer_Aspire3);
        laptop.add(Acer_Nitro18);
        laptop.add(Acer_Spin);

        Laptop FilterLaptop = new Laptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}