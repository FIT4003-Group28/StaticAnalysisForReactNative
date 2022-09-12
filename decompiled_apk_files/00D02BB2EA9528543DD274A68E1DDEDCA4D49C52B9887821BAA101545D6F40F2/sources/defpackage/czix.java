package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: czix  reason: default package */
/* loaded from: classes5.dex */
public final class czix<T extends Closeable> implements Closeable {
    @dzsi
    public T a;

    private czix(T t) {
        this.a = t;
    }

    public static <T extends Closeable> czix<T> a(T t) {
        return new czix<>(t);
    }

    @dzsi
    public final T b() {
        T t = this.a;
        this.a = null;
        return t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        T t = this.a;
        if (t != null) {
            t.close();
        }
    }
}
