class Kula extends PunktMaterialny {
    float promien;
    public float pobierzPromien() {
        return this.promien;
    }
    public void zmienPromien(float nowyPromien) {
        this.promien = nowyPromien;
    }
    public Kula() {
        this.masa = 0.0F;
        this.promien = 0.0F;
        this.obliczGlownyMomentBezwladnosci();
    }
    public Kula(float poczatkowaMasa, float poczatkowyPromien) {
        super(poczatkowaMasa);
        this.promien = poczatkowyPromien;
        this.obliczGlownyMomentBezwladnosci();
    }
    public float obliczGlownyMomentBezwladnosci() {
        this.glowny_momet_bezwladnosci = 2.0F * this.masa * this.promien *
                this.promien / 5.0F;
        return this.glowny_momet_bezwladnosci;
    }
    public String opis() {
        String temp = "\n\tTyp: Kula \n\tMasa:" + this.masa +
                "\n\tPromien:" + this.promien + "\n\tGlowny momet bezwladnosci:" +
                this.glowny_momet_bezwladnosci;
        return temp;
    }
}