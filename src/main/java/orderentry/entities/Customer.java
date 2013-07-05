package orderentry.entities;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @Column(name = "CUST_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_ID_GEN")
    @SequenceGenerator(name = "CUST_ID_GEN", sequenceName = "CUST_ID_SEQ")
    private Long id;

    @Version
    @Column(name = "CUST_VERSION")
    private Long version;

    @Basic
    @Column(name = "CUST_USERNAME")
    private String username;

    public Customer() {
        this(null);
    }

    public Customer(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
