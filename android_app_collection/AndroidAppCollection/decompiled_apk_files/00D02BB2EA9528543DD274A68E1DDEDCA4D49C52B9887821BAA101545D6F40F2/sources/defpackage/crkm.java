package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.util.replay.SetStateEvent;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crkm  reason: default package */
/* loaded from: classes5.dex */
public final class crkm implements crgy {
    public static final dcqe a = dcqe.c("crkm");
    static final long b = TimeUnit.SECONDS.toMillis(10);
    public static final int c = 10;
    public long C;
    public final long D;
    public long E;
    public GmmLocation F;
    @dzsi
    public crkk G;
    @dzsi
    srh H;
    public final cjqy I;
    public final bvrb J;
    public final craw K;
    private final dxio<cref> L;
    private final ckrh M;
    private final Context N;
    private final vtn O;
    private final crjw P;
    private final vxo Q;
    private final long R;
    @dzsi
    private dspd U;
    @dzsi
    private amub W;
    @dzsi
    private BroadcastReceiver X;
    @dzsi
    private BroadcastReceiver Y;
    private final asac Z;
    public final ckcw d;
    public final cqat e;
    public final btrm f;
    public final crka g;
    public final btwd h;
    public final dxio<btpc> i;
    @dzsi
    public final crkp j;
    public final jzv k;
    public final crnz l;
    public final crle m;
    public final bvjj n;
    public final crlp o;
    public final crlm p;
    public final asik q;
    public cqzw r;
    public boolean s;
    @dzsi
    public crkv u;
    @dzsi
    public crkl v;
    public final vxm x;
    boolean y;
    public final List<cqzw> t = dchl.h();
    @dzsi
    public Future<?> w = null;
    boolean z = true;
    long A = -1;
    public long B = -1;
    private boolean S = false;
    private boolean T = false;
    private boolean V = false;

    public crkm(Application application, dxio<cref> dxioVar, ckcw ckcwVar, ckrh ckrhVar, cqat cqatVar, vtn vtnVar, btrm btrmVar, crka crkaVar, btwd btwdVar, @dzsi crkp crkpVar, jzv jzvVar, crnz crnzVar, vxm vxmVar, crle crleVar, crjw crjwVar, bvjj bvjjVar, crlp crlpVar, vxo vxoVar, asik asikVar, crlm crlmVar, cjqy cjqyVar, bvrb bvrbVar, asac asacVar, dxio<btpc> dxioVar2, craw crawVar) {
        this.L = dxioVar;
        dbsk.s(ckcwVar);
        this.d = ckcwVar;
        this.M = ckrhVar;
        dbsk.s(cqatVar);
        this.e = cqatVar;
        dbsk.s(application);
        this.N = application;
        dbsk.s(vtnVar);
        this.O = vtnVar;
        dbsk.s(btrmVar);
        this.f = btrmVar;
        dbsk.s(crkaVar);
        this.g = crkaVar;
        dbsk.s(btwdVar);
        this.h = btwdVar;
        this.j = crkpVar;
        dbsk.s(jzvVar);
        this.k = jzvVar;
        dbsk.s(crnzVar);
        this.l = crnzVar;
        this.x = vxmVar;
        dbsk.s(crleVar);
        this.m = crleVar;
        this.P = crjwVar;
        dbsk.s(bvjjVar);
        this.n = bvjjVar;
        dbsk.s(crlpVar);
        this.o = crlpVar;
        dbsk.s(crlmVar);
        this.p = crlmVar;
        dbsk.s(vxoVar);
        this.Q = vxoVar;
        dbsk.s(asikVar);
        this.q = asikVar;
        this.D = TimeUnit.SECONDS.toMillis(btwdVar.k());
        this.C = d(bvjjVar, btwdVar);
        dbsk.s(cjqyVar);
        this.I = cjqyVar;
        dbsk.s(bvrbVar);
        this.J = bvrbVar;
        this.R = TimeUnit.SECONDS.toMillis(btwdVar.a.aQ);
        TimeUnit.SECONDS.toMillis(btwdVar.a.bd);
        this.Z = asacVar;
        this.i = dxioVar2;
        dbsk.s(crawVar);
        this.K = crawVar;
    }

