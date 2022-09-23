

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "empresa")
public class EmpresaEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;
    @Column 
    private String name;
    @Column
    private String document;
    @Column
    private String phone;
    @Column
    private String address;
    @Column
    private String users;
    @Column
    private String transactions;
    @Column
    private Date createdAt;
    @Column
    private Date updateAt;

    @OneToMany(mappedBy = "users",fetch = FetchType.LAZY)
    private List<EmpresaEntity>empresas;

    public EmpresaEntity() {
    }

    
    public EmpresaEntity(String name, String document, String phone, String address, String users, String transactions,
            Date createdAt, Date updateAt, List<Transaction> empresas) {
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.empresas = empresas;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDocument() {
        return document;
    }


    public void setDocument(String document) {
        this.document = document;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getUsers() {
        return users;
    }


    public void setUsers(String users) {
        this.users = users;
    }


    public String getTransactions() {
        return transactions;
    }


    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }


    public Date getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }


    public Date getUpdateAt() {
        return updateAt;
    }


    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }


    public List<Transaction> getEmpresas() {
        return empresas;
    }


    public void setEmpresas(List<Transaction> empresas) {
        this.empresas = empresas;
    }

 
    
}
