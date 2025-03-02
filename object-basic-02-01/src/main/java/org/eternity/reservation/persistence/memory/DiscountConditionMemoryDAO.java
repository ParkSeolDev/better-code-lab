package org.eternity.reservation.persistence.memory;

import java.util.List;

import org.eternity.reservation.domain.DiscountCondition;
import org.eternity.reservation.persistence.DiscountConditionDAO;

public class DiscountConditionMemoryDAO extends InMemoryDAO<DiscountCondition> implements DiscountConditionDAO {
    @Override
    public List<DiscountCondition> selectDiscountConditions(Long policyId) {
        return findMany(condition -> condition.getPolicyId().equals(policyId));
    }
}
