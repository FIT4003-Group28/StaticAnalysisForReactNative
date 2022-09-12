package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahi  reason: default package */
/* loaded from: classes6.dex */
public final class eahi implements eajx {
    boolean a;
    boolean b;
    final /* synthetic */ eahl c;
    private final eaiz d = new eaiz();

    public eahi(eahl eahlVar) {
        this.c = eahlVar;
    }

    private final void c(boolean z) {
        eahl eahlVar;
        long min;
        synchronized (this.c) {
            this.c.j.d();
            while (true) {
                eahlVar = this.c;
                if (eahlVar.b > 0 || this.b || this.a || eahlVar.k != 0) {
                    break;
                }
                eahlVar.i();
            }
            eahlVar.j.c();
            this.c.h();
            min = Math.min(this.c.b, this.d.b);
            this.c.b -= min;
        }
        this.c.j.d();
        try {
            eahl eahlVar2 = this.c;
            eahlVar2.d.e(eahlVar2.c, z && min == this.d.b, this.d, min);
        } finally {
            this.c.j.c();
        }
    }

    @Override // defpackage.eajx
    public final void a(eaiz eaizVar, long j) {
        this.d.a(eaizVar, j);
        while (this.d.b >= 16384) {
            c(false);
        }
    }

    @Override // defpackage.eajx
    public final eaka b() {
        return this.c.j;
    }

    @Override // defpackage.eajx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (this.a) {
                return;
            }
            eahl eahlVar = this.c;
            if (!eahlVar.h.b) {
                if (this.d.b > 0) {
                    while (this.d.b > 0) {
                        c(true);
                    }
                } else {
                    eahlVar.d.e(eahlVar.c, true, null, 0L);
                }
            }
            synchronized (this.c) {
                this.a = true;
            }
            this.c.d.g();
            this.c.f();
        }
    }

    @Override // defpackage.eajx, java.io.Flushable
    public final void flush() {
        synchronized (this.c) {
            this.c.h();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.d.g();
        }
    }
}
