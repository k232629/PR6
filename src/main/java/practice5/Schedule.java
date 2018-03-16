package practice5;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Schedule {
    @Id @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Lecture> lecturesoerder;
}
