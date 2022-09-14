package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: psk  reason: default package */
/* loaded from: classes7.dex */
public final class psk {
    private static final dcqe l = dcqe.c("psk");
    public final gfw a;
    @dzsi
    public qbn b;
    @dzsi
    public brln c;
    @dzsi
    public String f;
    @dzsi
    public String g;
    @dzsi
    public dnqh h;
    public final dxio<brba> i;
    public final pso j;
    public final psn k;
    @dzsi
    private amte m;
    private boolean o;
    private final Activity p;
    private final btrm q;
    private final btvo r;
    private final dxio<broq> s;
    private final akox t;
    private final dzsj<srv> u;
    private int n = -1;
    public int d = -1;
    public int e = -1;

    public psk(psn psnVar, gfw gfwVar, Activity activity, btrm btrmVar, btvo btvoVar, dxio dxioVar, dxio dxioVar2, akox akoxVar, dzsj dzsjVar, pso psoVar) {
        this.k = psnVar;
        this.a = gfwVar;
        this.p = activity;
        this.q = btrmVar;
        this.r = btvoVar;
        this.i = dxioVar;
        this.s = dxioVar2;
        this.t = akoxVar;
        this.u = dzsjVar;
        this.j = psoVar;
    }

    private final void g() {
        if (this.o) {
            this.q.a(this);
            this.o = false;
        }
        this.b = null;
        this.d = -1;
        this.e = -1;
        this.h = null;
        this.f = null;
        this.g = null;
    }

    public final void a(vnk vnkVar) {
        vnu l2 = vnkVar.l();
        if (!vxx.d(l2.a(), this.r)) {
            this.m = null;
            this.n = -1;
            return;
        }
        amte p = l2.d().p();
        if (p == null) {
            this.m = null;
            this.n = -1;
        } else if (p.a.s() != dovb.SUCCESS) {
            this.m = null;
            this.n = -1;
        } else {
            this.m = p;
            this.n = l2.d().e();
        }
    }