    private final void E(crfh crfhVar, String str) {
        crfi crfiVar = dbsj.d(str) ? crfi.PREROLL_SOUND_ONLY : crfi.OTHER;
        Integer num = crfj.a.get(crfhVar);
        this.L.a().b(crfj.b(crfiVar, str, num != null ? num.intValue() : R.raw.da_traffic_report_ding_dong), crej.NAVIGATION_STATE_UPDATE, null);
    }

    public static long c(bvjj bvjjVar, int i) {
        String z = bvjjVar.z(bvjk.au, "0");
        if (!"0".equals(z)) {
            try {
                return (long) Math.ceil(i / Float.parseFloat(z));
            } catch (NullPointerException | NumberFormatException unused) {
            }
        }
        return i;
    }

    public static long d(bvjj bvjjVar, btwd btwdVar) {
        return TimeUnit.SECONDS.toMillis(c(bvjjVar, btwdVar.j()));
    }

    public static int n(amuh amuhVar) {
        for (int i = 0; i < amuhVar.m(); i++) {
            if (amuhVar.l(i).ap()) {
                return i;
            }
        }
        return -1;
    }

    public final void A(amuh amuhVar, boolean z, boolean z2, int i) {
        B(amuhVar, z, z2, i, null);
    }

    public final void B(amuh amuhVar, boolean z, boolean z2, int i, @dzsi GmmLocation gmmLocation) {
        dbsk.l(amuhVar.j());
        if (!amuhVar.k().L) {
            bvoo.h("Attempting to navigate on a non-navigable route.", new Object[0]);
            return;
        }
        this.t.clear();
        dqvj dqvjVar = amuhVar.k().h;
        int b2 = amuhVar.b();
        for (int i2 = 0; i2 < amuhVar.m(); i2++) {
            amub l = amuhVar.l(i2);
            if (l.L && l.h == dqvjVar) {
                if (i2 == amuhVar.b()) {
                    b2 = this.t.size();
                }
                this.t.add(cqzw.a(l, this.f, this.h, gmmLocation, this.K));
                l(l);
                if (this.j != null) {
                    HashSet hashSet = new HashSet();
                    for (amuo amuoVar : l.k) {
                        for (dpdf dpdfVar : amuoVar.G) {
                            if (dpdfVar.b == 6) {
                                hashSet.add(albv.e(((dpda) dpdfVar.c).b));
                            }
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this.O.h(hashSet, null);
                    }
                }
            }
        }
        C(this.t.get(b2), z, z2, i);
    }

    public final void C(cqzw cqzwVar, boolean z, boolean z2, int i) {
        amtz amtzVar = amtz.ONLINE;
        dovb dovbVar = dovb.SUCCESS;
        int ordinal = cqzwVar.g.K.ordinal();
        if (ordinal == 0) {
            long j = cqzwVar.g.f;
            this.E = this.e.e() - (this.e.b() - j);
        } else if (ordinal == 2) {
            this.E = this.e.e() - this.C;
        }
        D(cqzwVar, z, z2, i);
    }

    final void D(cqzw cqzwVar, boolean z, boolean z2, int i) {
        cray crayVar;
        int i2;
        GmmLocation gmmLocation;
        cqzw cqzwVar2 = this.r;
        if (cqzwVar2 != cqzwVar || !this.s) {
            dspd dspdVar = null;
            if (cqzwVar2 == null || !this.s) {
                crayVar = null;
            } else {
                crayVar = cqzwVar2.n();
                this.r.b();
            }
            this.r = cqzwVar;
            this.s = true;
            amub amubVar = cqzwVar.g;
            crkp crkpVar = this.j;
            if (crkpVar != null) {
                crkpVar.a = cqzwVar;
                cqzw cqzwVar3 = crkpVar.a;
                if (cqzwVar3 != null) {
                    int i3 = (int) cqzwVar3.b;
                    amuo[] amuoVarArr = cqzwVar3.g.k;
                    crkpVar.b.clear();
                    int i4 = 0;
                    for (amuo amuoVar : amuoVarArr) {
                        i4 += amuoVar.k;
                        for (dpdf dpdfVar : amuoVar.G) {
                            int i5 = dpdfVar.g + i4;
                            if (i5 >= i3) {
                                crkpVar.b.offer(new crko(dpdfVar, i5));
                            }
                        }
                    }
                }
            }
            if (amubVar.K == amtz.ONLINE) {
                s();
            }
            if (amubVar.K != amtz.REROUTING) {
                if (amubVar.h == dqvj.DRIVE) {
                    this.W = amubVar;
                } else {
                    this.W = null;
                }
            }
            String str = amubVar.p;
            this.G = null;
            if (z2 || this.V) {
                amve amveVar = amubVar.d;
                if ((amveVar.a.a & 2097152) != 0) {
                    dspdVar = amveVar.x();
                }
                this.U = dspdVar;
            }
            this.f.b(new crmj(u(), crayVar, this.F, i));
            if (z && (gmmLocation = this.F) != null) {
                cqzwVar.d(gmmLocation);
            }
            this.g.e();
            this.g.d(this.f, amubVar, false, cqzwVar.b);
            cqzwVar.l = true;
            if (cqzwVar.a == null || (i2 = cqzwVar.i) == -1 || ((craj) cqzwVar.h).c.get(i2).b() != 0) {
                cqzwVar.g();
                return;
            }
            cram d = cran.d();
            cqzwVar.f(d, cqzwVar.a, dcyn.a, amvw.i(((craj) cqzwVar.h).a, dcyn.a, 0.1d, dcyn.a, 0.1d), dcyn.a);
            cqzwVar.o(d.a());
        }
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        crfo crfoVar = crgzVar.c;
        if (crfoVar != null) {
            this.S = crfoVar.f;
            this.T = crfoVar.g;
            this.V = crfoVar.l;
        }
        crkh crkhVar = new crkh(this);
        this.X = crkhVar;
        this.N.registerReceiver(crkhVar, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        crkj crkjVar = new crkj(this);
        this.Y = crkjVar;
        this.N.registerReceiver(crkjVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        btrm btrmVar = this.f;
        dceq a2 = dcet.a();
        a2.b(arnl.class, new crkn(0, arnl.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(asin.class, new crkn(1, asin.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crkf.class, new crkn(2, crkf.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crip.class, new crkn(3, crip.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crit.class, new crkn(4, crit.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(arnk.class, new crkn(5, arnk.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(SetStateEvent.class, new crkn(6, SetStateEvent.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crrk.class, new crkn(7, crrk.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crma.class, new crkn(8, crma.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crhm.class, new crkn(9, crhm.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(btar.class, new crkn(10, btar.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(arnm.class, new crkn(11, arnm.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crif.class, new crkn(12, crif.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(sri.class, new crkn(13, sri.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crhg.class, new crkn(14, crhg.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crhv.class, new crkn(15, crhv.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crhx.class, new crkn(16, crhx.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crig.class, new crkn(17, crig.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(arnj.class, new crkn(18, arnj.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a2.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        bvrj.NAVIGATION_INTERNAL.c();
        this.f.a(this);
        BroadcastReceiver broadcastReceiver = this.X;
        if (broadcastReceiver != null) {
            this.N.unregisterReceiver(broadcastReceiver);
        }
        BroadcastReceiver broadcastReceiver2 = this.Y;
        if (broadcastReceiver2 != null) {
            this.N.unregisterReceiver(broadcastReceiver2);
        }
        this.f.e(amuj.class);
        f();
    }

    public final void e(amub amubVar, @dzsi dspd dspdVar) {
        if (dspdVar != null) {
            this.o.d(dspdVar, amubVar.f);
            return;
        }
        this.o.e();
    }

    public final void f() {
        bvrj.NAVIGATION_INTERNAL.c();
        cqzw cqzwVar = this.r;
        if (cqzwVar != null && this.s) {
            cqzwVar.b();
        }
        this.s = false;
        s();
        this.m.c.b(new ahmu(null));
    }

    @dzsi
    public final dqvj g() {
        cqzw cqzwVar = this.r;
        if (cqzwVar == null) {
            return null;
        }
        return cqzwVar.g.h;
    }

    final void h() {
        i(null, null, true, false);
    }

    public final void i(@dzsi dqvj dqvjVar, @dzsi srh srhVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        bvrj.NAVIGATION_INTERNAL.c();
        if (this.T) {
            this.f.b(new crme(u()));
            return;
        }
        cqzw cqzwVar = this.r;
        if (cqzwVar == null) {
            z(srhVar, 2);
        } else if (this.F == null) {
            z(srhVar, 3);
            bvoo.h("Attempted to reroute but current location was unavailable.", new Object[0]);
        } else {
            amub amubVar = this.W;
            crkv crkvVar = this.u;
            amtz amtzVar = cqzwVar.g.K;
            amtz amtzVar2 = amtz.OFFLINE;
            long e = this.e.e();
            long j = this.B;
            boolean z5 = amubVar != null && !this.y && !x() && amtzVar != amtzVar2 && ((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1)) == 0 || ((e - j) > b ? 1 : ((e - j) == b ? 0 : -1)) > 0);
            if (srhVar != null) {
                if (z5) {
                    z(srhVar, 5);
                } else {
                    z(srhVar, 4);
                }
                srh srhVar2 = this.H;
                if (srhVar2 == null) {
                    this.H = srhVar;
                } else {
                    srhVar2.a.putAll(srhVar.a);
                    srhVar2.b |= srhVar.b;
                    srhVar2.c = srhVar.c;
                }
            }
            boolean z6 = crkvVar == null || z5 || this.H != null;
            if (!z5 && !z6) {
                return;
            }
            if (v() && z && (this.y || this.z)) {
                long j2 = this.A;
                if (j2 == -1 || e - j2 > this.R) {
                    E(crfh.DRING_DRING, (!this.h.P() || !this.n.m(bvjk.jP, false) || g() != dqvj.WALK) ? "" : this.N.getString(R.string.EYES_FREE_MODE_REROUTE_NOTIFICATION));
                    this.A = e;
                }
            }
            this.z = this.y;
            btrm btrmVar = this.f;
            crqo u = u();
            if (srhVar != null) {
                z3 = z2;
                z4 = true;
            } else {
                z3 = z2;
                z4 = false;
            }
            btrmVar.b(new crmi(u, z, z4, z3));
            GmmLocation gmmLocation = this.F;
            EnumMap<vux, Integer> enumMap = null;
            if (z5) {
                amub amubVar2 = this.W;
                dbsk.s(amubVar2);
                crle crleVar = this.m;
                dvgi s = this.h.s();
                Context context = this.N;
                dwaw f = crleVar.f(gmmLocation, amubVar2, this.U, j(), false, null, null, null);
                dcdc g = dcdc.g(crleVar.e.a(), crleVar.d.a());
                crrj crrjVar = crleVar.i;
                dehn<crrk> a2 = crrjVar.a(g, s, avnk.a(crleVar.g, gmmLocation, null, null), f, amubVar2.b, amubVar2.c, crke.c(f, context), crle.e(gmmLocation), crrjVar.b.b());
                final btrm btrmVar2 = crleVar.c;
                btrmVar2.getClass();
                bvqg bvqgVar = new bvqg(btrmVar2) { // from class: crld
                    private final btrm a;

                    {
                        this.a = btrmVar2;
                    }

                    @Override // defpackage.bvqg
                    public final void NU(Object obj) {
                        this.a.b((crrk) obj);
                    }
                };
                Executor g2 = crleVar.h.g(bvrj.BACKGROUND_THREADPOOL);
                dbsk.s(g2);
                bvqj.c(a2, bvqgVar, g2);
                this.w = a2;
            }
            crkv crkvVar2 = this.u;
            if (crkvVar2 != null) {
                crkvVar2.b();
            } else {
                crkl crklVar = this.v;
                if (crklVar != null) {
                    crklVar.a();
                    this.v = null;
                }
            }
            boolean z7 = amtzVar == amtzVar2 || (z5 && (this.B > (-1L) ? 1 : (this.B == (-1L) ? 0 : -1)) != 0);
            srh srhVar3 = this.H;
            if (srhVar3 != null) {
                this.Q.f(srhVar3.a);
            }
            dwaq f2 = this.l.f(true);
            crle crleVar2 = this.m;
            GmmLocation gmmLocation2 = this.F;
            cqzw cqzwVar2 = this.r;
            amub amubVar3 = cqzwVar2.g;
            int i = cqzwVar2.n;
            dspd dspdVar = this.U;
            dspd j3 = j();
            boolean a3 = this.k.a();
            srh srhVar4 = this.H;
            if (srhVar4 != null) {
                enumMap = srhVar4.a;
            }
            dwaw f3 = crleVar2.f(gmmLocation2, amubVar3, dspdVar, j3, a3, dqvjVar, enumMap, f2);
            crkv a4 = crleVar2.f.a(gmmLocation2, crleVar2.k, crleVar2.l);
            a4.h(f3, crle.e(gmmLocation2), z7);
            this.u = a4;
        }
    }

    @dzsi
    public final dspd j() {
        this.f.b(new crmp());
        return this.o.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
        if (defpackage.bvsl.f((int) (r9.i() - r14.r.i())) != 3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
        if (defpackage.bvtb.u((int) java.lang.Math.round(r9.k() - r14.r.k()), false) != 3) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.apps.gmm.map.model.location.GmmLocation r15) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crkm.k(com.google.android.apps.gmm.map.model.location.GmmLocation):void");
    }

    public final void l(amub amubVar) {
        dpfh dpfhVar = amubVar.z;
        if (dpfhVar != null) {
            vtn vtnVar = this.O;
            dozz dozzVar = dpfhVar.h;
            if (dozzVar == null) {
                dozzVar = dozz.y;
            }
            vtnVar.h(new HashSet(alca.j(dozzVar)), null);
        }
    }

    public final void o() {
        if (this.e.e() - this.E < this.C) {
            return;
        }
        q(null);
    }

    public final void p(dqtv dqtvVar) {
        if (this.F == null || this.r == null) {
            return;
        }
        dqtu dqtuVar = dqtvVar.c;
        if (dqtuVar == null) {
            dqtuVar = dqtu.c;
        }
        if (!dqtuVar.b && dqtvVar.b.size() == 0) {
            return;
        }
        q(dqtvVar);
    }

    public final void q(@dzsi dqtv dqtvVar) {
        dwbm dwbmVar;
        double d;
        if (!this.S && this.u == null && this.v == null && this.r.m() && this.r.g.an()) {
            boolean z = this.r.g.K == amtz.OFFLINE;
            if (z) {
                dwbmVar = crle.b;
            } else {
                dwbmVar = crle.a;
            }
            dwaq f = this.l.f(z);
            crle crleVar = this.m;
            cqzw cqzwVar = this.r;
            GmmLocation gmmLocation = this.F;
            dspd j = j();
            boolean a2 = this.k.a();
            amub amubVar = cqzwVar.g;
            double d2 = cqzwVar.b;
            double d3 = amubVar.S;
            Double.isNaN(d3);
            double d4 = d2 - d3;
            akrn akrnVar = cqzwVar.e;
            if (akrnVar != null) {
                amvs A = gmmLocation.A();
                A.v(akrnVar.a.k(), akrnVar.a.o());
                A.p((float) akrnVar.b);
                GmmLocation d5 = A.d();
                crleVar.c.b(new ahmu(new ahmt(d5)));
                gmmLocation = d5;
                d = d4;
            } else {
                crleVar.c.b(new ahmu(null));
                d = -1.0d;
            }
            vuz a3 = crleVar.j.a(amubVar.J, amubVar.h);
            a3.b = j;
            a3.d(amubVar.Q, d);
            a3.c = dqtvVar;
            dwaw c2 = crle.c(crleVar.b(gmmLocation, amubVar, a3.a(), a2, crleVar.d(), crleVar.n).a(), dwbmVar, f);
            crkv a4 = crleVar.f.a(null, crleVar.m, null);
            a4.h(c2, false, false);
            this.v = new crkl(a4, this.r.g);
        }
    }

    public final void r(amub amubVar, @dzsi dqum dqumVar) {
        cqzw cqzwVar;
        Iterator<cqzw> it = this.t.iterator();
        while (true) {
            if (!it.hasNext()) {
                cqzwVar = null;
                break;
            }
            cqzwVar = it.next();
            if (cqzwVar.g == amubVar) {
                break;
            }
        }
        if (cqzwVar != null) {
            cqzw cqzwVar2 = this.r;
            if (cqzwVar2 != null) {
                this.f.b(new cror(amubVar, cqzwVar2.k(), cqzwVar.k(), dqumVar, this.e.e()));
            }
            D(cqzwVar, false, dqumVar == null, 2);
        }
    }

    final void s() {
        this.u = null;
        this.v = null;
        t();
    }

    public final void t() {
        this.B = -1L;
        if (x()) {
            this.w.cancel(false);
            this.w = null;
        }
    }

    public final boolean v() {
        return this.n.m(bvjk.eP, true);
    }

    public final void w(crfh crfhVar) {
        E(crfhVar, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        return this.w != null;
    }

    public final void y(int i, @dzsi crke crkeVar) {
        this.f.b(new crml(i, u()));
        if (crkeVar != null) {
            amtz amtzVar = amtz.ONLINE;
            dovb dovbVar = dovb.SUCCESS;
            crkeVar.a.ordinal();
        }
    }

    public final void z(@dzsi srh srhVar, int i) {
        dmcf dmcfVar;
        if (srhVar == null || !srhVar.c) {
            return;
        }
        EnumMap<vux, Integer> enumMap = srhVar.a;
        enumMap.size();
        if (enumMap.containsKey(vux.AVOID_TOLLS)) {
            if (enumMap.get(vux.AVOID_TOLLS).intValue() == 0) {
                dmcfVar = dmcf.ALLOW_TOLLS;
            } else {
                dmcfVar = dmcf.AVOID_TOLLS;
            }
        } else if (enumMap.containsKey(vux.AVOID_FERRIES)) {
            if (enumMap.get(vux.AVOID_FERRIES).intValue() == 0) {
                dmcfVar = dmcf.ALLOW_FERRIES;
            } else {
                dmcfVar = dmcf.AVOID_FERRIES;
            }
        } else if (!enumMap.containsKey(vux.AVOID_HIGHWAYS)) {
            dmcfVar = null;
        } else if (enumMap.get(vux.AVOID_HIGHWAYS).intValue() == 0) {
            dmcfVar = dmcf.ALLOW_HIGHWAYS;
        } else {
            dmcfVar = dmcf.AVOID_HIGHWAYS;
        }
        if (dmcfVar == null) {
            return;
        }
        this.M.u(i, dmcfVar);
    }

    public final void m(amub amubVar) {
        amub amubVar2 = this.r.g;
        int i = 0;
        if (amubVar2.d.e() == amubVar.d.e()) {
            for (int i2 = 0; i2 < amubVar.d.e(); i2++) {
                amtr d = amubVar.d.d(i2);
                amubVar2.d.d(i2).b = d.b;
            }
        }
        if (amubVar2.d.e() == amubVar.d.e()) {
            for (int i3 = 0; i3 < amubVar.d.e(); i3++) {
                amtr d2 = amubVar.d.d(i3);
                amubVar2.d.d(i3).c = d2.c;
            }
        }
        amvh[] amvhVarArr = amubVar.o;
        if (amubVar2.o.length == amvhVarArr.length) {
            while (true) {
                amvh[] amvhVarArr2 = amubVar2.o;
                if (i >= amvhVarArr2.length) {
                    break;
                }
                if (!dbsd.a(amvhVarArr2[i].E(), amvhVarArr[i].E())) {
                    amvh[] amvhVarArr3 = amubVar2.o;
                    amvg amvgVar = new amvg(amvhVarArr3[i]);
                    amvgVar.s = amvhVarArr[i].E();
                    amvhVarArr3[i] = amvgVar.a();
                }
                i++;
            }
        }
        this.e.e();
    }

    public final crqo u() {
        dpio dpioVar;
        crap crapVar;
        crkk crkkVar = this.G;
        amub amubVar = null;
        if (crkkVar == null) {
            dpioVar = null;
        } else {
            amubVar = crkkVar.a;
            dpioVar = crkkVar.b;
        }
        amub[] amubVarArr = new amub[this.t.size()];
        cray[] crayVarArr = new cray[this.t.size()];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            cqzw cqzwVar = this.t.get(i3);
            amubVarArr[i3] = cqzwVar.g;
            crayVarArr[i3] = cqzwVar.n();
            if (cqzwVar == this.r) {
                i = i3;
            }
            if (cqzwVar.g == amubVar) {
                i2 = i3;
            }
        }
        cqat cqatVar = this.e;
        cqzw cqzwVar2 = this.r;
        long j = Long.MAX_VALUE;
        if (cqzwVar2 != null) {
            double d = Double.MAX_VALUE;
            if (cqzwVar2.l && (crapVar = cqzwVar2.a) != null) {
                d = cqzwVar2.h(cqzwVar2.f, cqzwVar2.b, ((crad) crapVar).i);
            }
            if (d < 9.223372036854776E18d) {
                j = cqatVar.e() + ((long) (d * 1000.0d));
            }
        }
        crqn crqnVar = new crqn();
        crqnVar.a = amuh.e(i, amubVarArr);
        crqnVar.c = i2;
        crqnVar.b = crayVarArr;
        crqnVar.e = dpioVar;
        crqnVar.d = j;
        return crqnVar.a();
    }
}
