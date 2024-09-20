class Ab{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class Bb extends Ab{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in B show");
    }
}


public class AnnotationsOver {
    public static void main(String[] args) {
        Bb obj = new Bb();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
