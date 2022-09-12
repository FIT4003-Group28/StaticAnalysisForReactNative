package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ssf  reason: default package */
/* loaded from: classes7.dex */
public final class ssf implements qds {
    private final btzp<djyy, djza> a;
    private final srz b;
    @dzsi
    private btzc c;

    public ssf(btzp<djyy, djza> btzpVar, srz srzVar) {
        this.a = btzpVar;
        this.b = srzVar;
    }

    @Override // defpackage.qds
    public final void a(qdq qdqVar, boolean z, degu<dopk> deguVar) {
        btzc btzcVar = this.c;
        if (btzcVar != null) {
            if (!z) {
                return;
            }
            btzcVar.a();
        }
        djyv bZ = djyy.f.bZ();
        String o = qdqVar.a().o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djyy djyyVar = (djyy) bZ.b;
        o.getClass();
        djyyVar.a |= 1;
        djyyVar.b = o;
        djyw bZ2 = djyx.c.bZ();
        dquf a = this.b.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djyx djyxVar = (djyx) bZ2.b;
        a.getClass();
        djyxVar.b = a;
        djyxVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djyy djyyVar2 = (djyy) bZ.b;
        djyx bK = bZ2.bK();
        bK.getClass();
        djyyVar2.d = bK;
        djyyVar2.a |= 4;
        dvyz bZ3 = dvzd.o.bZ();
        List<String> c = qdqVar.c();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvzd dvzdVar = (dvzd) bZ3.b;
        dvzdVar.c();
        dsod.bv(c, dvzdVar.h);
        int j = qdqVar.j();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvzd dvzdVar2 = (dvzd) bZ3.b;
        if (j != 0) {
            dvzdVar2.b = j;
            dvzdVar2.a |= 1;
            dopp bZ4 = dops.g.bZ();
            int k = qdqVar.k();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dops dopsVar = (dops) bZ4.b;
            int i = k - 1;
            if (k == 0) {
                throw null;
            }
            dopsVar.d = i;
            dopsVar.a |= 4;
            boolean booleanValue = qdqVar.d().booleanValue();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dops dopsVar2 = (dops) bZ4.b;
            dopsVar2.a |= 8;
            dopsVar2.f = booleanValue;
            List<dooj> e = qdqVar.e();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dops dopsVar3 = (dops) bZ4.b;
            dopsVar3.b();
            for (dooj doojVar : e) {
                dopsVar3.e.h(doojVar.f);
            }
            Integer i2 = qdqVar.i();
            if (i2 != null) {
                int intValue = i2.intValue();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dops dopsVar4 = (dops) bZ4.b;
                dopsVar4.a |= 1;
                dopsVar4.b = intValue;
                int intValue2 = i2.intValue();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dops dopsVar5 = (dops) bZ4.b;
                dopsVar5.a |= 2;
                dopsVar5.c = intValue2;
            }
            dops bK2 = bZ4.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvzd dvzdVar3 = (dvzd) bZ3.b;
            bK2.getClass();
            dvzdVar3.j = bK2;
            dvzdVar3.a |= 128;
            djyp bZ5 = djyq.d.bZ();
            List<doos> g = qdqVar.g();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djyq djyqVar = (djyq) bZ5.b;
            djyqVar.b();
            for (doos doosVar : g) {
                djyqVar.b.h(doosVar.c);
            }
            dhkd h = qdqVar.h();
            if (h != null) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djyq djyqVar2 = (djyq) bZ5.b;
                h.getClass();
                djyqVar2.c = h;
                djyqVar2.a |= 1;
            }
            djyq bK3 = bZ5.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvzd dvzdVar4 = (dvzd) bZ3.b;
            bK3.getClass();
            dvzdVar4.k = bK3;
            dvzdVar4.a |= 512;
            dopw bZ6 = doqa.f.bZ();
            int o2 = qdqVar.o();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            doqa doqaVar = (doqa) bZ6.b;
            int i3 = o2 - 1;
            if (o2 == 0) {
                throw null;
            }
            doqaVar.e = i3;
            doqaVar.a |= 16;
            int n = qdqVar.n();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            doqa doqaVar2 = (doqa) bZ6.b;
            int i4 = n - 1;
            if (n == 0) {
                throw null;
            }
            doqaVar2.c = i4;
            doqaVar2.a |= 4;
            int m = qdqVar.m();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            doqa doqaVar3 = (doqa) bZ6.b;
            int i5 = m - 1;
            if (m == 0) {
                throw null;
            }
            doqaVar3.b = i5;
            doqaVar3.a |= 1;
            doqa.b(doqaVar3);
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            doqa doqaVar4 = (doqa) bZ6.b;
            doqaVar4.a |= 8;
            doqaVar4.d = 30000;
            doqa bK4 = bZ6.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvzd dvzdVar5 = (dvzd) bZ3.b;
            bK4.getClass();
            dvzdVar5.l = bK4;
            dvzdVar5.a |= 1024;
            int l = qdqVar.l();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvzd dvzdVar6 = (dvzd) bZ3.b;
            int i6 = l - 1;
            if (l == 0) {
                throw null;
            }
            dvzdVar6.m = i6;
            dvzdVar6.a |= 2048;
            for (akqi akqiVar : qdqVar.b()) {
                String o3 = akqiVar.o();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dvzd dvzdVar7 = (dvzd) bZ3.b;
                o3.getClass();
                dsrj<String> dsrjVar = dvzdVar7.f;
                if (!dsrjVar.a()) {
                    dvzdVar7.f = dsqw.cl(dsrjVar);
                }
                dvzdVar7.f.add(o3);
            }
            dvzd bK5 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyy djyyVar3 = (djyy) bZ.b;
            bK5.getClass();
            djyyVar3.c = bK5;
            djyyVar3.a |= 2;
            dnqh f = qdqVar.f();
            if (f != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djyy djyyVar4 = (djyy) bZ.b;
                f.getClass();
                djyyVar4.e = f;
                djyyVar4.a |= 8;
            }
            this.c = this.a.a(bZ.bK(), new sse(this, deguVar), bvrj.UI_THREAD);
            return;
        }
        throw null;
    }

    @Override // defpackage.qds
    public final void b() {
        btzc btzcVar = this.c;
        if (btzcVar != null) {
            btzcVar.a();
            this.c = null;
        }
    }
}
