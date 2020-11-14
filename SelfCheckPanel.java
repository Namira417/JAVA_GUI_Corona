import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class SelfCheckPanel extends JPanel {
    public SelfCheckPanel() {
        // 배경색 설정
        this.setBackground(new Color(245, 245, 245));
        // 사이즈 설정
        this.setPreferredSize(new Dimension(750, 750));
        // 레이아웃 설정
        this.setLayout(new BorderLayout());
        // 보더 설정
        this.setBorder(new EtchedBorder());

        InitPanel();
    }

    JPanel upside;
    JPanel downside;

    void InitPanel() {
        upside = new JPanel();
        downside = new JPanel();

        // 문진표 배치
        upside.setPreferredSize(new Dimension(350, 700));
        upside.setBackground(Color.WHITE);
        upside.setBorder(new EtchedBorder());

        // 확인 버튼 배치
        downside.setPreferredSize(new Dimension(350, 50));
        downside.setBackground(Color.WHITE);
        downside.setBorder(new EtchedBorder());

        ComponentAtUpside();
        ComponentAtDownside();

        this.add(upside, BorderLayout.NORTH);
        this.add(downside, BorderLayout.SOUTH);
    }

    void ComponentAtUpside() {
        upside.setLayout(new BorderLayout());
        JPanel centerside = new JPanel();
        centerside.setLayout(new GridLayout(4, 1));
        JPanel eastside = new JPanel();
        eastside.setLayout(new GridLayout(4, 2));

        upside.add(centerside, BorderLayout.CENTER);
        upside.add(eastside, BorderLayout.EAST);

        Font labelFontSetting = new Font("맑은 고딕", Font.BOLD, 15);

        JLabel question_1 = new JLabel("   1. 최근 30일 이내에 해외 국가를 방문한 적이 있습니까?");
        JLabel question_2 = new JLabel("   2. 최근 14일 이내에 확진 환자와 접촉한 적이 있습니까?");
        JLabel question_3 = new JLabel("   3. 최근 14일 이내에 호흡기 증상이나 기타 폐렴 증상이 나타난 적 있습니까?");
        JLabel question_4 = new JLabel("   4. 최근 30일 이내에 지역사회 유행국가를 방문 한 적이 있습니까?");

        question_1.setFont(labelFontSetting);
        question_2.setFont(labelFontSetting);
        question_3.setFont(labelFontSetting);
        question_4.setFont(labelFontSetting);

        JRadioButton q1_Y = new JRadioButton("Y");
        JRadioButton q1_N = new JRadioButton("N");
        JRadioButton q2_Y = new JRadioButton("Y");
        JRadioButton q2_N = new JRadioButton("N");
        JRadioButton q3_Y = new JRadioButton("Y");
        JRadioButton q3_N = new JRadioButton("N");
        JRadioButton q4_Y = new JRadioButton("Y");
        JRadioButton q4_N = new JRadioButton("N");

        ButtonGroup q1 = new ButtonGroup();
        ButtonGroup q2 = new ButtonGroup();
        ButtonGroup q3 = new ButtonGroup();
        ButtonGroup q4 = new ButtonGroup();

        q1.add(q1_Y);
        q1.add(q1_N);
        q2.add(q2_Y);
        q2.add(q2_N);
        q3.add(q3_Y);
        q3.add(q3_N);
        q4.add(q4_Y);
        q4.add(q4_N);

        centerside.add(question_1);
        eastside.add(q1_Y);
        eastside.add(q1_N);
        centerside.add(question_2);
        eastside.add(q2_Y);
        eastside.add(q2_N);
        centerside.add(question_3);
        eastside.add(q3_Y);
        eastside.add(q3_N);
        centerside.add(question_4);
        eastside.add(q4_Y);
        eastside.add(q4_N);
    }

    void ComponentAtDownside() {
        downside.setLayout(new FlowLayout());
        downside.setBackground(new Color(245, 245, 245));

        JButton showResult = new JButton("제출하기");
        downside.add(showResult);
    }
}
