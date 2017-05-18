import java.util.ArrayList;
public class klasaGlowna {
    public klasaGlowna() {
    }
    public static void main(String[] args) {
        Walec walec01 = new Walec(100.0F, 10.0F);
        Kula kula01 = new Kula(200.0F, 20.0F);
        Pret_srodek pret01 = new Pret_srodek(300.0F, 30.0F);
        System.out.print("Opis : " + walec01.opis());
        System.out.print("\nMasa : " + walec01.pobierzMase());
        System.out.print("\nPromien : " + walec01.pobierzPromien());
        System.out.print("\nMomet bezwladnosci : " +
                walec01.pobierzGlownyMomentBezwladnosci());
        System.out.print("\nOpis : " + kula01.opis());
        System.out.print("\nMasa : " + kula01.pobierzMase());
        System.out.print("\nPromien : " + kula01.pobierzPromien());
        System.out.print("\nMomet bezwladnosci : " +
                kula01.pobierzGlownyMomentBezwladnosci());
        System.out.print("\nOpis : " + pret01.opis());
        System.out.print("\nMasa : " + pret01.pobierzMase());
        System.out.print("\nPromien : " + pret01.pobierzDlogosc());
        System.out.print("\nMomet bezwladnosci : " +
                pret01.pobierzGlownyMomentBezwladnosci());
        ArrayList<PunktMaterialny> ListaTymczasowa = new ArrayList();
        int i;
        for(i = 1; i < 4; ++i) {
            ListaTymczasowa.add(new Walec((float)(i * 10), (float)i));
        }
        for(i = 1; i < 4; ++i) {
            ListaTymczasowa.add(new Kula((float)(i * 10), (float)i));
        }
        for(i = 1; i < 4; ++i) {
            ListaTymczasowa.add(new Pret_srodek((float)(i * 10),
                    (float)i));
        }
        new PunktMaterialny();
        for(int j = 0; j < ListaTymczasowa.size(); ++j) {
            PunktMaterialny temp = (PunktMaterialny)ListaTymczasowa.get(j);
            System.out.println(temp.opis());
            System.out.println("\tMomet bezwladnosci wzgledem nowej osi:" +
                    temp.obliczMometBezwladnosciWzdluzOsi(10.0F));
        }
    }
}
