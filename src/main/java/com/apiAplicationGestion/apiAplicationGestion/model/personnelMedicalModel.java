package com.apiAplicationGestion.apiAplicationGestion.model;




import javax.persistence.*;

@Entity
@Table(name = "personnelMedicals")
public class personnelMedicalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom_personnel")
    private String nom_personnel;

    @Column(name = "prenom_personnel")
    private String prenom_personnel;

    @Column(name = "tel_personnel")
    private String tel_personnel;

    @Column(name = "specialite_personnel")
    private String specialite_personnel;

    @Column(name = "service_personnel")
    private String service_personnel;

    @Column(name = "status_personnel")
    private String status_personnel;

    @Column(name = "jours_personnel")
    private String jours_personnel;

    @Column(name = "heurs_personnel")
    private String heurs_personnel;

    @Column(name = "email_personnel")
    private String email_personnel;

    @Column(name = "password_personnel")
    private String password_personnel;

    @Column(name = "adresse_personnel")
    private String adresse_personnel;

    /**
     * Contructeur par defaut personnelMedicalModel
     * */
    public personnelMedicalModel(){

    }
    /**
     * Constructeur de personnelMedicalModel
     *
     * prend la comme parametre
     * id: int (id de personnelMedical)
     * nom_personnel: String (Nom personnelMedical)
     * */
    public personnelMedicalModel(Integer id, String nom_personnel, String prenom_personnel,
                                 String tel_personnel, String specialite_personnel,
                                 String service_personnel, String status_personnel,
                                 String jours_personnel, String heurs_personnel,
                                 String email_personnel, String password_personnel,
                                 String adresse_personnel) {
        this.id = id;
        this.nom_personnel = nom_personnel;
        this.prenom_personnel = prenom_personnel;
        this.tel_personnel = tel_personnel;
        this.specialite_personnel = specialite_personnel;
        this.service_personnel = service_personnel;
        this.status_personnel = status_personnel;
        this.jours_personnel = jours_personnel;
        this.heurs_personnel = heurs_personnel;
        this.email_personnel = email_personnel;
        this.password_personnel = password_personnel;
        this.adresse_personnel = adresse_personnel;
    }

    /**
     * ======================================Getters personnelMedicalModel===================================
     * */
    public Integer getId() {
        return id;
    }

    public String getNom_personnel() {
        return nom_personnel;
    }

    public String getPrenom_personnel() {
        return prenom_personnel;
    }

    public String getTel_personnel() {
        return tel_personnel;
    }

    public String getSpecialite_personnel() {
        return specialite_personnel;
    }

    public String getService_personnel() {
        return service_personnel;
    }

    public String getStatus_personnel() {
        return status_personnel;
    }

    public String getJours_personnel() {
        return jours_personnel;
    }

    public String getHeurs_personnel() {
        return heurs_personnel;
    }

    public String getEmail_personnel() {
        return email_personnel;
    }

    public String getPassword_personnel() {
        return password_personnel;
    }

    public String getAdresse_personnel() {
        return adresse_personnel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * =======================================================Setters personnelMedicalModel===========================
     * */
    public void setNom_personnel(String nom_personnel) {
        this.nom_personnel = nom_personnel;
    }

    public void setPrenom_personnel(String prenom_personnel) {
        this.prenom_personnel = prenom_personnel;
    }

    public void setTel_personnel(String tel_personnel) {
        this.tel_personnel = tel_personnel;
    }

    public void setSpecialite_personnel(String specialite_personnel) {
        this.specialite_personnel = specialite_personnel;
    }

    public void setService_personnel(String service_personnel) {
        this.service_personnel = service_personnel;
    }

    public void setStatus_personnel(String status_personnel) {
        this.status_personnel = status_personnel;
    }

    public void setJours_personnel(String jours_personnel) {
        this.jours_personnel = jours_personnel;
    }

    public void setHeurs_personnel(String heurs_personnel) {
        this.heurs_personnel = heurs_personnel;
    }

    public void setEmail_personnel(String email_personnel) {
        this.email_personnel = email_personnel;
    }

    public void setPassword_personnel(String password_personnel) {
        this.password_personnel = password_personnel;
    }

    public void setAdresse_personnel(String adresse_personnel) {
        this.adresse_personnel = adresse_personnel;
    }

    /**
     * =========================================================toString methode personnelMedicalModel =================================
     * */
    @Override
    public String toString() {
        return "personnelMedicalModel{" +
                "id=" + id +
                ", nom_personnel='" + nom_personnel + '\'' +
                ", prenom_personnel='" + prenom_personnel + '\'' +
                ", tel_personnel='" + tel_personnel + '\'' +
                ", specialite_personnel='" + specialite_personnel + '\'' +
                ", service_personnel='" + service_personnel + '\'' +
                ", status_personnel='" + status_personnel + '\'' +
                ", jours_personnel='" + jours_personnel + '\'' +
                ", heurs_personnel='" + heurs_personnel + '\'' +
                ", email_personnel='" + email_personnel + '\'' +
                ", password_personnel='" + password_personnel + '\'' +
                ", adresse_personnel='" + adresse_personnel + '\'' +
                '}';
    }
}
