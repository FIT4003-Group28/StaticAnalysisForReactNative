package defpackage;

import android.app.Service;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crul  reason: default package */
/* loaded from: classes5.dex */
public final class crul implements crxk {
    public static final Object a = new Object();
    crxj b;
    public crwb d;
    public crvv e;
    public final crxu f;
    public crwl g;
    public cruh h;
    ExecutorService j;
    public duiw k;
    private final Service l;
    private final crvc m;
    private final crvt n;
    private final cruq o;
    final Queue<crxj> c = new ArrayDeque();
    public final crxx i = new crxx();

    public crul(Service service, crvt crvtVar, cruq cruqVar, crvc crvcVar, ExecutorService executorService, crxu crxuVar) {
        this.l = service;
        this.n = crvtVar;
        this.o = cruqVar;
        this.m = crvcVar;
        new crxv(service);
        this.j = executorService;
        this.f = crxuVar;
    }

    private final int m() {
        int size;
        synchronized (a) {
            dcdc<crwo> b = this.g.b();
            dcpe<crwo> listIterator = b.listIterator();
            while (listIterator.hasNext()) {
                crwo next = listIterator.next();
                if (f(next.c())) {
                    next.c();
                } else {
                    next.c();
                    crxb P = next.P();
                    crts crtsVar = next.O().d;
                    if (crtsVar == null) {
                        crtsVar = crts.r;
                    }
                    String A = next.A();
                    int i = 2;
                    if (A != null && A.startsWith("video/")) {
                        i = 3;
                    }
                    crxj g = k(P).g(crwz.g(crtsVar, i), this.f, this.k, this.g);
                    synchronized (a) {
                        this.c.add(g);
                    }
                    this.i.d(next.c(), i);
                    this.n.a(g).a.c(44);
                }
            }
            size = b.size();
        }
        return size;
    }

