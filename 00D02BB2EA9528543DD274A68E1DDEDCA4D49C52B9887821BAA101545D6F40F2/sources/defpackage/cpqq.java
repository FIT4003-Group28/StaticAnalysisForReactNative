package defpackage;
/* compiled from: PG */
/* renamed from: cpqq  reason: default package */
/* loaded from: classes5.dex */
public final class cpqq<T, D> extends cpqt<T, D> implements cpqn<T, D> {
    private float a;
    private float b;

    @Override // defpackage.cpqn
    public final void b(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cpqn
    public final cpqp<T, D> c() {
        cpqv<T, D> F = F();
        if (F == null) {
            return null;
        }
        return new cpqp<>(F, o(), this.a, this.b);
    }

    @Override // defpackage.cpqn
    public final void d(cpqp<T, D> cpqpVar) {
        if (cpqpVar == null) {
            return;
        }
        g(cpqpVar.a);
        v(cpqpVar.b);
        this.a = cpqpVar.c;
        this.b = cpqpVar.d;
    }

    @Override // defpackage.cpqn
    public final float e() {
        return this.b;
    }

    @Override // defpackage.cpqn
    public final float f() {
        return this.a;
    }
}
