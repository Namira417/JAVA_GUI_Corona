import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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

        String header[] = { "연번", "확진일", "번호", "거주지", "여행력", "접촉력", "상태", "이동경로", "등록일", "수정일", "노출여부" };
        //////////////// Contents 에 DB 넣으면 됨 /////////////////////////
        String contents[][] = { { "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0" } };
        JTable table = new JTable(contents, header);
        scroll = new JScrollPane(table);
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
