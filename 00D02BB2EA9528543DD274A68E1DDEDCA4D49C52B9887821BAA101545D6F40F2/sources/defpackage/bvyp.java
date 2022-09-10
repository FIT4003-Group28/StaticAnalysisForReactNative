package defpackage;
/* renamed from: bvyp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bvyp implements defg {
    static final defg a = new bvyp();

    private bvyp() {
    }

    @Override // defpackage.defg
    public final dehn a(Object obj) {
        dmcj dmcjVar = (dmcj) obj;
        if (dmcjVar.b != 0) {
            bvvx bvvxVar = new bvvx();
            drtc b = drtc.b(dmcjVar.b);
            if (b != null) {
                bvvxVar.a = b;
                String str = bvvxVar.a == null ? " statusCode" : "";
                if (str.isEmpty()) {
                    return deha.b(new bvvy(bvvxVar.a));
                }
                throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null statusCode");
        }
        return deha.a(dmcjVar);
    }
}
