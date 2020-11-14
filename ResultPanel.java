import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

//////// 그래픽 작성 패널 //////////

public class ResultPanel extends JPanel {
    public ResultPanel() {
        // 배경색 설정
        this.setBackground(new Color(245, 245, 245));
        // 사이즈 설정
        this.setPreferredSize(new Dimension(750, 750));
        // 레이아웃 설정
        this.setLayout(new BorderLayout());
        // 보더 설정
        this.setBorder(new EtchedBorder());
    }
}
