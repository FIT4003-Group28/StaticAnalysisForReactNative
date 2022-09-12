package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: crwq  reason: default package */
/* loaded from: classes5.dex */
public final class crwq extends crwx {
    public final Uri a;
    public final String b;
    public final int c;

    public crwq(int i, @dzsi Uri uri, @dzsi String str) {
        this.c = i;
        this.a = uri;
        this.b = str;
    }

    @Override // defpackage.crwx
    @dzsi
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.crwx
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.crwx
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof crwx)) {
            return false;
        }
        crwx crwxVar = (crwx) obj;
        int i = this.c;
        int c = crwxVar.c();
        if (i == 0) {
            throw null;
        }
        return i == c && ((uri = this.a) != null ? uri.equals(crwxVar.a()) : crwxVar.a() == null) && ((str = this.b) != null ? str.equals(crwxVar.b()) : crwxVar.b() == null);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            Uri uri = this.a;
            int i3 = 0;
            int hashCode = (i2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
            String str = this.b;
            if (str != null) {
                i3 = str.hashCode();
            }
            return hashCode ^ i3;
        }
        throw null;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? "null" : "FAILED" : "SUCCESS";
        String valueOf = String.valueOf(this.a);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 41 + String.valueOf(valueOf).length() + String.valueOf(str2).length());
        sb.append("MediaCopyResult{status=");
        sb.append(str);
        sb.append(", uriCopy=");
        sb.append(valueOf);
        sb.append(", sha1=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
