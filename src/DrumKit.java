public class DrumKit {
   boolean topHat = true;
   boolean snare = true;

   void playSnare(){
       System.out.println("bang bang ba-bang");
   }

   void playTopHat(){
       System.out.println("dingn ding da-ding");
   }

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
           if(d.snare==true){
            d.playSnare();
            }
        d.playTopHat();
           d.snare=false;
    }
}

class DrumkitTestDrive{
}