    public final boolean b(vnk vnkVar, int i, String str, String str2, @dzsi dnqh dnqhVar) {
        int i2;
        d();
        if (dbsj.d(str2)) {
            return false;
        }
        dbsk.z(i, vnkVar.aw().size());
        if (!vxx.d(vnkVar.l().a(), this.r)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = i;
        for (int i4 = 0; i4 < vnkVar.aw().size(); i4++) {
            amvh amvhVar = vnkVar.aw().get(i4);
            if (i4 != i) {
                if (!amvhVar.a()) {
                    arrayList.add(amvhVar);
                } else if (i4 < i) {
                    i3--;
                }
            }
        }
        if (arrayList.size() < 2) {
            c(i, amsz.b(arrayList.isEmpty() ? null : (amvh) arrayList.get(0), i3, vnkVar.g(), vnkVar.h()), str, str2, dnqhVar);
        } else {
            dqvj g = vnkVar.g();
            dwao h = vnkVar.h();
            amte amteVar = this.m;
            if (amteVar == null || (i2 = this.n) < 0 || g != amteVar.c(i2) || !psp.c(h, this.m.i()) || !psp.d(Arrays.asList(this.m.c), arrayList)) {
                vum vumVar = new vum();
                vumVar.e = vnkVar.aM();
                vumVar.c(arrayList);
                dwao h2 = vnkVar.h();
                dsqp dsqpVar = (dsqp) h2.cu(5);
                dsqpVar.bC(h2);
                dwal dwalVar = (dwal) dsqpVar;
                dphq dphqVar = ((dwao) dwalVar.b).e;
                if (dphqVar == null) {
                    dphqVar = dphq.m;
                }
                dsqp dsqpVar2 = (dsqp) dphqVar.cu(5);
                dsqpVar2.bC(dphqVar);
                dphm dphmVar = (dphm) dsqpVar2;
                if (dphmVar.c) {
                    dphmVar.bF();
                    dphmVar.c = false;
                }
                dphq dphqVar2 = (dphq) dphmVar.b;
                dphqVar2.a |= 64;
                dphqVar2.h = false;
                dphq bK = dphmVar.bK();
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar = (dwao) dwalVar.b;
                bK.getClass();
                dwaoVar.e = bK;
                dwaoVar.a |= 1;
                vumVar.a = dwalVar.bK();
                vumVar.f = vnkVar.f();
                vumVar.g = vnkVar.u();
                vumVar.p = false;
                dnqg bZ = dnqh.p.bZ();
                int i5 = ddda.cn.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                dnqhVar2.a |= 64;
                dnqhVar2.g = i5;
                vumVar.o = bZ.bK();
                vun a = vumVar.a();
                srv a2 = this.u.a();
                if (!this.o) {
                    btrm btrmVar = this.q;
                    dceq a3 = dcet.a();
                    a3.b(srf.class, new psm(srf.class, this, bvrj.UI_THREAD));
                    btrmVar.g(this, a3.a());
                    this.o = true;
                }
                a2.k(a, false);
                this.b = a2;
                this.d = i;
                this.e = i3;
                this.f = str;
                this.g = str2;
                this.h = dnqhVar;
            } else {
                amte amteVar2 = this.m;
                dbsk.s(amteVar2);
                c(i, amsz.a(amteVar2, this.n, i3), str, str2, dnqhVar);
            }
        }
        return true;
    }

    public final void c(int i, amsz amszVar, String str, String str2, @dzsi dnqh dnqhVar) {
        dnqg dnqgVar;
        amvh d;
        this.k.a(i);
        if (dnqhVar == null) {
            dnqgVar = dnqh.p.bZ();
        } else {
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            dnqgVar = (dnqg) dsqpVar;
        }
        int i2 = ddda.cl.b;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar2 = (dnqh) dnqgVar.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i2;
        dwim bZ = dwir.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        str2.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str2;
        dhjx Z = this.t.Z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        Z.getClass();
        dwirVar2.d = Z;
        dwirVar2.a |= 2;
        dnqh bK = dnqgVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        bK.getClass();
        dwirVar3.s = bK;
        dwirVar3.a |= 33554432;
        if (amszVar.c()) {
            dodt e = psp.e(amszVar, this.p);
            if (e != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar4 = (dwir) bZ.b;
                e.getClass();
                dwirVar4.y = e;
                dwirVar4.a |= Integer.MIN_VALUE;
            } else {
                bvoo.h("SearchAlongRouteContext is null for a middle waypoint", new Object[0]);
            }
        }
        if (!amszVar.c() && (d = amszVar.d()) != null) {
            dwip bZ2 = dwiq.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwiq dwiqVar = (dwiq) bZ2.b;
            str2.getClass();
            dwiqVar.a |= 1;
            dwiqVar.b = str2;
            if (d.l()) {
                String str3 = d.c;
                dbsk.s(str3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwiq dwiqVar2 = (dwiq) bZ2.b;
                str3.getClass();
                dwiqVar2.a |= 2;
                dwiqVar2.c = str3;
            }
            if (d.m()) {
                akqi akqiVar = d.d;
                dbsk.s(akqiVar);
                String o = akqiVar.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwiq dwiqVar3 = (dwiq) bZ2.b;
                o.getClass();
                dwiqVar3.a |= 4;
                dwiqVar3.d = o;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar5 = (dwir) bZ.b;
            dwiq bK2 = bZ2.bK();
            bK2.getClass();
            dwirVar5.u = bK2;
            dwirVar5.a |= 134217728;
        }
        this.i.a().r(bZ);
        iqy iqyVar = new iqy();
        iqyVar.l = str;
        brln brlnVar = new brln(bZ.bK(), iqyVar, amszVar, psp.a(amszVar, this.p));
        brlnVar.f = new psj(this, i);
        this.c = brlnVar;
        this.j.a();
        this.s.a().a(brlnVar);
    }

    public final void d() {
        brln brlnVar = this.c;
        if (brlnVar != null) {
            this.s.a().b(brlnVar);
            this.c = null;
        }
        g();
    }

    public final void e(boolean z) {
        g();
        if (!z) {
            this.k.e();
        }
    }
}
