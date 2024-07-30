import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    static boolean start = false;
    GamePanel gamePanel;
    StartPanel startPanel;

    GameFrame() {
        startPanel = new StartPanel(this);
        // Start with the start panel
        this.add(startPanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void switchToGamePanel(int player) {
            // Remove the start panel and add the game panel
            if (gamePanel == null) {
                gamePanel = new GamePanel(player);
            }
            this.remove(startPanel);
            this.add(gamePanel);
            this.validate(); // Validate the container
            this.repaint();  // Repaint the container
            gamePanel.requestFocusInWindow(); // Request focus for the game panel
        }
    }

