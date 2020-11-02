import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class InsertInfo extends JPanel {
    // 추가 수정 제거 버튼
    JButton addButton;
    JButton editButton;
    JButton delButton;

    // 수정사항 기입칸
    JTextArea idText;
    JTextArea influe_Date;
    JTextArea patient_Number;
    JTextArea residence;
    JTextArea travel;
    JTextArea connect_Region;
    JTextArea patient_Status;
    JTextArea route;
    JTextArea registration_Date;
    JTextArea modified_Date;

    // 노출여부 라디오 버튼
    JRadioButton exposure_Y;
    JRadioButton exposure_N;
    ButtonGroup exposure;

    // 컴포넌트 배치를 위한 패널
    JPanel upside;
    JPanel midside;
    JPanel downside;

    public InsertInfo() {
        // 배경색 설정
        this.setBackground(new Color(245, 245, 245));
        // 사이즈 설정
        this.setPreferredSize(new Dimension(500, 870));
        // 레이아웃 설정
        this.setLayout(new BorderLayout());
        // 보더 설정
        this.setBorder(new EtchedBorder());

        InitComponent();
        InitPanel();
    }

    // 패널에 들어가는 컴포넌트 생성 및 초기화
    void InitComponent() {
        this.addButton = new JButton("추가");
        this.editButton = new JButton("수정");
        this.delButton = new JButton("제거");

        // 수정사항 기입칸
        this.idText = new JTextArea();
        this.influe_Date = new JTextArea();
        this.patient_Number = new JTextArea();
        this.residence = new JTextArea();
        this.travel = new JTextArea();
        this.connect_Region = new JTextArea();
        this.patient_Status = new JTextArea();
        this.route = new JTextArea();
        this.registration_Date = new JTextArea();
        this.modified_Date = new JTextArea();

        exposure_Y = new JRadioButton("Y");
        exposure_N = new JRadioButton("N");
        exposure = new ButtonGroup();
        exposure.add(exposure_Y);
        exposure.add(exposure_N);
    }

    void InitPanel() {
        upside = new JPanel();
        midside = new JPanel();
        downside = new JPanel();

        upside.setPreferredSize(new Dimension(500, 200));
        upside.setBackground(Color.white);
        upside.setBorder(new EtchedBorder());

        midside.setPreferredSize(new Dimension(500, 570));
        midside.setBackground(Color.white);
        midside.setBorder(new EtchedBorder());

        downside.setPreferredSize(new Dimension(500, 100));
        downside.setBackground(Color.white);
        downside.setBorder(new EtchedBorder());

        ComponentAtUpside();
        ComponentAtMidside();
        ComponentAtDownside();

        this.add(upside, BorderLayout.NORTH);
        this.add(midside, BorderLayout.CENTER);
        this.add(downside, BorderLayout.SOUTH);
    }

    // upside 패널의 컴포넌트 배치
    void ComponentAtUpside() {

    }

    // midside 패널의 컴포넌트 배치
    void ComponentAtMidside() {

    }

    // downside 패널의 컴포넌트 배치
    void ComponentAtDownside() {
        downside.setLayout(new FlowLayout(30, 70, 30));

        JPanel temp1 = new JPanel();
        temp1.setSize(163, 100);
        temp1.add(addButton);

        JPanel temp2 = new JPanel();
        temp2.setSize(163, 100);
        temp2.add(editButton);

        JPanel temp3 = new JPanel();
        temp3.setSize(163, 100);
        temp3.add(delButton);

        downside.add(temp1, FlowLayout.LEFT);
        downside.add(temp2, FlowLayout.CENTER);
        downside.add(temp3, FlowLayout.RIGHT);
    }
}
