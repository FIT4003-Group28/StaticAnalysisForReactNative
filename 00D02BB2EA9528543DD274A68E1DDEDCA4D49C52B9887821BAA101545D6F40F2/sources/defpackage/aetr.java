package defpackage;
/* compiled from: PG */
/* renamed from: aetr  reason: default package */
/* loaded from: classes2.dex */
final class aetr extends aett {
    public String a;
    public Integer c;
    public Integer d;
    public Integer e;
    public Boolean f;
    public dmlo g;
    public akvo<? super aktd> h;
    public int i;
    private Integer k;
    private Integer l;
    private Integer m;
    private Integer n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private dbsg<String> j = dbpy.a;
    public dbsg<String> b = dbpy.a;

    @Override // defpackage.aett
    public final void b() {
        this.l = -431847948;
    }

    @Override // defpackage.aett
    public final void c(int i) {
        this.q = Integer.valueOf(i);
    }

    @Override // defpackage.aett
    public final void d(int i) {
        this.n = Integer.valueOf(i);
    }

    @Override // defpackage.aett
    public final void e(int i) {
        this.r = Integer.valueOf(i);
    }

    @Override // defpackage.aett
    public final void f(String str) {
        this.j = dbsg.i(str);
    }

    @Override // defpackage.aett
    public final void g() {
        this.k = -1;
    }

    @Override // defpackage.aett
    public final void h() {
        this.p = 4;
    }

    @Override // defpackage.aett
    public final void i() {
        this.m = 14;
    }

    @Override // defpackage.aett
    public final void j() {
        this.o = 4;
    }

    @Override // defpackage.aett
    public final aetu a() {
        String str = this.a == null ? " text" : "";
        if (this.k == null) {
            str = str.concat(" textColor");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" backgroundColor");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" textSizeDp");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" caretHeightDp");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" textVerticalPaddingDp");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" textHorizontalPaddingDp");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" calloutCaretOffsetDp");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" dropShadowOffsetDp");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" dropShadowColor");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" dropShadowBlurRadiusDp");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" iconScaleDp");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" drawOverPlacemarks");
        }
        if (this.i == 0) {
            str = String.valueOf(str).concat(" iconPosition");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" anchorPoint");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aets(this.a, this.j, this.b, this.k.intValue(), this.l.intValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.intValue(), this.q.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.r.intValue(), this.f.booleanValue(), this.i, this.g, this.h);
    }
}
