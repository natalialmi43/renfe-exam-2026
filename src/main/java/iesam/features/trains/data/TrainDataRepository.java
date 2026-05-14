package iesam.features.trains.data;

import iesam.features.trains.domain.Train;
import iesam.features.trains.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {

    private TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void saveTrain(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public ArrayList<Train> getTrains() {
        return trainMemLocalDataSource.findAll();
    }

    @Override
    public void deleteTrain(String id) {
        trainMemLocalDataSource.delete(id);
    }
}
