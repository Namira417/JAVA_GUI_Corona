import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PatientPanel extends BasePanel {
    Patient info;
    JButton patientButton;

    public Patient getInfo() {
        return info;
    }

    public PatientPanel(Patient info) {
        this.info = info;
        this.setSize(1030, 5);

        this.setPreferredSize(new Dimension(1050, 50));

        this.patientButton = new JButton();

        this.setLayout(new BorderLayout());
        SettingButton();

        this.add(patientButton, BorderLayout.CENTER);
        patientButton.addActionListener(new PanelActionListener());
    }

    void SettingButton() {
        String result = "";
        result += "연번 : " + info.getId() + " ";
        result += "확진일 : " + info.getInflue_Date() + " ";
        result += "환자번호 : " + info.getPatient_Number() + " ";
        result += "공개 여부 : ";

        if (info.getExposure().equals("Y"))
            result += "Y";
        else if (info.getExposure().equals("N"))
            result += "N";

        this.patientButton.setText(result);
    }

    class PanelActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //
        }
    }
}
