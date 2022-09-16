package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: pqh  reason: default package */
/* loaded from: classes4.dex */
public final class pqh {
    public final int a;
    public final CopyOnWriteArrayList b;
    public final ppz c;

    public pqh() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private pqh(CopyOnWriteArrayList copyOnWriteArrayList, int i, ppz ppzVar) {
        this.b = copyOnWriteArrayList;
        this.a = i;
        this.c = ppzVar;
    }

    public static final void j(long j) {
        phk.d(j);
    }

    public final void a(Handler handler, pqi pqiVar) {
        ptx.a(pqiVar);
        this.b.add(new pqg(handler, pqiVar));
    }

    public final void b(final ppw ppwVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            final pqi pqiVar = pqgVar.b;
            pxi.al(pqgVar.a, new Runnable() { // from class: pqe
                @Override // java.lang.Runnable
                public final void run() {
                    pqh pqhVar = pqh.this;
                    pqiVar.J(pqhVar.a, pqhVar.c, ppwVar);
                }
            });
        }
    }

    public final void c(int i, Format format, int i2, Object obj, long j) {
        j(j);
        b(new ppw(i, format, i2, obj));
    }

    public final void d(ppr pprVar, ppw ppwVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            pxi.al(pqgVar.a, new pqc(this, pqgVar.b, pprVar, ppwVar, 1));
        }
    }

    public final void e(ppr pprVar, ppw ppwVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            pxi.al(pqgVar.a, new pqc(this, pqgVar.b, pprVar, ppwVar));
        }
    }

    public final void f(final ppr pprVar, final ppw ppwVar, final IOException iOException, final boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            final pqi pqiVar = pqgVar.b;
            pxi.al(pqgVar.a, new Runnable() { // from class: pqd
                @Override // java.lang.Runnable
                public final void run() {
                    pqh pqhVar = pqh.this;
                    pqiVar.S(pqhVar.a, pqhVar.c, pprVar, ppwVar, iOException, z);
                }
            });
        }
    }

    public final void g(ppr pprVar, ppw ppwVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            pxi.al(pqgVar.a, new pqc(this, pqgVar.b, pprVar, ppwVar, 2));
        }
    }

    public final void h(final ppw ppwVar) {
        final ppz ppzVar = this.c;
        ptx.a(ppzVar);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pqg pqgVar = (pqg) it.next();
            final pqi pqiVar = pqgVar.b;
            pxi.al(pqgVar.a, new Runnable() { // from class: pqf
                @Override // java.lang.Runnable
                public final void run() {
                    pqh pqhVar = pqh.this;
                    pqiVar.U(pqhVar.a, ppzVar, ppwVar);
                }
            });
        }
    }

    public final pqh i(int i, ppz ppzVar) {
        return new pqh(this.b, i, ppzVar);
    }

    public final void k(ppr pprVar, int i, Format format, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        d(pprVar, new ppw(i, format, i2, obj));
    }

    public final void l(ppr pprVar, int i, Format format, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        e(pprVar, new ppw(i, format, i2, obj));
    }

    public final void m(ppr pprVar, int i, Format format, int i2, Object obj, long j, long j2, IOException iOException, boolean z) {
        j(j);
        j(j2);
        f(pprVar, new ppw(i, format, i2, obj), iOException, z);
    }

    public final void n(ppr pprVar, int i, Format format, int i2, Object obj, long j, long j2) {
        j(j);
        j(j2);
        g(pprVar, new ppw(i, format, i2, obj));
    }
}
