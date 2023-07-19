import java.awt.Dimension;
import java.awt.Toolkit;

public class Exercise003 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Sua tela tem resolução "+(int)screenSize.getWidth()+" x "+(int)screenSize.getHeight());
    }
}