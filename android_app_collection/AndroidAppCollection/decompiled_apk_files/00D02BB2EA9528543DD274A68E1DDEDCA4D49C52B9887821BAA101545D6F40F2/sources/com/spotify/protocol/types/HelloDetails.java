package com.spotify.protocol.types;

import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HelloDetails implements Item {
    @dgto(a = "authid")
    public final String authid;
    @dgto(a = "authmethods")
    public final String[] authmethods;
    @dgto(a = "extras")
    public final Map<String, String> extras;
    @dgto(a = "info")
    public final Info info;
    @dgto(a = "roles")
    public final Roles roles;

    private HelloDetails() {
        this(null, null, null, null, null);
    }

    public HelloDetails(Roles roles, Info info, String[] strArr, String str, Map<String, String> map) {
        this.roles = roles;
        this.info = info;
        this.authmethods = strArr;
        this.authid = str;
        this.extras = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HelloDetails helloDetails = (HelloDetails) obj;
        Roles roles = this.roles;
        if (roles == null ? helloDetails.roles != null : !roles.equals(helloDetails.roles)) {
            return false;
        }
        Info info = this.info;
        if (info == null ? helloDetails.info != null : !info.equals(helloDetails.info)) {
            return false;
        }
        if (!Arrays.equals(this.authmethods, helloDetails.authmethods)) {
            return false;
        }
        String str = this.authid;
        if (str == null ? helloDetails.authid != null : !str.equals(helloDetails.authid)) {
            return false;
        }
        Map<String, String> map = this.extras;
        return map != null ? map.equals(helloDetails.extras) : helloDetails.extras == null;
    }

    public int hashCode() {
        Roles roles = this.roles;
        int i = 0;
        int hashCode = (roles != null ? roles.hashCode() : 0) * 31;
        Info info = this.info;
        int hashCode2 = (((hashCode + (info != null ? info.hashCode() : 0)) * 31) + Arrays.hashCode(this.authmethods)) * 31;
        String str = this.authid;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.extras;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.roles);
        String valueOf2 = String.valueOf(this.info);
        String arrays = Arrays.toString(this.authmethods);
        String str = this.authid;
        String valueOf3 = String.valueOf(this.extras);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 61 + length2 + length3 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("HelloDetails{roles=");
        sb.append(valueOf);
        sb.append(", info=");
        sb.append(valueOf2);
        sb.append(", authmethods=");
        sb.append(arrays);
        sb.append(", authid='");
        sb.append(str);
        sb.append('\'');
        sb.append(", extras=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
