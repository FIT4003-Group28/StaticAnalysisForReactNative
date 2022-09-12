package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bxef  reason: default package */
/* loaded from: classes4.dex */
public final class bxef implements bxer, bxlg {
    private static final AtomicBoolean n = new AtomicBoolean(false);
    public final cqat a;
    public final bxli d;
    public btxx e;
    public bxep<?, ?> f;
    private final Application g;
    private final btvo h;
    private final btpc i;
    private final btrm j;
    private final ahjq k;
    private final bvrb l;
    private final bxet m;
    private final bxes p;
    private final btxz q;
    private final long r;
    private final long s;
    private final long t;
    private final bxls u;
    private final bxle v;
    long b = 100;
    private final bxlt o = new bxlt();
    long c = 0;
    private bxec w = new bxec(this, null);
    private bxee x = new bxee(this, null);

    public bxef(Application application, btvo btvoVar, cqat cqatVar, btpc btpcVar, btrm btrmVar, ahjq ahjqVar, bvrb bvrbVar, ckcw ckcwVar, bxli bxliVar, bxls bxlsVar, bxle bxleVar, bxet bxetVar, bxes bxesVar) {
        this.g = application;
        this.h = btvoVar;
        this.a = cqatVar;
        this.i = btpcVar;
        this.j = btrmVar;
        this.k = ahjqVar;
        this.l = bvrbVar;
        this.d = bxliVar;
        this.u = bxlsVar;
        this.v = bxleVar;
        this.m = bxetVar;
        this.p = bxesVar;
        this.r = btvoVar.getOfflineMapsParameters().h;
        this.s = btvoVar.getOfflineMapsParameters().i;
        this.t = btvoVar.getOfflineMapsParameters().j;
        this.q = new btxz(ckcwVar, dunt.TACTILE_SUGGEST_REQUEST);
        if (n.compareAndSet(false, true)) {
            bvqm.a(application.getApplicationContext(), bvrj.SUGGEST_CALLBACK_THREAD, bvrbVar);
        }
    }

    public static final void d(bxep<?, ?> bxepVar) {
        bxepVar.c.e();
    }

    private final void f(String str, int i) {
        bxet bxetVar = this.m;
        String replaceFirst = str.substring(0, i).replaceFirst(".*\\s+", "");
        String a = bxet.a(str, i);
        ArrayList arrayList = new ArrayList();
        for (dpui dpuiVar : ((dbys) bxetVar.a).f(a)) {
            if (arrayList.size() >= 3) {
                break;
            }
            Locale b = bvom.b(dpuiVar.b);
            if (dpuiVar.a.toLowerCase(b).startsWith(replaceFirst.toLowerCase(b))) {
                arrayList.add(dpuiVar);
            }
        }
        bxetVar.b = arrayList.isEmpty();
        this.j.b(new bxeu(dcdc.r(arrayList)));
    }

    @dzsi
    private final synchronized bxep<dvvu, dvvw> g(bxla bxlaVar, bxkz bxkzVar, @dzsi akqs akqsVar, bxkx bxkxVar) {
        bxdt bxdtVar;
        btxz btxzVar;
        dvvu dvvuVar;
        bxec bxecVar;
        btpc a;
        bute a2;
        avnt a3;
        cqat cqatVar = this.a;
        j();
        bxdtVar = new bxdt(bxlaVar, bxkzVar, bxkxVar, cqatVar, akqsVar, this.h.getUgcParameters().c());
        bxec bxecVar2 = this.w;
        synchronized (bxecVar2.b) {
            bxecVar2.a = true;
        }
        this.w = new bxec(this, bxdtVar);
        bxle bxleVar = this.v;
        btxzVar = this.q;
        dvvuVar = bxdtVar.a;
        bxecVar = this.w;
        a = bxleVar.a.a();
        bxle.a(a, 1);
        a2 = bxleVar.b.a();
        bxle.a(a2, 2);
        a3 = bxleVar.c.a();
        bxle.a(a3, 3);
        bxle.a(btxzVar, 4);
        bxle.a(dvvuVar, 5);
        bxle.a(bxecVar, 6);
        return i(bxdtVar, new bxld(a, a2, a3, btxzVar, dvvuVar, bxecVar));
    }

