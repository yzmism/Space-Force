import javax.swing.*;

public class Window extends JFrame {
    static final int DEFAULT_WIDTH = 600;
    static final int DEFAULT_HEIGHT = 400;
    static final String title = "Space Force";

    private int width = DEFAULT_WIDTH;
    private int height = DEFAULT_HEIGHT;

    public Window() {
        System.out.println("Window");
        this.setSize(width, height);
        this.init();
    }

    public Window(int _width, int _height) {
        System.out.println("Window");
        this.setSize(_width, _height);
        this.width = _width;
        this.height = _height;
        this.init();
    }
    public void addScene(Scene _scene) {
        System.out.println("Window.addScene(Scene _scene)");
        getContentPane().add(_scene);
    }

    public void init() {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
