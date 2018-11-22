package com.tw.dps.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "organization_unit", schema = "db_dev", catalog = "")
public class OrganizationUnit {
    private int orgUnitId;
    private String orgName;
    private String fullName;
    private int orgLevel;
    private int parentId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String createdBy;
    private String updatedBy;
    private Collection<Api> apisByOrgUnitId;
    private Collection<UserAssignment> userAssignmentsByOrgUnitId;

    @Id
    @Column(name = "org_unit_id", nullable = false)
    public int getOrgUnitId() {
        return orgUnitId;
    }

    public void setOrgUnitId(int orgUnitId) {
        this.orgUnitId = orgUnitId;
    }

    @Basic
    @Column(name = "org_name", nullable = false, length = 64)
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "full_name", nullable = false, length = 256)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "org_level", nullable = false)
    public int getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(int orgLevel) {
        this.orgLevel = orgLevel;
    }

    @Basic
    @Column(name = "parent_id", nullable = false)
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
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
        OrganizationUnit that = (OrganizationUnit) o;
        return orgUnitId == that.orgUnitId &&
                orgLevel == that.orgLevel &&
                parentId == that.parentId &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgUnitId, orgName, fullName, orgLevel, parentId, createdAt, updatedAt, createdBy, updatedBy);
    }

    @OneToMany(mappedBy = "organizationUnitByTeam")
    public Collection<Api> getApisByOrgUnitId() {
        return apisByOrgUnitId;
    }

    public void setApisByOrgUnitId(Collection<Api> apisByOrgUnitId) {
        this.apisByOrgUnitId = apisByOrgUnitId;
    }

    @OneToMany(mappedBy = "organizationUnitByOrgUnitId")
    public Collection<UserAssignment> getUserAssignmentsByOrgUnitId() {
        return userAssignmentsByOrgUnitId;
    }

    public void setUserAssignmentsByOrgUnitId(Collection<UserAssignment> userAssignmentsByOrgUnitId) {
        this.userAssignmentsByOrgUnitId = userAssignmentsByOrgUnitId;
    }
}
