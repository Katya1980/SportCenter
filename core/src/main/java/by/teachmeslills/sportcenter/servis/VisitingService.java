package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Visiting;
import by.teachmeslills.sportcenter.entity.Worker;
import by.teachmeslills.sportcenter.repository.VisitingInterface;
import by.teachmeslills.sportcenter.repository.WorkerInterface;

public class VisitingService {

    private final VisitingInterface repository;

    public VisitingService(VisitingInterface  repository) {

        this.repository =  repository;
    }
    public void add(Visiting visiting) {

        repository.addVisiting(visiting);
    }

    public void updateVisiting (Long customerId, Long visitingId){
         repository.updateCustomVisiting(customerId,visitingId);
    }


}
