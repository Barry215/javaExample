package com.frank.apply;

import com.frank.organization.Organization;

/**
 * Created by frank on 16/11/10.
 */
public interface ApplyForPosition {
    boolean applyForChairman(Organization organization);

    boolean applyForMember(Organization organization);

    boolean applyForLeave(Organization organization);

}
