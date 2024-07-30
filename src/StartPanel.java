import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartPanel extends JPanel implements ActionListener {
    JButton twoPlayer;
    JButton onePlayer;
    GameFrame gameFrame;

    StartPanel(GameFrame gameFrame){

        this.gameFrame=gameFrame;
        Font font= new Font("Courier", Font.PLAIN, 32);
        // Set the layout and background color
        GridLayout gd = new GridLayout(3, 1);
        this.setLayout(gd);
        this.setPreferredSize(new Dimension(GamePanel.GAME_WIDTH, GamePanel.GAME_HEIGHT));
        this.setBackground(Color.BLACK);
        // Add a welcome label
        Label welcomeLabel=new Label();
        welcomeLabel.setFont(font);
        welcomeLabel.setText(" WELCOME TO PONG GAME ");
        welcomeLabel.setForeground(Color.WHITE); // Set text color to white for better visibility
        welcomeLabel.setAlignment(Label.CENTER);// Center align the text
        this.add(welcomeLabel);

        // Create and add the one-player game button
        onePlayer = createButton("One Player Game",font);
        this.add(onePlayer);

        // Create and add the two-player game button
        twoPlayer = createButton("Two Player Game",font);
        this.add(twoPlayer);


    }
    private JButton createButton(String text, Font font) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(0, 0, 0, 0)); // Fully transparent background
        button.setOpaque(false); // Makes the background color effective
        button.setBorderPainted(false); // Removes border
        button.setFocusable(false); // Removes focus border
        button.addActionListener(this); // Add action listener to the button
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == twoPlayer){
            gameFrame.switchToGamePanel(2);
        }
        if(e.getSource()==onePlayer){
            gameFrame.switchToGamePanel(1);
        }
    }
}
