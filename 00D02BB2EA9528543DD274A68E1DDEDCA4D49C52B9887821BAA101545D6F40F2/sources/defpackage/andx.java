package defpackage;
/* compiled from: PG */
/* renamed from: andx  reason: default package */
/* loaded from: classes2.dex */
public final class andx extends aneb {
    public Integer a;
    public String b;
    public akqq c;
    public String d;
    public String e;
    public String f;
    public dbsg<anef> g;
    public dbsg<aned> h;
    public dbsg<cjmu> i;
    private String j;
    private Integer k;
    private String l;
    private Integer m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Boolean r;
    private Boolean s;
    private ddho t;
    private ddho u;
    private ddho v;
    private dcdc<anec> w;
    private Boolean x;

    public andx() {
        this.g = dbpy.a;
        this.h = dbpy.a;
        this.i = dbpy.a;
    }

    public andx(anee aneeVar) {
        this.g = dbpy.a;
        this.h = dbpy.a;
        this.i = dbpy.a;
        andy andyVar = (andy) aneeVar;
        this.j = andyVar.a;
        this.k = Integer.valueOf(andyVar.b);
        this.l = andyVar.c;
        this.a = Integer.valueOf(andyVar.d);
        this.m = Integer.valueOf(andyVar.e);
        this.b = andyVar.f;
        this.c = andyVar.g;
        this.n = Boolean.valueOf(andyVar.h);
        this.o = Boolean.valueOf(andyVar.i);
        this.d = andyVar.j;
        this.p = Boolean.valueOf(andyVar.k);
        this.q = Boolean.valueOf(andyVar.l);
        this.e = andyVar.m;
        this.r = Boolean.valueOf(andyVar.n);
        this.s = Boolean.valueOf(andyVar.o);
        this.f = andyVar.p;
        this.g = andyVar.q;
        this.t = andyVar.r;
        this.u = andyVar.s;
        this.v = andyVar.t;
        this.w = andyVar.u;
        this.x = Boolean.valueOf(andyVar.v);
        this.h = andyVar.w;
        this.i = andyVar.x;
    }

    @Override // defpackage.aneb
    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void c(ddho ddhoVar) {
        if (ddhoVar != null) {
            this.u = ddhoVar;
            return;
        }
        throw new NullPointerException("Null cancelVisualElementType");
    }

    @Override // defpackage.aneb
    public final void d(dbsg<anef> dbsgVar) {
        this.g = dbsgVar;
    }

    @Override // defpackage.aneb
    public final void e(ddho ddhoVar) {
        if (ddhoVar != null) {
            this.v = ddhoVar;
            return;
        }
        throw new NullPointerException("Null doneVisualElementType");
    }

    @Override // defpackage.aneb
    public final void f(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void g(ddho ddhoVar) {
        if (ddhoVar != null) {
            this.t = ddhoVar;
            return;
        }
        throw new NullPointerException("Null fragmentVisualElementType");
    }

    @Override // defpackage.aneb
    public final void h(@dzsi akqq akqqVar) {
        this.c = akqqVar;
    }

    @Override // defpackage.aneb
    public final void i(dcdc<anec> dcdcVar) {
        if (dcdcVar != null) {
            this.w = dcdcVar;
            return;
        }
        throw new NullPointerException("Null mapMarkers");
    }

    @Override // defpackage.aneb
    public final void j(int i) {
        this.k = Integer.valueOf(i);
    }

    @Override // defpackage.aneb
    public final void k(int i) {
        this.m = Integer.valueOf(i);
    }

    @Override // defpackage.aneb
    public final void l(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void m() {
        this.x = false;
    }

    @Override // defpackage.aneb
    public final void n(boolean z) {
        this.s = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void o(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void p(boolean z) {
        this.r = Boolean.valueOf(z);
    }

    @Override // defpackage.aneb
    public final void q(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null subTitle");
    }

    @Override // defpackage.aneb
    public final void r(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.aneb
    public final anee a() {
        String str = this.j == null ? " title" : "";
        if (this.k == null) {
            str = str.concat(" maxLinesForTitle");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" subTitle");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" maxLinesForSubTitle");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" pinDrawable");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" animateInitialLatLng");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" showCalloutView");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" shouldAvoidFirstTimeNoMoveSaveWarning");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" enableNoMoveSaveWarning");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" showGeocodedAddressInSubTitle");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" showAlertMessageInFooter");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" fragmentVisualElementType");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" cancelVisualElementType");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" doneVisualElementType");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" mapMarkers");
        }
        if (this.x == null) {
            str = String.valueOf(str).concat(" shouldUseMapPointPickerHeader");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new andy(this.j, this.k.intValue(), this.l, this.a.intValue(), this.m.intValue(), this.b, this.c, this.n.booleanValue(), this.o.booleanValue(), this.d, this.p.booleanValue(), this.q.booleanValue(), this.e, this.r.booleanValue(), this.s.booleanValue(), this.f, this.g, this.t, this.u, this.v, this.w, this.x.booleanValue(), this.h, this.i);
    }
}
