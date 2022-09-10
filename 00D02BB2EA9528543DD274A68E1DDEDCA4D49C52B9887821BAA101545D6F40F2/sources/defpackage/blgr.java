package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blgr  reason: default package */
/* loaded from: classes3.dex */
public final class blgr extends blhx {
    private dccx<cdjd> a;
    private dcdc<cdjd> b;
    private dccx<dwfl> c;
    private dcdc<dwfl> d;

    @Override // defpackage.blhx
    public final dccx<cdjd> a() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = dcdc.F();
            } else {
                dccx<cdjd> F = dcdc.F();
                this.a = F;
                F.i(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.blhx
    public final dccx<dwfl> b() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = dcdc.F();
            } else {
                dccx<dwfl> F = dcdc.F();
                this.c = F;
                F.i(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.blhx
    public final blhy c() {
        dccx<cdjd> dccxVar = this.a;
        if (dccxVar != null) {
            this.b = dccxVar.f();
        } else if (this.b == null) {
            this.b = dcdc.e();
        }
        dccx<dwfl> dccxVar2 = this.c;
        if (dccxVar2 != null) {
            this.d = dccxVar2.f();
        } else if (this.d == null) {
            this.d = dcdc.e();
        }
        return new blgs(this.b, this.d);
    }
}
