package com.titec.apportion.controller.data;

import java.time.LocalDateTime;
import java.util.UUID;

public class AbstractSearchCriteriaRequest {

    private LocalDateTime fromCreateDate;
    private LocalDateTime toCreateDate;
    private LocalDateTime fromLastEditDate;
    private LocalDateTime toLastEditDate;
    private UUID creatorUserCd;
    private UUID lastEditorUserCd;
    private Integer pageNo;
    private Integer pageSize;

    public LocalDateTime getFromCreateDate() {
        return fromCreateDate;
    }

    public void setFromCreateDate(LocalDateTime fromCreateDate) {
        this.fromCreateDate = fromCreateDate;
    }

    public LocalDateTime getToCreateDate() {
        return toCreateDate;
    }

    public void setToCreateDate(LocalDateTime toCreateDate) {
        this.toCreateDate = toCreateDate;
    }

    public LocalDateTime getFromLastEditDate() {
        return fromLastEditDate;
    }

    public void setFromLastEditDate(LocalDateTime fromLastEditDate) {
        this.fromLastEditDate = fromLastEditDate;
    }

    public LocalDateTime getToLastEditDate() {
        return toLastEditDate;
    }

    public void setToLastEditDate(LocalDateTime toLastEditDate) {
        this.toLastEditDate = toLastEditDate;
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

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
