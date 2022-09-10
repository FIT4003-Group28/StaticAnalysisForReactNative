package defpackage;
/* compiled from: PG */
/* renamed from: wue  reason: default package */
/* loaded from: classes7.dex */
public final class wue extends wuo {
    public final wuv a;
    private final int c;
    private final int d;
    private final boolean e;
    private final dspd f;
    private final dpic g;

    public wue(wuv wuvVar, int i, int i2, boolean z, dspd dspdVar, dpic dpicVar) {
        this.a = wuvVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = dspdVar;
        this.g = dpicVar;
    }

    @Override // defpackage.wuo
    public final wuv a() {
        return this.a;
    }

    @Override // defpackage.wuo
    public final int b() {
        return this.c;
    }

    @Override // defpackage.wuo
    public final int c() {
        return this.d;
    }

    @Override // defpackage.wuo
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.wuo
    public final dspd e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wuo) {
            wuo wuoVar = (wuo) obj;
            if (this.a.equals(wuoVar.a()) && this.c == wuoVar.b() && this.d == wuoVar.c() && this.e == wuoVar.d() && this.f.equals(wuoVar.e()) && this.g.equals(wuoVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wuo
    public final dpic f() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003;
        dpic dpicVar = this.g;
        int i = dpicVar.bC;
        if (i == 0) {
            i = dsst.a.b(dpicVar).c(dpicVar);
            dpicVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.c;
        int i2 = this.d;
        boolean z = this.e;
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 154 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RidesharingLegAlternate{taxiDetails=");
        sb.append(valueOf);
        sb.append(", tripIndex=");
        sb.append(i);
        sb.append(", stepGroupIndex=");
        sb.append(i2);
        sb.append(", isFirstLeg=");
        sb.append(z);
        sb.append(", legAlternateToken=");
        sb.append(valueOf2);
        sb.append(", protoForClientSideMerging=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
