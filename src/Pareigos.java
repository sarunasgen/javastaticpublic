public class Pareigos {
    public static String DIREKTORIUS = "Direktorius";
    public static String BUHALTERIS = "Buhalteris";
    public static String VADYBININKAS = "Vadybininkas";
    private static double menesinisBonus = 10.55;


    public static double skaiciuotiAtlygininma(double valandinis, double isdirbtosValandos)
    {
        return (valandinis * isdirbtosValandos) + menesinisBonus;
    }
    public double skaiciuotiAtlygininmaNeStatic(double valandinis, double isdirbtosValandos)
    {
        return (valandinis * isdirbtosValandos) + menesinisBonus;
    }
    public static double skaiciuokAtlygiPagalPareigas(Darbuotojas darbuotojas, double isdirbtosValandos)
    {
        switch (darbuotojas.pareigos)
        {
            case Direktorius:
            {
                return (18.50 * isdirbtosValandos) + menesinisBonus;
            }
            case Pavaduotojas:
                break;
            case Vadybininkas:
            {
                return (12.50 * isdirbtosValandos) + menesinisBonus;
            }
            case VyrVykdantysis:
                break;
            case Vykdantysis:
                break;
            case Valytojas:
                break;
        }
        return 0;
    }
}
