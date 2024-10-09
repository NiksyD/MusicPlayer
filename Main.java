import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
	    
	    boolean running = true;
	    while(running) {
	    	
	    	int selectSong = MusicPlayerMethods.songChoice();
	    	
	    	if(selectSong == 4) {
	    		System.out.println("Program has been terminated...");
	            running = false;
	            break;
	    	} else {
	    		MusicPlayerMethods.musicPlayer();
	    	}
	    	
	    }
	    scanner.close();
	}
	
}