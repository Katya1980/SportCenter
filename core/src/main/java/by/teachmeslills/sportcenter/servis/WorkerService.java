package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Customer;
import by.teachmeslills.sportcenter.entity.Worker;
import by.teachmeslills.sportcenter.repository.CustomerInterface;
import by.teachmeslills.sportcenter.repository.WorkerInterface;

public class WorkerService {

    private final WorkerInterface repository;

    public WorkerService(WorkerInterface  repository) {

        this.repository =  repository;
    }
    public void add(Worker worker) {

        repository.addWorker(worker);
    }
}
