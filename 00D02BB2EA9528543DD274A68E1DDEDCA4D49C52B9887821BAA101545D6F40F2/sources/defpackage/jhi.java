package defpackage;
/* compiled from: PG */
/* renamed from: jhi  reason: default package */
/* loaded from: classes7.dex */
public final class jhi extends jhu {
    public jhs a;
    public jhr b;
    public Integer c;
    public Integer d;
    public String e;
    private cjtd f;
    private dccx<jho> g;
    private dcdc<jho> h;

    @Override // defpackage.jhu
    public final dccx<jho> a() {
        if (this.g == null) {
            if (this.h == null) {
                this.g = dcdc.F();
            } else {
                dccx<jho> F = dcdc.F();
                this.g = F;
                F.i(this.h);
                this.h = null;
            }
        }
        return this.g;
    }

    @Override // defpackage.jhu
    public final jhv b() {
        dccx<jho> dccxVar = this.g;
        if (dccxVar != null) {
            this.h = dccxVar.f();
        } else if (this.h == null) {
            this.h = dcdc.e();
        }
        String str = this.f == null ? " ue3LoggingParams" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new jhj(this.f, this.h, this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.jhu
    public final void c(cjtd cjtdVar) {
        if (cjtdVar != null) {
            this.f = cjtdVar;
            return;
        }
        throw new NullPointerException("Null ue3LoggingParams");
    }
}
