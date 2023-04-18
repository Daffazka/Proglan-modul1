import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim;
        boolean running = true;
        do {
            try {
                System.out.print("Inputkan nim : ");
                nim = input.nextLine();
                if (nim.length() < 15) {
                    throw new Exception("Nim yang anda masukkan kurang dari 15 digit!");
                } else if (nim.length() > 15) {
                    throw new Exception("Nim yang anda masukkan lebih dari 15 digit!");
                }
                String subNim = nim.substring(4, 12);
                if (!(subNim.equals("10370311"))) {
                    throw new Exception("inputan yang anda masukkan salah!");
                } else{
                    running = false;
                }
            } catch (Exception e) {
              System.out.println("error" + e);

            }

        } while (running);
    }
}
