package iesam.features.trains.data;

import iesam.features.trains.domain.Train;

import java.util.ArrayList;
import java.util.Objects;

public class TrainMemLocalDataSource {

    private ArrayList<Train> storage = new ArrayList<>();

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void save(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }

    //Singleton
    private static TrainMemLocalDataSource instance = null;

    public static TrainMemLocalDataSource newInstance(){
        if (instance == null){
            instance = new TrainMemLocalDataSource();
        }
        return instance;
    }
}
