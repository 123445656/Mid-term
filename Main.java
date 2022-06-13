import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();




        prodList.add(new Computers("MacBook","Apple",5734,2));
        prodList.add(new Scanners("Fujitsu","lsla",6834,1));
        prodList.add(new Printers("Panasonic","lsla",1654,3));
        prodList.add(new Computers("HP","lsla",7534,4));
        prodList.add(new Scanners("HP","lsla",6634,1));
        prodList.add(new Printers("Lexmark","lsla",7734,3));
        prodList.add(new Computers("Positive","Intel",24550,2));
        prodList.add(new Printers("HP ScanJet","HP",4758,2));
        prodList.add(new Scanners("CanoScan","lsla",8574,2));
        prodList.add(new Printers("Xerox","lsla",1574,4));


        for (Product prod:prodList){
            System.out.println(prod);
        }
    }
}
