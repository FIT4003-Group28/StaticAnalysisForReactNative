package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: plh  reason: default package */
/* loaded from: classes4.dex */
public final class plh {
    public final pli a;
    private final Handler b;

    public plh(Handler handler, pli pliVar) {
        if (pliVar != null) {
            ptx.a(handler);
        } else {
            handler = null;
        }
        this.b = handler;
        this.a = pliVar;
    }

    public final void a(Exception exc) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new pld(this, exc, 1));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new pld(this, exc));
        }
    }

    public final void c(final String str, final long j, final long j2) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: plf
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    pli pliVar = plhVar.a;
                    int i = pxi.a;
                    pliVar.d(str2, j3, j4);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ple
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    String str2 = str;
                    pli pliVar = plhVar.a;
                    int i = pxi.a;
                    pliVar.e(str2);
                }
            });
        }
    }

    public final void e(pms pmsVar) {
        pmsVar.a();
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new plc(this, pmsVar, 1));
        }
    }

    public final void f(pms pmsVar) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new plc(this, pmsVar));
        }
    }

    public final void g(final Format format, final pmw pmwVar) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: plb
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    Format format2 = format;
                    pmw pmwVar2 = pmwVar;
                    pli pliVar = plhVar.a;
                    int i = pxi.a;
                    pliVar.V();
                    plhVar.a.h(format2, pmwVar2);
                }
            });
        }
    }

    public final void h(final long j) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pla
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    long j2 = j;
                    pli pliVar = plhVar.a;
                    int i = pxi.a;
                    pliVar.i(j2);
                }
            });
        }
    }

    public final void i(final boolean z) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: plg
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    boolean z2 = z;
                    pli pliVar = plhVar.a;
                    int i = pxi.a;
                    pliVar.x(z2);
                }
            });
        }
    }

    public final void j(final int i, final long j, final long j2) {
        Handler handler = this.b;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pkz
                @Override // java.lang.Runnable
                public final void run() {
                    plh plhVar = plh.this;
                    int i2 = i;
                    long j3 = j;
                    long j4 = j2;
                    pli pliVar = plhVar.a;
                    int i3 = pxi.a;
                    pliVar.k(i2, j3, j4);
                }
            });
        }
    }
}
