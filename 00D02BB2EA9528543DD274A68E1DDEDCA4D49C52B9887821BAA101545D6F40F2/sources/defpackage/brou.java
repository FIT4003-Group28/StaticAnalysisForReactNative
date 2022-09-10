package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: brou  reason: default package */
/* loaded from: classes4.dex */
public final class brou implements broq {
    final brpa a = new bros(this);
    final brot b = new brot(this);
    private final btvo c;
    private final bvjj d;
    private final cjqy e;
    private final Application f;
    private final bvrb g;
    private final brpt h;
    private final brpd i;
    private final brop j;
    private final btxz k;
    @dzsi
    private btxx l;
    @dzsi
    private brln m;
    private final brpw n;

    public brou(Application application, btvo btvoVar, bvjj bvjjVar, cjqy cjqyVar, ckcw ckcwVar, bvrb bvrbVar, brpd brpdVar, brop bropVar, brpt brptVar, dxio<brpq<dwiv, brps>> dxioVar) {
        this.f = application;
        this.c = btvoVar;
        this.d = bvjjVar;
        this.e = cjqyVar;
        this.i = brpdVar;
        this.j = bropVar;
        this.h = brptVar;
        this.n = new brpw(dxioVar, ckcwVar);
        this.k = new btxz(ckcwVar, dunt.TACTILE_SEARCH_REQUEST);
        this.g = bvrbVar;
    }

    private static boolean h(brln brlnVar) {
        return !brlnVar.c() && (brlnVar.b().a & Integer.MIN_VALUE) != 0;
    }

    private final void j() {
        btxx btxxVar = this.l;
        if (btxxVar != null) {
            btxxVar.b();
        }
        this.m = null;
        this.l = null;
    }

    private final boolean k() {
        return this.c.getCategoricalSearchParameters().D();
    }

    @Override // defpackage.broq
    public final synchronized void a(brln brlnVar) {
        brpb brpbVar;
        j();
        this.m = brlnVar;
        if ((brlnVar.b().a & Integer.MIN_VALUE) != 0) {
            cjqy cjqyVar = this.e;
            cjsx i = cjsy.i();
            i.b(ddda.ez);
            cjqyVar.k(i.a());
        }
        if (k()) {
            brps a = this.h.a(brlnVar);
            brpw brpwVar = this.n;
            final dwiv dwivVar = null;
            if (brpw.b(a)) {
                dwiv b = brpwVar.a.a().b(a);
                if (b != null) {
                    djnc djncVar = b.v;
                    if (djncVar == null) {
                        djncVar = djnc.b;
                    }
                    djnk djnkVar = djncVar.a;
                    if (djnkVar == null) {
                        djnkVar = djnk.f;
                    }
                    if (djnkVar.c.isEmpty()) {
                        brpwVar.a(ckip.ab, brpwVar.a.a().d());
                        dwivVar = b;
                    }
                }
                brpwVar.a(ckip.ac, brpwVar.a.a().d());
            }
            if (dwivVar != null) {
                this.g.b(new Runnable(this, dwivVar) { // from class: bror
                    private final brou a;
                    private final dwiv b;

                    {
                        this.a = this;
                        this.b = dwivVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        brou brouVar = this.a;
                        brouVar.a.a(this.b, null, false);
                    }
                }, bvrj.UI_THREAD);
                return;
            }
        }
        amvq amvqVar = brlnVar.d;
        if (brlnVar.g == 2) {
            brpbVar = brpb.ONLINE_ONLY;
        } else {
            brpbVar = brpb.BOTH;
        }
        if (h(brlnVar)) {
            brop bropVar = this.j;
            dwir b2 = brlnVar.b();
            btxz btxzVar = this.k;
            brot brotVar = this.b;
            bvrj bvrjVar = bvrj.UI_THREAD;
            long i2 = this.d.m(bvjk.ah, false) ? 0L : i(brlnVar);
            btpc a2 = bropVar.a.a();
            brop.a(a2, 1);
            buxl a3 = bropVar.b.a();
            brop.a(a3, 2);
            avnt a4 = bropVar.c.a();
            brop.a(a4, 3);
            cjqy a5 = bropVar.d.a();
            brop.a(a5, 4);
            cqat a6 = bropVar.e.a();
            brop.a(a6, 5);
            bvrb a7 = bropVar.f.a();
            brop.a(a7, 6);
            brop.a(b2, 7);
            brop.a(brpbVar, 9);
            brop.a(btxzVar, 10);
            brop.a(brotVar, 11);
            brop.a(bvrjVar, 12);
            this.l = new broo(a2, a3, a4, a5, a6, a7, b2, amvqVar, brpbVar, btxzVar, brotVar, bvrjVar, i2);
        } else {
            this.l = this.i.a(brlnVar.b(), amvqVar, brpbVar, this.k, this.a, bvrj.UI_THREAD, i(brlnVar));
        }
        this.l.a();
    }

