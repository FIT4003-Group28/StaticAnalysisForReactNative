package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acgx  reason: default package */
/* loaded from: classes2.dex */
public final class acgx extends acgz {
    private dccx<acha> a;
    private dcdc<acha> b;

    @Override // defpackage.acgz
    public final dccx<acha> a() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = dcdc.F();
            } else {
                dccx<acha> F = dcdc.F();
                this.a = F;
                F.i(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.acgz
    public final achb b() {
        dccx<acha> dccxVar = this.a;
        if (dccxVar != null) {
            this.b = dccxVar.f();
        } else if (this.b == null) {
            this.b = dcdc.e();
        }
        return new acgy(this.b);
    }
}
