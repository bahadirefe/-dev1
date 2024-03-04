package Odev1;

public class Odev1Test {
    public static void main(String[] args) {
        int[] minutes={391,266,222,300,489,402,388,231,243};
        String[] isimler={"Bahadır","Ali","Sude","Ceren","Furkan","Öykü","Emre","Fatih","Cenk"};
        Odev1 zamanSiralama=new Odev1(isimler,minutes);
        zamanSiralama.siralama();
        zamanSiralama.outputBarChart();
    }
}



