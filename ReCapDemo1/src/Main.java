public class Main {
    public static void main(String[] args) {
        DortIslem dortislem= new DortIslem();
        int sonuc = dortislem.Topla(3,4);
        System.out.println(sonuc);

        int sonuc2 = dortislem.Bol(348,32);
        System.out.println(sonuc2);

        int sonuc3 = dortislem.Carp(41,9);
        System.out.println(sonuc3);

        int sonuc4 = dortislem.Cikar(4564,2654);
        System.out.println(sonuc4);
    }
}