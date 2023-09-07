import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedQuizGame extends JFrame {

    private JLabel questionLabel;
    private JRadioButton[] options;
    private JButton submitButton;
    private int currentQuestion;

    private String[][] quizData = {
            {"Q1: What is the capital of France?", "Paris", "London", "Berlin", "Rome", "A"},
            {"Q2: Who painted the Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo", "A"},
            {"Q3: What is the largest planet in our solar system?", "Jupiter", "Saturn", "Mars", "Earth", "A"}
    };

    public AdvancedQuizGame() {
        setTitle("Advanced Quiz Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1));
        getContentPane().add(panel);

        questionLabel = new JLabel();
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(questionLabel);

        options = new JRadioButton[4];
        ButtonGroup group = new ButtonGroup();

        for (int i = 0; i < options.length; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            panel.add(options[i]);
        }

        submitButton = new JButton("Submit");
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validateSelection()) {
                    if (currentQuestion < quizData.length - 1) {
                        currentQuestion++;
                        loadQuestion();
                    } else {
                        showResult();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an option!");
                }
            }
        });

        currentQuestion = 0;
        loadQuestion();
        setVisible(true);
    }

    private void loadQuestion() {
        questionLabel.setText(quizData[currentQuestion][0]);

        for (int i = 0; i < options.length; i++) {
            options[i].setText(quizData[currentQuestion][i + 1]);
            options[i].setSelected(false);
        }
    }

    private boolean validateSelection() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].isSelected()) {
                return true;
            }
        }
        return false;
    }

    private void showResult() {
        int correctAnswers = 0;

        for (int i = 0; i < quizData.length; i++) {
            if (options[i].isSelected() && options[i].getText().equals(quizData[i][5])) {
                correctAnswers++;
            }
        }

        int totalQuestions = quizData.length;
        double percentage = (double) correctAnswers / totalQuestions * 100;

        String result = String.format("You answered %d out of %d questions correctly (%.2f%%).",
                correctAnswers, totalQuestions, percentage);
        JOptionPane.showMessageDialog(null, result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdvancedQuizGame();
            }
        });
    }
}
