abstract class Lyrics implements Runnable {

    String[] lyrics;  // Array of Lyrics defined for subclass
    long[] timestamps;  // Array of Time Stamps defined for subclass

    @Override
    public void run() {
        long songStartTime = System.currentTimeMillis();
        for (int i = 0; i < lyrics.length; i++) {
            long currentTime = System.currentTimeMillis();
            long timeToWait = (songStartTime + timestamps[i]) - currentTime;

            if (timeToWait > 0) {
                try {
                    Thread.sleep(timeToWait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            typewriterEffect(lyrics[i]);
        }
    }

    private void typewriterEffect(String text) {
    	
        System.out.println();
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(55); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// BEST FRIEND - REX ORANGE COUNTY
class BestFriend extends Lyrics {
    BestFriend() {
        lyrics = new String[]{
            "I should've stayed at home", "Cause right now I see all these people that love me", "But I still feel alone",
            "Can't help but check my phone", "I could've made you mine", "But no, it wasn't meant to be and see, I wasn't made for you",
            "And you weren't made for me", "Though it seemed so easy", "And that's because I wanna be your favorite boy",
            "I wanna be the one that makes your day", "The one you think about as you lie awake", "I can't wait to be your number one",
            "I'll be your biggest fan and you'll be mine", "But I still wanna break your heart and make you cry", "But won't you wait?",
            "You know it's too late", "I'm on my own now", "Let me tell you how it feels to be fucking great", "I feel great",
            "Whoa, whoa, whoa, whoa, whoa", "You need to be yourself", "Love someone for loving you instead of someone really cool",
            "That makes your heart melt", "Who knows what you truly felt?", "You're still my favorite girl", "You better trust me when I tell you",
            "There ain't no one else more beautiful in this damn world", "In this damn world", "You're gonna wanna be my best friend, baby",
            "You're gonna wanna be my best friend", "I said that", "You're gonna wanna be my best friend, baby", "You're gonna wanna be my best friend",
            "Best friend", "You're gonna wanna be my best friend, baby", "You're gonna wanna be my best friend", "Best friend",
            "You're gonna wanna be my best friend", "I say that I'm happy", "I say that I'm happy", "But no, no, no, no",
            "No, no, no", "Oh, I still wanna be your favorite boy", "I wanna be the one that makes your day",
            "The one you think about as you lie awake", "And I can't wait to be your number, your number one", "I'll be your biggest fan and you'll be mine",
            "But I still wanna break your heart and make you cry", "I still wanna be your favorite boy", "I still wanna be your favorite boy",
            "Oh, I wanna be the one", "I might just be the one"
        };

        timestamps = new long[]{
            0, 3000, 5000, 8000, 12000, 17000, 19000, 23000, 28000,
            32000, 35000, 42000, 48000, 51000, 56000, 60000, 62000, 67000,
            73000, 76000, 82000, 86000, 91000, 94000, 99000, 104000, 107000,
            112000, 118000, 121000, 124000, 128000, 132000, 138000, 142000,
            146000, 152000, 156000, 160000, 163000, 166000, 172000, 175000,
            180000, 185000, 190000, 197000, 203000, 214000, 219000, 223000,
            234000, 253000, 260000, 265000
        };
    }
}

// ALWAYS - DANIEL CAESAR
class Always extends Lyrics {
    Always() {
        lyrics = new String[]{
            "Baby, baby", "There will always be a space for you and me", "Right where you left it",
            "And just maybe", "Enough time will pass", "We'll look back and laugh",
            "Just don't forget it", "And maybe I'm wrong", "For writing this song",
            "Losing my head over you", "And I'll be here", "'Cause we both know how it goes",
            "I don't want things to change", "I pray they stay the same always",
            "And I don't care", "If you're with somebody else", "I'll give you time and space",
            "Just know I'm not a phase", "I'm always, ways, ways", "Always, ways, ways",
            "I'm always, ways, ways", "Pretty lady, used to walk with me", "Down Bloor street, oh, what a time",
            "And I still remember the fussin', the fightin', the fuckin', the lyin'", "It's all fine, you'll always be mine",
            "And maybe I'm wrong (hey, babe, you could)", "For writing this song (write me a song)",
            "Losing my head over you", "And I'll be here", "'Cause we both know how it goes",
            "I don't want things to change", "I pray they stay the same always",
            "And I don't care", "If you're with somebody else", "I'll give you time and space",
            "Just know I'm not a phase", "I'm always, ways, ways", "Always, ways, ways",
            "I'm always, ways, ways", "Always, can count on it sure as the stars in the sky",
            "Always, you can count on it sure as the stars in the sky", "Always, my love for you ain't goin' nowhere",
            "Always, I will be here"
        };

        timestamps = new long[]{
            15000, 19500, 24000, 28500, 33000, 36500, 40000, 43500, 47000, 50500, 55000, 57500, 61000, 64500, 68000, 71500,
            75000, 78500, 82000, 85500, 89000, 92500, 96000, 99500, 103000, 106500, 110000, 113500, 117000, 120500, 124000,
            127500, 131000, 134500, 138000, 141500, 145000, 148500, 152000, 155500, 159000, 162500, 166000, 169500, 173000, 176500,
            180000, 183500, 187000, 190500, 194000, 197500, 201000, 204500, 208000, 211500, 215000, 218500, 222000, 225500, 229000
        };
    }
}

// IDK You Yet - Alexander 23
class IDKYouYet extends Lyrics {
    IDKYouYet() {
        lyrics = new String[]{
            "How can you miss someone you've never met?",
            "'Cause I need you now, but I don't know you yet",
            "But can you find me soon because I'm in my head?",
            "Yeah, I need you now, but I don't know you yet",
            "'Cause lately it's been hard",
            "They're sellin' me for parts",
            "And I don't wanna be modern art",
            "But I only got half a heart to give to you",
            "How can you miss someone you've never seen?",
            "Oh, tell me, are your eyes brown, blue, or green?",
            "And do you like it with sugar and cream?",
            "Or do you take it straight, oh, just like me?",
            "Yeah, lately it's been hard",
            "They're sellin' me for parts",
            "And I don't wanna be modern art",
            "But I only got half a heart to give to you",
            "And I hope it's enough",
            "How can you miss someone you've never met?",
            "'Cause I need you now, but I don't know you yet",
            "But can you find me soon because I'm in my head?",
            "Yeah, I need you now, but I don't know you yet",
            "I need you now, but I don't know you yet",
            "I need you now, but I don't know you yet",
            "I need you now, but I don't know you yet",
            "I need you now, but I don't know you yet"
        };

        timestamps = new long[]{
            17000, 23000, 29000, 34500, 41000, 47000, 52000, 58000, 65000, 74500, 78500, 84000,
            89500, 95500, 102500, 108000, 112000, 137000, 142000, 148000, 153000, 158000, 163000,
            168000, 173000
        };
    }
}
