package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ared  reason: default package */
/* loaded from: classes2.dex */
public final class ared implements btzi<dvct, dvcx> {
    private static final dcqe k = dcqe.c("ared");
    private static final long l = TimeUnit.MINUTES.toMillis(1);
    private static final long m = TimeUnit.MINUTES.toMillis(1);
    private final buqd A;
    @dzsi
    public final btlu a;
    public final bwrs<arfk> b;
    public final bvjj d;
    public boolean e;
    public boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public boolean i;
    @dzsi
    public dvcx j;
    private final String n;
    private final dwyb o;
    private final boolean p;
    private final dvct q;
    private final arej r;
    private final Activity s;
    private final akox t;
    private final bvrb u;
    private final cqat v;
    private final arfm w;
    private dvct x;
    public final Map<String, amml> c = dcjz.d();
    private long y = -1;
    private final Runnable z = new arec(this);

    public ared(Activity activity, buqd buqdVar, bvjj bvjjVar, bvrb bvrbVar, cqat cqatVar, akox akoxVar, btlu btluVar, dwyb dwybVar, bwrs bwrsVar, boolean z, boolean z2, dvct dvctVar, dvcx dvcxVar, arfm arfmVar, arej arejVar) {
        this.a = btluVar;
        this.n = dwybVar.b;
        this.o = dwybVar;
        this.b = bwrsVar;
        this.g = z;
        this.p = z2;
        this.q = dvctVar;
        if (dvcxVar != null) {
            if (dvctVar == null) {
                bvoo.h("An initial request must be provided.", new Object[0]);
            }
            this.j = dvcxVar;
        }
        this.r = arejVar;
        this.s = activity;
        this.t = akoxVar;
        this.u = bvrbVar;
        this.v = cqatVar;
        this.A = buqdVar;
        this.d = bvjjVar;
        this.w = arfmVar;
    }

