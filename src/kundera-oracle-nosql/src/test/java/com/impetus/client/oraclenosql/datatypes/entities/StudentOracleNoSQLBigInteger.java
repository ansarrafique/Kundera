package com.impetus.client.oraclenosql.datatypes.entities;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentOracleNoSQLBigInteger", schema = "OracleNoSqlTests@twikvstore")
public class StudentOracleNoSQLBigInteger implements Serializable
{

    @Id
    private BigInteger id;

    @Column(name = "AGE")
    private short age;

    @Column(name = "NAME")
    private String name;

    /**
     * @return the id
     */
    public BigInteger getId()
    {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(BigInteger id)
    {
        this.id = id;
    }

    /**
     * @return the age
     */
    public short getAge()
    {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(short age)
    {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
