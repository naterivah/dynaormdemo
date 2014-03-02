/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import be.bittich.dynaorm.annotation.MetaColumn;
import be.bittich.dynaorm.annotation.PrimaryKey;
import be.bittich.dynaorm.annotation.TableFromDB;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author Nordine
 */
@TableFromDB(tableName = "citations")
public class Citation {

    @PrimaryKey
    private long id;
    @MetaColumn(columnName = "auteur_id")
    private long auteurId;
    private String description;
    private String source;
    private String citation;
    private boolean confirmed;
    @MetaColumn(columnName = "like")
    private long likes;
    @MetaColumn(columnName = "dislike")
    private long dislikes;
    private long views;
    @MetaColumn(columnName = "created_at")
    private Date createdAt;
    @MetaColumn(columnName = "updated_at")
    private Date updatedAt;

    private Auteur auteur;
   

    public Citation() {

    }
    public Citation(long id){
        this.id=id;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public Citation(long id, long auteurId, String description, String source, String citation, boolean confirmed, Long likes, Long dislikes, Long views, Date createdAt, Date updatedAt) {
        this.id = id;
        this.auteurId = auteurId;
        this.description = description;
        this.source = source;
        this.citation = citation;
        this.confirmed = confirmed;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Citation(long auteurId, String description, String source, String citation, boolean confirmed, Long likes, Long dislikes, Long views, Date createdAt, Date updatedAt) {
        this.auteurId = auteurId;
        this.description = description;
        this.source = source;
        this.citation = citation;
        this.confirmed = confirmed;
        this.likes = likes;
        this.dislikes = dislikes;
        this.views = views;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the auteurId
     */
    public long getAuteurId() {
        return auteurId;
    }

    /**
     * @param auteurId the auteurId to set
     */
    public void setAuteurId(long auteurId) {
        this.auteurId = auteurId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the citation
     */
    public String getCitation() {
        return citation;
    }

    /**
     * @param citation the citation to set
     */
    public void setCitation(String citation) {
        this.citation = citation;
    }

    /**
     * @return the confirmed
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed the confirmed to set
     */
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * @return the likes
     */
    public Long getLikes() {
        return likes;
    }

    /**
     * @param likes the likes to set
     */
    public void setLikes(Long likes) {
        this.likes = likes;
    }

    /**
     * @return the dislikes
     */
    public long getDislikes() {
        return dislikes;
    }

    /**
     * @param dislikes the dislikes to set
     */
    public void setDislikes(long dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * @return the views
     */
    public long getViews() {
        return views;
    }

    /**
     * @param views the views to set
     */
    public void setViews(long views) {
        this.views = views;
    }

    /**
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
