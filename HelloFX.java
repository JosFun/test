package hellofx;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.*;

public class HelloFX extends Application {
	private Label label;
	
	@Override
	public void init ( ) {
		this.label = new Label ( "Hello FX!" );
	}
	
	@Override
	public void start ( Stage stage ) {
		StackPane root = new StackPane ( );
		root.getChildren ( ).add ( this.label );
		Scene scene = new Scene ( root, 200, 200 );
		stage.setTitle ( "Hello FX!" );
		stage.setScene ( scene );
		stage.show ( );
	
	}
	
	@Override
	public void stop ( ) {
	}
	
	public static void main ( String [ ] args ) {
		System.out.println ( "Hello FX! I am currently learning Git as well! This is aweseome!" );
		launch ( args );
	}
}