package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqba  reason: default package */
/* loaded from: classes4.dex */
public final class bqba implements akvo, cflk {
    public final akzh a;
    public final bqdl b;
    public final dbsg<cfll> c;
    public final List<bqgw> e;
    public final bqcn f;
    public bqhr g;
    public int h;
    private final bqaz i;
    private final Executor j;
    private final Activity k;
    private final jkf l;
    private final zzn m;
    private final akox n;
    private final bqdk o;
    private final List<akte> q;
    private final bqbf r;
    @dzsi
    private akuh s;
    private int t;
    @dzsi
    akqq d = null;
    private dbsg<bqhj> p = dbpy.a;

    public bqba(bqhg bqhgVar, bqaz bqazVar, bqco bqcoVar, Executor executor, Activity activity, jkf jkfVar, akzh akzhVar, zzn zznVar, akox akoxVar, bqdl bqdlVar, dbsg<cfll> dbsgVar, bqdk bqdkVar, bqbf bqbfVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.q = new ArrayList();
        this.t = 2;
        this.i = bqazVar;
        this.j = executor;
        this.k = activity;
        this.l = jkfVar;
        this.a = akzhVar;
        this.m = zznVar;
        this.n = akoxVar;
        this.b = bqdlVar;
        this.c = dbsgVar;
        this.o = bqdkVar;
        this.g = bqhgVar.c();
        this.r = bqbfVar;
        bqhf b = bqhgVar.b();
        bqco.a(b, 1);
        zzn a = bqcoVar.a.a();
        bqco.a(a, 2);
        Executor a2 = bqcoVar.b.a();
        bqco.a(a2, 3);
        gga a3 = bqcoVar.c.a();
        bqco.a(a3, 4);
        btrm a4 = bqcoVar.d.a();
        bqco.a(a4, 5);
        akzh a5 = bqcoVar.e.a();
        bqco.a(a5, 6);
        alhv a6 = bqcoVar.f.a();
        bqco.a(a6, 7);
        bpsj a7 = bqcoVar.g.a();
        bqco.a(a7, 8);
        akox a8 = bqcoVar.h.a();
        bqco.a(a8, 9);
        bpyj a9 = bqcoVar.i.a();
        bqco.a(a9, 10);
        this.f = new bqcn(b, a, a2, a3, a4, a5, a6, a7, a8, a9);
        arrayList.addAll(bqhgVar.a());
        this.h = bqhgVar.d();
    }

    private final void r() {
        if (this.s != null) {
            w(this.n).j(this.s);
            this.s = null;
        }
    }

    private final void s() {
        this.n.D(this.t == 2);
    }

    private final void t() {
        dmqx e;
        v();
        int size = this.e.size();
        int i = size;
        for (bqgw bqgwVar : this.e) {
            akrk e2 = akrk.e(dchl.k(bqgwVar.f(), bqav.a));
            if (this.s == null) {
                if (this.t == 2) {
                    int i2 = bpzc.a;
                    dmqj bZ = dmqk.j.bZ();
                    dmsk bZ2 = dmsl.l.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmsl dmslVar = (dmsl) bZ2.b;
                    dmslVar.a |= 1;
                    dmslVar.b = -2236963;
                    bZ.a(bZ2);
                    dmsk bZ3 = dmsl.l.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dmsl dmslVar2 = (dmsl) bZ3.b;
                    dmslVar2.a |= 1;
                    dmslVar2.b = -2236963;
                    bZ.a(bZ3);
                    int ordinal = bntp.POLYLINE.ordinal();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmqk dmqkVar = (dmqk) bZ.b;
                    dmqkVar.a |= 4;
                    dmqkVar.c = ordinal;
                    e = bpzc.e(bZ.bK());
                } else {
                    int i3 = bpzc.a;
                    dmqj bZ4 = dmqk.j.bZ();
                    dmsk bZ5 = dmsl.l.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dmsl dmslVar3 = (dmsl) bZ5.b;
                    dmslVar3.a |= 1;
                    dmslVar3.b = -12566464;
                    bZ4.a(bZ5);
                    dmsk bZ6 = dmsl.l.bZ();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dmsl dmslVar4 = (dmsl) bZ6.b;
                    dmslVar4.a |= 1;
                    dmslVar4.b = -7303024;
                    bZ4.a(bZ6);
                    int ordinal2 = bntp.POLYLINE.ordinal();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dmqk dmqkVar2 = (dmqk) bZ4.b;
                    dmqkVar2.a |= 4;
                    dmqkVar2.c = ordinal2;
                    e = bpzc.e(bZ4.bK());
                }
                this.s = w(this.n).c(e);
            }
            akuh akuhVar = this.s;
            akoq aj = this.n.aj();
            akte c = aj.aj().c(e2.q(), akuhVar, i, 0, 2, 2, 3);
            aj.aF().c().f(c);
            c.Pt(this);
            this.q.add(c);
            i--;
        }
    }

