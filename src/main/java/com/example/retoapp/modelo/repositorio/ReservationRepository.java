package com.example.retoapp.modelo.repositorio;

import com.example.retoapp.modelo.entidad.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long>{
    @Query("select c.client,count(c.client) from Reservation as c group by c.client order by count(c.client) DESC")
    public List<Object[]> countTotalReservationByClient();
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne,
                                                                       Date dateTwo);
    public List<Reservation> findAllByStatus(String status);


}
