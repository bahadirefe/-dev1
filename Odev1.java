package Odev1;

public class Odev1 {
    private final String[] isimler;
    private final int[] dakikalar;

    public Odev1(String[]isimler, int[] dakikalar){
        this.isimler =isimler;
        this.dakikalar =dakikalar;
    }

    private String birinciKisi;
    private String ikinciKisi;
    private String ucuncuKisi;

    public int endusukZaman(){
        int birinciOlan = dakikalar[0];
        for (int i = 0; i< dakikalar.length; i++){
            if (birinciOlan> dakikalar[i]){
                birinciOlan = dakikalar[i];
                birinciKisi = isimler[i];
            }
        }
        return birinciOlan;
    }
    public int ikinciZaman(){
        int ikinciOlan = dakikalar[0];
        for (int i = 0; i< dakikalar.length; i++){
            if (dakikalar[i]> endusukZaman() && ikinciOlan> dakikalar[i]){
                ikinciOlan = dakikalar[i];
                ikinciKisi = isimler[i];
            }
        }
        return ikinciOlan;
    }
    public int ucuncuZaman(){
        int ucuncuOlan = dakikalar[0];
        for (int a = 0; a< dakikalar.length; a++){
            if (ucuncuOlan> dakikalar[a] && dakikalar[a]!= endusukZaman() && dakikalar[a]!= ikinciZaman()){
                ucuncuOlan = dakikalar[a];
                ucuncuKisi = isimler[a];
            }
        }
        return ucuncuOlan;
    }
    public void siralama(){
        ucuncuZaman();
        System.out.println("Birinci= "+ birinciKisi + " " + endusukZaman() + "'");
        System.out.println("İkinci= "+ ikinciKisi + " " + ikinciZaman() + "'");
        System.out.println("Üçüncü= "+ ucuncuKisi + " " + ucuncuZaman() + "'");
    }

    public void outputBarChart(){
        int[] frequency = new int[3];
        for (int dakika: dakikalar){
            frequency[(dakika/100)-2]++;
        }
        System.out.println("A -> "+ frequency[0]);
        System.out.println("B -> "+ frequency[1]);
        System.out.println("C -> "+ frequency[2]);
    }

}
