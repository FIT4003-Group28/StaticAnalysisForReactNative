package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbet  reason: default package */
/* loaded from: classes3.dex */
public final class bbet extends bbfb {
    public final akqi a;
    public final dspd b;
    public final dcdc<dkzl> c;
    public final boolean d;

    public bbet(akqi akqiVar, dspd dspdVar, dcdc<dkzl> dcdcVar, boolean z) {
        this.a = akqiVar;
        this.b = dspdVar;
        this.c = dcdcVar;
        this.d = z;
    }

    @Override // defpackage.bbfb
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.bbfb
    public final dspd b() {
        return this.b;
    }

    @Override // defpackage.bbfb
    public final dcdc<dkzl> c() {
        return this.c;
    }

    @Override // defpackage.bbfb
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bbfb
    public final bbfa e() {
        return new bbes(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbfb) {
            bbfb bbfbVar = (bbfb) obj;
            if (this.a.equals(bbfbVar.a()) && this.b.equals(bbfbVar.b()) && dchl.m(this.c, bbfbVar.c()) && this.d == bbfbVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ExemplarsModel{currentPlace=");
        sb.append(valueOf);
        sb.append(", continuationToken=");
        sb.append(valueOf2);
        sb.append(", recommendedPlaces=");
        sb.append(valueOf3);
        sb.append(", isFetching=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
