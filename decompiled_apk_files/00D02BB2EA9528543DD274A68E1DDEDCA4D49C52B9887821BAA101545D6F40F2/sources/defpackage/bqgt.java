package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqgt  reason: default package */
/* loaded from: classes4.dex */
public final class bqgt extends bqhh {
    private akqq a;
    private dbsg<Long> b = dbpy.a;
    private dbsg<Long> c = dbpy.a;
    private dbsg<bqhr> d = dbpy.a;

    @Override // defpackage.bqhh
    public final void b(long j) {
        this.c = dbsg.i(Long.valueOf(j));
    }

    @Override // defpackage.bqhh
    public final void c(akqq akqqVar) {
        if (akqqVar != null) {
            this.a = akqqVar;
            return;
        }
        throw new NullPointerException("Null point");
    }

    @Override // defpackage.bqhh
    public final void d(long j) {
        this.b = dbsg.i(Long.valueOf(j));
    }

    @Override // defpackage.bqhh
    public final void e(bqhr bqhrVar) {
        this.d = dbsg.i(bqhrVar);
    }

    @Override // defpackage.bqhh
    public final bqhj a() {
        String str = this.a == null ? " point" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bqgu(this.a, this.b, this.c, this.d);
    }
}
