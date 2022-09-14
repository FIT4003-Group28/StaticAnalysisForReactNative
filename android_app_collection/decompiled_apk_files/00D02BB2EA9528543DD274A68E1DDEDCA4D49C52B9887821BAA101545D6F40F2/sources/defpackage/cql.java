package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cql  reason: default package */
/* loaded from: classes5.dex */
public final class cql {
    public final cqk a;
    public final cqat b;
    public final btrm c;
    public final bxer d;
    public final btpc e;
    @dzsi
    public String f;
    public final cqj g = new cqj(this);
    private final cqf h;
    private final dzsj<afwr> i;
    private final akpm j;
    private final bnyo k;

    public cql(cqf cqfVar, cqk cqkVar, akpm akpmVar, dzsj<afwr> dzsjVar, cqat cqatVar, btrm btrmVar, bxer bxerVar, bnyo bnyoVar, btpc btpcVar) {
        this.h = cqfVar;
        this.a = cqkVar;
        this.j = akpmVar;
        this.i = dzsjVar;
        this.b = cqatVar;
        this.d = bxerVar;
        this.c = btrmVar;
        this.k = bnyoVar;
        this.e = btpcVar;
    }

    private static void c(List<dnet> list, int i, String str) {
        dbsg<dner> d = d(i, str, null, null, null);
        if (d.a()) {
            list.add(d.b().bK());
        }
    }

    private static dbsg<dner> d(int i, String str, @dzsi dory doryVar, @dzsi String str2, @dzsi String str3) {
        if (dbsj.d(str)) {
            return dbpy.a;
        }
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = i;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        str.getClass();
        dnfeVar.a |= 2;
        dnfeVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar2 = (dnet) bZ.b;
        dnfe bK = bZ2.bK();
        bK.getClass();
        dnetVar2.d = bK;
        dnetVar2.a |= 4;
        dbsg<doru> b = bonb.b(doryVar, str2, str3);
        if (b.a()) {
            doru b2 = b.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar3 = (dnet) bZ.b;
            dorz bK2 = b2.bK();
            bK2.getClass();
            dnetVar3.e = bK2;
            dnetVar3.a |= 8;
        }
        return dbsg.i(bZ);
    }

    public final void a(String str) {
        dwbv bZ = dwbw.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbw dwbwVar = (dwbw) bZ.b;
        str.getClass();
        dwbwVar.a |= 1;
        dwbwVar.b = str;
        dhjx Z = this.j.Z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwbw dwbwVar2 = (dwbw) bZ.b;
        Z.getClass();
        dwbwVar2.c = Z;
        dwbwVar2.a |= 2;
        this.k.a(bZ.bK(), new cqh(this));
    }

