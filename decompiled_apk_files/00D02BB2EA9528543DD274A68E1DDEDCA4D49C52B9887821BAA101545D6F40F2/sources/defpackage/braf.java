package defpackage;
/* compiled from: PG */
/* renamed from: braf  reason: default package */
/* loaded from: classes4.dex */
final class braf extends bral {
    public bwrs<brln> a;
    public gfw b;
    private Boolean c;
    private Boolean d;
    private cjqk e;

    @Override // defpackage.bral
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bral
    public final void c(cjqk cjqkVar) {
        if (cjqkVar != null) {
            this.e = cjqkVar;
            return;
        }
        throw new NullPointerException("Null searchLoggedEvent");
    }

    @Override // defpackage.bral
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.bral
    public final bram a() {
        String str = this.a == null ? " searchRequestRef" : "";
        if (this.c == null) {
            str = str.concat(" replaceCurrentTopFragment");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" shouldChangeCamera");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" searchLoggedEvent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new brag(this.a, this.c.booleanValue(), this.d.booleanValue(), this.e, this.b);
    }
}
