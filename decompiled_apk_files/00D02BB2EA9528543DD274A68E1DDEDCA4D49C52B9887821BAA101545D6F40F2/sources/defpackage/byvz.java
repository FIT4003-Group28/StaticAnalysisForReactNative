package defpackage;
/* compiled from: PG */
/* renamed from: byvz  reason: default package */
/* loaded from: classes4.dex */
final class byvz extends byxr {
    public dbsg<String> a;
    public ih b;
    private String c;
    private String d;
    private String e;
    private dbsg<String> f;
    private dbsg<dcdc<String>> g;
    private String h;
    private dbsg<String> i;
    private dbsg<String> j;
    private Integer k;

    public byvz() {
        this.f = dbpy.a;
        this.g = dbpy.a;
        this.a = dbpy.a;
        this.i = dbpy.a;
        this.j = dbpy.a;
    }

    public byvz(byxs byxsVar) {
        this.f = dbpy.a;
        this.g = dbpy.a;
        this.a = dbpy.a;
        this.i = dbpy.a;
        this.j = dbpy.a;
        bywa bywaVar = (bywa) byxsVar;
        this.c = bywaVar.a;
        this.d = bywaVar.b;
        this.e = bywaVar.c;
        this.f = bywaVar.d;
        this.g = bywaVar.e;
        this.a = bywaVar.f;
        this.b = bywaVar.g;
        this.h = bywaVar.h;
        this.i = bywaVar.i;
        this.j = bywaVar.j;
        this.k = Integer.valueOf(bywaVar.k);
    }

    @Override // defpackage.byxr
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null collapsedText");
    }

    @Override // defpackage.byxr
    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null collapsedTitle");
    }

    @Override // defpackage.byxr
    public final void d(String str) {
        this.i = dbsg.i(str);
    }

    @Override // defpackage.byxr
    public final void e(String str) {
        this.f = dbsg.i(str);
    }

    @Override // defpackage.byxr
    public final void f(dcdc<String> dcdcVar) {
        this.g = dbsg.i(dcdcVar);
    }

    @Override // defpackage.byxr
    public final void g(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null expandedTitle");
    }

    @Override // defpackage.byxr
    public final void h(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null headerText");
    }

    @Override // defpackage.byxr
    public final void i(int i) {
        this.k = Integer.valueOf(i);
    }

    @Override // defpackage.byxr
    public final void j(ih ihVar) {
        this.b = ihVar;
    }

    @Override // defpackage.byxr
    public final void k(String str) {
        this.j = dbsg.i(str);
    }

    @Override // defpackage.byxr
    public final byxs a() {
        String str = this.c == null ? " collapsedTitle" : "";
        if (this.d == null) {
            str = str.concat(" collapsedText");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" expandedTitle");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" style");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" headerText");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" smallIcon");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bywa(this.c, this.d, this.e, this.f, this.g, this.a, this.b, this.h, this.i, this.j, this.k.intValue());
    }
}
