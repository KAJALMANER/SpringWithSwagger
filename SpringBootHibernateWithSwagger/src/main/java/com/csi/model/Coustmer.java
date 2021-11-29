package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Coustmer {

    @Id
    @GeneratedValue
    private int custID;

    private String custName;

    private String custAddress;

    private  String custEmail;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    private long contactNumber;

    private String custPassword;

}
