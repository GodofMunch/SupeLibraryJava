package packagename;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "GENRE", schema = "SUPERLIBRARY", catalog = "")
public class GenreEntity {
    private byte genreid;
    private String genre;

    @Id
    @Column(name = "GENREID")
    public byte getGenreid() {
        return genreid;
    }

    public void setGenreid(byte genreid) {
        this.genreid = genreid;
    }

    @Basic
    @Column(name = "GENRE")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreEntity that = (GenreEntity) o;
        return genreid == that.genreid &&
                Objects.equals(genre, that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreid, genre);
    }
}
