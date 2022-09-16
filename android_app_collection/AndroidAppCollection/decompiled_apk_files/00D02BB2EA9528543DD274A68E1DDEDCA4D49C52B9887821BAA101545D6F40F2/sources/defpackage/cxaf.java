package defpackage;
/* compiled from: PG */
/* renamed from: cxaf  reason: default package */
/* loaded from: classes5.dex */
final class cxaf extends cxah {
    public Integer a;
    public dbsg<cxam> b = dbpy.a;
    public int c;
    private Boolean d;

    @Override // defpackage.cxah
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cxah
    public final void c(int i) {
        this.c = i;
    }

    @Override // defpackage.cxah
    public final cxai a() {
        String str = this.c == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" batchSize");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" enableUrlAutoSanitization");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxag(this.c, this.a.intValue(), this.d.booleanValue(), this.b);
    }
}
