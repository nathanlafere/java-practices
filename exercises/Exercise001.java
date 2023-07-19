public class Exercise001 {
    public static void main(String[] args) {
        String text = "Olá Mundo!";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                System.out.print(c+" ");
            } else {
                System.out.println();
            }
        }
    }
}