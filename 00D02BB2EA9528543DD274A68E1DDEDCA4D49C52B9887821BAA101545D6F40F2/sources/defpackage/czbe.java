package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czbe  reason: default package */
/* loaded from: classes5.dex */
public final class czbe extends czbk {
    private dcdc<czbm> a;
    private dcdn<String, cywi> b;
    private cyes c;

    @Override // defpackage.czbk
    public final void b(dcdc<czbm> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null matches");
    }

    @Override // defpackage.czbk
    public final void c(dcdn<String, cywi> dcdnVar) {
        if (dcdnVar != null) {
            this.b = dcdnVar;
            return;
        }
        throw new NullPointerException("Null people");
    }

    @Override // defpackage.czbk
    public final void d(cyes cyesVar) {
        if (cyesVar != null) {
            this.c = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.czbk
    public final czbn a() {
        String str = this.a == null ? " matches" : "";
        if (this.b == null) {
            str = str.concat(" people");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" status");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czbf(this.a, this.b, this.c);
    }
}
