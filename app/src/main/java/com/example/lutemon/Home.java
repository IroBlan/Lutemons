package com.example.lutemon;

public class Home implements Create {
    private Storage storage;

    public Home() {
        this.storage = Storage.getInstance();
    }

    @Override
    public Lutemon Create_lutemon(String color) {
        switch(color){
            case "White":Lutemon lutemon = WhiteLutemon();
        }
        storage.addLutemon(lutemon);
        return lutemon;
    }

    public void moveToTrainArea(Lutemon lutemon, TrainArea trainArea) {
        storage.moveLutemon(lutemon, trainArea);
    }

    public void moveToBattleField(Lutemon lutemon, BattleField battleField) {
        storage.moveLutemon(lutemon, battleField);
    }
}
