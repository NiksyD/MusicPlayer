import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

class MusicPlayerMethods extends Main{
	
	static String song;
	static int selectSong;
	
	public static int songChoice() {
		System.out.println(">>> SONG CHOICES <<<");
    	System.out.println("[1] Best Friend - Rex Orange County");
    	System.out.println("[2] Always - Daniel Caesar");
    	System.out.println("[3] IDK You Yet - Alexander 23");
    	System.out.println("[4] Exit");
    	System.out.print(">> ");
    	selectSong = scanner.nextInt();
    	scanner.nextLine();
		
		switch (selectSong) {
        case 1:
            song = "Rex Orange County - Best Friend.wav";
            break;
        case 2:
            song = "Daniel Caesar - Always.wav";
            break;
        case 3:
            song = "Alexander 23 - IDK You Yet.wav";
            break;
        case 4:
            System.out.println("Program has been terminated...");
            break;
        default:
            System.out.println("Invalid selection.");
            break;
    	}
		return selectSong;
	}
	
	public static void musicPlayer() {
		Lyrics lyrics_bestfriend = new BestFriend();
		Lyrics lyrics_always = new Always();
		Lyrics lyrics_idkyouyet = new IDKYouYet();
		
	    Clip clip = null;
	    try {
	        File file = new File(song);
	        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
	        clip = AudioSystem.getClip();
	        clip.open(audioStream);

	        String response = "";

	        while (!response.equals("Q")) {
	            System.out.println("\nP = Play, S = Stop, R = Reset, Q = Quit and Select new Song");
	            System.out.print("Enter your choice >> ");
	            response = scanner.next().toUpperCase();

	            switch (response) {
	                case "P":
	                    clip.start();
	                    if(selectSong == 1) {
	                    	lyrics_bestfriend.run();
	                    } else if(selectSong == 2) {
	                    	lyrics_always.run();
	                    } else if(selectSong == 3) {
	                    	lyrics_idkyouyet.run();
	                    }
	                    break;
	                case "S":
	                    clip.stop();
	                    break;
	                case "R":
	                    clip.setMicrosecondPosition(0);
	                    break;
	                case "Q":
	                    clip.close();
	                    break;
	                default:
	                    System.out.println("Not a valid response");
	            }
	        }
	        System.out.println();
	    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	        System.out.println("An error occurred while playing the file: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        if (clip != null) {
	            clip.close();
	        }
	    }
	}

	
}
