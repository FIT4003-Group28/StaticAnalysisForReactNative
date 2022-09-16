package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pyj  reason: default package */
/* loaded from: classes4.dex */
public final class pyj {
    public final Handler a;
    public final pyk b;

    public pyj(Handler handler, pyk pykVar) {
        if (pykVar != null) {
            ptx.a(handler);
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = pykVar;
    }

    public final void a(final String str, final long j, final long j2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pyi
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.z(str2, j3, j4);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pyh
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    String str2 = str;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.A(str2);
                }
            });
        }
    }

    public final void c(pms pmsVar) {
        pmsVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new pye(this, pmsVar, 1));
        }
    }

    public final void d(int i, long j) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new pyb(this, i, j, 1));
        }
    }

    public final void e(pms pmsVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new pye(this, pmsVar));
        }
    }

    public final void f(final Format format, final pmw pmwVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pyd
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    Format format2 = format;
                    pmw pmwVar2 = pmwVar;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.af();
                    pyjVar.b.E(format2, pmwVar2);
                }
            });
        }
    }

    public final void g(final Object obj) {
        if (this.a != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.post(new Runnable() { // from class: pyg
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    Object obj2 = obj;
                    long j = elapsedRealtime;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.v(obj2, j);
                }
            });
        }
    }

    public final void h(final Exception exc) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pyf
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    Exception exc2 = exc;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.y(exc2);
                }
            });
        }
    }

    public final void i(final asr asrVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: pyc
                @Override // java.lang.Runnable
                public final void run() {
                    pyj pyjVar = pyj.this;
                    asr asrVar2 = asrVar;
                    pyk pykVar = pyjVar.b;
                    int i = pxi.a;
                    pykVar.F(asrVar2);
                }
            });
        }
    }
}
