package com.egregius.Springboot_addressbook;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



    @Entity
    @Table(name = "addressbook")
    public class AddressbookEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "firstname", nullable = false)
        private String firstname;

        @Column(name = "lastname", nullable = false)
        private String lastname;

        @Column(name = "phonenumber", nullable = false)
        private String phonenumber;

        @Column(name = "emailaddress", nullable = false)
        private String emailaddress;


        public AddressbookEntity() {

        }

        public AddressbookEntity(String firstname, String lastname, String phonenumber, String emailaddress) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.phonenumber = phonenumber;
            this.emailaddress =emailaddress;
        }


        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }


        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }


        public String getPhonenumber() {
            return phonenumber;
        }
        public void setPhonenumber(String phonenumber)
        {   this.phonenumber = phonenumber;}



        public String getEmailaddress() {
            return emailaddress;
        }
        public void setEmailaddress(String emailaddress) {
            this.emailaddress = emailaddress;

        }
        @Override
        public String toString() {
            return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname +
                    "phonenumber=" + phonenumber + ", emailaddress=" + emailaddress + "]";
        }

    }

