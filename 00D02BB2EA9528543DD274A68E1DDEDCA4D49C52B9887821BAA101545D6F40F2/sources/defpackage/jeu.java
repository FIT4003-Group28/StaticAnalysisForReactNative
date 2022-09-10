package defpackage;
/* compiled from: PG */
/* renamed from: jeu  reason: default package */
/* loaded from: classes7.dex */
final class jeu extends jfn {
    public cqtv a;
    private Boolean b;
    private Boolean c;
    private Integer d;
    private Integer e;
    private Integer f;
    private dbsg<cqtv> g;

    public jeu() {
        this.g = dbpy.a;
    }

    public jeu(jfo jfoVar) {
        this.g = dbpy.a;
        this.b = Boolean.valueOf(jfoVar.a());
        this.c = Boolean.valueOf(jfoVar.b());
        this.d = Integer.valueOf(jfoVar.c());
        this.e = Integer.valueOf(jfoVar.d());
        this.f = Integer.valueOf(jfoVar.e());
        this.g = jfoVar.f();
        this.a = jfoVar.g();
    }

    @Override // defpackage.jfn
    public final void b(cqtv cqtvVar) {
        this.a = cqtvVar;
    }

    @Override // defpackage.jfn
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.jfn
    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.jfn
    public final void e(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.jfn
    public final void f(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.jfn
    public final void g(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.jfn
    public final void h(cqtv cqtvVar) {
        this.g = dbsg.i(cqtvVar);
    }

    @Override // defpackage.jfn
    public final jfo a() {
        String str = this.b == null ? " isInteractive" : "";
        if (this.c == null) {
            str = str.concat(" showRatingCommentary");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" resourceStar");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" resourceStarEmpty");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" resourceStarHalf");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" interStarPadding");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new jew(this.b.booleanValue(), this.c.booleanValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g, this.a);
    }
}
