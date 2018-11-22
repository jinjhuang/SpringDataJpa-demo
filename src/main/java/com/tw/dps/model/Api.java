package com.tw.dps.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Api {
    private Integer apiId;
    private String apiName;
    private String description;
    private String apiVersion;
    private String apiPath;
    private String upstream;
    private int team;
    private int squad;
    private String header;
    private String md5Code;
    private String serviceEmail;
    private String apiStatus;
    private String activePlugins;
    private String createdBy;
    private Timestamp createdAt;
    private String updatedBy;
    private Timestamp updatedAt;
    private OrganizationUnit organizationUnitByTeam;

    @Id
    @Column(name = "api_id", nullable = false)
    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    @Basic
    @Column(name = "api_name", nullable = false, length = 256)
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 1024)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "api_version", nullable = false, length = 32)
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @Basic
    @Column(name = "api_path", nullable = false, length = 64)
    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    @Basic
    @Column(name = "upstream", nullable = false, length = 128)
    public String getUpstream() {
        return upstream;
    }

    public void setUpstream(String upstream) {
        this.upstream = upstream;
    }

    @Basic
    @Column(name = "team", nullable = false)
    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    @Basic
    @Column(name = "squad", nullable = false)
    public int getSquad() {
        return squad;
    }

    public void setSquad(int squad) {
        this.squad = squad;
    }

    @Basic
    @Column(name = "header", nullable = true, length = 512)
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Basic
    @Column(name = "md5_code", nullable = false, length = 128)
    public String getMd5Code() {
        return md5Code;
    }

    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code;
    }

    @Basic
    @Column(name = "service_email", nullable = false, length = 64)
    public String getServiceEmail() {
        return serviceEmail;
    }

    public void setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail;
    }

    @Basic
    @Column(name = "api_status", nullable = false, length = 32)
    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    @Basic
    @Column(name = "active_plugins", nullable = true, length = 256)
    public String getActivePlugins() {
        return activePlugins;
    }

    public void setActivePlugins(String activePlugins) {
        this.activePlugins = activePlugins;
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
    @Column(name = "created_at", nullable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_by", nullable = false, length = 64)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "updated_at", nullable = false)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Api api = (Api) o;
        return apiId == api.apiId &&
                team == api.team &&
                squad == api.squad &&
                Objects.equals(apiName, api.apiName) &&
                Objects.equals(description, api.description) &&
                Objects.equals(apiVersion, api.apiVersion) &&
                Objects.equals(apiPath, api.apiPath) &&
                Objects.equals(upstream, api.upstream) &&
                Objects.equals(header, api.header) &&
                Objects.equals(md5Code, api.md5Code) &&
                Objects.equals(serviceEmail, api.serviceEmail) &&
                Objects.equals(apiStatus, api.apiStatus) &&
                Objects.equals(activePlugins, api.activePlugins) &&
                Objects.equals(createdBy, api.createdBy) &&
                Objects.equals(createdAt, api.createdAt) &&
                Objects.equals(updatedBy, api.updatedBy) &&
                Objects.equals(updatedAt, api.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, apiName, description, apiVersion, apiPath, upstream, team, squad, header, md5Code, serviceEmail, apiStatus, activePlugins, createdBy, createdAt, updatedBy, updatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "team", referencedColumnName = "org_unit_id", nullable = false, insertable = false, updatable = false)
    public OrganizationUnit getOrganizationUnitByTeam() {
        return organizationUnitByTeam;
    }

    public void setOrganizationUnitByTeam(OrganizationUnit organizationUnitByTeam) {
        this.organizationUnitByTeam = organizationUnitByTeam;
    }
}
