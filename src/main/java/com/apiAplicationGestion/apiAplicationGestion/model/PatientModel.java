package com.apiAplicationGestion.apiAplicationGestion.model;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class PatientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom_pat" )
    private String nom_pat;

    @Column(name = "prenom_pat" )
    private  String prenom_pat;

    @Column(name ="age_pat" )
    private  int age_pat;

    @Column(name = "sexe_pat")
    private  char sexe_pat;

    @Column(name = "adresse_pat")
    private  String adresse_pat;

    @Column(name = "situation_pat")
    private  String situation_pat;

    @Column(name = "assurence_pat")
    private  String assurence_pat;

    @Column(name = "code_assurence_pat")
    private  String code_assurence_pat;

    @Column(name = "Tel_pat")
    private  String Tel_pat;

    @Column(name = "nom_person_a_pre")
    private  String nom_person_a_pre;

    @Column(name = "prenom_person_a_pre")
    private String prenom_person_a_pre;

    @Column(name = "tel_person_a_pre")
    private  String tel_person_a_pre;

    @Column(name = "eth_pat")
    private  String eth_pat;



    // Contructur par default
    public PatientModel(){

    }
    // Constructeur de patientModel


    public PatientModel(int id, String nom_pat, String prenom_pat, int age_pat,
                        char sexe_pat, String adresse_pat, String ssituation_pat,
                        String assurence_pat, String code_assurence_pat, String tel_pat,
                        String nom_person_a_pre, String prenom_person_a_pre, String tel_person_a_pre, String eth_pat) {
        this.id = id;
        this.nom_pat = nom_pat;
        this.prenom_pat = prenom_pat;
        this.age_pat = age_pat;
        this.sexe_pat = sexe_pat;
        this.adresse_pat = adresse_pat;
        this.situation_pat = ssituation_pat;
        this.assurence_pat = assurence_pat;
        this.code_assurence_pat = code_assurence_pat;
        this.Tel_pat = tel_pat;
        this.nom_person_a_pre = nom_person_a_pre;
        this.prenom_person_a_pre = prenom_person_a_pre;
        this.tel_person_a_pre = tel_person_a_pre;
        this.eth_pat = eth_pat;
    }

    public String getPrenom_person_a_pre() {
        return prenom_person_a_pre;
    }

    public void setPrenom_person_a_pre(String prenom_person_a_pre) {
        this.prenom_person_a_pre = prenom_person_a_pre;
    }
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_pat() {
        return nom_pat;
    }

    public void setNom_pat(String nom_pat) {
        this.nom_pat = nom_pat;
    }

    public String getPrenom_pat() {
        return prenom_pat;
    }

    public void setPrenom_pat(String prenom_pat) {
        this.prenom_pat = prenom_pat;
    }

    public int getAge_pat() {
        return age_pat;
    }

    public void setAge_pat(int age_pat) {
        this.age_pat = age_pat;
    }

    public char getSexe_pat() {
        return sexe_pat;
    }

    public void setSexe_pat(char sexe_pat) {
        this.sexe_pat = sexe_pat;
    }

    public String getAdresse_pat() {
        return adresse_pat;
    }

    public void setAdresse_pat(String adresse_pat) {
        this.adresse_pat = adresse_pat;
    }

    public String getSituation_pat() {
        return situation_pat;
    }

    public void setSituation_pat(String ssituation_pat) {
        this.situation_pat = ssituation_pat;
    }

    public String getAssurence_pat() {
        return assurence_pat;
    }

    public void setAssurence_pat(String assurence_pat) {
        this.assurence_pat = assurence_pat;
    }

    public String getCode_assurence_pat() {
        return code_assurence_pat;
    }

    public void setCode_assurence_pat(String code_assurence_pat) {
        this.code_assurence_pat = code_assurence_pat;
    }

    public String getTel_pat() {
        return Tel_pat;
    }

    public void setTel_pat(String tel_pat) {
        Tel_pat = tel_pat;
    }

    public String getNom_person_a_pre() {
        return nom_person_a_pre;
    }

    public void setNom_person_a_pre(String nom_person_a_pre) {
        this.nom_person_a_pre = nom_person_a_pre;
    }

    public String getTel_person_à_pre() {
        return tel_person_a_pre;
    }

    public void setTel_person_à_pre(String tel_person_à_pre) {
        this.tel_person_a_pre = tel_person_à_pre;
    }

    public String getEth_pat() {
        return eth_pat;
    }

    public void setEth_pat(String eth_pat) {
        this.eth_pat = eth_pat;
    }

    @Override
    public String toString() {
        return "PatientModel{" +
                "id=" + id +
                ", nom_pat='" + nom_pat + '\'' +
                ", prenom_pat='" + prenom_pat + '\'' +
                ", age_pat=" + age_pat +
                ", sexe_pat=" + sexe_pat +
                ", adresse_pat='" + adresse_pat + '\'' +
                ", situation_pat='" + situation_pat + '\'' +
                ", assurence_pat='" + assurence_pat + '\'' +
                ", code_assurence_pat='" + code_assurence_pat + '\'' +
                ", Tel_pat='" + Tel_pat + '\'' +
                ", nom_person_a_pre='" + nom_person_a_pre + '\'' +
                ", prenom_person_a_pre='" + prenom_person_a_pre + '\'' +
                ", tel_person_à_pre='" + tel_person_a_pre + '\'' +
                ", eth_pat='" + eth_pat + '\'' +
                '}';
    }
}
