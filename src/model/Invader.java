public abstract class Invader extends Mob {
    public Invader() {
        super();
        this.name = "Invader";
    }

    public Invader(String _name) {
        super(_name);
    }

    public Invader(String _name, String _description) {
        super(_name, _description);
        this.init();
    }

    public void init() {
        System.out.println("Player.init()");
        this.setCoord(10, 10);
    }

    public void draw() {
    }

    public void resize() {
    }

    // TODO: Draw for Invader
    // Have to fix the changing of icons
    // inside Atom first
}