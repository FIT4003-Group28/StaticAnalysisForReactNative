package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlayerContext implements Item {
    @dgto(a = "subtitle")
    public final String subtitle;
    @dgto(a = "title")
    public final String title;
    @dgto(a = "type")
    public final String type;
    @dgto(a = "uri")
    public final String uri;

    public PlayerContext() {
        this(null, null, null, null);
    }

    public PlayerContext(String str, String str2, String str3, String str4) {
        this.uri = str;
        this.title = str2;
        this.subtitle = str3;
        this.type = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlayerContext playerContext = (PlayerContext) obj;
            String str = this.uri;
            if (str == null ? playerContext.uri != null : !str.equals(playerContext.uri)) {
                return false;
            }
            String str2 = this.title;
            if (str2 == null ? playerContext.title != null : !str2.equals(playerContext.title)) {
                return false;
            }
            String str3 = this.subtitle;
            if (str3 == null ? playerContext.subtitle != null : !str3.equals(playerContext.subtitle)) {
                return false;
            }
            String str4 = this.type;
            String str5 = playerContext.type;
            if (str4 != null) {
                if (!str4.equals(str5)) {
                    return true;
                }
            } else if (str5 != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.type;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.uri;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.type;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 47 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("PlayerContext{, uri=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subtitle=");
        sb.append(str3);
        sb.append(", type=");
        sb.append(str4);
        sb.append('}');
        return sb.toString();
    }
}
