package guimusic.main;

import guimusic.models.FavoriteAudios;
import guimusic.models.Music;
import guimusic.models.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Music mymusic = new Music();
        mymusic.setTitle("Living like a dog");
        mymusic.setSinger("Peppa the dog");

        for (int i = 0; i < 1000; i++) {
            mymusic.play();
        }
        for (int i = 0; i < 50; i++) {
            mymusic.like();
        }

        Podcast mypodcast = new Podcast();
        mypodcast.setTitle("Otelo speaks");
        mypodcast.setHost("Otelo the cat");

        for (int i = 0; i < 5000; i++) {
            mypodcast.play();
        }
        for (int i = 0; i < 1000; i++) {
            mypodcast.like();
        }

        FavoriteAudios favorite = new FavoriteAudios();
        favorite.includes(mypodcast);
        favorite.includes(mymusic);
    }
}