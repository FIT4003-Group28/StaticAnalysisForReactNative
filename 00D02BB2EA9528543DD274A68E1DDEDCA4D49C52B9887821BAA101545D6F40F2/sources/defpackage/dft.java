package defpackage;
/* compiled from: PG */
/* renamed from: dft  reason: default package */
/* loaded from: classes6.dex */
final class dft extends dfw {
    private dfx a;
    private Boolean b;
    private Boolean c;
    private Boolean d;

    public dft() {
    }

    public dft(dfy dfyVar) {
        dfu dfuVar = (dfu) dfyVar;
        this.a = dfuVar.a;
        this.b = Boolean.valueOf(dfuVar.b);
        this.c = Boolean.valueOf(dfuVar.c);
        this.d = Boolean.valueOf(dfuVar.d);
    }

    @Override // defpackage.dfw
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.dfw
    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.dfw
    public final void d(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.dfw
    public final void e(dfx dfxVar) {
        if (dfxVar != null) {
            this.a = dfxVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.dfw
    public final dfy a() {
        String str = this.a == null ? " type" : "";
        if (this.b == null) {
            str = str.concat(" rippleEnabled");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" snapToBottomEnabled");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" darkModeDisabled");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new dfu(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue());
    }
}
