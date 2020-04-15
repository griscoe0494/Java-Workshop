import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	BufferedImage maze;
	final int frameWidth = 500;
	final int frameHeight = 500;
	
	public static void main(String[] args) throws IOException {
		SwingUtilities.invokeLater(new ScaryMaze());
	}
	ScaryMaze() throws IOException {
		maze = ImageIO.read(getClass().getResource("Maze(2).jpg"));

	}
	
	@Override
	public void run() {
		JFrame frame = new JFrame("ScaryMaze");
		frame.add(this);
		setPreferredSize(new Dimension (frameWidth, frameHeight));
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected
	void paintComponent (Graphics g) {
		g.drawImage(maze, 0, 0,null);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
