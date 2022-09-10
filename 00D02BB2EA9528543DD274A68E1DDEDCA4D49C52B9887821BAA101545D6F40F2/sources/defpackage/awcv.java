package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awcv  reason: default package */
/* loaded from: classes3.dex */
public final class awcv {
    public final bvjj a;
    public final awfh b;
    public final avzo c;
    public final dbrn<String, btlu> d;
    private final crzm<avkr> g;
    private final crzm<avzg> h;
    private final Executor i;
    private final crzp<avkr> j = new crzp(this) { // from class: awcs
        private final awcv a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            awcv awcvVar = this.a;
            avkr avkrVar = (avkr) crzmVar.l();
            dbsk.s(avkrVar);
            dlrl e = avkrVar.e();
            if ((e.a & 2) != 0) {
                btlu a = awcvVar.d.a(avkrVar.f().b);
                for (dltm dltmVar : avkrVar.c().values()) {
                    if (awcvVar.c.a(dltmVar)) {
                        if (dbsd.a(e.c, awcvVar.a.A(bvjk.el, a, null))) {
                            return;
                        }
                        awcvVar.a.ad(bvjk.el, a, e.c);
                        return;
                    }
                }
                awcvVar.a(a);
            }
        }
    };
    private final crzp<avzg> k = new crzp(this) { // from class: awct
        private final awcv a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            final awcv awcvVar = this.a;
            avzg avzgVar = (avzg) crzmVar.l();
            if (avzgVar == null) {
                return;
            }
            avze b = avzgVar.b();
            final btlu a = avzgVar.a().a();
            if (btlu.p(a) && !awcvVar.b.b()) {
                return;
            }
            if (b.f()) {
                awcvVar.a(a);
                awcvVar.c(a, null);
                return;
            }
            String b2 = b.b();
            String A = awcvVar.a.A(bvjk.el, a, null);
            synchronized (awcvVar.f) {
                String b3 = awcvVar.b(a);
                if (b3 != null && b3.equals(b2)) {
                    awcvVar.c(a, null);
                }
                if (A != null && !A.equals(b2)) {
                    awcvVar.a(a);
                    if (b3 == null) {
                        awcvVar.c(a, A);
                    }
                    awcvVar.e.d(new dbsz(awcvVar, a) { // from class: awcu
                        private final awcv a;
                        private final btlu b;

                        {
                            this.a = awcvVar;
                            this.b = a;
                        }

                        @Override // defpackage.dbsz
                        public final void NU(Object obj) {
                            awcv awcvVar2 = this.a;
                            btlu btluVar = this.b;
                            avgn avgnVar = ((avgb) obj).a;
                            synchronized (awcvVar2.f) {
                                if (awcvVar2.b(btluVar) != null) {
                                    awcvVar2.c(btluVar, null);
                                    Executor executor = avgnVar.b;
                                    avhz avhzVar = avgnVar.k;
                                    avhzVar.getClass();
                                    executor.execute(new Runnable(avhzVar) { // from class: avge
                                        private final avhz a;

                                        {
                                            this.a = avhzVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            gcz a2 = this.a.b.a();
                                            a2.i(R.string.OFFLINE_MAPS_MISSING_SDCARD_ALERT_TITLE);
                                            a2.d(R.string.OFFLINE_MAPS_MISSING_SDCARD_ALERT_BODY);
                                            a2.i = cjtd.a(dtxx.bO);
                                            a2.h(R.string.DISMISS, null, avhw.a);
                                            a2.b();
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }
        }
    };
    public final crzd<avgb> e = new crzd<>();
    public final Object f = new Object();

    public awcv(bvjj bvjjVar, awfh awfhVar, avzo avzoVar, crzm<avkr> crzmVar, crzm<avzg> crzmVar2, dbrn<String, btlu> dbrnVar, Executor executor) {
        this.a = bvjjVar;
        this.b = awfhVar;
        this.c = avzoVar;
        this.g = crzmVar;
        this.h = crzmVar2;
        this.i = executor;
        this.d = dbrnVar;
    }

    public final void a(@dzsi btlu btluVar) {
        this.a.ad(bvjk.el, btluVar, null);
    }

    @dzsi
    public final String b(@dzsi btlu btluVar) {
        return this.a.A(bvjk.em, btluVar, null);
    }

    public final void c(@dzsi btlu btluVar, @dzsi String str) {
        this.a.ad(bvjk.em, btluVar, str);
    }

    public final synchronized void d(avgb avgbVar, Executor executor) {
        this.e.a(avgbVar, executor);
        if (this.e.e() == 1) {
            this.h.d(this.k, this.i);
            this.g.d(this.j, this.i);
        }
    }

    public final synchronized void e(avgb avgbVar) {
        this.e.c(avgbVar);
        if (this.e.e() == 0) {
            this.g.c(this.j);
            this.h.c(this.k);
        }
    }
}