    public final void b() {
        dgsl c;
        int i = this.i.a().l().d(afwm.SATELLITE) ? 3 : 2;
        dhjx Z = this.j.Z();
        int size = this.h.h.b().size() + this.h.m.d().b().size();
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = this.h.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        cqf cqfVar = this.h;
        if (cqfVar.j == null) {
            dnpy bZ2 = dnpz.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnpz dnpzVar = (dnpz) bZ2.b;
            dnpzVar.a |= 1;
            dnpzVar.b = 10433;
            deaf deafVar = deaf.UNKNOWN_ACTION;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnpz dnpzVar2 = (dnpz) bZ2.b;
            dnpzVar2.c = deafVar.Q;
            dnpzVar2.a |= 2;
            cqfVar.j = bvrt.b(bZ2.bK());
        }
        dnpz e = cqfVar.j.e((dssr) dnpz.d.cu(7), dnpz.d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar2 = (dnqe) bZ.b;
        e.getClass();
        dnqeVar2.f = e;
        int i2 = dnqeVar2.a | 32;
        dnqeVar2.a = i2;
        dnqeVar2.d = i - 1;
        int i3 = i2 | 4;
        dnqeVar2.a = i3;
        dnqeVar2.a = i3 | 64;
        dnqeVar2.g = size;
        dngl bZ3 = dngm.d.bZ();
        if (Z != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar3 = (dnqe) bZ.b;
            Z.getClass();
            dnqeVar3.e = Z;
            dnqeVar3.a |= 8;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dngm dngmVar = (dngm) bZ3.b;
            Z.getClass();
            dngmVar.c = Z;
            dngmVar.a |= 4;
        }
        dwgy bZ4 = dwgz.h.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar = (dwgz) bZ4.b;
        dnqe bK = bZ.bK();
        bK.getClass();
        dwgzVar.c = bK;
        dwgzVar.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar2 = (dwgz) bZ4.b;
        dngm bK2 = bZ3.bK();
        bK2.getClass();
        dwgzVar2.d = bK2;
        dwgzVar2.a |= 4;
        djgw a = chiw.a();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar3 = (dwgz) bZ4.b;
        a.getClass();
        dwgzVar3.e = a;
        dwgzVar3.a |= 8;
        ArrayList a2 = dchl.a();
        String c2 = this.h.a.c();
        if (c2 != null) {
            c(a2, 1, c2);
        }
        String c3 = this.h.b.c();
        if (c3 != null) {
            bokg bokgVar = this.h.b;
            dory doryVar = bokgVar.k;
            String str = bokgVar.m;
            String str2 = bokgVar.l;
            String str3 = bokgVar.c;
            Integer num = bokgVar.n;
            cpnd cpndVar = bokgVar.b;
            dbsg<dner> d = d(2, c3, doryVar, str, str2);
            if (d.a()) {
                dner b = d.b();
                dorz dorzVar = ((dnet) b.b).e;
                if (dorzVar == null) {
                    dorzVar = dorz.f;
                }
                dsqp dsqpVar = (dsqp) dorzVar.cu(5);
                dsqpVar.bC(dorzVar);
                doru doruVar = (doru) dsqpVar;
                if (str3 != null && num != null) {
                    dorv bZ5 = dorw.d.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dorw dorwVar = (dorw) bZ5.b;
                    str3.getClass();
                    dorwVar.a |= 1;
                    dorwVar.b = str3;
                    dorw.b(dorwVar);
                    int intValue = num.intValue();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dorw dorwVar2 = (dorw) bZ5.b;
                    dorwVar2.a |= 4;
                    dorwVar2.c = intValue;
                    if (doruVar.c) {
                        doruVar.bF();
                        doruVar.c = false;
                    }
                    dorz dorzVar2 = (dorz) doruVar.b;
                    dorw bK3 = bZ5.bK();
                    bK3.getClass();
                    dorzVar2.d = bK3;
                    dorzVar2.a |= 4;
                }
                bonb.a(doruVar, doryVar, cpndVar);
                if (b.c) {
                    b.bF();
                    b.c = false;
                }
                dnet dnetVar = (dnet) b.b;
                dorz bK4 = doruVar.bK();
                bK4.getClass();
                dnetVar.e = bK4;
                dnetVar.a |= 8;
                a2.add(b.bK());
            }
        }
        akqq akqqVar = this.h.c.b;
        if (akqqVar != null) {
            dner bZ6 = dnet.h.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnet dnetVar2 = (dnet) bZ6.b;
            dnetVar2.a |= 1;
            dnetVar2.b = 5;
            dneu bZ7 = dnfe.p.bZ();
            dnoh g = akqqVar.g();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ7.b;
            g.getClass();
            dnfeVar.e = g;
            dnfeVar.a |= 8;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnet dnetVar3 = (dnet) bZ6.b;
            dnfe bK5 = bZ7.bK();
            bK5.getClass();
            dnetVar3.d = bK5;
            dnetVar3.a |= 4;
            doru bZ8 = dorz.f.bZ();
            dory doryVar2 = this.h.c.f;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dorz dorzVar3 = (dorz) bZ8.b;
            dorzVar3.b = doryVar2.i;
            dorzVar3.a |= 1;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnet dnetVar4 = (dnet) bZ6.b;
            dorz bK6 = bZ8.bK();
            bK6.getClass();
            dnetVar4.e = bK6;
            dnetVar4.a |= 8;
            a2.add(bZ6.bK());
        }
        dnfw c4 = this.h.d.c();
        if (c4 != null) {
            c(a2, 14, c4.b);
        }
        String c5 = this.h.f.c();
        if (c5 != null) {
            c(a2, 3, c5);
        }
        String c6 = this.h.g.c();
        if (c6 != null) {
            c(a2, 4, c6);
        }
        byee byeeVar = this.h.e;
        if (byeeVar != null && (c = byeeVar.c()) != null && c.a.size() > 0) {
            dner bZ9 = dnet.h.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dnet dnetVar5 = (dnet) bZ9.b;
            dnetVar5.a |= 1;
            dnetVar5.b = 8;
            dneu bZ10 = dnfe.p.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dnfe dnfeVar2 = (dnfe) bZ10.b;
            c.getClass();
            dnfeVar2.l = c;
            dnfeVar2.a |= 2048;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dnet dnetVar6 = (dnet) bZ9.b;
            dnfe bK7 = bZ10.bK();
            bK7.getClass();
            dnetVar6.d = bK7;
            dnetVar6.a |= 4;
            a2.add(bZ9.bK());
        }
        boki bokiVar = this.h.o;
        if (bokiVar.b) {
            int i4 = bokiVar.e.a;
            int i5 = bokiVar.d.a;
            dgrw bZ11 = dgrz.c.bZ();
            dgsg bZ12 = dgsj.f.bZ();
            dgsa bZ13 = dgsf.i.bZ();
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            dgsf dgsfVar = (dgsf) bZ13.b;
            dgsfVar.a |= 256;
            dgsfVar.h = i4;
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dgsj dgsjVar = (dgsj) bZ12.b;
            dgsf bK8 = bZ13.bK();
            bK8.getClass();
            dgsjVar.d = bK8;
            dgsjVar.a |= 8;
            dgsa bZ14 = dgsf.i.bZ();
            int i6 = i4 + 1;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dgsf dgsfVar2 = (dgsf) bZ14.b;
            dgsfVar2.a |= 256;
            dgsfVar2.h = i6;
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dgsj dgsjVar2 = (dgsj) bZ12.b;
            dgsf bK9 = bZ14.bK();
            bK9.getClass();
            dgsjVar2.e = bK9;
            dgsjVar2.a |= 16;
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dgsj dgsjVar3 = (dgsj) bZ12.b;
            dgsjVar3.b = 2;
            dgsjVar3.a |= 1;
            bZ11.a(bZ12);
            dgsg bZ15 = dgsj.f.bZ();
            dgsa bZ16 = dgsf.i.bZ();
            int a3 = dgse.a(i5);
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dgsf dgsfVar3 = (dgsf) bZ16.b;
            if (a3 == 0) {
                throw null;
            }
            dgsfVar3.g = a3;
            dgsfVar3.a |= 128;
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dgsj dgsjVar4 = (dgsj) bZ15.b;
            dgsf bK10 = bZ16.bK();
            bK10.getClass();
            dgsjVar4.d = bK10;
            dgsjVar4.a |= 8;
            dgsa bZ17 = dgsf.i.bZ();
            int a4 = dgse.a(i5 + 1);
            if (bZ17.c) {
                bZ17.bF();
                bZ17.c = false;
            }
            dgsf dgsfVar4 = (dgsf) bZ17.b;
            if (a4 == 0) {
                throw null;
            }
            dgsfVar4.g = a4;
            dgsfVar4.a |= 128;
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dgsj dgsjVar5 = (dgsj) bZ15.b;
            dgsf bK11 = bZ17.bK();
            bK11.getClass();
            dgsjVar5.e = bK11;
            dgsjVar5.a |= 16;
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dgsj dgsjVar6 = (dgsj) bZ15.b;
            dgsjVar6.b = 2;
            dgsjVar6.a |= 1;
            bZ11.a(bZ15);
            if (bokiVar.a) {
                int i7 = bokiVar.c.a;
                dgsg bZ18 = dgsj.f.bZ();
                dgsa bZ19 = dgsf.i.bZ();
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                dgsf dgsfVar5 = (dgsf) bZ19.b;
                dgsfVar5.f = 1;
                int i8 = dgsfVar5.a | 16;
                dgsfVar5.a = i8;
                dgsfVar5.a = i8 | 8;
                dgsfVar5.e = i7;
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                dgsj dgsjVar7 = (dgsj) bZ18.b;
                dgsf bK12 = bZ19.bK();
                bK12.getClass();
                dgsjVar7.d = bK12;
                dgsjVar7.a |= 8;
                dgsa bZ20 = dgsf.i.bZ();
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                dgsf dgsfVar6 = (dgsf) bZ20.b;
                dgsfVar6.f = 1;
                int i9 = dgsfVar6.a | 16;
                dgsfVar6.a = i9;
                dgsfVar6.a = 8 | i9;
                dgsfVar6.e = i7 + 1;
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                dgsj dgsjVar8 = (dgsj) bZ18.b;
                dgsf bK13 = bZ20.bK();
                bK13.getClass();
                dgsjVar8.e = bK13;
                dgsjVar8.a |= 16;
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                dgsj dgsjVar9 = (dgsj) bZ18.b;
                dgsjVar9.b = 2;
                dgsjVar9.a |= 1;
                bZ11.a(bZ18);
            }
            dner bZ21 = dnet.h.bZ();
            if (bZ21.c) {
                bZ21.bF();
                bZ21.c = false;
            }
            dnet dnetVar7 = (dnet) bZ21.b;
            dnetVar7.a |= 1;
            dnetVar7.b = 40;
            dneu bZ22 = dnfe.p.bZ();
            dgsk bZ23 = dgsl.b.bZ();
            bZ23.a(bZ11);
            if (bZ22.c) {
                bZ22.bF();
                bZ22.c = false;
            }
            dnfe dnfeVar3 = (dnfe) bZ22.b;
            dgsl bK14 = bZ23.bK();
            bK14.getClass();
            dnfeVar3.l = bK14;
            dnfeVar3.a |= 2048;
            if (bZ21.c) {
                bZ21.bF();
                bZ21.c = false;
            }
            dnet dnetVar8 = (dnet) bZ21.b;
            dnfe bK15 = bZ22.bK();
            bK15.getClass();
            dnetVar8.d = bK15;
            dnetVar8.a = 4 | dnetVar8.a;
            a2.add(bZ21.bK());
        }
        ArrayList arrayList = new ArrayList();
        for (dnzx dnzxVar : this.h.n.e((dssr) dwhd.h.cu(7), dwhd.h).g) {
            dnix bZ24 = dniy.c.bZ();
            String str4 = dnzxVar.a;
            if (bZ24.c) {
                bZ24.bF();
                bZ24.c = false;
            }
            dniy dniyVar = (dniy) bZ24.b;
            str4.getClass();
            dniyVar.a |= 1;
            dniyVar.b = str4;
            arrayList.add(bZ24.bK());
        }
        doaq bZ25 = doar.c.bZ();
        dniw bZ26 = dniz.f.bZ();
        bZ26.a(a2);
        if (bZ26.c) {
            bZ26.bF();
            bZ26.c = false;
        }
        dniz dnizVar = (dniz) bZ26.b;
        dsrj<dniy> dsrjVar = dnizVar.e;
        if (!dsrjVar.a()) {
            dnizVar.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, dnizVar.e);
        if (bZ25.c) {
            bZ25.bF();
            bZ25.c = false;
        }
        doar doarVar = (doar) bZ25.b;
        dniz bK16 = bZ26.bK();
        bK16.getClass();
        doarVar.b = bK16;
        doarVar.a |= 1;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar4 = (dwgz) bZ4.b;
        doar bK17 = bZ25.bK();
        bK17.getClass();
        dwgzVar4.b = bK17;
        dwgzVar4.a |= 1;
        dobs bZ27 = dobt.c.bZ();
        if (bZ27.c) {
            bZ27.bF();
            bZ27.c = false;
        }
        dobt dobtVar = (dobt) bZ27.b;
        dobtVar.a |= 1;
        dobtVar.b = true;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar5 = (dwgz) bZ4.b;
        dobt bK18 = bZ27.bK();
        bK18.getClass();
        dwgzVar5.f = bK18;
        dwgzVar5.a |= 32;
        this.k.a(bZ4.bK(), new cqi(this));
    }
}
