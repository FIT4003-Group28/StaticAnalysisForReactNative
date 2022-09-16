package defpackage;
/* compiled from: PG */
/* renamed from: aljl  reason: default package */
/* loaded from: classes.dex */
public final class aljl extends aljf {
    public aljl(int i, aliy aliyVar, float f, float f2) {
        super(i, aliyVar, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean d(aljd aljdVar) {
        return this.a.o(aljdVar);
    }

    @Override // defpackage.alip
    protected final void f(aljd aljdVar) {
        this.a.p(aljdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean g(aljd aljdVar) {
        return this.a.n(aljdVar);
    }

    @Override // defpackage.aljf
    protected final float j(aliv alivVar, int i) {
        return alivVar.b(i);
    }

    @Override // defpackage.aljf
    protected final float k(aliv alivVar, int i) {
        return alivVar.c(i);
    }

    @Override // defpackage.aljf
    protected final float l(float f) {
        double abs = Math.abs(f);
        Double.isNaN(abs);
        return (float) Math.abs(abs - 1.5707963267948966d);
    }
}
