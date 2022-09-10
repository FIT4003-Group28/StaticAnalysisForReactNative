package defpackage;
/* compiled from: PG */
/* renamed from: qnh  reason: default package */
/* loaded from: classes7.dex */
public final class qnh extends qnk {
    public eaow a;
    public ddho b;
    public ddho c;
    public ddho d;
    public ddho e;
    public int f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;

    @Override // defpackage.qnk
    public final void b(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void c(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void d(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void e(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void f(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void g(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void h(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void i(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void j(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void k(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.qnk
    public final void l() {
        this.g = false;
    }

    @Override // defpackage.qnk
    public final qnl a() {
        String str = this.g == null ? " departureAlarmEnabled" : "";
        if (this.h == null) {
            str = str.concat(" vehiclesOnMapEnabled");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" transfersEnabled");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" dayHeadersEnabled");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" pastDeparturesEnabled");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" landscapeSidePanelEnabled");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" updatingSummaryAndPolylineEnabled");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" cameraOnCurrentLocationEnabled");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" routeShouldSkipInitialNonTransitLeg");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" anchorDeparturesToPassedInDirections");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" departureWindowDuration");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" departureCardOnClickDestination");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" showErrorCardActionButton");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" departureCardVe");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" departureAlertIconVe");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" transitAlertVe");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" transferTabVe");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qni(this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.a, this.f, this.q.booleanValue(), this.b, this.c, this.d, this.e);
    }
}
