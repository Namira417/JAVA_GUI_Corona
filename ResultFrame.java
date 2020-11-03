import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ResultFrame extends BaseFrame {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));

    public ResultFrame() {
        this.setTitle("결과 보기");
        this.setBounds(100, 100, 800, 800);
        this.setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        panel.setBackground(Color.white);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.getContentPane().setBackground(new Color(0, 200, 250));
        this.addWindowListener(new ClosingEventHandler());

        add(panel);
    }

    class ClosingEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.print("닫힘\n");
            ResultFrame.this.mainFrame.setEnabled(true);
        }
    }

}
