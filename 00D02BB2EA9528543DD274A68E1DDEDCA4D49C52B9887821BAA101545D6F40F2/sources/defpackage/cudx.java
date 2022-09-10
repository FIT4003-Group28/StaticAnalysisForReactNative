package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cudx  reason: default package */
/* loaded from: classes5.dex */
public final class cudx extends cugp {
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Integer j;
    private dbsg<ctzl> a = dbpy.a;
    private dbsg<dspd> b = dbpy.a;
    private dbsg<cugd> c = dbpy.a;
    private dbsg<String> d = dbpy.a;
    private dbsg<Integer> i = dbpy.a;

    @Override // defpackage.cugp
    public final void b(ctzl ctzlVar) {
        this.a = dbsg.i(ctzlVar);
    }

    @Override // defpackage.cugp
    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cugp
    public final void d(dspd dspdVar) {
        this.b = dbsg.i(dspdVar);
    }

    @Override // defpackage.cugp
    public final void e(String str) {
        this.d = dbsg.i(str);
    }

    @Override // defpackage.cugp
    public final void f(int i) {
        this.i = dbsg.i(Integer.valueOf(i));
    }

    @Override // defpackage.cugp
    public final void g(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cugp
    public final void h(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.cugp
    public final void i(cugd cugdVar) {
        this.c = dbsg.i(cugdVar);
    }

    @Override // defpackage.cugp
    public final void j(int i) {
        this.j = Integer.valueOf(i);
    }

    @Override // defpackage.cugp
    public final void k(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cugp
    public final cugq a() {
        String str = this.e == null ? " timeToLiveSec" : "";
        if (this.f == null) {
            str = str.concat(" hideSnippetInConversationList");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" hideDismissButton");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" dismissibleByTappingOutside");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" overlayStyle");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cudy(this.a, this.b, this.c, this.d, this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j.intValue());
    }
}
