package com.example.lutemon;

public class TrainingField implements Train{
    private Storage storage;

    public void TrainingFieldeld() {
        this.storage = Storage.getInstance();
    }

    @Override
    public void train(Lutemon lutemon) {
        // Training logic here
    }
}
