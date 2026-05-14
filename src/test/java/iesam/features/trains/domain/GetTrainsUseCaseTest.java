package iesam.features.trains.domain;

import iesam.features.trains.mocks.EmptyTrainMockRepository;
import iesam.features.trains.mocks.NullTrainMockRepository;
import iesam.features.trains.mocks.TrainMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetTrainsUseCaseTest {

    GetTrainsUseCase getTrainsUseCase;
    TrainMockRepository trainMockRepository;
    EmptyTrainMockRepository emptyTrainMockRepository;
    NullTrainMockRepository nullTrainMockRepository;

    @Test
    public void shouldReturnListOfTrainsWhenExecuteUseCase(){
         //Given
        trainMockRepository = new TrainMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(trainMockRepository);

         //When
        ArrayList <Train> trains = getTrainsUseCase.execute();

         //Then
        assertEquals(1, trains.size());
    }

    @Test
    public void shouldReturnEmptyListOfTrainsWhenExecuteUseCase(){
        //Given
        emptyTrainMockRepository = new EmptyTrainMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(emptyTrainMockRepository);

        //When
        ArrayList <Train> trains = getTrainsUseCase.execute();

        //Then
        assertEquals(0, trains.size());
    }

    @Test
    public void shouldReturnNullWhenExecuteUseCase(){
        //Given
        nullTrainMockRepository = new NullTrainMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(nullTrainMockRepository);

        //When
        ArrayList <Train> trains = getTrainsUseCase.execute();

        //Then
        assertNull(trains);
    }

}