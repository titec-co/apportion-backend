package com.titec.apportion.common.model;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Version;

import javax.persistence.*;
import javax.persistence.Id;

@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    protected UUID id;
    @CreatedDate
    private Instant createDate;
    @LastModifiedDate
    private Instant lastEditDate;
    @CreatedBy
    private UUID creatorUserCd;
    @LastModifiedBy
    private UUID lastEditorUserCd;
    @Version
    private Integer version;
    private Boolean active;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Instant getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(Instant lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public UUID getCreatorUserCd() {
        return creatorUserCd;
    }

    public void setCreatorUserCd(UUID creatorUserCd) {
        this.creatorUserCd = creatorUserCd;
    }

    public UUID getLastEditorUserCd() {
        return lastEditorUserCd;
    }

    public void setLastEditorUserCd(UUID lastEditorUserCd) {
        this.lastEditorUserCd = lastEditorUserCd;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
