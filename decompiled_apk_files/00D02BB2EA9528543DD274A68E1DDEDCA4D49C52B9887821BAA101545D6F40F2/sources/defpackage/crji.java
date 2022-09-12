package defpackage;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crji  reason: default package */
/* loaded from: classes5.dex */
public final class crji implements crgy {
    public final btrm a;
    public final crka b;
    public final criy d;
    public final crlb e;
    public final jzv f;
    public final crlg g;
    public final crmt h;
    public final crms i;
    public final criw j;
    public final criw k;
    public boolean l;
    private final crfm o;
    private final crje p;
    private final Executor q;
    public final crqc c = new crqc();
    public final Object m = new Object();
    private boolean r = false;
    public boolean n = false;

    public crji(btrm btrmVar, crfm crfmVar, crka crkaVar, crlb crlbVar, criw criwVar, criw criwVar2, jzv jzvVar, crje crjeVar, crlg crlgVar, crmt crmtVar, crms crmsVar, Executor executor) {
        this.a = btrmVar;
        dbsk.t(crfmVar, "navigationServiceController");
        this.o = crfmVar;
        dbsk.t(crkaVar, "locationSimulation");
        this.b = crkaVar;
        dbsk.s(crlbVar);
        this.e = crlbVar;
        this.j = criwVar;
        this.k = criwVar2;
        this.d = new criy();
        dbsk.t(jzvVar, "projectedModeController");
        this.f = jzvVar;
        this.p = crjeVar;
        this.g = crlgVar;
        this.h = crmtVar;
        this.i = crmsVar;
        crjk crjkVar = criwVar.d;
        crjkVar.b(new crjh(this, crjkVar));
        crjk crjkVar2 = criwVar2.d;
        crjkVar2.b(new crjh(this, crjkVar2));
        this.q = dehx.b(executor);
    }