    @dzsi
    private final synchronized bxep<dwjn, dwjp> h(bxla bxlaVar, bxkz bxkzVar, dhjx dhjxVar, @dzsi akqs akqsVar, @dzsi dovx dovxVar, boolean z, boolean z2, bxkx bxkxVar, dwjm dwjmVar, boolean z3, boolean z4, boolean z5) {
        bxlr a;
        bxea bxeaVar = new bxea(bxlaVar, bxkzVar, dhjxVar, dovxVar, z, bxkxVar, this.a, j(), bxlaVar.a(), dwjmVar, z3, z4, z2, z5, this.h);
        bxee bxeeVar = this.x;
        synchronized (bxeeVar.b) {
            bxeeVar.a = true;
        }
        GmmLocation gmmLocation = null;
        if (dwjmVar == dwjm.LOCAL_GUIDE_LOCATION) {
            if (!this.i.i()) {
                bvrb bvrbVar = this.l;
                Application application = this.g;
                cjxu.k(bvrbVar, application, application.getString(R.string.OFFLINE_COULD_NOT_FETCH_SUGGESTIONS));
                return null;
            }
            this.x = new bxee(this, bxeaVar);
            a = this.u.a(this.q, bxeaVar.a, true, this.o, this.p, this.x, null, null, bvrj.SUGGEST_CALLBACK_THREAD, this.r, this.s, this.t);
        } else {
            this.x = new bxee(this, bxeaVar);
            if (akqsVar != null) {
                amvs amvsVar = new amvs();
                amvsVar.v(akqsVar.c().a, akqsVar.c().b);
                gmmLocation = amvsVar.d();
            }
            a = this.u.a(this.q, bxeaVar.a, false, this.o, this.p, this.x, gmmLocation, j(), bvrj.SUGGEST_CALLBACK_THREAD, this.r, this.s, this.t);
        }
        return i(bxeaVar, a);
    }

    @dzsi
    private final synchronized <Q extends dssj, S extends dssj> bxep<Q, S> i(bxep<Q, S> bxepVar, btxx btxxVar) {
        if (bxepVar.c() != null && bxepVar.c().length() <= 100) {
            this.l.b(new bxed(this, bxepVar, this.e, btxxVar), bvrj.SUGGEST_CALLBACK_THREAD);
            return bxepVar;
        }
        return null;
    }

    @dzsi
    private final GmmLocation j() {
        ahjq ahjqVar = this.k;
        if (ahjqVar == null) {
            return null;
        }
        return ahjqVar.a();
    }

    @Override // defpackage.bxlg
    public final synchronized void a(bxlh bxlhVar) {
        if (bxlhVar != this.e) {
            return;
        }
        this.c = this.a.e();
        bxep<?, ?> bxepVar = this.f;
        if (bxepVar == null) {
            return;
        }
        bxepVar.c.b(this.a);
    }

    public final void b(bxep<?, ?> bxepVar, boolean z) {
        int h = bxepVar.h();
        if (h >= 0) {
            this.b = h;
        }
        if (this.h.getSuggestParameters().k || this.h.getSuggestParameters().l) {
            bxet bxetVar = this.m;
            dcdc<dpui> f = bxepVar.f();
            String c = bxepVar.c();
            int d = bxepVar.d();
            dcka<String, dpui> dckaVar = bxetVar.a;
            if (((dbye) dckaVar).b > 1000) {
                dckaVar.p();
            }
            bxetVar.a.M(bxet.a(c, d), f);
            if (this.m.b) {
                f(bxepVar.c(), bxepVar.d());
            }
        }
        btrm btrmVar = this.j;
        bxla bxlaVar = bxepVar.b;
        String c2 = bxepVar.c();
        dcdc<bxmh> e = bxepVar.e();
        bxkx bxkxVar = bxepVar.c;
        bxepVar.f();
        btrmVar.b(new bxev(bxlaVar, c2, e, bxkxVar, z, bxepVar.g()));
    }

    @Override // defpackage.bxer
    @dzsi
    /* renamed from: c */
    public final synchronized bxep<?, ?> e(bxla bxlaVar, bxkz bxkzVar, dhjx dhjxVar, @dzsi akqs akqsVar, @dzsi dovx dovxVar, boolean z, boolean z2, bxkx bxkxVar, dwjm dwjmVar, boolean z3, boolean z4, boolean z5) {
        if (!dbsj.d(((bxky) bxkzVar).a) || z2) {
            if (this.h.getSuggestParameters().k || this.h.getSuggestParameters().l) {
                f(((bxky) bxkzVar).a, ((bxky) bxkzVar).b);
            }
            bxla bxlaVar2 = bxla.UNKNOWN;
            int ordinal = bxlaVar.ordinal();
            if (ordinal == 13 || ordinal == 15 || ordinal == 17) {
                return g(bxlaVar, bxkzVar, akqsVar, bxkxVar);
            }
            return h(bxlaVar, bxkzVar, dhjxVar, akqsVar, dovxVar, z, z2, bxkxVar, dwjmVar, z3, z4, z5);
        }
        int a = dvud.a(this.h.getSuggestParameters().x);
        if (a != 0 && a != 1) {
            this.p.b();
        }
        this.l.b(new bxeb(this), bvrj.SUGGEST_CALLBACK_THREAD);
        return null;
    }
}
