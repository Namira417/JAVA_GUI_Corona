import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends BaseFrame {

    // 파일, 관리, 결과 메뉴
    JMenu fileMenu;
    JMenu resultMenu;
    JMenu selfcheckMenu;

    JMenuItem fileMenuList[];
    JMenuItem resultMenuList[];
    JMenuItem selfcheckMenuList[];

    InsertInfo insertInfo;
    InfoList infoList;

    FileMenuActionListener fileListen;
    ResultMenuActionListener resultListen;
    SelfCheckMenuActionListener selfcheckListen;

    public MainFrame() {
        this.setTitle("COVID Alert");
        this.setSize(1600, 900);
        // 레이아웃 설정
        this.setLayout(new BorderLayout());
        // 창 크기 변경 불가능
        this.setResizable(false);
        // 메인프레임 배경색 지정
        this.setBackground(Color.GRAY);

        ///// 메뉴바 설정 /////
        JMenuBar mainBar = new JMenuBar();
        mainBar.setSize(1600, 30);
        mainBar.setBorder(new EtchedBorder());
        this.SetMenuList();

        mainBar.add(fileMenu);
        mainBar.add(resultMenu);
        mainBar.add(selfcheckMenu);
        /////////////////////

        // 메인 바 추가
        this.add(mainBar, BorderLayout.NORTH);

        ///// 패널 설치 /////
        insertInfo = new InsertInfo();
        infoList = new InfoList();

        this.add(insertInfo, BorderLayout.EAST);
        this.add(infoList, BorderLayout.WEST);

        // 창 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 보이도록 설정
        this.setVisible(true);
    }

    void SetMenuList() {
        // 파일 메뉴
        fileMenu = new JMenu("파일");
        fileMenuList = new JMenuItem[3];

        fileMenuList[0] = new JMenuItem("새로 열기");
        fileMenuList[1] = new JMenuItem("저장");
        fileMenuList[2] = new JMenuItem("수정");

        fileListen = new FileMenuActionListener();
        resultListen = new ResultMenuActionListener();
        selfcheckListen = new SelfCheckMenuActionListener();

        for (int i = 0; i < fileMenuList.length; i++)
            fileMenu.add(fileMenuList[i]);

        fileMenuList[0].addActionListener(fileListen);
        fileMenuList[1].addActionListener(fileListen);
        fileMenuList[2].addActionListener(fileListen);

        // 결과 메뉴
        resultMenu = new JMenu("결과 보기");
        resultMenuList = new JMenuItem[2];

        resultMenuList[0] = new JMenuItem("확진 날짜 별");
        resultMenuList[1] = new JMenuItem("확진 장소 별");

        resultMenuList[0].addActionListener(resultListen);
        resultMenuList[1].addActionListener(resultListen);

        for (int i = 0; i < resultMenuList.length; i++)
            resultMenu.add(resultMenuList[i]);

        // 자가 진단표
        selfcheckMenu = new JMenu("자가진단표");
        selfcheckMenuList = new JMenuItem[1];

        selfcheckMenuList[0] = new JMenuItem("자가진단표 작성");

        selfcheckMenuList[0].addActionListener(selfcheckListen);

        selfcheckMenu.add(selfcheckMenuList[0]);
    }

    public void ResetFrame() {
        this.setTitle("COVID Alert");
        this.setSize(1600, 900);
        // 레이아웃 설정
        this.setLayout(new BorderLayout());
        // 창 크기 변경 불가능
        this.setResizable(false);
        // 메인프레임 배경색 지정
        this.setBackground(Color.GRAY);

        ///// 메뉴바 설정 /////
        JMenuBar mainBar = new JMenuBar();
        mainBar.setSize(1600, 30);
        mainBar.setBorder(new EtchedBorder());
        this.SetMenuList();

        mainBar.add(fileMenu);
        mainBar.add(resultMenu);
        mainBar.add(selfcheckMenu);
        /////////////////////

        // 메인 바 추가
        this.add(mainBar, BorderLayout.NORTH);

        ///// 패널 설치 /////
        insertInfo = new InsertInfo();
        infoList = new InfoList();

        this.add(insertInfo, BorderLayout.EAST);
        this.add(infoList, BorderLayout.WEST);

        // 창 종료
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 보이도록 설정
        this.setVisible(true);
    }

    class FileMenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == fileMenuList[0]) {
                // 새로 만들기
                System.out.print("새로 만들기\n");
                new MainFrame();
                MainFrame.this.dispose();
            } else if (e.getSource() == fileMenuList[1]) {
                System.out.print("파일 열기\n");
                // 파일 열기
            } else if (e.getSource() == fileMenuList[2]) {
                System.out.print("저장\n");
                // 저장
            }
        }
    }

    class ResultMenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == resultMenuList[0]) {
                System.out.print("확진 날짜 별\n");
                // 확진 날짜 별
            } else if (e.getSource() == resultMenuList[1]) {
                System.out.print("확진 장소 별\n");
                // 확진 장소 별
            }
        }
    }

    class SelfCheckMenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == selfcheckMenuList[0]) {
                System.out.print("자가진단표 작성\n");
                // 자가진단표
            }
        }
    }
}