    private final boolean l(criw criwVar, GmmLocation gmmLocation) {
        int i;
        crjk crjkVar = criwVar.d;
        int size = crjkVar.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            crjo crjoVar = crjkVar.get(i2);
            dcdc<cqzw> dcdcVar = crjoVar.d;
            int size2 = dcdcVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                dcdcVar.get(i3).d(gmmLocation);
            }
            cray n = crjoVar.e.n();
            if (n.a() != -1 && (i = n.g) != -1) {
                crjoVar.f = n.i;
                crjoVar.g = i;
                crjoVar.h = crjoVar.c.e();
            }
            z |= crjoVar.e.k;
        }
        h(criwVar);
        f(criwVar.d);
        return true == z;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        synchronized (this.m) {
            dbsk.l(!this.r);
            crfo crfoVar = crgzVar.c;
            if (crfoVar != null) {
                this.c.e = crfoVar.b;
            }
            this.j.a(vul.FREE_NAV);
            btrm btrmVar = this.a;
            dceq a = dcet.a();
            a.b(crii.class, new crjj(0, crii.class, this, bvrj.NAVIGATION_INTERNAL));
            a.b(ahju.class, new crjj(1, ahju.class, this, bvrj.NAVIGATION_INTERNAL));
            a.b(crhz.class, new crjj(2, crhz.class, this, bvrj.NAVIGATION_INTERNAL));
            a.b(cric.class, new crjj(3, cric.class, this, bvrj.NAVIGATION_INTERNAL));
            a.b(criq.class, new crjj(4, criq.class, this, bvrj.NAVIGATION_INTERNAL));
            btrmVar.g(this, a.a());
            this.r = true;
        }
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        synchronized (this.m) {
            dbsk.l(this.r);
            this.a.a(this);
            this.j.b();
            criw criwVar = this.k;
            if (criwVar.j) {
                criwVar.b();
            }
            this.r = false;
        }
    }

    public final amtq<cqzw> c(amvh amvhVar) {
        crjo a = this.j.d.a(amvhVar);
        if (a == null) {
            return amtq.a;
        }
        return amtq.c(a.d.indexOf(a.e), a.d);
    }

    public final void d(GmmLocation gmmLocation) {
        bvrj.NAVIGATION_INTERNAL.c();
        this.c.a = gmmLocation;
        if (!j()) {
            return;
        }
        boolean l = l(this.j, gmmLocation);
        criw criwVar = this.k;
        if (criwVar.j) {
            l(criwVar, gmmLocation);
        }
        dcdc<crqg> dcdcVar = this.c.g;
        int size = dcdcVar.size();
        int i = 0;
        while (true) {
            if (i < size) {
                String d = dcdcVar.get(i).b.d();
                if (d != null && !TextUtils.isEmpty(d)) {
                    this.c.b = d;
                    break;
                }
                i++;
            } else {
                this.c.a(gmmLocation);
                break;
            }
        }
        criy criyVar = this.d;
        GmmLocation gmmLocation2 = criyVar.a;
        if (gmmLocation2 != null && gmmLocation2.distanceTo(gmmLocation) <= 50.0f) {
            if (!l || criyVar.b) {
                if (TimeUnit.SECONDS.convert(gmmLocation.j - gmmLocation2.j, TimeUnit.MILLISECONDS) >= (true != criyVar.b ? 600L : 60L) && this.l) {
                    this.o.d(true);
                }
                k();
            }
            l = true;
        }
        criyVar.a = gmmLocation;
        criyVar.b = l;
        k();
    }

    public final void f(crjk crjkVar) {
        ArrayList arrayList = new ArrayList();
        int size = crjkVar.size();
        for (int i = 0; i < size; i++) {
            crqg b = crjkVar.get(i).b();
            if (b.b.a() != -1) {
                arrayList.add(b);
            }
        }
        if (i(crjkVar)) {
            this.c.g = dcdc.r(arrayList);
            return;
        }
        this.c.h = dcdc.r(arrayList);
    }

    public final void g(List<amvh> list, @dzsi aryr aryrVar, boolean z, @dzsi crjl crjlVar) {
        crjo a = this.j.d.a(list.get(0));
        dqvj dqvjVar = this.c.f;
        crje crjeVar = this.p;
        Application a2 = crjeVar.a.a();
        crje.a(a2, 1);
        btrm a3 = crjeVar.b.a();
        crje.a(a3, 2);
        bvjj a4 = crjeVar.c.a();
        crje.a(a4, 3);
        crlb a5 = crjeVar.d.a();
        crje.a(a5, 4);
        vxa a6 = crjeVar.e.a();
        crje.a(a6, 5);
        ahjq a7 = crjeVar.f.a();
        crje.a(a7, 6);
        dzsj<srv> dzsjVar = crjeVar.g;
        bvrb a8 = crjeVar.h.a();
        crje.a(a8, 8);
        vva a9 = crjeVar.i.a();
        crje.a(a9, 9);
        crje.a(list, 10);
        crje.a(dqvjVar, 12);
        new crjd(a2, a3, a4, a5, a6, a7, dzsjVar, a8, a9, list, a, dqvjVar, aryrVar, z, crjlVar).c();
    }

    public final void h(criw criwVar) {
        GmmLocation gmmLocation = this.c.a;
        if (gmmLocation == null) {
            return;
        }
        criwVar.f(gmmLocation);
    }

    public final boolean i(crjk crjkVar) {
        return crjkVar == this.j.d;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.m) {
            z = this.n;
        }
        return z;
    }

    public final void k() {
        final crqd crqdVar = new crqd(this.c);
        synchronized (this.m) {
            if (this.r && this.n) {
                this.q.execute(new Runnable(this, crqdVar) { // from class: crjg
                    private final crji a;
                    private final crqd b;

                    {
                        this.a = this;
                        this.b = crqdVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.b(new crhp(null, this.b));
                    }
                });
            }
        }
    }

    public static void e(criw criwVar, vul vulVar, @dzsi List<dpjx> list, int i, boolean z) {
        if (i == Integer.MAX_VALUE) {
            if (!criwVar.j || !z) {
                return;
            }
            criwVar.b();
        } else if (criwVar.j) {
            criwVar.d(list);
            criwVar.c(i);
        } else {
            criwVar.a(vulVar);
            criwVar.d(list);
            criwVar.c(i);
        }
    }
}
