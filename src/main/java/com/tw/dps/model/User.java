package com.tw.dps.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    private int userId;
    private String employeeId;
    private String userName;
    private String givenName;
    private String familyName;
    private String email;
    private String userStatus;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String createdBy;
    private String updatedBy;
    private Collection<UserAssignment> userAssignmentsByUserId;

    @Id
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "employee_id", nullable = true, length = 32)
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 64)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "given_name", nullable = true, length = 64)
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @Basic
    @Column(name = "family_name", nullable = true, length = 64)
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 64)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "user_status", nullable = false, length = 1)
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
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
        User user = (User) o;
        return userId == user.userId &&
                Objects.equals(employeeId, user.employeeId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(givenName, user.givenName) &&
                Objects.equals(familyName, user.familyName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(userStatus, user.userStatus) &&
                Objects.equals(createdAt, user.createdAt) &&
                Objects.equals(updatedAt, user.updatedAt) &&
                Objects.equals(createdBy, user.createdBy) &&
                Objects.equals(updatedBy, user.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, employeeId, userName, givenName, familyName, email, userStatus, createdAt, updatedAt, createdBy, updatedBy);
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<UserAssignment> getUserAssignmentsByUserId() {
        return userAssignmentsByUserId;
    }

    public void setUserAssignmentsByUserId(Collection<UserAssignment> userAssignmentsByUserId) {
        this.userAssignmentsByUserId = userAssignmentsByUserId;
    }
}
