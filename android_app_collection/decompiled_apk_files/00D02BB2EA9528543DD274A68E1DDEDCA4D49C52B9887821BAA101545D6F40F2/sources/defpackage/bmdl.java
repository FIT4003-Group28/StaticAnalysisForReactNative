package defpackage;
/* compiled from: PG */
/* renamed from: bmdl  reason: default package */
/* loaded from: classes3.dex */
final class bmdl extends bmdr {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private dbsg<cjqm> g;

    public bmdl() {
        this.g = dbpy.a;
    }

    public bmdl(bmds bmdsVar) {
        this.g = dbpy.a;
        bmdm bmdmVar = (bmdm) bmdsVar;
        this.a = Boolean.valueOf(bmdmVar.a);
        this.b = Boolean.valueOf(bmdmVar.b);
        this.c = Boolean.valueOf(bmdmVar.c);
        this.d = Boolean.valueOf(bmdmVar.d);
        this.e = Boolean.valueOf(bmdmVar.e);
        this.f = Boolean.valueOf(bmdmVar.f);
        this.g = bmdmVar.g;
    }

    @Override // defpackage.bmdr
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final void e(cjqm cjqmVar) {
        this.g = dbsg.i(cjqmVar);
    }

    @Override // defpackage.bmdr
    public final void f(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final void g(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final void h(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bmdr
    public final bmds a() {
        String str = this.a == null ? " preferAdNumber" : "";
        if (this.b == null) {
            str = str.concat(" showRateDialogIfNeeded");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" preferUserEditedNumber");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" canUseProxyPhoneNumber");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" canLogIAmHere");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" canLogPersonalizationEvent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bmdm(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g);
    }
}
