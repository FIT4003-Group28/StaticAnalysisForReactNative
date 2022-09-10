package defpackage;
/* compiled from: PG */
/* renamed from: cpqo  reason: default package */
/* loaded from: classes5.dex */
public class cpqo<T, D> extends cpqs<T, D, cpqr<T, D>> implements cpqn<T, D> {
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;

    @Override // defpackage.cpqn
    public final void b(float f, float f2) {
        this.b = this.c;
        this.e = this.f;
        this.d = f;
        this.g = f2;
    }

    @Override // defpackage.cpqn
    public final cpqp<T, D> c() {
        if (this.a == null) {
            return null;
        }
        return new cpqp<>(w(), y(), this.c, this.f);
    }

    @Override // defpackage.cpqn
    public final synchronized void d(cpqp<T, D> cpqpVar) {
        if (cpqpVar == null) {
            return;
        }
        v(cpqpVar.a);
        x(cpqpVar.b);
        float f = cpqpVar.c;
        this.d = f;
        this.b = f;
        this.c = f;
        float f2 = cpqpVar.d;
        this.g = f2;
        this.e = f2;
        this.f = f2;
    }

    @Override // defpackage.cpqn
    public final float e() {
        return this.f;
    }

    @Override // defpackage.cpqn
    public final float f() {
        return this.c;
    }

    @Override // defpackage.cpqs
    protected final cpqr<T, D> g(cpvi<T, D> cpviVar) {
        return A(cpviVar);
    }

    @Override // defpackage.cpqs, defpackage.cpqu
    public final synchronized void h(float f) {
        super.h(f);
        float f2 = this.d;
        float f3 = this.b;
        this.c = ((f2 - f3) * f) + f3;
        float f4 = this.g;
        float f5 = this.e;
        this.f = ((f4 - f5) * f) + f5;
    }
}
