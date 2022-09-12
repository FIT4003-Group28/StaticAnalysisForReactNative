package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vwj  reason: default package */
/* loaded from: classes7.dex */
public final class vwj extends vwl {
    public bvrt<vwi> a;
    private Boolean b;
    private bwrs<amte> c;
    private bwrs<amte> d;
    private bttq e;
    private Integer f;
    private Integer g;
    private Integer h;
    private String i;
    private String j;
    private String k;
    private vwm l;
    private dcdn<Integer, String> m;

    public vwj() {
    }

    public vwj(vwn vwnVar) {
        vwk vwkVar = (vwk) vwnVar;
        this.b = Boolean.valueOf(vwkVar.a);
        this.c = vwkVar.b;
        this.d = vwkVar.c;
        this.e = vwkVar.d;
        this.f = Integer.valueOf(vwkVar.e);
        this.g = vwkVar.f;
        this.h = vwkVar.g;
        this.i = vwkVar.h;
        this.j = vwkVar.i;
        this.k = vwkVar.j;
        this.l = vwkVar.k;
        this.m = vwkVar.l;
        this.a = vwkVar.m;
    }

    @Override // defpackage.vwl
    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.vwl
    public final void c(@dzsi vwm vwmVar) {
        this.l = vwmVar;
    }

    @Override // defpackage.vwl
    public final void d(@dzsi String str) {
        this.k = str;
    }

    @Override // defpackage.vwl
    public final void e(@dzsi bttq bttqVar) {
        this.e = bttqVar;
    }

    @Override // defpackage.vwl
    public final void f(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.vwl
    public final void g(bwrs<amte> bwrsVar) {
        this.d = bwrsVar;
    }

    @Override // defpackage.vwl
    public final void h(@dzsi String str) {
        this.j = str;
    }

    @Override // defpackage.vwl
    public final void i(@dzsi dcdn<Integer, String> dcdnVar) {
        this.m = dcdnVar;
    }

    @Override // defpackage.vwl
    public final void j(@dzsi Integer num) {
        this.g = num;
    }

    @Override // defpackage.vwl
    public final void k(@dzsi Integer num) {
        this.h = num;
    }

    @Override // defpackage.vwl
    public final void l(bwrs<amte> bwrsVar) {
        this.c = bwrsVar;
    }

    @Override // defpackage.vwl
    public final void m(bvrt<vwi> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.vwl
    public final void n(@dzsi String str) {
        this.i = str;
    }

    @Override // defpackage.vwl
    public final vwn a() {
        String str = this.b == null ? " isLoading" : "";
        if (this.c == null) {
            str = str.concat(" storageItemReference");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" pendingStorageItemReference");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" activeTripIndex");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" transitTripDetailsStateInternal");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new vwk(this.b.booleanValue(), this.c, this.d, this.e, this.f.intValue(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.a);
    }
}
