package defpackage;
/* compiled from: PG */
/* renamed from: bqcs  reason: default package */
/* loaded from: classes4.dex */
public final class bqcs extends bqcx {
    public int a;
    private dccx<bqcv> b;
    private dcdc<bqcv> c;
    private dccx<bqcw> d;
    private dcdc<bqcw> e;

    @Override // defpackage.bqcx
    public final dccx<bqcv> a() {
        if (this.b == null) {
            if (this.c == null) {
                this.b = dcdc.F();
            } else {
                dccx<bqcv> F = dcdc.F();
                this.b = F;
                F.i(this.c);
                this.c = null;
            }
        }
        return this.b;
    }

    @Override // defpackage.bqcx
    public final dccx<bqcw> b() {
        if (this.d == null) {
            if (this.e == null) {
                this.d = dcdc.F();
            } else {
                dccx<bqcw> F = dcdc.F();
                this.d = F;
                F.i(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    @Override // defpackage.bqcx
    public final bqcy c() {
        dccx<bqcv> dccxVar = this.b;
        if (dccxVar != null) {
            this.c = dccxVar.f();
        } else if (this.c == null) {
            this.c = dcdc.e();
        }
        dccx<bqcw> dccxVar2 = this.d;
        if (dccxVar2 != null) {
            this.e = dccxVar2.f();
        } else if (this.e == null) {
            this.e = dcdc.e();
        }
        String str = this.a == 0 ? " errorType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bqct(this.a, this.c, this.e);
    }
}
