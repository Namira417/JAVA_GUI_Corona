import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SelfCheckFrame extends BaseFrame {

    SelfCheckPanel selfCheckPanel;

    public SelfCheckFrame() {
        this.setTitle("결과 보기");
        this.setBounds(100, 100, 800, 800);
        this.setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        selfCheckPanel = new SelfCheckPanel();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.getContentPane().setBackground(new Color(245, 245, 245));
        this.addWindowListener(new ClosingEventHandler());

        add(selfCheckPanel);
    }

    class ClosingEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.print("닫힘\n");
            SelfCheckFrame.this.mainFrame.setEnabled(true);
        }
    }

}
