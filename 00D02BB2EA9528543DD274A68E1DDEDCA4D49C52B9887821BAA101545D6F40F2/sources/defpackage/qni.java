package defpackage;
/* compiled from: PG */
/* renamed from: qni  reason: default package */
/* loaded from: classes7.dex */
final class qni extends qnl {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final eaow k;
    private final boolean l;
    private final ddho m;
    private final ddho n;
    private final ddho o;
    private final ddho p;
    private final int q;

    public qni(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, eaow eaowVar, int i, boolean z11, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = eaowVar;
        this.q = i;
        this.l = z11;
        this.m = ddhoVar;
        this.n = ddhoVar2;
        this.o = ddhoVar3;
        this.p = ddhoVar4;
    }

    @Override // defpackage.qnl
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.qnl
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.qnl
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.qnl
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qnl
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qnl) {
            qnl qnlVar = (qnl) obj;
            if (this.a == qnlVar.a() && this.b == qnlVar.b() && this.c == qnlVar.c() && this.d == qnlVar.d() && this.e == qnlVar.e() && this.f == qnlVar.f() && this.g == qnlVar.g() && this.h == qnlVar.h() && this.i == qnlVar.i() && this.j == qnlVar.j() && this.k.equals(qnlVar.k())) {
                int i = this.q;
                int q = qnlVar.q();
                if (i == 0) {
                    throw null;
                }
                if (i == q && this.l == qnlVar.l() && this.m.equals(qnlVar.m()) && this.n.equals(qnlVar.n()) && this.o.equals(qnlVar.o()) && this.p.equals(qnlVar.p())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qnl
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.qnl
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.qnl
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003;
        int i2 = this.q;
        if (i2 != 0) {
            int i3 = (hashCode ^ i2) * 1000003;
            if (true == this.l) {
                i = 1231;
            }
            return ((((((((i3 ^ i) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
        }
        throw null;
    }

    @Override // defpackage.qnl
    public final boolean i() {
        return this.i;
    }

    @Override // defpackage.qnl
    public final boolean j() {
        return this.j;
    }

    @Override // defpackage.qnl
    public final eaow k() {
        return this.k;
    }

    @Override // defpackage.qnl
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.qnl
    public final ddho m() {
        return this.m;
    }

    @Override // defpackage.qnl
    public final ddho n() {
        return this.n;
    }

    @Override // defpackage.qnl
    public final ddho o() {
        return this.o;
    }

    @Override // defpackage.qnl
    public final ddho p() {
        return this.p;
    }

    @Override // defpackage.qnl
    public final int q() {
        return this.q;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        boolean z7 = this.g;
        boolean z8 = this.h;
        boolean z9 = this.i;
        boolean z10 = this.j;
        String valueOf = String.valueOf(this.k);
        int i = this.q;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "TRANSIT_DETAILS" : "LINE_PAGE" : "DISABLED";
        boolean z11 = this.l;
        String valueOf2 = String.valueOf(this.m);
        String valueOf3 = String.valueOf(this.n);
        String valueOf4 = String.valueOf(this.o);
        String valueOf5 = String.valueOf(this.p);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 531 + str.length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("CommuteBoardContentPageOptions{departureAlarmEnabled=");
        sb.append(z);
        sb.append(", vehiclesOnMapEnabled=");
        sb.append(z2);
        sb.append(", transfersEnabled=");
        sb.append(z3);
        sb.append(", dayHeadersEnabled=");
        sb.append(z4);
        sb.append(", pastDeparturesEnabled=");
        sb.append(z5);
        sb.append(", landscapeSidePanelEnabled=");
        sb.append(z6);
        sb.append(", updatingSummaryAndPolylineEnabled=");
        sb.append(z7);
        sb.append(", cameraOnCurrentLocationEnabled=");
        sb.append(z8);
        sb.append(", routeShouldSkipInitialNonTransitLeg=");
        sb.append(z9);
        sb.append(", anchorDeparturesToPassedInDirections=");
        sb.append(z10);
        sb.append(", departureWindowDuration=");
        sb.append(valueOf);
        sb.append(", departureCardOnClickDestination=");
        sb.append(str);
        sb.append(", showErrorCardActionButton=");
        sb.append(z11);
        sb.append(", departureCardVe=");
        sb.append(valueOf2);
        sb.append(", departureAlertIconVe=");
        sb.append(valueOf3);
        sb.append(", transitAlertVe=");
        sb.append(valueOf4);
        sb.append(", transferTabVe=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
