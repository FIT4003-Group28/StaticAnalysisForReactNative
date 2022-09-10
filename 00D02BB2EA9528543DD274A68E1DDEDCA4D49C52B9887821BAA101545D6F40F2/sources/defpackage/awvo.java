package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awvo  reason: default package */
/* loaded from: classes.dex */
public final class awvo extends awvx {
    public final dbsg<GmmLocation> a;
    public final dbsg<dhjx> b;
    public final dcdc<dnub> c;
    public final awwt d;

    public awvo(dbsg<GmmLocation> dbsgVar, dbsg<dhjx> dbsgVar2, dcdc<dnub> dcdcVar, awwt awwtVar) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dcdcVar;
        this.d = awwtVar;
    }

    @Override // defpackage.awvx
    public final dbsg<GmmLocation> a() {
        return this.a;
    }

    @Override // defpackage.awvx
    public final dbsg<dhjx> b() {
        return this.b;
    }

    @Override // defpackage.awvx
    public final dcdc<dnub> c() {
        return this.c;
    }

    @Override // defpackage.awvx
    public final awwt d() {
        return this.d;
    }

    @Override // defpackage.awvx
    public final awvw e() {
        return new awvn(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awvx) {
            awvx awvxVar = (awvx) obj;
            if (this.a.equals(awvxVar.a()) && this.b.equals(awvxVar.b()) && dchl.m(this.c, awvxVar.c()) && this.d.equals(awvxVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ExtendedRequestOptions{location=");
        sb.append(valueOf);
        sb.append(", camera=");
        sb.append(valueOf2);
        sb.append(", explicitTransitDestinations=");
        sb.append(valueOf3);
        sb.append(", requestOptions=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
