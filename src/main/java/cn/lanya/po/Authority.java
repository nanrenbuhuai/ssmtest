package cn.lanya.po;

import java.io.Serializable;

public class Authority implements Serializable {
    private Integer authorityId;

    private String authorityName;

    private Integer authorityPower;

    private static final long serialVersionUID = 1L;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public Integer getAuthorityPower() {
        return authorityPower;
    }

    public void setAuthorityPower(Integer authorityPower) {
        this.authorityPower = authorityPower;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authorityId=").append(authorityId);
        sb.append(", authorityName=").append(authorityName);
        sb.append(", authorityPower=").append(authorityPower);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}