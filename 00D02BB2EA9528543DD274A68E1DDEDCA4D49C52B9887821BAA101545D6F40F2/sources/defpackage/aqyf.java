package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqyf  reason: default package */
/* loaded from: classes2.dex */
public final class aqyf implements arad, bnib {
    private static final dcqe n = dcqe.c("aqyf");
    private long A;
    @dzsi
    private GmmLocation B;
    @dzsi
    private dgas C;
    @dzsi
    private cjtd D;
    private final boolean E;
    private int F = 1;
    private final int G;
    public final Activity a;
    @dzsi
    public final dwao b;
    public final dzsj<qbt> c;
    public final dzsj<brba> d;
    public final dzsj<afha> e;
    public ilg f;
    public amvh g;
    @dzsi
    public qbn h;
    @dzsi
    public dqvj i;
    public final boolean j;
    public boolean k;
    @dzsi
    public qbi l;
    @dzsi
    public final bdxs m;
    private final arac o;
    private final dzsj<akox> p;
    private final List<amvh> q;
    private final int r;
    private final amvi s;
    private final cqat t;
    private final btrm u;
    private final btvo v;
    private final ahjq w;
    private final dzsj<ascb> x;
    @dzsi
    private WeakReference<bnic> y;
    @dzsi
    private qbj z;

    public aqyf(Activity activity, cqat cqatVar, btrm btrmVar, btvo btvoVar, ahjq ahjqVar, dzsj dzsjVar, dzsj dzsjVar2, dzsj dzsjVar3, dzsj dzsjVar4, dzsj dzsjVar5, dcdc dcdcVar, int i, amvi amviVar, dqvj dqvjVar, boolean z, dwao dwaoVar, bdxs bdxsVar) {
        boolean z2 = false;
        if (dcdcVar.isEmpty() || ((i >= 0 && amviVar == amvi.INSERT && i <= dcdcVar.size()) || (amviVar == amvi.ATTACH_PARKING && i < dcdcVar.size()))) {
            z2 = true;
        }
        dbsk.b(z2, "Destination waypoint index is out of bounds");
        this.t = cqatVar;
        this.u = btrmVar;
        this.v = btvoVar;
        this.w = ahjqVar;
        this.c = dzsjVar2;
        this.x = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.a = activity;
        this.p = dzsjVar;
        this.o = arac.SEARCH;
        this.E = true;
        this.i = dqvjVar;
        this.j = z;
        this.b = dwaoVar;
        this.m = bdxsVar;
        this.r = i;
        ArrayList arrayList = new ArrayList(dcdcVar);
        this.q = arrayList;
        if (amviVar.equals(amvi.INSERT)) {
            arrayList.add(i, null);
        }
        this.s = amviVar;
        this.G = 2;
    }

    @Override // defpackage.arad
    public final void a(ilg ilgVar) {
        this.f = ilgVar;
        this.g = ilgVar.d();
        if (this.s.equals(amvi.INSERT)) {
            this.q.set(this.r, this.g);
            j();
        } else if (!this.s.equals(amvi.ATTACH_PARKING)) {
            bvoo.h("Unhandled destination waypoint action.", new Object[0]);
            j();
        } else {
            amvh amvhVar = this.q.get(this.r);
            if (amvhVar == null) {
                bvoo.h("Null destination waypoint found at destinationWaypointIndex", new Object[0]);
                j();
                return;
            }
            this.q.set(this.r, vyr.a(amvhVar, ilgVar.d()));
            j();
        }
    }

