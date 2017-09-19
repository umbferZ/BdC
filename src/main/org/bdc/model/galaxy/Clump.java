/*
 * 
 * Created by Umberto Ferracci, Francesco Ottaviano and Federica Zelli
 * Project: BdC - Osservatorio Astronomico Virtuale
 * Package: main.org.bdc.model.galaxy
 * Type: Clump
 * Last update: 15-set-2017 1.50.10
 * 
 */

package main.org.bdc.model.galaxy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 * The Class Clump.
 */
@Entity
public class Clump implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "clump")
    private ClumpDetails  clumpDetails;

    @Transient
    private double        distance;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "clump")
    private List<Ellipse> ellispses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Flow>    flows;

    @Id
    private int           id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Map           map;

    @Transient
    private double        massa;


    public BigDecimal getFraction() {
        return fraction;
    }

    public void setFraction(BigDecimal fraction) {
        this.fraction = fraction;
    }

    @Transient
    private BigDecimal fraction;

    /**
     * Instantiates a new clump.
     */
    public Clump() {
        ellispses = new ArrayList<>();
        flows = new ArrayList<>();
    }

    public Clump(Map map, ClumpDetails clumpDetails) {
        this();
        this.map = map;
        this.clumpDetails = clumpDetails;
    }

    /**
     * Adds the ellipse.
     *
     * @param ellipse the ellipse
     */
    public void addEllipse(Ellipse ellipse) {
        ellispses.add(ellipse);
    }

    public void addFlow(Flow flow) {
        flows.add(flow);
    }

    public ClumpDetails getClumpDetails() {
        return clumpDetails;
    }

    public double getDistance() {
        return distance;
    }

    /**
     * Gets the ellispses.
     *
     * @return the ellispses
     */
    public List<Ellipse> getEllispses() {
        return ellispses;
    }

    /**
     * Gets the ellisse.
     *
     * @return the ellisse
     */
    public List<Ellipse> getEllisse() {
        return ellispses;
    }

    public List<Flow> getFlows() {
        return flows;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the map.
     *
     * @return the map
     */
    public Map getMap() {
        return map;
    }

    public double getMassa() {
        return massa;
    }

    public void setClumpDetails(ClumpDetails clumpDetails) {
        this.clumpDetails = clumpDetails;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Sets the ellisse.
     *
     * @param ellipses the new ellisse
     */
    public void setEllipse(List<Ellipse> ellipses) {
        ellispses = ellipses;
    }

    /**
     * Sets the ellispses.
     *
     * @param ellispses the new ellispses
     */
    public void setEllispses(List<Ellipse> ellispses) {
        this.ellispses = ellispses;
    }

    public void setFlows(List<Flow> flows) {
        this.flows = flows;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the map.
     *
     * @param map the new map
     */
    public void setMap(Map map) {
        this.map = map;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

}