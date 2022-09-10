package defpackage;
/* compiled from: PG */
/* renamed from: hzf  reason: default package */
/* loaded from: classes6.dex */
final class hzf extends iap {
    public cqss a;
    public cqss b;
    public cqss c;
    private dccx<cqmp<iao>> d;
    private dcdc<cqmp<iao>> e;

    @Override // defpackage.iap
    public final dccx<cqmp<iao>> a() {
        if (this.d == null) {
            if (this.e == null) {
                this.d = dcdc.F();
            } else {
                dccx<cqmp<iao>> F = dcdc.F();
                this.d = F;
                F.i(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    @Override // defpackage.iap
    public final iaq b() {
        dccx<cqmp<iao>> dccxVar = this.d;
        if (dccxVar != null) {
            this.e = dccxVar.f();
        } else if (this.e == null) {
            this.e = dcdc.e();
        }
        String str = this.c == null ? " badgeColor" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new hzg(this.a, this.b, this.e, this.c);
    }

    @Override // defpackage.iap
    public final void c(cqss cqssVar) {
        this.c = cqssVar;
    }

    @Override // defpackage.iap
    public final void d(@dzsi cqss cqssVar) {
        this.b = cqssVar;
    }
}