    public static dwyb c(String str) {
        dwya bZ = dwyb.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyb dwybVar = (dwyb) bZ.b;
        str.getClass();
        int i = dwybVar.a | 1;
        dwybVar.a = i;
        dwybVar.b = str;
        dwybVar.a = i | 2;
        dwybVar.c = true;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static ared l(Activity activity, akox akoxVar, bvrb bvrbVar, cqat cqatVar, buqd buqdVar, bvjj bvjjVar, arfm arfmVar, @dzsi btlu btluVar, bwrs<arfk> bwrsVar, arej arejVar) {
        dwyb dwybVar = (dwyb) bvjjVar.N(bvjk.fa, btluVar, (dssr) dwyb.e.cu(7), null);
        if (dwybVar == null) {
            return null;
        }
        return new ared(activity, buqdVar, bvjjVar, bvrbVar, cqatVar, akoxVar, btluVar, dwybVar, bwrsVar, false, false, null, null, arfmVar, arejVar);
    }

    private final void m(@dzsi dvcx dvcxVar, @dzsi bttq bttqVar) {
        arfk arfkVar;
        boolean z;
        if (this.f) {
            return;
        }
        arfi a = arfi.a(bttqVar, dvcxVar);
        if (a.a != null || a.b != dvcw.SUCCESS) {
            this.b.d(arfk.c(this.n, a));
            if (n()) {
                this.w.G();
                this.r.a(R.string.MY_MAPS_ERROR_REFRESHING_MAP_TITLE, a.e(), a.c());
                return;
            } else if (this.p) {
                this.w.s();
                return;
            } else {
                this.w.G();
                if (a.c() || a.e() != null) {
                    this.r.a(R.string.MY_MAPS_ERROR_RESTORING_MAP_TITLE, a.e(), a.c());
                    return;
                } else {
                    this.w.k();
                    return;
                }
            }
        }
        arfk c = this.b.c();
        if (c.c == arfj.MAP_LOADED) {
            dbsk.l(c.c == arfj.MAP_LOADED);
            dbsk.s(dvcxVar);
            dcdg p = dcdn.p();
            dvcr dvcrVar = dvcxVar.b;
            if (dvcrVar == null) {
                dvcrVar = dvcr.h;
            }
            for (dvcl dvclVar : dvcrVar.e) {
                dxdm dxdmVar = dvclVar.b;
                if (dxdmVar == null) {
                    dxdmVar = dxdm.e;
                }
                String str = dxdmVar.d;
                if (c.g.containsKey(str)) {
                    z = c.g.get(str).booleanValue();
                } else {
                    z = dvclVar.d;
                }
                p.f(str, Boolean.valueOf(z));
            }
            arfkVar = new arfk(arfj.MAP_LOADED, c.d, dvcxVar, c.f, p.b());
        } else {
            arfkVar = arfk.b(this.o, dvcxVar);
        }
        this.b.d(arfkVar);
        i();
        int i = 0;
        while (true) {
            dvcr dvcrVar2 = dvcxVar.b;
            if (dvcrVar2 == null) {
                dvcrVar2 = dvcr.h;
            }
            if (i >= dvcrVar2.e.size()) {
                break;
            }
            dvcr dvcrVar3 = dvcxVar.b;
            if (dvcrVar3 == null) {
                dvcrVar3 = dvcr.h;
            }
            dvcl dvclVar2 = dvcrVar3.e.get(i);
            dxdm dxdmVar2 = dvclVar2.b;
            if (dxdmVar2 == null) {
                dxdmVar2 = dxdm.e;
            }
            String str2 = dxdmVar2.d;
            dxdm dxdmVar3 = dvclVar2.b;
            if (dxdmVar3 == null) {
                dxdmVar3 = dxdm.e;
            }
            dsqp dsqpVar = (dsqp) dxdmVar3.cu(5);
            dsqpVar.bC(dxdmVar3);
            dxdl dxdlVar = (dxdl) dsqpVar;
            dxdn bZ = dxdo.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxdo dxdoVar = (dxdo) bZ.b;
            dxdoVar.a |= 1;
            dxdoVar.b = "z_order";
            String num = Integer.toString(i);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxdo dxdoVar2 = (dxdo) bZ.b;
            num.getClass();
            dxdoVar2.a |= 2;
            dxdoVar2.c = num;
            if (dxdlVar.c) {
                dxdlVar.bF();
                dxdlVar.c = false;
            }
            dxdm dxdmVar4 = (dxdm) dxdlVar.b;
            dxdo bK = bZ.bK();
            bK.getClass();
            dsrj<dxdo> dsrjVar = dxdmVar4.c;
            if (!dsrjVar.a()) {
                dxdmVar4.c = dsqw.cl(dsrjVar);
            }
            dxdmVar4.c.add(bK);
            akox akoxVar = this.t;
            Resources resources = this.s.getResources();
            dxdm dxdmVar5 = dvclVar2.b;
            if (dxdmVar5 == null) {
                dxdmVar5 = dxdm.e;
            }
            akrw akrwVar = new akrw("mymaps." + dxdmVar5.b, akry.MY_MAPS_TILE_OVERLAY);
            alyk q = alyl.q();
            ((alvg) q).c = dxdlVar.bK();
            this.c.put(str2, akoxVar.L(resources, akrwVar, q.b()));
            j(str2);
            i++;
        }
        if (!n() && this.g) {
            k(dvcxVar);
        }
        this.y = this.v.b();
        this.j = dvcxVar;
        g();
    }

    private final boolean n() {
        return this.y != -1;
    }

    private static String o(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "mm_".concat(valueOf) : new String("mm_");
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvct> btzrVar, btzy btzyVar) {
        m(null, btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvct> btzrVar, dvcx dvcxVar) {
        m(dvcxVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        bvrj.UI_THREAD.c();
        dbsk.l(!this.e);
        dbsk.l(!this.f);
        this.e = true;
        dvct dvctVar = this.q;
        if (dvctVar == null) {
            dvctVar = arhe.a(this.s, this.n, this.t.Z());
        }
        this.x = dvctVar;
        if (n() || this.j == null) {
            this.b.d(arfk.a(this.n));
            e(true);
            return;
        }
        this.b.d(arfk.a(this.n));
        m(this.j, null);
    }

    public final void e(boolean z) {
        buqd buqdVar = this.A;
        dvct dvctVar = this.x;
        dsqp dsqpVar = (dsqp) dvctVar.cu(5);
        dsqpVar.bC(dvctVar);
        dvcs dvcsVar = (dvcs) dsqpVar;
        boolean z2 = z && this.p;
        if (dvcsVar.c) {
            dvcsVar.bF();
            dvcsVar.c = false;
        }
        dvct dvctVar2 = (dvct) dvcsVar.b;
        dvct dvctVar3 = dvct.f;
        dvctVar2.a |= 8;
        dvctVar2.e = z2;
        buqdVar.a(dvcsVar.bK(), this, bvrj.UI_THREAD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.h = false;
        g();
    }

    public final void g() {
        dvcx dvcxVar;
        if (!this.h || (dvcxVar = this.j) == null) {
            return;
        }
        dvcr dvcrVar = dvcxVar.b;
        if (dvcrVar == null) {
            dvcrVar = dvcr.h;
        }
        long j = Long.MAX_VALUE;
        for (dvcl dvclVar : dvcrVar.e) {
            if ((dvclVar.a & 2) != 0) {
                j = Math.min(j, dvclVar.c);
            }
        }
        long max = j == Long.MAX_VALUE ? -1L : Math.max(l, j - m) + this.y;
        if (max <= 0) {
            return;
        }
        this.u.a(this.z, bvrj.BACKGROUND_THREADPOOL, Math.max(0L, max - this.v.b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        bvjj bvjjVar = this.d;
        bvjk bvjkVar = bvjk.fa;
        btlu btluVar = this.a;
        arfk c = this.b.c();
        dwyb dwybVar = null;
        if (c.c != arfj.NO_MAP && (c.c != arfj.FAILED_TO_LOAD || c.e.c())) {
            dwya bZ = dwyb.e.bZ();
            String str = c.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwyb dwybVar2 = (dwyb) bZ.b;
            str.getClass();
            int i = dwybVar2.a | 1;
            dwybVar2.a = i;
            dwybVar2.b = str;
            boolean z = c.f;
            dwybVar2.a = i | 2;
            dwybVar2.c = z;
            dcpd<Map.Entry<String, Boolean>> it = c.g.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Boolean> next = it.next();
                String key = next.getKey();
                dwxy bZ2 = dwxz.d.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwxz dwxzVar = (dwxz) bZ2.b;
                key.getClass();
                dwxzVar.a |= 1;
                dwxzVar.b = key;
                boolean booleanValue = next.getValue().booleanValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwxz dwxzVar2 = (dwxz) bZ2.b;
                dwxzVar2.a |= 2;
                dwxzVar2.c = booleanValue;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwyb dwybVar3 = (dwyb) bZ.b;
                dwxz bK = bZ2.bK();
                bK.getClass();
                dsrj<dwxz> dsrjVar = dwybVar3.d;
                if (!dsrjVar.a()) {
                    dwybVar3.d = dsqw.cl(dsrjVar);
                }
                dwybVar3.d.add(bK);
            }
            dwybVar = bZ.bK();
        }
        bvjjVar.am(bvjkVar, btluVar, dwybVar);
    }

    public final void i() {
        if (this.t != null) {
            for (String str : this.c.keySet()) {
                this.t.Q(o(str));
            }
        }
        this.c.clear();
    }

    public final void j(String str) {
        amml ammlVar = this.c.get(str);
        boolean z = false;
        if (this.b.c().d(str) && !this.i) {
            z = true;
        }
        String o = o(str);
        if (z) {
            this.t.O(o, ammlVar);
        } else {
            this.t.Q(o);
        }
    }

    public final void k(dvcx dvcxVar) {
        dvcr dvcrVar = dvcxVar.b;
        if (dvcrVar == null) {
            dvcrVar = dvcr.h;
        }
        if ((dvcrVar.a & 8) != 0) {
            dvcr dvcrVar2 = dvcxVar.b;
            if (dvcrVar2 == null) {
                dvcrVar2 = dvcr.h;
            }
            dhjx dhjxVar = dvcrVar2.d;
            if (dhjxVar == null) {
                dhjxVar = dhjx.f;
            }
            alad c = alad.c(dhjxVar);
            alaa b = alad.b(c);
            b.c = Math.max(2.0f, c.k - 0.5f);
            this.t.p(akyt.e(b.a()));
        }
    }
}
