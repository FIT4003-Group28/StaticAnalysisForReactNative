package defpackage;
/* compiled from: PG */
/* renamed from: brry  reason: default package */
/* loaded from: classes4.dex */
public final class brry extends brrs {
    public ddho a;
    public dbsg<ddhc> b;
    private dghs c;
    private Boolean d;
    private Boolean e;
    private dbsg<String> f;
    private brrv g;
    private brrw h;

    public brry() {
        this.f = dbpy.a;
        this.b = dbpy.a;
    }

    public brry(brrx brrxVar) {
        this.f = dbpy.a;
        this.b = dbpy.a;
        brrz brrzVar = (brrz) brrxVar;
        this.c = brrzVar.a;
        this.a = brrzVar.b;
        this.d = Boolean.valueOf(brrzVar.c);
        this.e = Boolean.valueOf(brrzVar.d);
        this.f = brrzVar.e;
        this.g = brrzVar.f;
        this.h = brrzVar.g;
        this.b = brrzVar.h;
    }

    @Override // defpackage.brrs
    public final brrx a() {
        if (this.g == null) {
            this.g = brrv.c().a();
        }
        String str = this.c == null ? " buttonType" : "";
        if (this.a == null) {
            str = str.concat(" veType");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" logCounterfactually");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" isProminentButton");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" surface");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new brrz(this.c, this.a, this.d.booleanValue(), this.e.booleanValue(), this.f, this.g, this.h, this.b);
    }

    @Override // defpackage.brrs
    public final void b(dghs dghsVar) {
        if (dghsVar != null) {
            this.c = dghsVar;
            return;
        }
        throw new NullPointerException("Null buttonType");
    }

    @Override // defpackage.brrs
    public final void c(brrv brrvVar) {
        if (brrvVar != null) {
            this.g = brrvVar;
            return;
        }
        throw new NullPointerException("Null extras");
    }

    @Override // defpackage.brrs
    public final void d(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.brrs
    public final void e(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.brrs
    public final void f(brrw brrwVar) {
        if (brrwVar != null) {
            this.h = brrwVar;
            return;
        }
        throw new NullPointerException("Null surface");
    }
}
