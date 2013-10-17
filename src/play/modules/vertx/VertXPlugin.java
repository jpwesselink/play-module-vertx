package play.modules.vertx;

import play.Logger;
import play.PlayPlugin;

public class VertXPlugin extends PlayPlugin {
	public void onApplicationStart() {
		Logger.info("Starting vertx");
		VertXLoader.restart();
	}
	public void onApplicationStop() {
		Logger.info("Stopping vertx");
		VertXLoader.shutdown();
	}
}
