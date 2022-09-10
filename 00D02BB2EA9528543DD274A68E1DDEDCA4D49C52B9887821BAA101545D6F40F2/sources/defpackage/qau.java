package defpackage;
/* compiled from: PG */
/* renamed from: qau  reason: default package */
/* loaded from: classes7.dex */
public final class qau extends qdd {
    public String a;
    public dnqh b;
    public bwrs<brln> c;
    public bwrs<brlu> d;
    private akqi e;
    private Boolean f;
    private Boolean g;
    private Boolean h;

    @Override // defpackage.qdd
    public final void b(akqi akqiVar) {
        if (akqiVar != null) {
            this.e = akqiVar;
            return;
        }
        throw new NullPointerException("Null lineFeatureId");
    }

    @Override // defpackage.qdd
    public final void c(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.qdd
    public final void d(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.qdd
    public final void e(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.qdd
    public final qde a() {
        String str = this.e == null ? " lineFeatureId" : "";
        if (this.f == null) {
            str = str.concat(" replaceTopOfStack");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" showSearchBar");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" shouldPulseMap");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qav(this.e, this.a, this.b, this.f.booleanValue(), this.c, this.d, this.g.booleanValue(), this.h.booleanValue());
    }
}
