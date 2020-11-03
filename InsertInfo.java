import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class InsertInfo extends JPanel {
    // 추가 수정 제거 버튼
    JButton addButton;
    JButton editButton;
    JButton delButton;

    // 수정사항 기입칸
    JTextField idText;
    JTextField influe_Date;
    JTextField patient_Number;
    JTextField residence;
    JTextField travel;
    JTextField connect_Region;
    JTextField patient_Status;
    JTextField route;
    JTextField registration_Date;
    JTextField modified_Date;

    public JTextField getidText() {
        return idText;
    }

    public void setidText(JTextField idText) {
        this.idText = idText;
    }

    public JTextField getInflue_Date() {
        return influe_Date;
    }

    public void setinflue_Date(JTextField influe_Date) {
        this.influe_Date = influe_Date;
    }

    public JTextField getPatient_Number() {
        return patient_Number;
    }

    public void setPatient_Number(JTextField patient_Number) {
        this.patient_Number = patient_Number;
    }

    public JTextField getResidence() {
        return residence;
    }

    public void getResidence(JTextField residence) {
        this.residence = residence;
    }

    public JTextField getTravel() {
        return travel;
    }

    public void setTravel(JTextField travel) {
        this.travel = travel;
    }

    public JTextField getConnect_Region() {
        return connect_Region;
    }

    public void setConnect_Region(JTextField connect_Region) {
        this.connect_Region = connect_Region;
    }

    public JTextField getPatient_Status() {
        return patient_Status;
    }

    public void setPatient_Status(JTextField patient_Status) {
        this.patient_Status = patient_Status;
    }

    public JTextField getRoute() {
        return route;
    }

    public void setRoute(JTextField route) {
        this.route = route;
    }

    public JTextField getRegistration_Date() {
        return registration_Date;
    }

    public void setRegistration_Date(JTextField registration_Date) {
        this.registration_Date = registration_Date;
    }

    public JTextField getModified_Date() {
        return modified_Date;
    }

    public void setModified_Date(JTextField modified_Date) {
        this.modified_Date = modified_Date;
    }

    // 노출여부 라디오 버튼

    public JRadioButton getExposure_Y() {
        return exposure_Y;
    }

    public void setExposure(JRadioButton exposure_Y) {
        this.exposure_Y = exposure_Y;
    }

    public JRadioButton getExposure_N() {
        return exposure_N;
    }

    public void setExposure_N(JRadioButton exposure_N) {
        this.exposure_N = exposure_N;
    }

    public ButtonGroup getExposure() {
        return exposure;
    }

    public void setExposure(ButtonGroup exposure) {
        this.exposure = exposure;
    }

    JRadioButton exposure_Y;
    JRadioButton exposure_N;
    ButtonGroup exposure;

    // 컴포넌트 배치를 위한 패널
    JPanel upside;
    JPanel midside;
    JPanel downside;

    // 컴포넌트 혼트
    Font componentFont;

    // 이벤트 처리
    InsertInfoActionListener listener;

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
        componentFont = new Font("맑은 고딕", Font.BOLD, 15);
        listener = new InsertInfoActionListener();

        this.addButton = new JButton("추가");
        this.editButton = new JButton("수정");
        this.delButton = new JButton("제거");

        addButton.addActionListener(listener);
        editButton.addActionListener(listener);
        delButton.addActionListener(listener);

        // 수정사항 기입칸
        this.idText = new JTextField(10);
        this.influe_Date = new JTextField(10);
        this.patient_Number = new JTextField(10);
        this.residence = new JTextField(10);
        this.travel = new JTextField(10);
        this.connect_Region = new JTextField(10);
        this.patient_Status = new JTextField(10);
        this.route = new JTextField(10);
        this.registration_Date = new JTextField(10);
        this.modified_Date = new JTextField(10);

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
        upside.setBackground(Color.WHITE);
        upside.setBorder(new EtchedBorder());

        midside.setPreferredSize(new Dimension(500, 570));
        midside.setBackground(Color.WHITE);
        midside.setBorder(new EtchedBorder());

        downside.setPreferredSize(new Dimension(500, 100));
        downside.setBackground(Color.WHITE);
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
        upside.setLayout(new GridLayout(2, 1));

        Font labelFontSetting = new Font("맑은 고딕", Font.BOLD, 20);

        JLabel idLabel = new JLabel("연번");
        JLabel influe_DateLabel = new JLabel("확진일");
        JLabel patient_NumberLabel = new JLabel("번호");
        JLabel exposureLabel = new JLabel("노출여부");

        idLabel.setFont(labelFontSetting);
        influe_DateLabel.setFont(labelFontSetting);
        patient_NumberLabel.setFont(labelFontSetting);
        exposureLabel.setFont(labelFontSetting);

        JPanel northPane = new JPanel();
        JPanel southPane = new JPanel();

        northPane.setLayout(new FlowLayout(40, 20, 40));
        southPane.setLayout(new FlowLayout(40, 20, 40));

        northPane.add(idLabel);
        northPane.add(idText);
        northPane.add(influe_DateLabel);
        northPane.add(influe_Date);

        southPane.add(patient_NumberLabel);
        southPane.add(patient_Number);
        southPane.add(exposureLabel);
        southPane.add(exposure_Y);
        southPane.add(exposure_N);

        upside.add(northPane);
        upside.add(southPane);
    }

    // midside 패널의 컴포넌트 배치
    void ComponentAtMidside() {
        this.midside.setLayout(new BorderLayout());

        JPanel leftPane = new JPanel();
        JPanel rightPane = new JPanel();

        leftPane.setLayout(new GridLayout(7, 1));
        rightPane.setLayout(new GridLayout(7, 1, 20, 10));

        leftPane.setPreferredSize(new Dimension(120, 300));
        rightPane.setPreferredSize(new Dimension(250, 300));

        leftPane.add(new JLabel("거주지", SwingConstants.CENTER));
        leftPane.add(new JLabel("여행력", SwingConstants.CENTER));
        leftPane.add(new JLabel("접촉력", SwingConstants.CENTER));
        leftPane.add(new JLabel("상태", SwingConstants.CENTER));
        leftPane.add(new JLabel("이동경로", SwingConstants.CENTER));
        leftPane.add(new JLabel("등록일", SwingConstants.CENTER));
        leftPane.add(new JLabel("수정일", SwingConstants.CENTER));

        rightPane.add(residence);
        rightPane.add(travel);
        rightPane.add(connect_Region);
        rightPane.add(patient_Status);
        rightPane.add(route);
        rightPane.add(registration_Date);
        rightPane.add(modified_Date);

        JPanel northBlankPane = new JPanel();
        northBlankPane.setPreferredSize(new Dimension(570, 80));
        JPanel southBlankPane = new JPanel();
        southBlankPane.setPreferredSize(new Dimension(570, 80));

        this.midside.add(leftPane, BorderLayout.WEST);
        this.midside.add(rightPane, BorderLayout.CENTER);

        this.midside.add(northBlankPane, BorderLayout.NORTH);
        this.midside.add(southBlankPane, BorderLayout.SOUTH);
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

    class InsertInfoActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addButton) {
                System.out.print("추가\n");
            } else if (e.getSource() == editButton) {
                System.out.print("수정\n");
            } else if (e.getSource() == delButton) {
                System.out.print("삭제");
            }
        }
    }
}
