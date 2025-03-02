package org.eternity.reservation.persistence;

import java.util.List;

import org.eternity.reservation.domain.DiscountCondition;

public interface DiscountConditionDAO {
    List<DiscountCondition> selectDiscountConditions(Long policyId);

    void insert(DiscountCondition discountCondition);
}
