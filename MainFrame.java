import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

    // 파일, 관리, 결과 메뉴
    JMenu fileMenu;
    JMenu resultMenu;
    JMenu selfcheckMenu;

    JMenuItem fileMenuList[];
    JMenuItem resultMenuList[];

    public MainFrame() {
        this.setTitle("COVID Alert");
        this.setSize(1600, 900);
        this.setResizable(false);

        JMenuBar mainBar = new JMenuBar();
        mainBar.setSize(1600, 30);

        this.SetMenuList();

        mainBar.add(fileMenu);
        mainBar.add(resultMenu);
        mainBar.add(selfcheckMenu);

        this.add(mainBar);
        this.add(new JPanel());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    void SetMenuList() {
        fileMenu = new JMenu("파일");
        fileMenuList = new JMenuItem[3];

        fileMenuList[0] = new JMenuItem("열기");
        fileMenuList[1] = new JMenuItem("저장");
        fileMenuList[2] = new JMenuItem("수정");

        for (int i = 0; i < fileMenuList.length; i++)
            fileMenu.add(fileMenuList[i]);

        resultMenu = new JMenu("결과 보기");
        resultMenuList = new JMenuItem[2];

        resultMenuList[0] = new JMenuItem("확진 날짜 별");
        resultMenuList[1] = new JMenuItem("확진 장소 별");

        for (int i = 0; i < resultMenuList.length; i++)
            resultMenu.add(resultMenuList[i]);

        selfcheckMenu = new JMenu("자가진단표");
    }
}
