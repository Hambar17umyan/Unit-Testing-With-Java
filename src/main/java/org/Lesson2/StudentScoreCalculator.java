package org.Lesson2;

public class StudentScoreCalculator {
    private int satScore;

    public void calculateSATScore(int mathScore, int literacyScore){
        if(mathScore < 0 || mathScore > 100 || literacyScore > 100 || literacyScore < 0){
            satScore = -1;
        } else{
            satScore = mathScore * literacyScore;
        }
    }

    public int getSatScore(){
        return this.satScore;
    }
}
