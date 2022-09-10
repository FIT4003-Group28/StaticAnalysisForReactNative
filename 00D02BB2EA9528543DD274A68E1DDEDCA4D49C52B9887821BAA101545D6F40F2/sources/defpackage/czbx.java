package defpackage;
/* compiled from: PG */
/* renamed from: czbx  reason: default package */
/* loaded from: classes5.dex */
final class czbx extends czck {
    private dcdc<cywi> a;
    private cyes b;
    private Boolean c;

    @Override // defpackage.czck
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.czck
    public final void c(dcdc<cywi> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @Override // defpackage.czck
    public final void d(cyes cyesVar) {
        if (cyesVar != null) {
            this.b = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.czck
    public final czcl a() {
        String str = this.a == null ? " items" : "";
        if (this.b == null) {
            str = str.concat(" status");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" containsPartialResults");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czby(this.a, this.b, this.c.booleanValue());
    }
}
