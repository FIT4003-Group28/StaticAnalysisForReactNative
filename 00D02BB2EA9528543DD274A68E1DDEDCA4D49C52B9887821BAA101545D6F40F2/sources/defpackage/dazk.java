package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: dazk  reason: default package */
/* loaded from: classes.dex */
public final class dazk implements Runnable, Closeable {
    private dazn a;
    private dazn b;
    private final boolean c = czhz.a();
    private boolean d;
    private boolean e;

    public dazk(dazn daznVar) {
        this.a = daznVar;
        this.b = daznVar;
    }

    private final void b() {
        this.d = true;
        dazn daznVar = this.a;
        if (this.c && !this.e) {
            czhz.a();
        }
        daznVar.g();
        this.a = null;
    }

    public final <V, T extends dehn<V>> void a(T t) {
        if (!this.d) {
            if (!this.e) {
                this.e = true;
                t.Pk(this, dege.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            czhz.e(dazj.a);
        } else {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        dazn daznVar = this.b;
        this.b = null;
        try {
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
        } finally {
            dbaa.d(daznVar);
        }
    }
}
