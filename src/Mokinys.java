public class Mokinys {
    String vardas;
    String pavarde;
    int[] pazymiai;
    private float vidurkis;
    public static String statinisString;

    private float skaiciuokVidurki()
    {
        statinisString = "aaa";
        int suma = 0;
        for(Integer i : pazymiai)
            suma = suma + i;
        float vid = suma / (float) pazymiai.length;
        return vid;
    }
    public float duokVidurki()
    {
        return skaiciuokVidurki();
    }


}