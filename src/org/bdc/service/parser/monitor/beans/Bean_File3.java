/*
 * 
 * Created by Umberto Ferracci from urania's PC
 * email: umberto.ferracci@gmail.com
 * Project: BdC
 * Package: org.bdc.service.parser.monitor.beans
 * Type: Bean_File3
 * Last update: 12-mar-2017 16.25.13
 * 
 */

package org.bdc.service.parser.monitor.beans;

/**
 * The Class Bean_File3.
 */
public class Bean_File3 extends SimpleBean {

    private double flow_3d6;

    private double flow_4d5;

    private double flow_5d8;

    private double flow_8d0;

    private double latitude;

    private double longitude;

    private String sotgentId;

    /**
     * Instantiates a new bean file 3.
     *
     * @param sotgentId the sotgent id
     * @param longitude the longitude
     * @param latitude the latitude
     * @param flow_3d6 the flow 3 d 6
     * @param flow_4d5 the flow 4 d 5
     * @param flow_5d8 the flow 5 d 8
     * @param flow_8d0 the flow 8 d 0
     */
    public Bean_File3(String sotgentId, double longitude, double latitude, double flow_3d6, double flow_4d5, double flow_5d8, double flow_8d0) {
        super();
        this.sotgentId = sotgentId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.flow_3d6 = flow_3d6;
        this.flow_4d5 = flow_4d5;
        this.flow_5d8 = flow_5d8;
        this.flow_8d0 = flow_8d0;
    }

    /**
     * Gets the flow 3 d 6.
     *
     * @return the flow 3 d 6
     */
    public double getFlow_3d6() {
        return flow_3d6;
    }

    /**
     * Gets the flow 4 d 5.
     *
     * @return the flow 4 d 5
     */
    public double getFlow_4d5() {
        return flow_4d5;
    }

    /**
     * Gets the flow 5 d 8.
     *
     * @return the flow 5 d 8
     */
    public double getFlow_5d8() {
        return flow_5d8;
    }

    /**
     * Gets the flow 8 d 0.
     *
     * @return the flow 8 d 0
     */
    public double getFlow_8d0() {
        return flow_8d0;
    }

    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Gets the sotgent id.
     *
     * @return the sotgent id
     */
    public String getSotgentId() {
        return sotgentId;
    }

    /**
     * Sets the flow 3 d 6.
     *
     * @param flow_3d6 the new flow 3 d 6
     */
    public void setFlow_3d6(double flow_3d6) {
        this.flow_3d6 = flow_3d6;
    }

    /**
     * Sets the flow 4 d 5.
     *
     * @param flow_4d5 the new flow 4 d 5
     */
    public void setFlow_4d5(double flow_4d5) {
        this.flow_4d5 = flow_4d5;
    }

    /**
     * Sets the flow 5 d 8.
     *
     * @param flow_5d8 the new flow 5 d 8
     */
    public void setFlow_5d8(double flow_5d8) {
        this.flow_5d8 = flow_5d8;
    }

    /**
     * Sets the flow 8 d 0.
     *
     * @param flow_8d0 the new flow 8 d 0
     */
    public void setFlow_8d0(double flow_8d0) {
        this.flow_8d0 = flow_8d0;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude the new latitude
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude the new longitude
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets the sotgent id.
     *
     * @param sotgentId the new sotgent id
     */
    public void setSotgentId(String sotgentId) {
        this.sotgentId = sotgentId;
    }
}