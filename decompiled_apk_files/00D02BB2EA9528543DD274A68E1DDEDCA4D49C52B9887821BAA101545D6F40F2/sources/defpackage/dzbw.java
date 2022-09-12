package defpackage;
/* compiled from: PG */
/* renamed from: dzbw  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzbw<T, U, V> extends dzby implements dyzw, dzfs {
    public final dyzw<? super V> a;
    public final dzbp<U> b;
    public volatile boolean c;
    public volatile boolean d;

    public dzbw(dyzw<? super V> dyzwVar, dzbp<U> dzbpVar) {
        this.a = dyzwVar;
        this.b = dzbpVar;
    }

    public final boolean f() {
        return this.e.getAndIncrement() == 0;
    }

    @Override // defpackage.dzfs
    public final int g(int i) {
        return this.e.addAndGet(i);
    }

    @Override // defpackage.dzfs
    public void h(U u) {
    }
}
