package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: anep  reason: default package */
/* loaded from: classes.dex */
public final class anep implements Closeable {
    private static final aneo b;
    final aneo a;
    private final Deque c = new ArrayDeque(4);
    private Throwable d;

    static {
        aneo aneoVar;
        try {
            aneoVar = new anen(Throwable.class.getMethod("addSuppressed", Throwable.class));
        } catch (Throwable unused) {
            aneoVar = null;
        }
        if (aneoVar == null) {
            aneoVar = anem.a;
        }
        b = aneoVar;
    }

    public anep(aneo aneoVar) {
        aneoVar.getClass();
        this.a = aneoVar;
    }

    public static anep a() {
        return new anep(b);
    }

    public final RuntimeException b(Throwable th) {
        this.d = th;
        amqs.d(th, IOException.class);
        throw new RuntimeException(th);
    }

    public final void c(Closeable closeable) {
        if (closeable != null) {
            this.c.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.a.a(closeable, th, th2);
                }
            }
        }
        if (this.d != null || th == null) {
            return;
        }
        amqs.d(th, IOException.class);
        throw new AssertionError(th);
    }
}
