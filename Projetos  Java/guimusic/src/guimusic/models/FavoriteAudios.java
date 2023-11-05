package guimusic.models;

public class FavoriteAudios {
    public void includes(Audio audio){
        if(audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " is on the list of the best");
        } else {
            System.out.println(audio.getTitle() + " is a good audio option");
        }
    }
}
