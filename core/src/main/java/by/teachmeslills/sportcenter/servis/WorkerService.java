package by.teachmeslills.sportcenter.servis;

import by.teachmeslills.sportcenter.entity.Worker;
import by.teachmeslills.sportcenter.repository.WorkerInterface;

public class WorkerService {

    private final WorkerInterface repository;

    public WorkerService(WorkerInterface  repository) {

        this.repository =  repository;
    }
    public void add(Worker worker) {

        repository.addWorker(worker);
    }

    public boolean maxSalary(int salary){
         repository.maxSalaryWorker(salary);
        return false;
    }

}
