package defpackage;
/* compiled from: PG */
/* renamed from: ifl  reason: default package */
/* loaded from: classes.dex */
public final class ifl extends iie {
    public cqtv a;
    public cqtv b;
    public cqtv c;
    public cqtv d;
    public cqss e;
    public igu f;
    private Integer g;
    private cqtv h;
    private cqtv i;
    private cqtv j;
    private cqtv k;
    private cqtv l;
    private cqtv m;
    private Boolean n;
    private Boolean o;
    private Boolean p;

    public ifl() {
    }

    public ifl(iif iifVar) {
        ifm ifmVar = (ifm) iifVar;
        this.g = Integer.valueOf(ifmVar.a);
        this.h = ifmVar.b;
        this.i = ifmVar.c;
        this.j = ifmVar.d;
        this.k = ifmVar.e;
        this.l = ifmVar.f;
        this.m = ifmVar.g;
        this.a = ifmVar.h;
        this.b = ifmVar.i;
        this.c = ifmVar.j;
        this.n = Boolean.valueOf(ifmVar.k);
        this.o = Boolean.valueOf(ifmVar.l);
        this.p = Boolean.valueOf(ifmVar.m);
        this.d = ifmVar.n;
        this.e = ifmVar.o;
        this.f = ifmVar.p;
    }

    @Override // defpackage.iie
    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.iie
    public final void c(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.k = cqtvVar;
            return;
        }
        throw new NullPointerException("Null carouselPaddingBottom");
    }

    @Override // defpackage.iie
    public final void d(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.j = cqtvVar;
            return;
        }
        throw new NullPointerException("Null carouselPaddingEnd");
    }

    @Override // defpackage.iie
    public final void e(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.i = cqtvVar;
            return;
        }
        throw new NullPointerException("Null carouselPaddingStart");
    }

    @Override // defpackage.iie
    public final void f(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.h = cqtvVar;
            return;
        }
        throw new NullPointerException("Null carouselPaddingTop");
    }

    @Override // defpackage.iie
    public final void g(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.iie
    public final void h(cqss cqssVar) {
        this.e = cqssVar;
    }

    @Override // defpackage.iie
    public final void i(cqtv cqtvVar) {
        this.d = cqtvVar;
    }

    @Override // defpackage.iie
    public final void j(cqtv cqtvVar) {
        this.c = cqtvVar;
    }

    @Override // defpackage.iie
    public final void k(cqtv cqtvVar) {
        this.a = cqtvVar;
    }

    @Override // defpackage.iie
    public final void l(cqtv cqtvVar) {
        this.m = cqtvVar;
    }

    @Override // defpackage.iie
    public final void m(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.iie
    public final void n(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.iie
    public final void o(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.l = cqtvVar;
            return;
        }
        throw new NullPointerException("Null itemWidthSize");
    }

    @Override // defpackage.iie
    public final iif a() {
        String str = this.g == null ? " carouselExpandWidthThreshold" : "";
        if (this.h == null) {
            str = str.concat(" carouselPaddingTop");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" carouselPaddingStart");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" carouselPaddingEnd");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" carouselPaddingBottom");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" itemWidthSize");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" itemElevation");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" itemSpacing");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" itemCornerRadius");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" enableItemSnapping");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" itemUseCompatPadding");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" itemPreventCornerOverlap");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" itemContentPadding");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" itemBackgroundColor");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" headerViewProperties");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ifm(this.g.intValue(), this.h, this.i, this.j, this.k, this.l, this.m, this.a, this.b, this.c, this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.d, this.e, this.f);
    }
}
