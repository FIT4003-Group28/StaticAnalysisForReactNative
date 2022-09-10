package defpackage;
/* compiled from: PG */
/* renamed from: tlo  reason: default package */
/* loaded from: classes7.dex */
class tlo extends tme {
    public final dcdc<amvh> a;
    private final boolean b;
    private final boolean c;
    private final eapd d;
    private final dwaw e;
    private final amsy f;
    private final eapd g;

    public tlo(boolean z, boolean z2, eapd eapdVar, dwaw dwawVar, amsy amsyVar, eapd eapdVar2, dcdc<amvh> dcdcVar) {
        this.b = z;
        this.c = z2;
        this.d = eapdVar;
        if (dwawVar != null) {
            this.e = dwawVar;
            if (amsyVar != null) {
                this.f = amsyVar;
                if (eapdVar2 != null) {
                    this.g = eapdVar2;
                    if (dcdcVar != null) {
                        this.a = dcdcVar;
                        return;
                    }
                    throw new NullPointerException("Null waypoints");
                }
                throw new NullPointerException("Null requestCreationTime");
            }
            throw new NullPointerException("Null directions");
        }
        throw new NullPointerException("Null rawRequest");
    }

    @Override // defpackage.tme
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.tme
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.tme
    public final eapd c() {
        return this.d;
    }

    @Override // defpackage.tme
    public final dwaw d() {
        return this.e;
    }

    @Override // defpackage.tme
    public final amsy e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tme) {
            tme tmeVar = (tme) obj;
            if (this.b == tmeVar.a() && this.c == tmeVar.b() && this.d.equals(tmeVar.c()) && this.e.equals(tmeVar.d()) && this.f.equals(tmeVar.e()) && this.g.equals(tmeVar.f()) && dchl.m(this.a, tmeVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tme
    public final eapd f() {
        return this.g;
    }

    @Override // defpackage.tme
    public final dcdc<amvh> g() {
        return this.a;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        int hashCode = (((i2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003;
        dwaw dwawVar = this.e;
        int i3 = dwawVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(dwawVar).c(dwawVar);
            dwawVar.bC = i3;
        }
        return ((((((hashCode ^ i3) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("StoredDirectionsMetadata{isOffline=");
        sb.append(z);
        sb.append(", isOnlineAvailable=");
        sb.append(z2);
        sb.append(", responseReceivedTime=");
        sb.append(valueOf);
        sb.append(", rawRequest=");
        sb.append(valueOf2);
        sb.append(", directions=");
        sb.append(valueOf3);
        sb.append(", requestCreationTime=");
        sb.append(valueOf4);
        sb.append(", waypoints=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
