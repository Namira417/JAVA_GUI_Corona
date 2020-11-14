import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResultFrame extends BaseFrame {

    ResultPanel resultPanel;

    public ResultFrame() {

        resultPanel = new ResultPanel(); // 그래프 작성 패널

        this.setTitle("결과 보기");
        this.setBounds(100, 100, 800, 800);
        this.setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.getContentPane().setBackground(new Color(245, 245, 245));
        this.addWindowListener(new ClosingEventHandler());

        add(resultPanel);
    }

    class ClosingEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.print("닫힘\n");
            ResultFrame.this.mainFrame.setEnabled(true);
        }
    }

}
