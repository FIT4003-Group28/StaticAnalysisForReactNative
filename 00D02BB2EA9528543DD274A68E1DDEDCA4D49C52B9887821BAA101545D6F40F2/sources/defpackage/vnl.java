package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vnl  reason: default package */
/* loaded from: classes7.dex */
public final class vnl implements qcy<vnk> {
    private static final dcqe a = dcqe.c("vnl");
    private final qbj b;
    private final dxio<qbt> c;
    private final bvjj d;
    private final vxa e;
    private final vmz f;
    private final vxl g;

    public vnl(qbj qbjVar, dxio<qbt> dxioVar, bvjj bvjjVar, vxa vxaVar, vmz vmzVar, vxl vxlVar) {
        this.b = qbjVar;
        this.c = dxioVar;
        this.d = bvjjVar;
        this.e = vxaVar;
        this.f = vmzVar;
        this.g = vxlVar;
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ vnk a(qct qctVar) {
        qbn n = qctVar.n();
        dbsk.s(n);
        qbm a2 = n.a();
        dbsk.l(!a2.a());
        dbsk.l(a2.f());
        vxa vxaVar = this.e;
        vnk vnkVar = new vnk(this.f.a());
        synchronized (vnkVar) {
            vnkVar.J(a2.i());
            amvj.k(vnkVar.a.size());
            vun g = a2.g();
            dbsk.s(g);
            dwao dwaoVar = g.b;
            dqvj l = a2.l();
            dbsk.s(l);
            vnkVar.b = bvrt.b(vnk.a(dwaoVar, l));
            vnkVar.h = g;
            vnkVar.c = g.d;
            vnkVar.d = g.e;
            vnkVar.e = g.f;
            vnkVar.f = g.i;
            amte n2 = a2.n();
            vnkVar.aB(n2);
            vnkVar.g = bvrt.a(g.n);
            if (n2 != null) {
                vnkVar.j = bvrt.b(n2.a.g());
            }
        }
        dwao d = vxaVar.d(vnkVar.h(), vnkVar.g(), 3, vul.DIRECTIONS_UI);
        vnkVar.T(qctVar.m());
        vnkVar.R(d);
        if (qctVar.i()) {
            vnkVar.C(vnkVar.aw().size() - 1);
        }
        vnkVar.W(qctVar.f());
        vnkVar.O(qctVar.g());
        vnkVar.Y(qctVar.h());
        vnkVar.ac(qctVar.k());
        vnkVar.bb(qctVar.o());
        vnkVar.bf(qctVar.b());
        vnkVar.bg(qctVar.q());
        vnkVar.bd(qctVar.p());
        vnkVar.M(qctVar.r());
        vnkVar.N(yze.b(d));
        vnkVar.Q(qctVar.s());
        return vnkVar;
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ vnk b(qcx qcxVar) {
        dqvj a2 = this.g.a(qcxVar.f(), this.b.a());
        if (qcxVar.q() && a2 != dqvj.TWO_WHEELER) {
            bvoo.h("[b/167589309] Attempting to show the hidden 2W promo with incorrect travelMode: %s", a2);
        }
        dwao d = this.e.d(qcxVar.y(), a2, 3, vul.DIRECTIONS_UI);
        List<dqvj> j = this.c.a().j();
        dccx F = dcdc.F();
        dcdc<vnu> a3 = this.f.a();
        int size = a3.size();
        for (int i = 0; i < size; i++) {
            vnu vnuVar = a3.get(i);
            dqvj a4 = vnuVar.a();
            if (j.contains(a4) || a4 == a2) {
                F.g(vnuVar);
            }
        }
        dcdc f = F.f();
        amvh g = qcxVar.g();
        dcdc<amvh> h = qcxVar.h();
        if (h.isEmpty()) {
            h = dcdc.f(amvh.a);
        }
        if (g == null) {
            g = this.b.f(h.get(0));
        }
        dccx F2 = dcdc.F();
        F2.g(g);
        F2.i(h);
        dcdc f2 = F2.f();
        dowa a5 = bvsl.a(this.d);
        vnk vnkVar = new vnk(f);
        synchronized (vnkVar) {
            vnkVar.T(qcxVar.m());
            vnkVar.R(d);
            vnkVar.S(f);
            vnkVar.J(f2);
            vnkVar.c = a5;
            vnkVar.d = qcxVar.i();
            vnkVar.e = qcxVar.j();
            vnkVar.f = qcxVar.k();
            if (qcxVar.a().a()) {
                vnkVar.ay(qcxVar.a().b());
            }
            vnkVar.i = qcxVar.b();
            vnkVar.M(qcxVar.z());
            vnkVar.N(yze.b(d));
            vnkVar.O(qcxVar.q());
            dcpd<dpjs> it = qcxVar.o().iterator();
            while (it.hasNext()) {
                vnkVar.aa(it.next());
            }
            int t = qcxVar.t();
            int i2 = t - 1;
            if (t == 0) {
                throw null;
            }
            if (i2 == 1) {
                vnkVar.aP(vni.TRAIN);
            }
            vnkVar.bi(qcxVar.e());
            vnkVar.bk(qcxVar.r());
        }
        return vnkVar;
    }
}
