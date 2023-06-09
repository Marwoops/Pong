package gamemodes;

import javafx.scene.input.KeyCode;

public interface Gamemode {
	public String getName();
	public void reset();
	public void on_key_pressed(KeyCode key);
	public void on_key_released(KeyCode key);
	public void on_ball_touched_racket(model.Court court, boolean left);
	public void on_ball_left_terrain(model.Court court, boolean left);
	public void update(model.Court court, double dt);
	public void render();
	public void no_render();
	public void update_render(gui.GameView view, model.Court court);
}