    @Override // defpackage.arad
    public final void b(bnic bnicVar) {
        this.y = new WeakReference<>(bnicVar);
        bnicVar.h(this);
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r0.E(defpackage.akqg.a(r2)) > 620000.0d) goto L19;
     */
    @Override // defpackage.arad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.F
            r1 = 1
            if (r0 != r1) goto L61
            dzsj<qbt> r0 = r6.c
            java.lang.Object r0 = r0.a()
            qbt r0 = (defpackage.qbt) r0
            qbj r0 = r0.e()
            r6.z = r0
            boolean r0 = r6.m()
            if (r0 != 0) goto L61
            qbj r0 = r6.z
            if (r0 == 0) goto L27
            dqvj r2 = r6.i
            if (r2 != 0) goto L27
            dqvj r0 = r0.a()
            r6.i = r0
        L27:
            dqvj r0 = r6.i
            if (r0 != 0) goto L2c
            goto L5e
        L2c:
            ilg r0 = r6.f
            defpackage.dbsk.s(r0)
            ilg r0 = r6.f
            boolean r0 = r0.e()
            if (r0 != 0) goto L5e
            ahjq r0 = r6.w
            com.google.android.apps.gmm.map.model.location.GmmLocation r0 = r0.a()
            amvh r2 = r6.g
            defpackage.dbsk.s(r2)
            amvh r2 = r6.g
            akqq r2 = r2.e
            if (r2 == 0) goto L61
            if (r0 == 0) goto L61
            akra r2 = defpackage.akqg.a(r2)
            float r0 = r0.E(r2)
            double r2 = (double) r0
            r4 = 4693572971539726336(0x4122ebc000000000, double:620000.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
        L5e:
            r0 = 5
            r6.F = r0
        L61:
            boolean r0 = r6.h()
            if (r0 == 0) goto L6a
            r6.i()
        L6a:
            btrm r0 = r6.u
            dceq r2 = defpackage.dcet.a()
            aqyh r3 = new aqyh
            java.lang.Class<srf> r4 = defpackage.srf.class
            bvrj r5 = defpackage.bvrj.UI_THREAD
            r3.<init>(r4, r6, r5)
            java.lang.Class<srf> r4 = defpackage.srf.class
            r2.b(r4, r3)
            dcet r2 = r2.a()
            r0.g(r6, r2)
            r6.k = r1
            r6.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqyf.c():void");
    }

    @Override // defpackage.arad
    public final void d() {
        this.k = false;
        this.u.a(this);
    }

    @Override // defpackage.arad
    public final boolean e() {
        return this.k;
    }

    @Override // defpackage.arad
    public final void f() {
        if (this.f == null || this.g == null || this.v.getNavigationParameters().v() || this.F != 1 || h() || this.f.b() != null) {
            return;
        }
        if (this.z == null) {
            this.F = 4;
            j();
            return;
        }
        dnqg bZ = dnqh.p.bZ();
        cjtd a = this.f.a();
        if (a != null) {
            String str = a.e;
            if (str != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                str.getClass();
                dnqhVar.a |= 4;
                dnqhVar.d = str;
            }
            String str2 = a.d;
            if (str2 != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                str2.getClass();
                dnqhVar2.a |= 8;
                dnqhVar2.e = str2;
            }
            ddho ddhoVar = a.g;
            if (ddhoVar != null) {
                ddxw bZ2 = ddxx.j.bZ();
                int b = ddhoVar.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddxx ddxxVar = (ddxx) bZ2.b;
                ddxxVar.a |= 8;
                ddxxVar.d = b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar3 = (dnqh) bZ.b;
                ddxx bK = bZ2.bK();
                bK.getClass();
                dnqhVar3.f = bK;
                dnqhVar3.a |= 16;
            }
        }
        qbj qbjVar = this.z;
        dbsk.s(qbjVar);
        if (qbjVar.g()) {
            this.h = qbjVar.i(dbsg.j(k()), l(), dbsg.i(bZ.bK()), dbsg.j(null), dbsg.j(this.p.a().aa()));
        } else {
            this.h = qbjVar.n(k(), l(), bZ.bK(), this.i, this.b, this.G, this.p.a().Z(), vul.DIRECTIONS_UI);
        }
        if (this.h == null) {
            this.F = 4;
            return;
        }
        this.A = this.t.e();
        this.B = this.w.a();
        this.F = 2;
    }

