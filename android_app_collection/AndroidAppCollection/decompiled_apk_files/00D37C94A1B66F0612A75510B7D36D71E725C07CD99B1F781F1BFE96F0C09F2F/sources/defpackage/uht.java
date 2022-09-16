package defpackage;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: uht  reason: default package */
/* loaded from: classes4.dex */
public final class uht {
    public final URL a;
    public final String b;
    public final Map c;
    public final byte[] d;

    public uht() {
    }

    public uht(URL url, String str, Map map, byte[] bArr) {
        this.a = url;
        this.b = str;
        this.c = map;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof uht) {
            uht uhtVar = (uht) obj;
            if (this.a.equals(uhtVar.a) && ((str = this.b) != null ? str.equals(uhtVar.b) : uhtVar.b == null) && this.c.equals(uhtVar.c)) {
                boolean z = uhtVar instanceof uht;
                if (Arrays.equals(this.d, uhtVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Arrays.hashCode(this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String arrays = Arrays.toString(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + String.valueOf(valueOf2).length() + String.valueOf(arrays).length());
        sb.append("GnpHttpRequest{url=");
        sb.append(valueOf);
        sb.append(", contentType=");
        sb.append(str);
        sb.append(", headers=");
        sb.append(valueOf2);
        sb.append(", body=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
