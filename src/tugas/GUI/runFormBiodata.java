package tugas.GUI;

import javax.swing.*;

public class runFormBiodata {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Form Biodata");
        jframe.setContentPane(new FormBiodata().getYpanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
