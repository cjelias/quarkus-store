package ca.celias.store.domain;

import java.io.Serializable;

public abstract class DomainEvent<T, ID> 
implements Serializable {

    private ID id;
    private Long createdAt;
    private Long lastModified;

    public DomainEvent() {
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    public abstract T getSubject();

    public abstract void setSubject(T subject);    
}
