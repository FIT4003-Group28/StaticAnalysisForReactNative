package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: assy  reason: default package */
/* loaded from: classes2.dex */
public final class assy extends astf {
    private amuh a;
    private alfa b;
    private Boolean c;
    private Boolean d;
    private int e;

    @Override // defpackage.astf
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.astf
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.astf
    public final void d(alfa alfaVar) {
        if (alfaVar != null) {
            this.b = alfaVar;
            return;
        }
        throw new NullPointerException("Null calloutsDisplayMode");
    }

    @Override // defpackage.astf
    public final void e(amuh amuhVar) {
        if (amuhVar != null) {
            this.a = amuhVar;
            return;
        }
        throw new NullPointerException("Null routeList");
    }

    @Override // defpackage.astf
    public final void f(int i) {
        if (i != 0) {
            this.e = i;
            return;
        }
        throw new NullPointerException("Null pinDisplayMode");
    }

    @Override // defpackage.astf
    public final astg a() {
        String str = this.a == null ? " routeList" : "";
        if (this.b == null) {
            str = str.concat(" calloutsDisplayMode");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" pinDisplayMode");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" alwaysShowImportantMeasles");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" allPathsAreActive");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new assz(this.a, this.b, this.e, this.c.booleanValue(), this.d.booleanValue());
    }
}
