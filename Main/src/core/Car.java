package core;

public class Car {
    private Player player;
    private World world;

    public Car() { }
    public Car(World w) {
        world = w;
    }

    public void setPlayer(Player p) {
        if (player != null)
            player = p;
    }

    public Player getPlayer() {
        return player;
    }

    public void removePlayer() {
        player = null;
    }

    public World getWorld() {
        return world;
    }
}