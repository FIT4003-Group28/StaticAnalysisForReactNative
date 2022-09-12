package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzsy  reason: default package */
/* loaded from: classes6.dex */
public final class dzsy<T> implements Serializable, dzss {
    private dzut<? extends T> a;
    private volatile Object b = dzta.a;
    private final Object c = this;

    public dzsy(dzut<? extends T> dzutVar) {
        this.a = dzutVar;
    }

    private final Object writeReplace() {
        return new dzsr(a());
    }

    public final String toString() {
        return this.b != dzta.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }

    @Override // defpackage.dzss
    public final T a() {
        T t;
        T t2 = (T) this.b;
        if (t2 != dzta.a) {
            return t2;
        }
        synchronized (this.c) {
            t = (T) this.b;
            if (t == dzta.a) {
                dzut<? extends T> dzutVar = this.a;
                if (dzutVar != null) {
                    t = dzutVar.a();
                    this.b = t;
                    this.a = null;
                } else {
                    NullPointerException nullPointerException = new NullPointerException();
                    dzvx.e(nullPointerException);
                    throw nullPointerException;
                }
            }
        }
        return t;
    }
}
