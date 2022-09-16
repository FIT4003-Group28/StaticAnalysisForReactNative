package defpackage;
/* compiled from: PG */
/* renamed from: amlp  reason: default package */
/* loaded from: classes.dex */
public final class amlp implements Runnable, amlw {
    private amlv a;
    private amlv b;
    private final boolean c = uwp.j();
    private boolean d;
    private boolean e;

    public amlp(amlv amlvVar) {
        this.a = amlvVar;
        this.b = amlvVar;
    }

    private final void b() {
        boolean z = true;
        this.d = true;
        amlv amlvVar = this.a;
        if (!this.c || this.e || !uwp.j()) {
            z = false;
        }
        amlvVar.g(z);
        this.a = null;
    }

    public final void a(ankt anktVar) {
        if (!this.d) {
            if (!this.e) {
                this.e = true;
                anktVar.qY(this, anjk.a);
                return;
            }
            throw new IllegalStateException("Signal is already attached to future");
        }
        throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            uwp.h(ajsy.d);
        } else {
            b();
        }
    }

    @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        amlv amlvVar = this.b;
        this.b = null;
        try {
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
        } finally {
            amna.i(amlvVar);
        }
    }
}
