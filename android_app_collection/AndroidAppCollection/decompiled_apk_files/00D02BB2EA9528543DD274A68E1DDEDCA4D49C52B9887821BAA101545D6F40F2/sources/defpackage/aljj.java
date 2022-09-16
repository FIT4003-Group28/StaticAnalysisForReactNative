package defpackage;
/* compiled from: PG */
/* renamed from: aljj  reason: default package */
/* loaded from: classes2.dex */
public final class aljj extends aljf {
    public aljj(aliy aliyVar, float f, float f2) {
        super(2, aliyVar, f, f2);
        this.f = 0.05f;
        this.g = (float) Math.tan(Math.toRadians(20.0d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean d(aljd aljdVar) {
        return this.a.t(aljdVar);
    }

    @Override // defpackage.alip
    protected final void f(aljd aljdVar) {
        this.a.u(aljdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean g(aljd aljdVar) {
        return this.a.v(aljdVar);
    }

    @Override // defpackage.aljf
    protected final float j(aliv alivVar, int i) {
        return alivVar.c(i);
    }

    @Override // defpackage.aljf
    protected final float k(aliv alivVar, int i) {
        return alivVar.b(i);
    }

    @Override // defpackage.aljf
    protected final float l(float f) {
        double abs = Math.abs(f);
        Double.isNaN(abs);
        return Math.min(Math.abs(f), (float) Math.abs(abs - 3.141592653589793d));
    }
}
