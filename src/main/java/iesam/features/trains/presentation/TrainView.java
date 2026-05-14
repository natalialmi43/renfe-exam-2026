package iesam.features.trains.presentation;

import iesam.features.trains.data.TrainDataRepository;
import iesam.features.trains.data.TrainMemLocalDataSource;
import iesam.features.trains.domain.DeleteTrainUseCase;
import iesam.features.trains.domain.GetTrainsUseCase;
import iesam.features.trains.domain.SaveTrainUseCase;
import iesam.features.trains.domain.Train;

import java.util.ArrayList;

public class TrainView {

    public static void printTrains (){
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        ArrayList <Train> trains = getTrainsUseCase.execute();

        System.out.println(trains);
    }

    public static void saveTrain (){
        SaveTrainUseCase saveTrainUseCase = new SaveTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        Train train = new Train("MD5-001", "Train", "2026", "White");

        printTrains();

        saveTrainUseCase.execute(train);

        printTrains();
    }


    public static void deleteTrain (){

        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        printTrains();

        deleteTrainUseCase.execute("MD5-001");

        printTrains();
    }

}
