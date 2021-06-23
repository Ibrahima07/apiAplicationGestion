package com.apiAplicationGestion.apiAplicationGestion.model;

import javax.persistence.*;

@Entity
@Table(name = "rendezVous")
public class rendezVousModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code_rdv")
    private String code_rdv;

    @Column(name = "date_rdv_create")
    private String date_rdv_create;

    @Column(name = "get_date_rdv")
    private String get_date_rdv;

    @Column(name = "service")
    private String service;

    @Column(name = "nom_complet")
    private String nom_complet;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "numero_de_tel")
    private String numero_de_tel;

    @Column(name = "age")
    private int age;

    @Column(name = "medcin")
    private String medcin;

    public  rendezVousModel(){

    }
    public rendezVousModel(int id, String code_rdv, String date_rdv_create, String get_date_rdv, String service, String
            nom_complet, String adresse, String numero_de_tel, int age, String medcin) {
        this.id = id;
        this.code_rdv = code_rdv;
        this.date_rdv_create = date_rdv_create;
        this.get_date_rdv = get_date_rdv;
        this.service = service;
        this.nom_complet = nom_complet;
        this.adresse = adresse;
        this.numero_de_tel = numero_de_tel;
        this.age = age;
        this.medcin = medcin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_rdv() {
        return code_rdv;
    }

    public void setCode_rdv(String code_rdv) {
        this.code_rdv = code_rdv;
    }

    public String getDate_rdvCreate() {
        return date_rdv_create;
    }

    public void setDate_rdvCreate(String date_rdvCreate) {
        this.date_rdv_create = date_rdvCreate;
    }

    public String getGet_date_rdv() {
        return get_date_rdv;
    }

    public void setGet_date_rdv(String get_date_rdv) {
        this.get_date_rdv = get_date_rdv;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumero_de_tel() {
        return numero_de_tel;
    }

    public void setNumero_de_tel(String numero_de_tel) {
        this.numero_de_tel = numero_de_tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedcin() {
        return medcin;
    }

    public void setMedcin(String medcin) {
        this.medcin = medcin;
    }

    @Override
    public String toString() {
        return "rendezVousModel{" +
                "id=" + id +
                ", code_rdv='" + code_rdv + '\'' +
                ", date_rdvCreate='" + date_rdv_create + '\'' +
                ", get_date_rdv='" + get_date_rdv + '\'' +
                ", service='" + service + '\'' +
                ", nom_complet='" + nom_complet + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numero_de_tel='" + numero_de_tel + '\'' +
                ", age=" + age +
                ", medcin='" + medcin + '\'' +
                '}';
    }
}
