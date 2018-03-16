package practice5;

import javax.persistence.Embeddable;

@Embeddable
public class LectureId {
    private String name;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LectureId lectureId = (LectureId) o;

        if (name != null ? !name.equals(lectureId.name) : lectureId.name != null) return false;
        return language != null ? language.equals(lectureId.language) : lectureId.language == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
