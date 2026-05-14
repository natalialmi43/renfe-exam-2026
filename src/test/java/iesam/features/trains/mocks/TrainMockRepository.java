package iesam.features.trains.mocks;

import iesam.features.trains.domain.Train;
import iesam.features.trains.domain.TrainRepository;

import java.util.ArrayList;

public class TrainMockRepository implements TrainRepository {

    public Integer saveMethodCounter = 0;

    @Override
    public void saveTrain(Train train) {
        saveMethodCounter ++;
    }

    @Override
    public ArrayList<Train> getTrains() {

        ArrayList <Train> trains = new ArrayList<>();
        Train train = new Train("MD5-001", "Train", "2026", "White");
        trains.add(train);

        return trains;
    }

    @Override
    public void deleteTrain(String id) {

    }
}
