package practice5;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Lecture {
    @EmbeddedId
    private LectureId id;

    @OneToOne(fetch = FetchType.LAZY)
    private LectureContent content;

    Lecture(LectureId my_id, LectureContent info){
        this.id=my_id;
        this.content=info;

    }

    public LectureId getId() {
        return id;
    }

    public void setId(LectureId id) {
        this.id = id;
    }

    public LectureContent getContent() {
        return content;
    }

    public void setContent(LectureContent content) {
        this.content = content;
    }
}
