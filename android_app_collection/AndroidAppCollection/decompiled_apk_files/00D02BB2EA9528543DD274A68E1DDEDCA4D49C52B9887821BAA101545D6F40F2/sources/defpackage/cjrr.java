package defpackage;
/* compiled from: PG */
/* renamed from: cjrr  reason: default package */
/* loaded from: classes4.dex */
public final class cjrr extends cjst {
    public String a;
    private dccx<cjrz> b;
    private dcdc<cjrz> c;
    private ddhn d;

    @Override // defpackage.cjst
    public final dccx<cjrz> a() {
        if (this.b == null) {
            this.b = dcdc.F();
        }
        return this.b;
    }

    @Override // defpackage.cjst
    public final dcdc<cjrz> b() {
        dccx<cjrz> dccxVar = this.b;
        if (dccxVar != null) {
            return dccxVar.f();
        }
        if (this.c == null) {
            this.c = dcdc.e();
        }
        return this.c;
    }

    @Override // defpackage.cjst
    public final cjsu c() {
        dccx<cjrz> dccxVar = this.b;
        if (dccxVar != null) {
            this.c = dccxVar.f();
        } else if (this.c == null) {
            this.c = dcdc.e();
        }
        String str = this.d == null ? " requestType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cjrs(this.c, this.d, this.a);
    }

    @Override // defpackage.cjst
    public final void d(ddhn ddhnVar) {
        if (ddhnVar != null) {
            this.d = ddhnVar;
            return;
        }
        throw new NullPointerException("Null requestType");
    }
}
