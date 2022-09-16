package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: ddaq  reason: default package */
/* loaded from: classes5.dex */
public final class ddaq implements Closeable {
    private static final ddap b;
    final ddap a;
    private final Deque<Closeable> c = new ArrayDeque(4);
    private Throwable d;

    static {
        b = ddao.b != null ? ddao.a : ddan.a;
    }

    public ddaq(ddap ddapVar) {
        dbsk.s(ddapVar);
        this.a = ddapVar;
    }

    public static ddaq a() {
        return new ddaq(b);
    }

    public final RuntimeException b(Throwable th) {
        this.d = th;
        dbue.c(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final <C extends Closeable> void c(C c) {
        if (c != null) {
            this.c.addFirst(c);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable removeFirst = this.c.removeFirst();
            try {
                removeFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.a.a(removeFirst, th, th2);
                }
            }
        }
        if (this.d != null || th == null) {
            return;
        }
        dbue.c(th, IOException.class);
        throw new AssertionError(th);
    }
}
