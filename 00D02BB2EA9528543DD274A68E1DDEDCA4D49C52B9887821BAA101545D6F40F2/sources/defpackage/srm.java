package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: srm  reason: default package */
/* loaded from: classes7.dex */
public final class srm extends sry {
    public final boolean a;
    public final boolean b;
    public final dnqh c;
    public final vun d;
    public final dwaw e;
    public final amte f;
    public final boolean g;
    public final int h;
    public final btzy i;
    public final int j;

    public srm(int i, boolean z, boolean z2, @dzsi dnqh dnqhVar, @dzsi vun vunVar, @dzsi dwaw dwawVar, @dzsi amte amteVar, boolean z3, int i2, @dzsi btzy btzyVar) {
        this.j = i;
        this.a = z;
        this.b = z2;
        this.c = dnqhVar;
        this.d = vunVar;
        this.e = dwawVar;
        this.f = amteVar;
        this.g = z3;
        this.h = i2;
        this.i = btzyVar;
    }

    @Override // defpackage.sry, defpackage.qbm
    @dzsi
    public final btzy e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        dnqh dnqhVar;
        vun vunVar;
        dwaw dwawVar;
        amte amteVar;
        btzy btzyVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sry)) {
            return false;
        }
        sry sryVar = (sry) obj;
        int i = this.j;
        int x = sryVar.x();
        if (i == 0) {
            throw null;
        }
        return i == x && this.a == sryVar.r() && this.b == sryVar.f() && ((dnqhVar = this.c) != null ? dnqhVar.equals(sryVar.s()) : sryVar.s() == null) && ((vunVar = this.d) != null ? vunVar.equals(sryVar.g()) : sryVar.g() == null) && ((dwawVar = this.e) != null ? dwawVar.equals(sryVar.h()) : sryVar.h() == null) && ((amteVar = this.f) != null ? amteVar.equals(sryVar.n()) : sryVar.n() == null) && this.g == sryVar.t() && sryVar.u() == null && this.h == sryVar.v() && ((btzyVar = this.i) != null ? btzyVar.equals(sryVar.e()) : sryVar.e() == null);
    }

    @Override // defpackage.sry, defpackage.qbm
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.sry, defpackage.qbm
    @dzsi
    public final vun g() {
        return this.d;
    }

    @Override // defpackage.sry, defpackage.qbm
    @dzsi
    public final dwaw h() {
        return this.e;
    }

    @Override // defpackage.sry, defpackage.qbm
    @dzsi
    public final amte n() {
        return this.f;
    }

    @Override // defpackage.sry
    public final boolean r() {
        return this.a;
    }

    @Override // defpackage.sry
    @dzsi
    public final dnqh s() {
        return this.c;
    }

    @Override // defpackage.sry
    public final boolean t() {
        return this.g;
    }

    public final String toString() {
        int i = this.j;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "COMPLETE" : "LOADING" : "INITIALIZING";
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        boolean z3 = this.g;
        int i2 = this.h;
        String valueOf5 = String.valueOf(this.i);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 258 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + "null".length() + String.valueOf(valueOf5).length());
        sb.append("DirectionsFetcherStateImpl{onlineState=");
        sb.append(str);
        sb.append(", offlineLoading=");
        sb.append(z);
        sb.append(", solicitedByUser=");
        sb.append(z2);
        sb.append(", prefetchUpgradeLoggingParams=");
        sb.append(valueOf);
        sb.append(", directionsParameters=");
        sb.append(valueOf2);
        sb.append(", request=");
        sb.append(valueOf3);
        sb.append(", storageItem=");
        sb.append(valueOf4);
        sb.append(", receivedOfflineResponse=");
        sb.append(z3);
        sb.append(", aliasSettingPrompt=");
        sb.append("null");
        sb.append(", activeTripIndex=");
        sb.append(i2);
        sb.append(", errorStatus=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.sry
    @dzsi
    public final dndp u() {
        return null;
    }

    @Override // defpackage.sry
    public final int v() {
        return this.h;
    }

    @Override // defpackage.sry
    public final srx w() {
        return new srl(this);
    }

    @Override // defpackage.sry
    public final int x() {
        return this.j;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.j;
        if (i3 != 0) {
            int i4 = 1237;
            int i5 = (((((i3 ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
            dnqh dnqhVar = this.c;
            int i6 = 0;
            if (dnqhVar == null) {
                i = 0;
            } else {
                i = dnqhVar.bC;
                if (i == 0) {
                    i = dsst.a.b(dnqhVar).c(dnqhVar);
                    dnqhVar.bC = i;
                }
            }
            int i7 = (i5 ^ i) * 1000003;
            vun vunVar = this.d;
            int hashCode = (i7 ^ (vunVar == null ? 0 : vunVar.hashCode())) * 1000003;
            dwaw dwawVar = this.e;
            if (dwawVar == null) {
                i2 = 0;
            } else {
                i2 = dwawVar.bC;
                if (i2 == 0) {
                    i2 = dsst.a.b(dwawVar).c(dwawVar);
                    dwawVar.bC = i2;
                }
            }
            int i8 = (hashCode ^ i2) * 1000003;
            amte amteVar = this.f;
            int hashCode2 = (i8 ^ (amteVar == null ? 0 : amteVar.hashCode())) * 1000003;
            if (true == this.g) {
                i4 = 1231;
            }
            int i9 = (((hashCode2 ^ i4) * (-721379959)) ^ this.h) * 1000003;
            btzy btzyVar = this.i;
            if (btzyVar != null) {
                i6 = btzyVar.hashCode();
            }
            return i9 ^ i6;
        }
        throw null;
    }
}
