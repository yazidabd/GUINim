package tugas.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JButton buttonOK;
    private JPanel Ypanel;
    private JLabel hasilnama;
    private JLabel hasilnim;
    private JLabel hasiljp;
    private JLabel hasilakt;
    private JLabel hasilfk;
    private JLabel hasilprd;
    private JLabel hasiljk;
    private JLabel hasilnomhs;

    public FormBiodata() {
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textNama.getText();
                String nim = textNIM.getText();

                mahasiswa mhs = new mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                hasilnama.setText("Nama                                      : " + mhs.getNama());
                hasilnim.setText("NIM                                          : " + mhs.getNim());
                hasiljp.setText("Jenjang pendidikan            : " + mhs.jenjangPendidikan());
                hasilakt.setText("Angkatan                               : " + mhs.angkatan());
                hasilfk.setText("Fakultas                                 : " + mhs.fakultas());
                hasilprd.setText("Prodi                                       : " + mhs.prodi());
                hasiljk.setText("Jenis kelamin                       : " + mhs.jenisKelamin());
                hasilnomhs.setText("No mahasiswa                     : " + mhs.noMhs());

            }
        });
    }

    public JPanel getYpanel() {

        return Ypanel;
    }
}
