/*
 * 
 * Created by Umberto Ferracci from urania's PC
 * email: umberto.ferracci@gmail.com
 * Project: BdC
 * Package: main.org.bdc.model.instruments
 * Type: Instrument
 * Last update: 12-set-2017 15.01.14
 * 
 */

package main.org.bdc.model.instruments;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import main.org.bdc.model.galaxy.Map;
import main.org.bdc.model.galaxy.Satellite;

/**
 * The Class Instrument.
 */
@Entity
public class Instrument implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "instrument")
    private List<Band> bands;

    @Id
    @GeneratedValue
    private int        id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Map        map;

    @Column(unique = true)
    private String     name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Satellite  satellite;

    /**
     * Instantiates a new instrument.
     */
    public Instrument() {
        bands = new ArrayList<>();
    }

    /**
     * Instantiates a new instrument.
     *
     * @param name the name
     */
    public Instrument(String name) {
        this(name, null);
    }

    /**
     * Instantiates a new instrument.
     *
     * @param name the name
     * @param satellite the satellite
     */
    public Instrument(String name, Satellite satellite) {
        this();
        this.name = name;
        this.satellite = satellite;

    }

    /**
     * Adds the banda operativa.
     *
     * @param banda the banda
     */
    public void addBandaOperativa(Band banda) {
        bands.add(banda);

    }

    public List<Band> getBands() {
        return bands;
    }

    public int getId() {
        return id;
    }

    public Map getMap() {
        return map;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the satellite.
     *
     * @return the satellite
     */
    public Satellite getSatellite() {
        return satellite;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the satellite.
     *
     * @param satellite the new satellite
     */
    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }
}