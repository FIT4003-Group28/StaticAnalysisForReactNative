package defpackage;
/* compiled from: PG */
/* renamed from: snm  reason: default package */
/* loaded from: classes7.dex */
final class snm extends sqv {
    public dcdc<dpte> a;
    public dcdc<dnui> b;
    private Long c;

    public snm() {
    }

    public snm(sqw sqwVar) {
        snn snnVar = (snn) sqwVar;
        this.a = snnVar.a;
        this.b = snnVar.b;
        this.c = Long.valueOf(snnVar.c);
    }

    @Override // defpackage.sqv
    public final void b(@dzsi dcdc<dnui> dcdcVar) {
        this.b = dcdcVar;
    }

    @Override // defpackage.sqv
    public final void c(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.sqv
    public final void d(@dzsi dcdc<dpte> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.sqv
    public final sqw a() {
        String str = this.c == null ? " predictedDestinationUpdatedSec" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new snn(this.a, this.b, this.c.longValue());
    }
}
