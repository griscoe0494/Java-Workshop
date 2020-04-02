import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {
		
	// 1.  Create a variable to hold the user's score 
	int score=0;
			// 2.  Ask the user a question 
			String answer = JOptionPane.showInputDialog("What is 4+4?");
			// 3.  Use an if statement to check if their answer is correct
			if (answer.equals("8")) {
			// 4.  if the user's answer was correct, add one to their score 
			score = score + 1;
		}
			//System.out.println(score);
			JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score);
			// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
			answer = JOptionPane.showInputDialog("8*2?");
			if (answer.equals("16")) {
			score = score + 1;
			}
			//System.out.println(score);
			JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score);
			answer = JOptionPane.showInputDialog("0*2?");
			if (answer.equals("0")) {
			score = score + 1;
			}
			//System.out.println(score);
			JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score);
			answer = JOptionPane.showInputDialog("0+2?");
			if (answer.equals("2")) {
			score = score + 1;
			}
			//System.out.println(score);
			JOptionPane.showMessageDialog(null, "Correct! Your score is now "+score);
			// 6.  After all the questions have been asked, print the user's score 
			
	}
			
}
