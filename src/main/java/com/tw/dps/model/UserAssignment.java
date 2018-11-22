package com.tw.dps.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_assignment", schema = "db_dev", catalog = "")
public class UserAssignment {
    private int userAssignmentId;
    private int userId;
    private int orgUnitId;
    private String userRole;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String createdBy;
    private String updatedBy;
    private User userByUserId;
    private OrganizationUnit organizationUnitByOrgUnitId;

    @Id
    @Column(name = "user_assignment_id", nullable = false)
    public int getUserAssignmentId() {
        return userAssignmentId;
    }

    public void setUserAssignmentId(int userAssignmentId) {
        this.userAssignmentId = userAssignmentId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "org_unit_id", nullable = false)
    public int getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(int orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    @Basic
    @Column(name = "user_role", nullable = false, length = 32)
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Basic
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "created_by", nullable = false, length = 64)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "updated_by", nullable = false, length = 64)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAssignment that = (UserAssignment) o;
        return userAssignmentId == that.userAssignmentId &&
                userId == that.userId &&
                orgUnitId == that.orgUnitId &&
                Objects.equals(userRole, that.userRole) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userAssignmentId, userId, orgUnitId, userRole, createdAt, updatedAt, createdBy, updatedBy);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "org_unit_id", referencedColumnName = "org_unit_id", nullable = false, insertable = false, updatable = false)
    public OrganizationUnit getOrganizationUnitByOrgUnitId() {
        return organizationUnitByOrgUnitId;
    }

    public void setOrganizationUnitByOrgUnitId(OrganizationUnit organizationUnitByOrgUnitId) {
        this.organizationUnitByOrgUnitId = organizationUnitByOrgUnitId;
    }
}
