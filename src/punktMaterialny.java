class PunktMaterialny {
    float masa;
    float glowny_momet_bezwladnosci;
    public float pobierzMase() {
        return this.masa;
    }
    public float pobierzGlownyMomentBezwladnosci() {
        return this.glowny_momet_bezwladnosci;
    }
    public void zmienMase(float nowaMasa) {
        this.masa = nowaMasa;
        this.obliczGlownyMomentBezwladnosci();
    }
    public PunktMaterialny() {
        this.masa = 0.0F;
        this.obliczGlownyMomentBezwladnosci();
    }
    public PunktMaterialny(float poczatkowaMasa) {
        this.masa = poczatkowaMasa;
        this.obliczGlownyMomentBezwladnosci();
    }
    public float obliczGlownyMomentBezwladnosci() {
        this.glowny_momet_bezwladnosci = 0.0F;
        return this.glowny_momet_bezwladnosci;
    }
    public float obliczMometBezwladnosciWzdluzOsi(float
                                                          odlegloscMiedzyOsiami) {
        float temp = this.glowny_momet_bezwladnosci + this.masa *
                odlegloscMiedzyOsiami * odlegloscMiedzyOsiami;
        return temp;
    }
    public String opis() {
        String temp = "\n\tTyp: Opis obiektu \n\tMasa:" + this.masa +
                "\n\tGlowny momet bezwladnosci:" + this.glowny_momet_bezwladnosci;
        return temp;
    }
}
