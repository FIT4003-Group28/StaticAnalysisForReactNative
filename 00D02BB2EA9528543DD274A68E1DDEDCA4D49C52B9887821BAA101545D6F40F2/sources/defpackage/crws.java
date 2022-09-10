package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crws  reason: default package */
/* loaded from: classes5.dex */
public final class crws extends crwz {
    public final String a;
    public final crts b;
    public final Uri c;
    public final int d;

    public crws(String str, crts crtsVar, Uri uri, int i) {
        this.a = str;
        this.b = crtsVar;
        this.c = uri;
        this.d = i;
    }

    @Override // defpackage.crwz
    public final String a() {
        return this.a;
    }

    @Override // defpackage.crwz
    public final crts b() {
        return this.b;
    }

    @Override // defpackage.crwz
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.crwz
    public final crwy d() {
        return new crwr(this);
    }

    @Override // defpackage.crwz
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crwz) {
            crwz crwzVar = (crwz) obj;
            if (this.a.equals(crwzVar.a()) && this.b.equals(crwzVar.b()) && this.c.equals(crwzVar.c())) {
                int i = this.d;
                int e = crwzVar.e();
                if (i == 0) {
                    throw null;
                }
                if (i == e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        crts crtsVar = this.b;
        int i = crtsVar.bC;
        if (i == 0) {
            i = dsst.a.b(crtsVar).c(crtsVar);
            crtsVar.bC = i;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i2 = this.d;
        if (i2 != 0) {
            return hashCode2 ^ i2;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MediaInfo{gpuMediaId=");
        sb.append(str);
        sb.append(", uploadOption=");
        sb.append(valueOf);
        sb.append(", uri=");
        sb.append(valueOf2);
        sb.append(", mediaType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