    private final void u(bqgw bqgwVar) {
        this.h = 2;
        this.f.d(bqgwVar);
        this.f.j();
        this.i.a(bqgwVar);
    }

    private final void v() {
        for (akte akteVar : this.q) {
            akteVar.i();
            akteVar.j();
        }
        this.q.clear();
    }

    private static akvz w(akox akoxVar) {
        return akoxVar.aj().aF().e();
    }

    @Override // defpackage.cflk
    public final void a(dcdc<Long> dcdcVar) {
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        akte akteVar = (akte) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        s();
        this.f.a();
        if (this.c.a()) {
            this.c.b().c(this);
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        this.f.c();
        v();
        r();
        this.n.D(false);
        if (this.c.a()) {
            this.c.b().d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        this.f.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        this.f.h();
        if (this.f.c.f().isEmpty()) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029d A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0019, B:10:0x0021, B:12:0x004b, B:14:0x005f, B:16:0x006d, B:17:0x0078, B:18:0x007b, B:20:0x0081, B:95:0x02d2, B:97:0x02d8, B:21:0x0085, B:23:0x008c, B:32:0x00d0, B:33:0x00da, B:35:0x00e0, B:37:0x00f0, B:44:0x0138, B:45:0x013c, B:47:0x0142, B:49:0x014a, B:52:0x0156, B:63:0x01d0, B:38:0x0105, B:40:0x010f, B:42:0x0129, B:43:0x0134, B:55:0x0162, B:56:0x0167, B:58:0x016e, B:60:0x01b5, B:62:0x01cd, B:64:0x01d4, B:66:0x01da, B:68:0x01f2, B:70:0x020b, B:71:0x0216, B:72:0x0219, B:74:0x0223, B:76:0x0239, B:77:0x023e, B:79:0x024e, B:80:0x0253, B:82:0x0266, B:83:0x026b, B:84:0x0284, B:85:0x0293, B:86:0x0297, B:88:0x029d, B:90:0x02b3, B:92:0x02c3, B:93:0x02c6, B:24:0x008f, B:25:0x00a3, B:27:0x00a9, B:28:0x00bd, B:30:0x00c3, B:31:0x00ce, B:94:0x02d0, B:98:0x02e0), top: B:106:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0019, B:10:0x0021, B:12:0x004b, B:14:0x005f, B:16:0x006d, B:17:0x0078, B:18:0x007b, B:20:0x0081, B:95:0x02d2, B:97:0x02d8, B:21:0x0085, B:23:0x008c, B:32:0x00d0, B:33:0x00da, B:35:0x00e0, B:37:0x00f0, B:44:0x0138, B:45:0x013c, B:47:0x0142, B:49:0x014a, B:52:0x0156, B:63:0x01d0, B:38:0x0105, B:40:0x010f, B:42:0x0129, B:43:0x0134, B:55:0x0162, B:56:0x0167, B:58:0x016e, B:60:0x01b5, B:62:0x01cd, B:64:0x01d4, B:66:0x01da, B:68:0x01f2, B:70:0x020b, B:71:0x0216, B:72:0x0219, B:74:0x0223, B:76:0x0239, B:77:0x023e, B:79:0x024e, B:80:0x0253, B:82:0x0266, B:83:0x026b, B:84:0x0284, B:85:0x0293, B:86:0x0297, B:88:0x029d, B:90:0x02b3, B:92:0x02c3, B:93:0x02c6, B:24:0x008f, B:25:0x00a3, B:27:0x00a9, B:28:0x00bd, B:30:0x00c3, B:31:0x00ce, B:94:0x02d0, B:98:0x02e0), top: B:106:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h() {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqba.h():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i() {
        this.f.o();
        View b = this.m.b();
        if (b != null) {
            b.setVisibility(4);
        }
        this.h = 3;
        this.i.b();
        j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void j() {
        t();
        int i = this.h;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            this.f.j();
            return;
        }
        throw null;
    }

    @Override // defpackage.akvo
    /* renamed from: k */
    public final synchronized void x(akte akteVar) {
        final int indexOf = this.q.indexOf(akteVar);
        if (indexOf != -1) {
            this.j.execute(new Runnable(this, indexOf) { // from class: bqaw
                private final bqba a;
                private final int b;

                {
                    this.a = this;
                    this.b = indexOf;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(this.b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(akqq akqqVar) {
        akqq akqqVar2;
        dbsg<bqhj> dbsgVar;
        dbsg dbsgVar2;
        Object obj;
        bqdn bqdnVar;
        if (!akqqVar.equals(this.d)) {
            if ((bnuq.b() ? this.a : this.a.b()).k() >= 15.0d) {
                ArrayList<bqdn> arrayList = new ArrayList();
                if (this.b.a) {
                    arrayList = new ArrayList();
                    if (this.c.a()) {
                        dcdc<cflx> e = this.c.b().e().e();
                        int size = e.size();
                        for (int i = 0; i < size; i++) {
                            cflx cflxVar = e.get(i);
                            if (cflxVar.b().l() >= 2) {
                                arrayList.add(bqdn.e(cflxVar));
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (bqgw bqgwVar : this.e) {
                    List k = dchl.k(bqgwVar.f(), bqax.a);
                    if (k.size() >= 2) {
                        arrayList2.add(bqdn.f(bqgwVar.c, akrk.e(k)));
                    }
                }
                arrayList.addAll(arrayList2);
                bqdk bqdkVar = this.o;
                akzh b = bnuq.b() ? bqdkVar.c : bqdkVar.c.b();
                akra f = akra.f(akqqVar);
                akse akseVar = new akse();
                akse akseVar2 = new akse();
                if (!akyx.p(b, f, akseVar2, bqdkVar.b)) {
                    dbsgVar2 = dbpy.a;
                } else {
                    double d = Double.MAX_VALUE;
                    bqdn bqdnVar2 = null;
                    bqdm bqdmVar = null;
                    for (bqdn bqdnVar3 : arrayList) {
                        dcdc<bqdm> d2 = bqdnVar3.d();
                        int size2 = d2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            bqdm bqdmVar2 = d2.get(i2);
                            int i3 = size2;
                            dcdc<bqdm> dcdcVar = d2;
                            if (akyx.p(b, bqdmVar2.a(), akseVar, bqdkVar.b)) {
                                double a = bqdk.a(akseVar2, akseVar, bqdkVar.c.B());
                                if (a < d && a < 12.0d) {
                                    d = a;
                                    bqdnVar2 = bqdnVar3;
                                    bqdmVar = bqdmVar2;
                                }
                            }
                            i2++;
                            size2 = i3;
                            d2 = dcdcVar;
                        }
                    }
                    if (bqdnVar2 != null && bqdmVar != null) {
                        bqhh f2 = bqhj.f();
                        f2.c(bqdmVar.a().S());
                        if (bqdmVar.b().a()) {
                            f2.b(bqdmVar.b().b().longValue());
                        }
                        if (bqdnVar2.b().a()) {
                            f2.d(bqdnVar2.b().b().longValue());
                        }
                        dbsgVar2 = dbsg.i(f2.a());
                    }
                    dbsgVar2 = dbpy.a;
                }
                akra f3 = akra.f(akqqVar);
                akse akseVar3 = new akse();
                akse akseVar4 = new akse();
                akra akraVar = new akra();
                if (!akyx.p(b, f3, akseVar3, bqdkVar.b)) {
                    obj = dbpy.a;
                } else {
                    Iterator it = arrayList.iterator();
                    bqdn bqdnVar4 = null;
                    akqq akqqVar3 = null;
                    float f4 = Float.MAX_VALUE;
                    while (it.hasNext()) {
                        bqdn bqdnVar5 = (bqdn) it.next();
                        akrk a2 = bqdnVar5.a();
                        Iterator it2 = it;
                        akra akraVar2 = null;
                        int i4 = 0;
                        float f5 = Float.MAX_VALUE;
                        while (true) {
                            bqdnVar = bqdnVar5;
                            if (i4 >= a2.l() - 1) {
                                break;
                            }
                            int i5 = i4 + 1;
                            float M = akra.M(a2.m(i4), a2.m(i5), f3, akraVar);
                            if (f5 > M) {
                                akraVar2 = akra.s(akraVar);
                                f5 = M;
                            }
                            i4 = i5;
                            bqdnVar5 = bqdnVar;
                        }
                        if (akraVar2 == null) {
                            bvoo.h("closestPoint should not be null.", new Object[0]);
                        } else if (akyx.p(b, akraVar2, akseVar4, bqdkVar.b) && bqdk.a(akseVar3, akseVar4, bqdkVar.c.B()) < 24.0d && f4 > f5) {
                            akqqVar3 = akraVar2.S();
                            f4 = f5;
                            bqdnVar4 = bqdnVar;
                        }
                        it = it2;
                    }
                    if (bqdnVar4 != null && akqqVar3 != null) {
                        bqhh f6 = bqhj.f();
                        f6.c(akqqVar3);
                        if (bqdnVar4.b().a()) {
                            f6.d(bqdnVar4.b().b().longValue());
                        } else if (bqdnVar4.c().a()) {
                            f6.e(bqdnVar4.c().b());
                        }
                        obj = dbsg.i(f6.a());
                    }
                    obj = dbpy.a;
                }
                dbsgVar = dbsgVar2.d(obj);
            } else {
                dbsgVar = dbpy.a;
            }
            this.p = dbsgVar;
        }
        int i6 = this.h;
        if (i6 == 0) {
            throw null;
        }
        if (i6 == 2) {
            akqqVar2 = akqqVar;
            this.f.i(akqqVar2, this.p);
        } else {
            akqqVar2 = akqqVar;
        }
        this.d = akqqVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized bqcl n() {
        return this.f.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int o() {
        return this.e.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void p() {
        if (this.e.size() >= 20) {
            dafk b = ckos.b(this.k.findViewById(16908290), R.string.MISSING_ROAD_POLYLINE_MAX_ROADS_REACHED, 0);
            b.s(this.k.getResources().getColor(R.color.qu_daynight_white));
            b.u(this.k.getResources().getColor(R.color.mod_daynight_blue600));
            b.c();
            return;
        }
        bqhr bqhrVar = this.g;
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.UNKNOWN_ENTRY_POINT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        u(new bqgw(bqhrVar, bZ.bK()));
        bqhq bZ2 = bqhr.c.bZ();
        int i = this.g.b + 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bqhr bqhrVar2 = (bqhr) bZ2.b;
        bqhrVar2.a |= 1;
        bqhrVar2.b = i;
        this.g = bZ2.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(int i) {
        if (this.t != i) {
            this.t = i;
            s();
            r();
            this.f.p(i);
        }
    }

    @Override // defpackage.cflk
    public final void y() {
    }

    public final synchronized void l(int i) {
        int i2 = this.h;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 2) {
            if (this.f.f()) {
                this.e.add(this.f.c);
            }
            this.f.o();
        }
        u(this.e.remove(i));
        View b = this.m.b();
        if (b != null) {
            b.setVisibility(4);
        }
        this.l.B(jjn.COLLAPSED);
        t();
    }
}