    @Override // defpackage.broq
    public final synchronized void b(brln brlnVar) {
        if (brlnVar == this.m) {
            j();
        }
        brlm brlmVar = brlnVar.f;
        if (brlmVar != null) {
            brlmVar.c(brlnVar);
        }
    }

    @Override // defpackage.broq
    public final synchronized void c() {
        this.n.a.a().c();
    }

    public final synchronized void d(@dzsi dwiv dwivVar, @dzsi bttq bttqVar, boolean z) {
        brln brlnVar = this.m;
        if (brlnVar == null) {
            return;
        }
        j();
        e(dwivVar, bttqVar, z, brlnVar);
    }

    protected final synchronized void e(@dzsi dwiv dwivVar, @dzsi bttq bttqVar, boolean z, brln brlnVar) {
        brlm brlmVar = brlnVar.f;
        if (brlmVar == null) {
            return;
        }
        if (bttqVar == null) {
            dbsk.s(dwivVar);
            f(brlnVar, dwivVar);
            brlnVar.e.d = z;
            brlmVar.a(brlnVar);
            if (dwivVar != null && k()) {
                brps a = this.h.a(brlnVar);
                brpw brpwVar = this.n;
                if (brpw.b(a)) {
                    brpwVar.a.a().a(a, dwivVar);
                    return;
                }
            }
            return;
        }
        brlmVar.b(brlnVar, bttqVar);
    }

    protected final void f(brln brlnVar, dwiv dwivVar) {
        brlnVar.h(dwivVar, this.f, this.c);
    }

    public final synchronized void g(@dzsi dwiv dwivVar, @dzsi bttq bttqVar, boolean z, boolean z2, boolean z3) {
        brln brlnVar = this.m;
        if (brlnVar == null) {
            return;
        }
        brlm brlmVar = brlnVar.f;
        if (!z2) {
            j();
        }
        if (brlmVar == null) {
            return;
        }
        if (bttqVar == null) {
            dbsk.s(dwivVar);
            f(brlnVar, dwivVar);
            brlu brluVar = brlnVar.e;
            brluVar.d = z;
            brluVar.f = !z2;
            brluVar.e = z3;
            brlmVar.a(brlnVar);
            return;
        }
        brlmVar.b(brlnVar, bttqVar);
    }

    private final long i(brln brlnVar) {
        int i;
        if (brlnVar.g != 3) {
            iqy iqyVar = brlnVar.a;
            if (iqyVar != null) {
                int i2 = iqyVar.p;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 1) {
                    i = this.c.getOfflineMapsParameters().g;
                } else if (i3 == 2) {
                    i = this.c.getOfflineMapsParameters().f;
                } else if (i3 == 3) {
                    i = this.c.getOfflineMapsParameters().k;
                } else if (h(brlnVar)) {
                    i = this.c.getOfflineMapsParameters().d;
                } else {
                    i = this.c.getOfflineMapsParameters().e;
                }
            } else if (h(brlnVar)) {
                i = this.c.getOfflineMapsParameters().d;
            } else {
                i = this.c.getOfflineMapsParameters().e;
            }
        } else {
            i = this.c.getSearchParameters().i().a;
        }
        return i;
    }
}
