package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cppe  reason: default package */
/* loaded from: classes5.dex */
public final class cppe<T, D> implements cppl {
    public cpqn<T, D> a;
    public cpvi<T, D> b;
    public final cpsf<Float> c;
    private final cpqn<T, D> d;
    private final cpqn<T, D> e;
    private cpso<D> f;

    public cppe(cpqn<T, D> cpqnVar) {
        Float valueOf = Float.valueOf(0.0f);
        this.c = new cpsf<>(valueOf, valueOf);
        this.d = cpqnVar;
        this.e = new cpqq();
        this.a = cpqnVar;
    }

    public final float b(int i) {
        return this.a.p(i);
    }

    public final float c(int i) {
        return this.a.n(i);
    }

    public final T d(int i) {
        return this.a.j(i);
    }

    public final float e(int i) {
        return this.a.l(i);
    }

    public final int f(int i) {
        return this.a.q(i);
    }

    public final int g() {
        return this.a.i();
    }

    public final int h(D d) {
        return this.a.t(d);
    }

    public final float i() {
        return this.a.e();
    }

    public final float j() {
        return this.a.f();
    }

    @Override // defpackage.cppl
    public final void setAnimationPercent(float f) {
        this.a.h(f);
    }

    public final void a(cpso<D> cpsoVar, cpso<Double> cpsoVar2, cpve<T, D> cpveVar, cpvi<T, D> cpviVar, boolean z, float f, float f2, cpsf<Float> cpsfVar) {
        this.b = cpviVar;
        cpqn<T, D> cpqnVar = z ? this.d : this.e;
        cpqn<T, D> cpqnVar2 = this.a;
        if (cpqnVar != cpqnVar2) {
            cpqnVar.d(cpqnVar2.c());
            cpqnVar.r(this.a.s());
            this.a = cpqnVar;
        }
        this.a.b(f, f2);
        this.a.z(cpsoVar, cpsoVar2, cpveVar, cpviVar);
        if (cpsoVar == null) {
            cpsoVar = this.f;
        }
        this.f = cpsoVar;
        if (cpsoVar == null) {
            cpsf<Float> cpsfVar2 = this.c;
            Float valueOf = Float.valueOf(0.0f);
            cpsfVar2.b(valueOf, valueOf);
            return;
        }
        float l = cpsoVar.l();
        this.c.b(Float.valueOf(cpsfVar.a.floatValue() - l), Float.valueOf(cpsfVar.b.floatValue() + l));
    }
}
