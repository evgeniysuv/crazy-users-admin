package com.suvorov.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USER_ROLES", schema = "crazy_users")
public class UserRoles implements Serializable {
    private static final long serialVersionUID = 359730866984505913L;
    private long userId;
    private long userProfileId;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "user_profile_id")
    public long getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(long userProfileId) {
        this.userProfileId = userProfileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoles userRoles = (UserRoles) o;

        if (userId != userRoles.userId) return false;
        if (userProfileId != userRoles.userProfileId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (userProfileId ^ (userProfileId >>> 32));
        return result;
    }
}
