public class Television{
  int channelNumber;
  int volume;
  boolean isBlackAndWhite;
// behaviours
  void changeChannelNumber(int number){
    channelNumber =  number;
  }
  void changeVolume(int number){
    volume = number;
  }
  void printTelevesionDetails(){
    System.out.println("Channel Number is " + channelNumber + "Volume is " + volume);
  }
}

public class LgTelevision{
  public static void main(String[] args){
    Television remote = new Television();
    remote.changeChannelNumber(5);
    remote.changeVolume(10);
    remote.printTelevisionDetails();
  }
}