    private final void n() {
        for (int i = 0; i < 10; i++) {
            try {
                this.j.shutdownNow();
                synchronized (a) {
                    crxj crxjVar = this.b;
                    if (crxjVar != null) {
                        crxjVar.d(false);
                    }
                }
                if (this.j.awaitTermination(5L, TimeUnit.SECONDS)) {
                    return;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    private final Iterable<crxj> o() {
        crxj crxjVar = this.b;
        return crxjVar == null ? this.c : dcbg.d(dcdc.f(crxjVar), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x00b4, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001c, B:13:0x0031, B:15:0x0039, B:17:0x003d, B:19:0x0043, B:21:0x0049, B:22:0x004d, B:30:0x0074, B:45:0x00b7, B:47:0x00bf, B:48:0x00c5, B:12:0x0026, B:23:0x004e, B:25:0x0053, B:28:0x005e, B:29:0x0073, B:32:0x0078, B:33:0x007e, B:35:0x0084, B:37:0x0094, B:38:0x00b0, B:40:0x00b2), top: B:55:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x00c7, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0014, B:11:0x001c, B:13:0x0031, B:15:0x0039, B:17:0x003d, B:19:0x0043, B:21:0x0049, B:22:0x004d, B:30:0x0074, B:45:0x00b7, B:47:0x00bf, B:48:0x00c5, B:12:0x0026, B:23:0x004e, B:25:0x0053, B:28:0x005e, B:29:0x0073, B:32:0x0078, B:33:0x007e, B:35:0x0084, B:37:0x0094, B:38:0x00b0, B:40:0x00b2), top: B:55:0x0003 }] */
    @Override // defpackage.crxk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.crxl r6, defpackage.crtx r7) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.crul.a
            monitor-enter(r0)
            crtx r1 = defpackage.crtx.UPLOADED     // Catch: java.lang.Throwable -> Lc7
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 != 0) goto L26
            crtx r1 = defpackage.crtx.IMPORTED     // Catch: java.lang.Throwable -> Lc7
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L14
            goto L26
        L14:
            crtx r1 = defpackage.crtx.CANCELLED     // Catch: java.lang.Throwable -> Lc7
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L31
            crxx r1 = r5.i     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r6.e()     // Catch: java.lang.Throwable -> Lc7
            r1.c(r2)     // Catch: java.lang.Throwable -> Lc7
            goto L31
        L26:
            crxx r1 = r5.i     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r6.e()     // Catch: java.lang.Throwable -> Lc7
            java.util.Set<java.lang.String> r1 = r1.b     // Catch: java.lang.Throwable -> Lc7
            r1.add(r2)     // Catch: java.lang.Throwable -> Lc7
        L31:
            crtx r1 = defpackage.crtx.UPLOADED     // Catch: java.lang.Throwable -> Lc7
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto Lb7
            crxj r7 = r5.b     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto Lb7
            boolean r7 = r7.h()     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto Lb7
            crxl r7 = r5.g(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto Lb7
            java.lang.String r7 = r7.e()     // Catch: java.lang.Throwable -> Lc7
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lc7
            crxj r1 = r5.b     // Catch: java.lang.Throwable -> Lb4
            r2 = 1
            if (r1 == 0) goto L78
            java.lang.String r1 = r1.e()     // Catch: java.lang.Throwable -> Lb4
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r1 != 0) goto L5e
            goto L78
        L5e:
            crxj r7 = r5.b     // Catch: java.lang.Throwable -> Lb4
            defpackage.dbsk.s(r7)     // Catch: java.lang.Throwable -> Lb4
            crvt r1 = r5.n     // Catch: java.lang.Throwable -> Lb4
            crvs r1 = r1.a(r7)     // Catch: java.lang.Throwable -> Lb4
            int r3 = r5.i()     // Catch: java.lang.Throwable -> Lb4
            r1.l(r3)     // Catch: java.lang.Throwable -> Lb4
            r7.d(r2)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            r5.n()     // Catch: java.lang.Throwable -> Lc7
            goto Lb7
        L78:
            java.util.Queue<crxj> r1 = r5.c     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb4
        L7e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb4
            crxj r3 = (defpackage.crxj) r3     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r4 = r3.e()     // Catch: java.lang.Throwable -> Lb4
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> Lb4
            if (r4 == 0) goto L7e
            crvt r7 = r5.n     // Catch: java.lang.Throwable -> Lb4
            crvs r7 = r7.a(r3)     // Catch: java.lang.Throwable -> Lb4
            int r4 = r5.i()     // Catch: java.lang.Throwable -> Lb4
            r7.l(r4)     // Catch: java.lang.Throwable -> Lb4
            r1.remove()     // Catch: java.lang.Throwable -> Lb4
            r3.d(r2)     // Catch: java.lang.Throwable -> Lb4
            crxx r7 = r5.i     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> Lb4
            r7.c(r1)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            goto Lb7
        Lb4:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb4
            throw r6     // Catch: java.lang.Throwable -> Lc7
        Lb7:
            crxj r7 = r5.b     // Catch: java.lang.Throwable -> Lc7
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r6 == 0) goto Lc5
            r6 = 0
            r5.b = r6     // Catch: java.lang.Throwable -> Lc7
            r5.j()     // Catch: java.lang.Throwable -> Lc7
        Lc5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lc7:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            goto Lcb
        Lca:
            throw r6
        Lcb:
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crul.a(crxl, crtx):void");
    }

    @Override // defpackage.crxk
    public final crwb b() {
        return this.d;
    }

    @Override // defpackage.crxk
    public final void c(crua cruaVar) {
        cruh cruhVar = this.h;
        if (cruhVar != null) {
            crtx b = crtx.b(cruaVar.e);
            if (b == null) {
                b = crtx.UNKNOWN;
            }
            if (b != crtx.IN_PROGRESS) {
                return;
            }
            cruhVar.f = cruaVar;
            crxx crxxVar = cruhVar.c;
            int a2 = crxxVar == null ? 1 : crxxVar.a();
            crxx crxxVar2 = cruhVar.c;
            int size = crxxVar2 == null ? 1 : crxxVar2.b.size() + 1;
            crxx crxxVar3 = cruhVar.c;
            int i = R.plurals.PHOTO_UPLOAD_IN_PROGRESS_TITLE;
            if (crxxVar3 != null && crxxVar3.b() > 0) {
                i = R.plurals.PHOTO_AND_VIDEO_UPLOAD_IN_PROGRESS_TITLE;
            }
            Resources resources = cruhVar.b.getResources();
            Integer valueOf = Integer.valueOf(a2);
            ib e = cruhVar.e(resources.getQuantityString(i, a2, valueOf));
            e.k(cruhVar.b.getResources().getQuantityString(R.plurals.UPLOAD_IN_PROGRESS_TEXT, a2, Integer.valueOf(size), valueOf));
            crwd crwdVar = cruhVar.d.g;
            if (crwdVar == null) {
                crwdVar = crwd.f;
            }
            if (crwdVar.d) {
                cruhVar.f(e);
            }
            crwd crwdVar2 = cruhVar.d.g;
            if (crwdVar2 == null) {
                crwdVar2 = crwd.f;
            }
            if (crwdVar2.e && !cruhVar.e.b(true) && !cruhVar.d.e) {
                e.e(0, cruhVar.b.getString(R.string.WAIT_FOR_WIFI), cruhVar.g("geo.uploader.wait_for_wifi_action", 2));
            }
            double d = cruaVar.h;
            if (d < dcyn.a) {
                e.s(0, 0, true);
            } else {
                e.s(100, (int) (d * 100.0d), false);
            }
            cruhVar.a.notify(116741324, e.b());
        }
    }

    @Override // defpackage.crxk
    public final void d() {
        cruh cruhVar = this.h;
        if (cruhVar != null) {
            cruhVar.d(this.i.a(), this.i.b());
        }
    }

    public final void e() {
        if (m() == 0) {
            return;
        }
        j();
    }

    public final boolean f(String str) {
        synchronized (a) {
            crxj crxjVar = this.b;
            if (crxjVar == null || !str.equals(crxjVar.e())) {
                for (crxj crxjVar2 : this.c) {
                    if (str.equals(crxjVar2.e())) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
    }

    public final crxl g(crxl crxlVar) {
        synchronized (a) {
            for (crxj crxjVar : this.c) {
                if (crxlVar.hashCode() == crxjVar.hashCode() && crxjVar.equals(crxlVar) && !crxjVar.h()) {
                    return crxjVar;
                }
            }
            return null;
        }
    }

    public final void h(boolean z) {
        synchronized (a) {
            int i = i();
            if (i == 0) {
                m();
                i = i();
            }
            for (crxj crxjVar : o()) {
                if (z) {
                    crvq crvqVar = this.n.a(crxjVar).a;
                    ((crve) crvqVar).l = Integer.valueOf(i);
                    crvqVar.c(57);
                }
                crxjVar.d(z);
            }
            this.c.clear();
            crxx crxxVar = this.i;
            crxxVar.a.clear();
            crxxVar.c.clear();
            crxxVar.b.clear();
            if (this.b == null) {
                j();
                return;
            }
            cruh cruhVar = this.h;
            if (cruhVar != null) {
                cruhVar.c(this.l);
            }
            n();
        }
    }

    public final int i() {
        int size;
        synchronized (a) {
            size = this.c.size() + (this.b == null ? 0 : 1);
        }
        return size;
    }

    public final void j() {
        synchronized (a) {
            this.c.size();
            if (this.b == null) {
                crxj poll = this.c.poll();
                this.b = poll;
                if (poll != null) {
                    if (this.j.isShutdown()) {
                        this.j = Executors.newSingleThreadExecutor();
                    }
                    poll.c(this.j);
                } else {
                    ((crum) this.o).a.b();
                }
            }
        }
    }

    public final crxf k(crxb crxbVar) {
        crxf g = crxg.g();
        ((crxc) g).a = this.l;
        g.b(this.e);
        g.c(this.m);
        g.f(this);
        g.e(crxbVar);
        g.d(this.n);
        return g;
    }

    public final void l(int i) {
        synchronized (a) {
            if (i - 1 != 59) {
                int i2 = i();
                for (crxj crxjVar : o()) {
                    crvq crvqVar = this.n.a(crxjVar).a;
                    ((crve) crvqVar).l = Integer.valueOf(i2);
                    crvqVar.c(61);
                }
            } else {
                int i3 = i();
                for (crxj crxjVar2 : o()) {
                    crvq crvqVar2 = this.n.a(crxjVar2).a;
                    ((crve) crvqVar2).l = Integer.valueOf(i3);
                    crvqVar2.c(60);
                }
            }
        }
    }
}
