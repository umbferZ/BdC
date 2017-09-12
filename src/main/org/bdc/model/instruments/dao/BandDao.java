/*
 * 
 * Created by Umberto Ferracci from urania's PC
 * email: umberto.ferracci@gmail.com
 * Project: BdC
 * Package: main.org.bdc.model.instruments.dao
 * Type: BandDao
 * Last update: 12-set-2017 14.26.30
 * 
 */

package main.org.bdc.model.instruments.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import main.org.bdc.model.instruments.Band;
import main.org.bdc.service.dal.EntityDaoHibernate;

/**
 * The Class BandDao.
 */
public class BandDao extends EntityDaoHibernate<Band, Integer> {

    /**
     * Gets the by band.
     *
     * @param resolution the resolution
     * @return the by band
     * @throws Exception the exception
     */
    public Band getByBand(double resolution) throws Exception {

        String sql = "FROM Band WHERE resolution= :resolution";
        TypedQuery<Band> query = getSession().createQuery(sql);
        query.setParameter("resolution", resolution);
        List<Band> bands = query.getResultList();
        closeSession();
        if (bands.size() == 1)
            return bands.get(0);
        throw new Exception("Error in band");

    }
}