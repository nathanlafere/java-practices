import java.util.Locale;

public class Exercise002 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("O idioma do sistema é "+locale.getLanguage()+"-"+locale.getCountry()+" ou "+locale.getDisplayLanguage()+" "+locale.getDisplayCountry());
    }
}