    public final void g(cjqm cjqmVar) {
        qcz a;
        if (!this.k || this.f == null || n()) {
            return;
        }
        if (!h()) {
            qcw x = qcx.x();
            x.s(this.i);
            x.w(this.b);
            x.k(qbs.NAVIGATION);
            x.v(yys.a(cjqmVar));
            x.j(m());
            x.f(true);
            if (m()) {
                x.r(k());
                x.b(l());
            } else {
                amvh amvhVar = null;
                x.r(this.f.e() ? null : amvh.i(this.a.getApplication()));
                if (!this.f.e()) {
                    amvhVar = this.g;
                }
                x.u(amvhVar);
            }
            a = x.a();
        } else {
            qbn qbnVar = this.h;
            qbnVar.b(yys.a(cjqmVar));
            qcr u = qct.u(qbnVar, qbs.NAVIGATION);
            u.e(m());
            u.c(this.j);
            u.d(true);
            a = u.a();
        }
        this.x.a().d(a, asca.PLACESHEET);
    }

    public final boolean h() {
        GmmLocation gmmLocation;
        qbn qbnVar = this.h;
        if (qbnVar != null && !qbnVar.a().a()) {
            long e = this.t.e() - this.A;
            if (e >= 0 && e <= 180000) {
                if (m()) {
                    for (amvh amvhVar : this.q) {
                        if (amvhVar == null || !amvhVar.k()) {
                        }
                    }
                    return true;
                }
                GmmLocation a = this.w.a();
                return (a == null || (gmmLocation = this.B) == null || gmmLocation.distanceTo(a) > 25.0f) ? false : true;
            }
        }
        return false;
    }

    public final void i() {
        dqvj l;
        qbm a = this.h.a();
        dgas j = a.j();
        if (j == null) {
            if (a.b()) {
                return;
            }
            this.F = 4;
            return;
        }
        if (!m()) {
            qbj qbjVar = this.z;
            dbsk.s(qbjVar);
            if (qbjVar.g()) {
                l = a.k();
            } else {
                l = a.l();
            }
            if (l == null) {
                bvoo.h("Unknown travel to display.", new Object[0]);
            } else {
                this.i = l;
            }
        }
        this.C = j;
        this.F = 3;
        this.D = a.m();
        if (this.E) {
            return;
        }
        this.h = null;
    }

    public final void j() {
        bnic bnicVar;
        WeakReference<bnic> weakReference = this.y;
        if (weakReference == null || (bnicVar = weakReference.get()) == null) {
            return;
        }
        int i = this.F;
        boolean z = i == 1 || i == 2;
        dbsk.s(this.f);
        bnicVar.i(this.f, this.i, this.C, this.D, z);
    }

    @dzsi
    final amvh k() {
        return this.q.get(0);
    }

    final dcdc<amvh> l() {
        List<amvh> list = this.q;
        return dcdc.r(list.subList(1, list.size()));
    }

    public final boolean m() {
        return this.o == arac.SEARCH;
    }

    public final boolean n() {
        return this.o == arac.DIRECTIONS;
    }

    public aqyf(Activity activity, cqat cqatVar, btrm btrmVar, btvo btvoVar, ahjq ahjqVar, dzsj dzsjVar, dzsj dzsjVar2, dzsj dzsjVar3, dzsj dzsjVar4, dzsj dzsjVar5, boolean z, dqvj dqvjVar, boolean z2, arac aracVar, qbi qbiVar, bdxs bdxsVar) {
        this.t = cqatVar;
        this.u = btrmVar;
        this.v = btvoVar;
        this.w = ahjqVar;
        this.c = dzsjVar2;
        this.x = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.a = activity;
        this.p = dzsjVar;
        this.o = aracVar;
        dbsk.b(aracVar != arac.SEARCH, "Invalid source! Please use another method for SEARCH related DistanceViewControllers.");
        this.s = amvi.INSERT;
        this.E = z;
        this.m = bdxsVar;
        this.b = null;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = 1;
        arrayList.add(null);
        arrayList.add(null);
        this.i = dqvjVar;
        this.j = z2;
        this.l = qbiVar;
        this.G = (dqvjVar == null || dqvjVar == dqvj.MIXED) ? 2 : 3;
    }
}
