package defpackage;
/* compiled from: PG */
/* renamed from: bc  reason: default package */
/* loaded from: classes3.dex */
public abstract class bc<T> extends bt {
    public bc(bn bnVar) {
        super(bnVar);
    }

    public final void a(T t) {
        awj e = e();
        try {
            c(e, t);
            e.b();
        } finally {
            f(e);
        }
    }

    public final void b(Iterable<? extends T> iterable) {
        awj e = e();
        try {
            for (T t : iterable) {
                c(e, t);
                e.b();
            }
        } finally {
            f(e);
        }
    }

    public abstract void c(awj awjVar, T t);
}
