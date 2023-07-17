import javax.swing.JFrame;
import javax.swing.JLabel;

public class soalClassRoom extends JFrame {

    public void Latihanp12b() {
        // Menambahkan judul pada jendela
        super("Hello Java");

        // Membuat JLabel (tulisan)
        JLabel label = new JLabel("Hello Java dengan inheritace");

        // Menambahkan label ke frame
        getContentPane().add(label);

        // Mengatur ukuran frame
        setSize(300, 200);

        // Mengatur tindakan penutupan default
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menampilkan frame
        setVisible(true);
    }

    public static void main(String[] args) {
        Latihanp12b helloGUI = new Latihanp12b();
    }
}