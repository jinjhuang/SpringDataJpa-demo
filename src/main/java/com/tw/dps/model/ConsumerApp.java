package com.tw.dps.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "consumer_app", schema = "db_dev", catalog = "")
public class ConsumerApp {
    private int appId;
    private String oktaAppId;
    private String appName;
    private String appLabel;
    private int orgId;
    private String clientId;
    private Timestamp createdAt;
    private String createdBy;
    private Timestamp updatedAt;
    private String updatedBy;

    @Id
    @Column(name = "app_id", nullable = false)
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "okta_app_id", nullable = false, length = 128)
    public String getOktaAppId() {
        return oktaAppId;
    }

    public void setOktaAppId(String oktaAppId) {
        this.oktaAppId = oktaAppId;
    }

    @Basic
    @Column(name = "app_name", nullable = false, length = 128)
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "app_label", nullable = true, length = 128)
    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    @Basic
    @Column(name = "org_id", nullable = false)
    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "client_id", nullable = false, length = 128)
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
    @Column(name = "created_by", nullable = false, length = 64)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
        ConsumerApp that = (ConsumerApp) o;
        return appId == that.appId &&
                orgId == that.orgId &&
                Objects.equals(oktaAppId, that.oktaAppId) &&
                Objects.equals(appName, that.appName) &&
                Objects.equals(appLabel, that.appLabel) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, oktaAppId, appName, appLabel, orgId, clientId, createdAt, createdBy, updatedAt, updatedBy);
    }
}
