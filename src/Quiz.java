import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz {

    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JPanel panel = new JPanel(new GridBagLayout());

        JLabel titleLabel = new JLabel("CodeJava TheQuiz");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30)); 
      
        GridBagConstraints titleConstraints = new GridBagConstraints();
        titleConstraints.gridx = 0;
        titleConstraints.gridy = 0;
        titleConstraints.insets = new Insets(50, 0, 30, 0); 
        panel.add(titleLabel, titleConstraints);

        JButton playButton = new JButton("Play");
 
        JButton leaderboardButton = new JButton("Leaderboard");
   
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 1;
        buttonConstraints.insets = new Insets(10, 0, 10, 0); 
        panel.add(playButton, buttonConstraints);

        buttonConstraints.gridy = 2;
        panel.add(leaderboardButton, buttonConstraints);
   
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    
        playButton.addActionListener(new ActionListener() {
       
    	@Override
        public void actionPerformed(ActionEvent e) {
            atualizarConteudoPainel(panel);
        }
    });
}
    private static void atualizarConteudoPainel(JPanel panel) {
    panel.removeAll();

    JLabel novoTitleLabel = new JLabel("Questão 1");
    novoTitleLabel.setFont(new Font("Arial", Font.BOLD, 20));

    GridBagConstraints novoTitleConstraints = new GridBagConstraints();
    novoTitleConstraints.gridx = 0;
    novoTitleConstraints.gridy = 0;
    novoTitleConstraints.insets = new Insets(20, 0, 10, 0);
    panel.add(novoTitleLabel, novoTitleConstraints);

    for (int i = 1; i <= 4; i++) {
        JButton novoBotao = new JButton("Botão " + i);
        GridBagConstraints novoButtonConstraints = new GridBagConstraints();
        novoButtonConstraints.gridx = 0;
        novoButtonConstraints.gridy = i;
        novoButtonConstraints.insets = new Insets(10, 0, 10, 0);
        panel.add(novoBotao, novoButtonConstraints);
        }
		
    	panel.revalidate();
		panel.repaint();
    }
}