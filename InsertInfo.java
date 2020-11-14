import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    JTextField exposure;

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

    public void setExposure(JTextField exposure) {
        this.exposure = exposure;
    }

    public JTextField getExposure() {
        return exposure;
    }

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
        this.exposure = new JTextField(10);
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
        upside.setLayout(new BorderLayout());

        JPanel westside = new JPanel();
        westside.setLayout(new GridLayout(1, 1));
        String header[] = { "연번", "확진일", "번호", "거주지", "여행력", "접촉력", "상태", "이동경로", "등록일", "수정일", "노출여부" };
        JComboBox combobox = new JComboBox<>(header);
        westside.add(combobox);
        upside.add(westside, BorderLayout.WEST);

        JPanel centerside = new JPanel();
        centerside.setLayout(new GridLayout(1, 1));
        JTextField search = new JTextField(25);
        centerside.add(search);
        upside.add(centerside, BorderLayout.CENTER);

        JPanel eastside = new JPanel();
        eastside.setLayout(new GridLayout(1, 1));
        JButton sButton = new JButton("검색");
        eastside.add(sButton);
        upside.add(eastside, BorderLayout.EAST);

        JPanel northside = new JPanel();
        northside.setPreferredSize(new Dimension(300, 80));
        upside.add(northside, BorderLayout.NORTH);

        JPanel southside = new JPanel();
        southside.setPreferredSize(new Dimension(300, 80));
        upside.add(southside, BorderLayout.SOUTH);
    }

    // midside 패널의 컴포넌트 배치
    void ComponentAtMidside() {
        this.midside.setLayout(new BorderLayout());

        JPanel leftPane = new JPanel();
        JPanel rightPane = new JPanel();

        leftPane.setLayout(new GridLayout(11, 1));
        rightPane.setLayout(new GridLayout(11, 1, 20, 10));

        leftPane.setPreferredSize(new Dimension(120, 300));
        rightPane.setPreferredSize(new Dimension(250, 300));

        leftPane.add(new JLabel("연번", SwingConstants.CENTER));
        leftPane.add(new JLabel("확진일", SwingConstants.CENTER));
        leftPane.add(new JLabel("번호", SwingConstants.CENTER));
        leftPane.add(new JLabel("거주지", SwingConstants.CENTER));
        leftPane.add(new JLabel("여행력", SwingConstants.CENTER));
        leftPane.add(new JLabel("접촉력", SwingConstants.CENTER));
        leftPane.add(new JLabel("상태", SwingConstants.CENTER));
        leftPane.add(new JLabel("이동경로", SwingConstants.CENTER));
        leftPane.add(new JLabel("등록일", SwingConstants.CENTER));
        leftPane.add(new JLabel("수정일", SwingConstants.CENTER));
        leftPane.add(new JLabel("노출 여부", SwingConstants.CENTER));

        rightPane.add(idText);
        rightPane.add(influe_Date);
        rightPane.add(patient_Number);
        rightPane.add(residence);
        rightPane.add(travel);
        rightPane.add(connect_Region);
        rightPane.add(patient_Status);
        rightPane.add(route);
        rightPane.add(registration_Date);
        rightPane.add(modified_Date);
        rightPane.add(exposure);

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
        downside.setBackground(new Color(245, 245, 245));

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
