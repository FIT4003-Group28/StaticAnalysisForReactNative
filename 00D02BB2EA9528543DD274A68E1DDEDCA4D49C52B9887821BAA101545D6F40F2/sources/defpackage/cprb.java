package defpackage;
/* compiled from: PG */
/* renamed from: cprb  reason: default package */
/* loaded from: classes5.dex */
public final class cprb<T, D> extends cpqt<T, D> implements cpqy<T, D> {
    private float a;

    @Override // defpackage.cpqy
    public final void a(float f) {
        this.a = f;
    }

    @Override // defpackage.cpqy
    public final float b() {
        return this.a;
    }

    @Override // defpackage.cpqy
    public final cpra<T, D> c() {
        if (F() == null) {
            return null;
        }
        return new cpra<>(F(), o(), this.a);
    }

    @Override // defpackage.cpqy
    public final void d(cpra<T, D> cpraVar) {
        if (cpraVar == null) {
            return;
        }
        this.a = cpraVar.c;
        g(cpraVar.a);
        v(cpraVar.b);
    }
}
