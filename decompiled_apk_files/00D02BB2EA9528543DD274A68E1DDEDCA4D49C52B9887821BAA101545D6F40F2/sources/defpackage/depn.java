package defpackage;
/* compiled from: PG */
/* renamed from: depn  reason: default package */
/* loaded from: classes6.dex */
public final class depn<T> implements desq<T> {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile desq<T> c;

    public depn(desq<T> desqVar) {
        this.c = desqVar;
    }

    @Override // defpackage.desq
    public final T a() {
        T t = (T) this.b;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.c.a();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }
}
