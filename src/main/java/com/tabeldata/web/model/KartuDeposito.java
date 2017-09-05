/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.model;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author VALERIANPC
 */
@Entity
@Table(name = "m_kartu_deposito", schema = "latihan")
public class KartuDeposito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nomorRekening;
    
    @Column(name = "bulan_ke", nullable = false)
    private String bulanKe;
    
    @Column(name = "bunga_bulanan", nullable = false)
    private BigDecimal bungaBulanan;
    
    @Column(name = "jatuh_tempo", nullable = false)
    private Date jatuhTempo;  
    
    @ManyToOne
    @JoinColumn(name = "id_nasabah")
    private Nasabah nasabah;
    
    @OneToOne
    @JoinColumn(name = "id_deposito")
    private Deposito deposito;

    public KartuDeposito() {
    }

    public KartuDeposito(String nomorRekening, String bulanKe, BigDecimal bungaBulanan, Date jatuhTempo, Nasabah nasabah, Deposito deposito) {
        this.nomorRekening = nomorRekening;
        this.bulanKe = bulanKe;
        this.bungaBulanan = bungaBulanan;
        this.jatuhTempo = jatuhTempo;
        this.nasabah = nasabah;
        this.deposito = deposito;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public String getBulanKe() {
        return bulanKe;
    }

    public void setBulanKe(String bulanKe) {
        this.bulanKe = bulanKe;
    }

    public BigDecimal getBungaBulanan() {
        return bungaBulanan;
    }

    public void setBungaBulanan(BigDecimal bungaBulanan) {
        this.bungaBulanan = bungaBulanan;
    }

    public Date getJatuhTempo() {
        return jatuhTempo;
    }

    public void setJatuhTempo(Date jatuhTempo) {
        this.jatuhTempo = jatuhTempo;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }
    
    
    
    
    
}
