package defpackage;
/* compiled from: PG */
/* renamed from: bbsy  reason: default package */
/* loaded from: classes3.dex */
final class bbsy extends bbvc {
    public akqq a;
    private Boolean b;
    private Boolean c;

    public bbsy() {
    }

    public bbsy(bbvd bbvdVar) {
        bbsz bbszVar = (bbsz) bbvdVar;
        this.a = bbszVar.a;
        this.b = Boolean.valueOf(bbszVar.b);
        this.c = Boolean.valueOf(bbszVar.c);
    }

    @Override // defpackage.bbvc
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.bbvc
    public final void c(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bbvc
    public final bbvd a() {
        String str = this.b == null ? " shouldUseExifLocationFirst" : "";
        if (this.c == null) {
            str = str.concat(" showImmediately");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbsz(this.a, this.b.booleanValue(), this.c.booleanValue());
    }
}
