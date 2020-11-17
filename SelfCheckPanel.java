import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;

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

    JRadioButton q1_Y;
    JRadioButton q1_N;
    JRadioButton q2_Y;
    JRadioButton q2_N;
    JRadioButton q3_Y;
    JRadioButton q3_N;
    JRadioButton q4_Y;
    JRadioButton q4_N;

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

        q1_Y = new JRadioButton("Y");
        q1_N = new JRadioButton("N");
        q2_Y = new JRadioButton("Y");
        q2_N = new JRadioButton("N");
        q3_Y = new JRadioButton("Y");
        q3_N = new JRadioButton("N");
        q4_Y = new JRadioButton("Y");
        q4_N = new JRadioButton("N");

        SelfCheckActionListener listener = new SelfCheckActionListener();

        q1_Y.addActionListener(listener);
        q2_Y.addActionListener(listener);
        q3_Y.addActionListener(listener);
        q4_Y.addActionListener(listener);

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

    JButton showResult;

    void ComponentAtDownside() {
        downside.setLayout(new FlowLayout());
        downside.setBackground(new Color(245, 245, 245));

        showResult = new JButton("제출하기");
        downside.add(showResult);

        SelfCheckResultActionListener listener = new SelfCheckResultActionListener();
        showResult.addActionListener(listener);
    }

    boolean SelfCheckResult = false; // Y가 하나라도 체크 될시 경고문 띄움

    class SelfCheckActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == q1_Y || e.getSource() == q2_Y || e.getSource() == q3_Y || e.getSource() == q4_Y) {
                SelfCheckResult = true;
            }
        }
    }

    class SelfCheckResultActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == showResult && SelfCheckResult == true) {
                System.out.println("가까운 보건소에 가세요");
            } else if (e.getSource() == showResult && SelfCheckResult == false) {
                System.out.println("정상입니다.");
            }
        }
    }
}
