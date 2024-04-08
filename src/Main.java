import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Darbuotojas jonas = new Darbuotojas();
        jonas.vardasPavarde = "Jonas Jonaitis";
        jonas.pareigos = EinamosPareigos.Direktorius;
        Darbuotojas petras = new Darbuotojas();
        petras.vardasPavarde = "Petras Petraitis";
        petras.pareigos = EinamosPareigos.Vadybininkas;

        List<Darbuotojas> darbuotojai = new ArrayList<>();
        darbuotojai.add(jonas);
        darbuotojai.add(petras);

        for(Darbuotojas darbuotojas : darbuotojai)
        {
            System.out.println("Darbuojas "+ darbuotojas.vardasPavarde);
            System.out.println(Pareigos.skaiciuokAtlygiPagalPareigas(darbuotojas,40));
            System.out.println();
        }
    }
    public static void skanuoti()
    {

    }
}