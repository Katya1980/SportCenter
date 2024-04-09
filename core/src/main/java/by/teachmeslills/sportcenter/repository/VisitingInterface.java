package by.teachmeslills.sportcenter.repository;

import by.teachmeslills.sportcenter.entity.Visiting;

public interface VisitingInterface {

    void  addVisiting (Visiting visiting);

    void updateCustomVisiting (Long  customerId, Long visitingId);
}
