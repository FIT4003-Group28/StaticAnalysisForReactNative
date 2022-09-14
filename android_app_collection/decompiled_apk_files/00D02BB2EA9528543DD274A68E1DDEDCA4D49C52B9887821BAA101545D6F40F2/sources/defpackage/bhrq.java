package defpackage;
/* compiled from: PG */
/* renamed from: bhrq  reason: default package */
/* loaded from: classes3.dex */
final class bhrq extends bhrs {
    private dgfb a;
    private Boolean b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;

    @Override // defpackage.bhrs
    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bhrs
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bhrs
    public final void d(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bhrs
    public final void e(dgfb dgfbVar) {
        if (dgfbVar != null) {
            this.a = dgfbVar;
            return;
        }
        throw new NullPointerException("Null offeringType");
    }

    @Override // defpackage.bhrs
    public final void f(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bhrs
    public final void g(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bhrs
    public final bhrt a() {
        String str = this.a == null ? " offeringType" : "";
        if (this.b == null) {
            str = str.concat(" enabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" counterfactualEnabled");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" zeroStateEnabled");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" zeroStateCounterfactualEnabled");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" contributionEnabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bhrr(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue());
    }
}
