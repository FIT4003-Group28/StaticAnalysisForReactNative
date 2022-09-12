package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UserStatus implements Item {
    public static final int STATUS_CODE_NOT_LOGGED_IN = 1;
    public static final int STATUS_CODE_OK = 0;
    @dgto(a = "code")
    public final int code;
    @dgto(a = "long_text")
    public final String longMessage;
    @dgto(a = "short_text")
    public final String shortMessage;

    private UserStatus() {
        this(1, null, null);
    }

    public UserStatus(int i, String str, String str2) {
        this.code = i;
        this.shortMessage = str;
        this.longMessage = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserStatus userStatus = (UserStatus) obj;
        if (this.code != userStatus.code) {
            return false;
        }
        String str = this.shortMessage;
        if (str == null ? userStatus.shortMessage != null : !str.equals(userStatus.shortMessage)) {
            return false;
        }
        String str2 = this.longMessage;
        String str3 = userStatus.longMessage;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.shortMessage;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.longMessage;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public boolean isLoggedIn() {
        return this.code == 0;
    }

    public String toString() {
        int i = this.code;
        String str = this.shortMessage;
        String str2 = this.longMessage;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61 + String.valueOf(str2).length());
        sb.append("UserStatus{code=");
        sb.append(i);
        sb.append(", shortMessage='");
        sb.append(str);
        sb.append('\'');
        sb.append(", longMessage='");
        sb.append(str2);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
