package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czan  reason: default package */
/* loaded from: classes5.dex */
public final class czan extends czas {
    private dcdc<czau> a;
    private cyes b;

    @Override // defpackage.czas
    public final void b(dcdc<czau> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null personResponses");
    }

    @Override // defpackage.czas
    public final void c(cyes cyesVar) {
        if (cyesVar != null) {
            this.b = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.czas
    public final czav a() {
        String str = this.a == null ? " personResponses" : "";
        if (this.b == null) {
            str = str.concat(" status");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czao(this.a, this.b);
    }
}
