package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChildrenPageRequest implements Item {
    @dgto(a = "limit")
    public final int limit;
    @dgto(a = "offset")
    public final int offset;
    @dgto(a = "parent_id")
    public final String parentId;

    private ChildrenPageRequest() {
        this(null, 0, 0);
    }

    public ChildrenPageRequest(String str, int i, int i2) {
        this.parentId = str;
        this.limit = i;
        this.offset = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChildrenPageRequest childrenPageRequest = (ChildrenPageRequest) obj;
        if (this.limit != childrenPageRequest.limit || this.offset != childrenPageRequest.offset) {
            return false;
        }
        String str = this.parentId;
        String str2 = childrenPageRequest.parentId;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.parentId;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.limit) * 31) + this.offset;
    }

    public String toString() {
        String str = this.parentId;
        int i = this.limit;
        int i2 = this.offset;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 71);
        sb.append("ChildrenPageRequest{parentId='");
        sb.append(str);
        sb.append('\'');
        sb.append(", limit=");
        sb.append(i);
        sb.append(", offset=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }
}
