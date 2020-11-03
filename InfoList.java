import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

public class InfoList extends BasePanel {

    JScrollPane scroll;
    JPanel listPane;

    float extraHeight;
    int manyPanel;

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public InfoList() {
        extraHeight = 0;
        manyPanel = 0;
        this.setLayout(null);
        // 배경색 설정
        this.setBackground(Color.WHITE);
        this.setBorder(new EtchedBorder());
        // 사이즈 설정
        this.setPreferredSize(new Dimension(1030, 700));

        // 레이아웃 설정
        this.setLayout(new FlowLayout(0, 5, 3));

        listPane = new JPanel();
        listPane.setLayout(new FlowLayout(FlowLayout.CENTER));
        listPane.setPreferredSize(new Dimension(1030, 750));
        listPane.setBackground(new Color(230, 230, 230));

        listPane.add(new PatientPanel(new Patient()));
        listPane.add(new PatientPanel(new Patient()));
        listPane.add(new PatientPanel(new Patient()));
        listPane.add(new PatientPanel(new Patient()));
        listPane.add(new PatientPanel(new Patient()));

        scroll = new JScrollPane(listPane);
        scroll.setPreferredSize(new Dimension(1014, 795));

        this.add(scroll);
    }

    public void addStudentPanel(JPanel pane) {
        if (manyPanel > 15) {
            extraHeight += 60;
            listPane.setPreferredSize(new Dimension(1000, 700 + (int) extraHeight));
        }

        listPane.add(pane);
        manyPanel++;

        listPane.updateUI();
        listPane.validate();
    }
}
