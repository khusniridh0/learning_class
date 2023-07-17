import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainClassrom {

    public static void main(String[] args) {
        // Membuat JFrame (jendela)
        JFrame frame = new JFrame("Hello Java");

        // Membuat JLabel (tulisan)
        JLabel label = new JLabel("Hello Java");

        // Menambahkan label ke frame
        frame.getContentPane().add(label);

        // Mengatur ukuran frame
        frame.setSize(300, 200);

        // Mengatur tindakan penutupan default
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan frame
        frame.setVisible(true);
    }
}