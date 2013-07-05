package orderentry.entities;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
public class Category {

    @Id
    @Column(name = "CTGR_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CTGR_ID_GEN")
    @SequenceGenerator(name = "CTGR_ID_GEN", sequenceName = "CTGR_ID_SEQ")
    private Long id;

    @Version
    @Column(name = "CTGR_VERSION")
    private Long version;

    @Basic(optional = false)
    @Column(name = "CTGR_NAME")
    private String name;

    @Basic
    @Column(name = "CTGR_DESCRIPTION")
    private String description;

    public Category() {
        this(null, null);
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
