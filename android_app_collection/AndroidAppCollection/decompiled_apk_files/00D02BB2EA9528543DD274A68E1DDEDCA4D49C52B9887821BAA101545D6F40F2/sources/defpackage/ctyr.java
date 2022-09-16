package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctyr  reason: default package */
/* loaded from: classes5.dex */
public final class ctyr extends cuhf {
    private String a;
    private dbsg<cuhp> b = dbpy.a;
    private dbsg<dcdc<cuhl>> c = dbpy.a;
    private dbsg<dcdc<cuhi>> d = dbpy.a;
    private dbsg<Boolean> e = dbpy.a;

    @Override // defpackage.cuhf
    public final void b(dcdc<cuhi> dcdcVar) {
        this.d = dbsg.i(dcdcVar);
    }

    @Override // defpackage.cuhf
    public final void c(dcdc<cuhl> dcdcVar) {
        this.c = dbsg.i(dcdcVar);
    }

    @Override // defpackage.cuhf
    public final void d(cuhp cuhpVar) {
        this.b = dbsg.i(cuhpVar);
    }

    @Override // defpackage.cuhf
    public final void e(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null rawText");
    }

    @Override // defpackage.cuhf
    public final void f(boolean z) {
        this.e = dbsg.i(Boolean.valueOf(z));
    }

    @Override // defpackage.cuhf
    public final cuhg a() {
        String str = this.a == null ? " rawText" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cueh(this.a, this.b, this.c, this.d, this.e);
    }
}
