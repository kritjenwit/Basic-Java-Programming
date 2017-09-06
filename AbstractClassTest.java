abstract class Player {

    String name;

    Player(String nm) {
        name = nm;
    }

    // public String getname() {
    //     return name;
    //}

    public abstract void play();

}


class Cricket_Player extends Player {
    Cricket_Player(String nm) {
        super(nm);
    }

    public void play() {
        System.out.println(name + " play Cricket");
    }
}

class Hockey_Player extends Player {
    Hockey_Player(String nm) {
        super(nm);
    }

    public void play() {
        System.out.println(name + " play Hockey");
    }
}

class Football_Player extends Player {
    Football_Player(String nm) {
        super(nm);
    }

    public void play() {
        System.out.println(name + " play Footabll");
    }
}


class AbstractClassTest {
    public static void main(String args[]) {
        Player ref;
        Cricket_Player c1 = new Cricket_Player("Zion");
        Hockey_Player h1 = new Hockey_Player("Zion");
        Football_Player f1 = new Football_Player("Jenwit");

        ref = c1;
        ref.play();
        ref = h1;
        ref.play();
        ref = f1;
        ref.play();

    }
}
