package defpackage;
/* compiled from: PG */
/* renamed from: cyzc  reason: default package */
/* loaded from: classes5.dex */
final class cyzc extends cyzn {
    private cyes a;
    private dcdc<cyzl> b;

    @Override // defpackage.cyzn
    public final void b(dcdc<cyzl> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @Override // defpackage.cyzn
    public final void c(cyes cyesVar) {
        if (cyesVar != null) {
            this.a = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.cyzn
    public final cyzo a() {
        String str = this.a == null ? " status" : "";
        if (this.b == null) {
            str = str.concat(" items");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyzd(this.a, this.b);
    }
}
