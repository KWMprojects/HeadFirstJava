public class chapter02TestDrive {
    public static void main(String[] args) {
        chapter02 test = new chapter02();

        test.canRecord = true;
        test.playTape();

        if(test.canRecord == true){
            test.recordTape();
        }
    }       
}