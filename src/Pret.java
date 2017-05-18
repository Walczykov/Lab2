class Pret_srodek extends PunktMaterialny {
    float dlugosc;
    public float pobierzDlogosc() {
        return this.dlugosc;
    }
    public void zmienDlogosc(float nowyDlugosc) {
        this.dlugosc = nowyDlugosc;
    }
    public Pret_srodek() {
        this.masa = 0.0F;
        this.dlugosc = 0.0F;
        this.obliczGlownyMomentBezwladnosci();
    }
    public Pret_srodek(float poczatkowaMasa, float poczatkowaDlugosc) {
        super(poczatkowaMasa);
        this.dlugosc = poczatkowaDlugosc;
        this.obliczGlownyMomentBezwladnosci();
    }
    public float obliczGlownyMomentBezwladnosci() {
        this.glowny_momet_bezwladnosci = this.masa * this.dlugosc *
                this.dlugosc / 12.0F;
        return this.glowny_momet_bezwladnosci;
    }
    public String opis() {
        String temp = "\n\tTyp: Pret o osi obrotu w srodku dlugosci \n\tMasa:" + this.masa + "\n\tDlugosc:" + this.dlugosc + "\n\tGlowny momet bezwladnosci:" + this.glowny_momet_bezwladnosci;
        return temp;
    }
}
