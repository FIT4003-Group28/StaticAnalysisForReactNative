package defpackage;

import java.util.UUID;
/* compiled from: PG */
/* renamed from: adnw  reason: default package */
/* loaded from: classes.dex */
public final class adnw {
    public final ampq a;
    public final long b;
    public final adna c;
    public final String d;
    public final String e;
    public final ampq f;
    public final String g;
    public final int h;
    public final int i;
    public final adit j;

    public adnw() {
    }

    public adnw(int i, ampq ampqVar, long j, adna adnaVar, String str, String str2, ampq ampqVar2, adit aditVar, String str3, int i2) {
        this.i = i;
        this.a = ampqVar;
        this.b = j;
        this.c = adnaVar;
        this.d = str;
        this.e = str2;
        this.f = ampqVar2;
        this.j = aditVar;
        this.g = str3;
        this.h = i2;
    }

    public static adnv a() {
        adnv adnvVar = new adnv((byte[]) null);
        adnvVar.h(0L);
        adnvVar.d("");
        adnvVar.e("");
        adnvVar.g(UUID.randomUUID().toString());
        adnvVar.f(0);
        return adnvVar;
    }

    public final adnv b() {
        return new adnv(this);
    }

    public final boolean equals(Object obj) {
        adna adnaVar;
        adit aditVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adnw)) {
            return false;
        }
        adnw adnwVar = (adnw) obj;
        int i = this.i;
        int i2 = adnwVar.i;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.a.equals(adnwVar.a) && this.b == adnwVar.b && ((adnaVar = this.c) != null ? adnaVar.equals(adnwVar.c) : adnwVar.c == null) && this.d.equals(adnwVar.d) && this.e.equals(adnwVar.e) && this.f.equals(adnwVar.f) && ((aditVar = this.j) != null ? aditVar.equals(adnwVar.j) : adnwVar.j == null) && this.g.equals(adnwVar.g) && this.h == adnwVar.h;
    }

    public final int hashCode() {
        int i = this.i;
        almu.X(i);
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i2 = (((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        adna adnaVar = this.c;
        int i3 = 0;
        int hashCode2 = (((((((i2 ^ (adnaVar == null ? 0 : adnaVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        adit aditVar = this.j;
        if (aditVar != null) {
            i3 = aditVar.hashCode();
        }
        return ((((hashCode2 ^ i3) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    public final String toString() {
        int i = this.i;
        String W = i != 0 ? almu.W(i) : "null";
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.j);
        String str3 = this.g;
        int i2 = this.h;
        int length = String.valueOf(W).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 206 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(str3).length());
        sb.append("MdxSessionInfo{sessionType=");
        sb.append(W);
        sb.append(", connectedInfo=");
        sb.append(valueOf);
        sb.append(", startedTimeMs=");
        sb.append(j);
        sb.append(", dialSessionInfo=");
        sb.append(valueOf2);
        sb.append(", mediaRouteId=");
        sb.append(str);
        sb.append(", screenName=");
        sb.append(str2);
        sb.append(", loggedDisconnectReason=");
        sb.append(valueOf3);
        sb.append(", pairingCode=");
        sb.append(valueOf4);
        sb.append(", sessionNonce=");
        sb.append(str3);
        sb.append(", sessionIndex=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
