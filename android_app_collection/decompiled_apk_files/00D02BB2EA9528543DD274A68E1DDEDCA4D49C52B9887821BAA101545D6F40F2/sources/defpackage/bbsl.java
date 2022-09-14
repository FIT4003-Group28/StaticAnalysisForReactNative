package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbsl  reason: default package */
/* loaded from: classes3.dex */
public final class bbsl extends bbtv {
    public int b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private bvrt<bbvn> k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private bbtx o;
    private Boolean q;
    private Boolean r;
    private afyb s;
    private Boolean t;
    public dbsg<bbtw> a = dbpy.a;
    private dbsg<Long> p = dbpy.a;
    private dbsg<bbtq> u = dbpy.a;

    @Override // defpackage.bbtv
    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void c(dbsg<bbtw> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.bbtv
    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void e(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void g(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void h(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void i(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void j(bbtq bbtqVar) {
        this.u = dbsg.i(bbtqVar);
    }

    @Override // defpackage.bbtv
    public final void k(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void l(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void m(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void n(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void o(boolean z) {
        this.r = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void p(afyb afybVar) {
        if (afybVar != null) {
            this.s = afybVar;
            return;
        }
        throw new NullPointerException("Null lensPhotoActionOptions");
    }

    @Override // defpackage.bbtv
    public final void q(bbtx bbtxVar) {
        if (bbtxVar != null) {
            this.o = bbtxVar;
            return;
        }
        throw new NullPointerException("Null muteIconBehavior");
    }

    @Override // defpackage.bbtv
    public final void r(int i) {
        this.b = 2;
    }

    @Override // defpackage.bbtv
    public final void s(bvrt<bbvn> bvrtVar) {
        this.k = bvrtVar;
    }

    @Override // defpackage.bbtv
    public final void t(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void u(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    @Override // defpackage.bbtv
    public final void v() {
        this.p = dbsg.i(30000L);
    }

    @Override // defpackage.bbtv
    public final bbty a() {
        String str = this.c == null ? " enableOfferingTagsEdit" : "";
        if (this.d == null) {
            str = str.concat(" shouldDisplayPhotoCountAsTitle");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" enableDelete");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" enableDoneButton");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" enableDisassociate");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" enableReceiptActions");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" enableMarkAsReceipt");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" enableRap");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" photoReportAProblemOptionsProtoWrapper");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" enablePhotoEdit");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" enableShowIconsForCaptionAndEditPhoto");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" allowUploadIfEnabled");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" muteIconBehavior");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" enableSelection");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" enableThumbsUp");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" navigationButtonStyle");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" lensPhotoActionOptions");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" shouldShowPlaceNameInFooter");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsm(this.a, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o, this.p, this.q.booleanValue(), this.r.booleanValue(), this.b, this.s, this.t.booleanValue(), this.u);
    }
}
