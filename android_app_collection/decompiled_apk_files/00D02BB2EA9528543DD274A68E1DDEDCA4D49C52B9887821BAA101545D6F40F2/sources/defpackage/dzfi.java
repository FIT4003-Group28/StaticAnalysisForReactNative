package defpackage;
/* compiled from: PG */
/* renamed from: dzfi  reason: default package */
/* loaded from: classes6.dex */
public final class dzfi<T> extends dzfh<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    public final eavl<? super T> a;
    public T b;

    public dzfi(eavl<? super T> eavlVar) {
        this.a = eavlVar;
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return get() != 16;
    }

    @Override // defpackage.dzbq
    public final T SP() {
        if (get() == 16) {
            lazySet(32);
            T t = this.b;
            this.b = null;
            return t;
        }
        return null;
    }

    @Override // defpackage.eavm
    public final void SS() {
        set(4);
        this.b = null;
    }

    @Override // defpackage.eavm
    public final void a(long j) {
        T t;
        if (dzfj.d(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    eavl<? super T> eavlVar = this.a;
                    eavlVar.c(t);
                    if (get() == 4) {
                        return;
                    }
                    eavlVar.e();
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // defpackage.dzbq
    public final void f() {
        lazySet(32);
        this.b = null;
    }

    @Override // defpackage.dzbo
    public final int h() {
        throw null;
    }
}
