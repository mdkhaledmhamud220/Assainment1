public class RangeInput {
    private int currentTempreature, maxTempreature, minTempreature;

    public RangeInput(){
        maxTempreature = 80;
        minTempreature = 60;
        current();
    }

    public RangeInput(int min, int max){
        maxTempreature = max;
        minTempreature = min;
        current();
    }

    private void current(){

        currentTempreature = (maxTempreature + minTempreature)/2;
    }

    public void up(){

        currentTempreature = Math.min(maxTempreature, currentTempreature + 1);
    }

    public void down(){

        currentTempreature = Math.max(minTempreature, currentTempreature - 1);
    }

    public int getCurrentTempreature(){

        return currentTempreature;
    }
}
