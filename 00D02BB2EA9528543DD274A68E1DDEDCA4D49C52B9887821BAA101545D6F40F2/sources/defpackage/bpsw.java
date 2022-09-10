package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpsw  reason: default package */
/* loaded from: classes4.dex */
public class bpsw {
    public final akpm a;
    private final dxio<afwr> b;

    public bpsw(akpm akpmVar, dxio<afwr> dxioVar) {
        this.a = akpmVar;
        this.b = dxioVar;
    }

    public static dnqe b(dnqe dnqeVar, int i, dwgy dwgyVar) {
        dnqb b = dnqb.b(dnqeVar.b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        if (b == dnqb.NOTIFICATION) {
            b = dnqb.ADD_INFO_LINK;
        }
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqeVar2.b = b.ah;
        int i2 = 1;
        dnqeVar2.a |= 1;
        dnqe dnqeVar3 = ((dwgz) dwgyVar.b).c;
        if (dnqeVar3 == null) {
            dnqeVar3 = dnqe.i;
        }
        int a = dnqd.a(dnqeVar3.d);
        if (a != 0) {
            i2 = a;
        }
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar4 = (dnqe) dnpsVar.b;
        dnqeVar4.d = i2 - 1;
        dnqeVar4.a |= 4;
        dnqe dnqeVar5 = ((dwgz) dwgyVar.b).c;
        if (dnqeVar5 == null) {
            dnqeVar5 = dnqe.i;
        }
        dhjx dhjxVar = dnqeVar5.e;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar6 = (dnqe) dnpsVar.b;
        dhjxVar.getClass();
        dnqeVar6.e = dhjxVar;
        int i3 = dnqeVar6.a | 8;
        dnqeVar6.a = i3;
        dnqeVar6.a = i3 | 64;
        dnqeVar6.g = i;
        return dnpsVar.bK();
    }

    static void f(List<dnet> list, int i, bowr bowrVar) {
        if (!bowrVar.a()) {
            return;
        }
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = i;
        list.add(bZ.bK());
    }

    static dnet g(dnet dnetVar, bokk bokkVar) {
        String c = bokkVar.c();
        if (!dbsj.d(c)) {
            dsqp dsqpVar = (dsqp) dnetVar.cu(5);
            dsqpVar.bC(dnetVar);
            dner dnerVar = (dner) dsqpVar;
            if (dnerVar.c) {
                dnerVar.bF();
                dnerVar.c = false;
            }
            dnet dnetVar2 = (dnet) dnerVar.b;
            dnet dnetVar3 = dnet.h;
            c.getClass();
            dnetVar2.a |= 16;
            dnetVar2.f = c;
            return dnerVar.bK();
        }
        return dnetVar;
    }

    public static dgsf h(eaol eaolVar) {
        dgsa bZ = dgsf.i.bZ();
        int E = eaolVar.E();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsf dgsfVar = (dgsf) bZ.b;
        dgsfVar.a |= 1;
        dgsfVar.b = E;
        int D = eaolVar.D();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsf dgsfVar2 = (dgsf) bZ.b;
        dgsfVar2.a |= 2;
        dgsfVar2.c = D;
        int C = eaolVar.C();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsf dgsfVar3 = (dgsf) bZ.b;
        dgsfVar3.a |= 4;
        dgsfVar3.d = C;
        dgsf dgsfVar4 = (dgsf) bZ.b;
        dgsfVar4.f = 1;
        dgsfVar4.a |= 16;
        int A = eaolVar.A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsf dgsfVar5 = (dgsf) bZ.b;
        dgsfVar5.a |= 8;
        dgsfVar5.e = A;
        int a = dgse.a(eaolVar.z());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgsf dgsfVar6 = (dgsf) bZ.b;
        if (a != 0) {
            dgsfVar6.g = a;
            dgsfVar6.a |= 128;
            int y = eaolVar.y();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgsf dgsfVar7 = (dgsf) bZ.b;
            dgsfVar7.a |= 256;
            dgsfVar7.h = y;
            return bZ.bK();
        }
        throw null;
    }

    static final void i(ArrayList<dnet> arrayList, bowr bowrVar) {
        if (!bowrVar.a()) {
            return;
        }
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = 9;
        dneu bZ2 = dnfe.p.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnfe dnfeVar = (dnfe) bZ2.b;
        dnfeVar.a |= 4;
        dnfeVar.d = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar2 = (dnet) bZ.b;
        dnfe bK = bZ2.bK();
        bK.getClass();
        dnetVar2.c = bK;
        dnetVar2.a |= 2;
        dneu bZ3 = dnfe.p.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnfe dnfeVar2 = (dnfe) bZ3.b;
        dnfeVar2.a |= 4;
        dnfeVar2.d = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar3 = (dnet) bZ.b;
        dnfe bK2 = bZ3.bK();
        bK2.getClass();
        dnetVar3.d = bK2;
        dnetVar3.a |= 4;
        arrayList.add(bZ.bK());
    }

    static final void j(List<dnet> list, int i, bokk bokkVar) {
        if (!bokkVar.h.booleanValue()) {
            return;
        }
        list.add(k(i, bokkVar).bK());
    }

    private static dner k(int i, bokk bokkVar) {
        dner bZ = dnet.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnet dnetVar = (dnet) bZ.b;
        dnetVar.a |= 1;
        dnetVar.b = i;
        String str = bokkVar.e;
        String c = bokkVar.c();
        String str2 = bokkVar.g;
        if (!dbsj.d(str)) {
            dneu bZ2 = dnfe.p.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ2.b;
            str.getClass();
            dnfeVar.a |= 2;
            dnfeVar.c = str;
            if (!dbsj.d(str2)) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnfe dnfeVar2 = (dnfe) bZ2.b;
                str2.getClass();
                dnfeVar2.a |= 16384;
                dnfeVar2.n = str2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar2 = (dnet) bZ.b;
            dnfe bK = bZ2.bK();
            bK.getClass();
            dnetVar2.c = bK;
            dnetVar2.a |= 2;
        }
        if (!dbsj.d(c)) {
            dneu bZ3 = dnfe.p.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnfe dnfeVar3 = (dnfe) bZ3.b;
            c.getClass();
            dnfeVar3.a |= 2;
            dnfeVar3.c = c;
            if (!dbsj.d(str2)) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dnfe dnfeVar4 = (dnfe) bZ3.b;
                str2.getClass();
                dnfeVar4.a |= 16384;
                dnfeVar4.n = str2;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnet dnetVar3 = (dnet) bZ.b;
            dnfe bK2 = bZ3.bK();
            bK2.getClass();
            dnetVar3.d = bK2;
            dnetVar3.a |= 4;
        }
        return bZ;
    }

    private static bokk l(bowv bowvVar) {
        dodb c = bowvVar.c();
        dbsk.s(c);
        bokk bokkVar = bowvVar.e().get(c.b);
        dbsk.s(bokkVar);
        return bokkVar;
    }

    public final dwgy a(@dzsi akqq akqqVar, cjqm cjqmVar, dniw dniwVar, @dzsi dodb dodbVar, bokk bokkVar, List<bpsv> list, @dzsi String str, boolean z) {
        dhjx Z = this.a.Z();
        int i = this.b.a().l().d(afwm.SATELLITE) ? 3 : 2;
        dngl bZ = dngm.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dngm dngmVar = (dngm) bZ.b;
        Z.getClass();
        dngmVar.c = Z;
        dngmVar.a |= 4;
        if (akqqVar != null) {
            dnoh g = akqqVar.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dngm dngmVar2 = (dngm) bZ.b;
            g.getClass();
            dngmVar2.b = g;
            dngmVar2.a |= 2;
        }
        ArrayList arrayList = new ArrayList();
        if (dodbVar == null) {
            String str2 = bokkVar.d.booleanValue() ? bokkVar.e : null;
            for (bpsv bpsvVar : list) {
                if (!dbsj.d(bpsvVar.a())) {
                    dnip bZ2 = dniu.i.bZ();
                    String a = bpsvVar.a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dniu dniuVar = (dniu) bZ2.b;
                    a.getClass();
                    int i2 = dniuVar.a | 1;
                    dniuVar.a = i2;
                    dniuVar.b = a;
                    Z.getClass();
                    dniuVar.e = Z;
                    dniuVar.a = i2 | 16;
                    String b = bpsvVar.b();
                    if (!dbsj.d(str2)) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dniu dniuVar2 = (dniu) bZ2.b;
                        str2.getClass();
                        dniuVar2.a |= 4;
                        dniuVar2.d = str2;
                    } else if (z && !dbsj.d(b)) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dniu dniuVar3 = (dniu) bZ2.b;
                        b.getClass();
                        dniuVar3.a |= 4;
                        dniuVar3.d = b;
                    } else if (!dbsj.d(str)) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dniu dniuVar4 = (dniu) bZ2.b;
                        str.getClass();
                        dniuVar4.a |= 4;
                        dniuVar4.d = str;
                        arrayList.add(bZ2.bK());
                    }
                    arrayList.add(bZ2.bK());
                }
            }
        } else {
            String str3 = (!bokkVar.d.booleanValue() || dbsj.d(bokkVar.e)) ? dodbVar.c : bokkVar.e;
            dnip bZ3 = dniu.i.bZ();
            String str4 = dodbVar.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dniu dniuVar5 = (dniu) bZ3.b;
            str4.getClass();
            int i3 = dniuVar5.a | 1;
            dniuVar5.a = i3;
            dniuVar5.b = str4;
            Z.getClass();
            dniuVar5.e = Z;
            int i4 = i3 | 16;
            dniuVar5.a = i4;
            str3.getClass();
            dniuVar5.a = i4 | 4;
            dniuVar5.d = str3;
            arrayList.add(bZ3.bK());
        }
        int size = arrayList.size();
        if (size == 1) {
            dniu dniuVar6 = (dniu) arrayList.get(0);
            if (dniwVar.c) {
                dniwVar.bF();
                dniwVar.c = false;
            }
            dniz dnizVar = (dniz) dniwVar.b;
            dniz dnizVar2 = dniz.f;
            dniuVar6.getClass();
            dnizVar.b = dniuVar6;
            dnizVar.a |= 1;
        } else if (size > 0 && z) {
            if (dniwVar.c) {
                dniwVar.bF();
                dniwVar.c = false;
            }
            dniz dnizVar3 = (dniz) dniwVar.b;
            dniz dnizVar4 = dniz.f;
            dnizVar3.b();
            dsod.bv(arrayList, dnizVar3.c);
        }
        dwgy bZ4 = dwgz.h.bZ();
        doaq bZ5 = doar.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        doar doarVar = (doar) bZ5.b;
        dniz bK = dniwVar.bK();
        bK.getClass();
        doarVar.b = bK;
        doarVar.a |= 1;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar = (dwgz) bZ4.b;
        doar bK2 = bZ5.bK();
        bK2.getClass();
        dwgzVar.b = bK2;
        dwgzVar.a |= 1;
        dnps bZ6 = dnqe.i.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ6.b;
        dnqeVar.d = i - 1;
        int i5 = dnqeVar.a | 4;
        dnqeVar.a = i5;
        Z.getClass();
        dnqeVar.e = Z;
        dnqeVar.a = i5 | 8;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar2 = (dwgz) bZ4.b;
        dnqe bK3 = bZ6.bK();
        bK3.getClass();
        dwgzVar2.c = bK3;
        dwgzVar2.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar3 = (dwgz) bZ4.b;
        dngm bK4 = bZ.bK();
        bK4.getClass();
        dwgzVar3.d = bK4;
        dwgzVar3.a |= 4;
        djgw a2 = chiw.a();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwgz dwgzVar4 = (dwgz) bZ4.b;
        a2.getClass();
        dwgzVar4.e = a2;
        dwgzVar4.a |= 8;
        if (cjqmVar.a().a()) {
            dnqg bZ7 = dnqh.p.bZ();
            String b2 = cjqmVar.a().b();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ7.b;
            b2.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b2;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dwgz dwgzVar5 = (dwgz) bZ4.b;
            dnqh bK5 = bZ7.bK();
            bK5.getClass();
            dwgzVar5.g = bK5;
            dwgzVar5.a |= 64;
        }
        return bZ4;
    }

    public final dwgz c(bowv bowvVar, cjqm cjqmVar) {
        dgsl c;
        dodb dodbVar;
        ArrayList a = dchl.a();
        if (bowvVar.l.b.booleanValue() || !bowvVar.l.a()) {
            if (!bowvVar.b()) {
                j(a, 1, bowvVar.b);
            } else {
                j(a, 1, l(bowvVar));
            }
            j(a, 35, bowvVar.c);
            j(a, 36, bowvVar.d);
            bokg bokgVar = bowvVar.e;
            if (bokgVar.h.booleanValue()) {
                dner k = k(2, bokgVar);
                dbsg<doru> b = bonb.b(bokgVar.k, bokgVar.m, bokgVar.l);
                if (!b.a()) {
                    a.add(k.bK());
                } else {
                    doru b2 = b.b();
                    String str = bokgVar.c;
                    Integer num = bokgVar.n;
                    if (str != null && num != null) {
                        dorv bZ = dorw.d.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dorw dorwVar = (dorw) bZ.b;
                        str.getClass();
                        dorwVar.a |= 1;
                        dorwVar.b = str;
                        dorw.b(dorwVar);
                        int intValue = num.intValue();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dorw dorwVar2 = (dorw) bZ.b;
                        dorwVar2.a |= 4;
                        dorwVar2.c = intValue;
                        if (b2.c) {
                            b2.bF();
                            b2.c = false;
                        }
                        dorz dorzVar = (dorz) b2.b;
                        dorw bK = bZ.bK();
                        dorz dorzVar2 = dorz.f;
                        bK.getClass();
                        dorzVar.d = bK;
                        dorzVar.a |= 4;
                    }
                    bonb.a(b2, bokgVar.k, bokgVar.b);
                    if (k.c) {
                        k.bF();
                        k.c = false;
                    }
                    dnet dnetVar = (dnet) k.b;
                    dorz bK2 = b2.bK();
                    dnet dnetVar2 = dnet.h;
                    bK2.getClass();
                    dnetVar.e = bK2;
                    dnetVar.a |= 8;
                    a.add(k.bK());
                }
            }
            bows bowsVar = bowvVar.p;
            boolean z = bowvVar.e.h.booleanValue() && bowvVar.h();
            if (bowsVar.e.booleanValue() || z) {
                akqq akqqVar = bowsVar.e.booleanValue() ? bowsVar.a : null;
                dner bZ2 = dnet.h.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnet dnetVar3 = (dnet) bZ2.b;
                dnetVar3.a |= 1;
                dnetVar3.b = 5;
                if (akqqVar != null) {
                    dneu bZ3 = dnfe.p.bZ();
                    dnog bZ4 = dnoh.d.bZ();
                    double d = akqqVar.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnoh dnohVar = (dnoh) bZ4.b;
                    int i = dnohVar.a | 1;
                    dnohVar.a = i;
                    dnohVar.b = d;
                    double d2 = akqqVar.b;
                    dnohVar.a = i | 2;
                    dnohVar.c = d2;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dnfe dnfeVar = (dnfe) bZ3.b;
                    dnoh bK3 = bZ4.bK();
                    bK3.getClass();
                    dnfeVar.e = bK3;
                    dnfeVar.a |= 8;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnet dnetVar4 = (dnet) bZ2.b;
                    dnfe bK4 = bZ3.bK();
                    bK4.getClass();
                    dnetVar4.c = bK4;
                    dnetVar4.a |= 2;
                }
                akqq akqqVar2 = bowsVar.e.booleanValue() ? bowsVar.b : bowsVar.a;
                if (akqqVar2 != null) {
                    dneu bZ5 = dnfe.p.bZ();
                    dnog bZ6 = dnoh.d.bZ();
                    double d3 = akqqVar2.a;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dnoh dnohVar2 = (dnoh) bZ6.b;
                    int i2 = dnohVar2.a | 1;
                    dnohVar2.a = i2;
                    dnohVar2.b = d3;
                    double d4 = akqqVar2.b;
                    dnohVar2.a = i2 | 2;
                    dnohVar2.c = d4;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dnfe dnfeVar2 = (dnfe) bZ5.b;
                    dnoh bK5 = bZ6.bK();
                    bK5.getClass();
                    dnfeVar2.e = bK5;
                    dnfeVar2.a |= 8;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dnet dnetVar5 = (dnet) bZ2.b;
                    dnfe bK6 = bZ5.bK();
                    bK6.getClass();
                    dnetVar5.d = bK6;
                    dnetVar5.a |= 4;
                }
                a.add(bZ2.bK());
            }
            j(a, 3, bowvVar.f);
            j(a, 4, bowvVar.g);
            byee byeeVar = bowvVar.n;
            byee byeeVar2 = bowvVar.x;
            if (byeeVar != null && byeeVar2 != null && !bowvVar.z) {
                dgsl c2 = byeeVar.c();
                dgsl c3 = byeeVar2.c();
                int size = c2 != null ? c2.a.size() : 0;
                int size2 = c3 != null ? c3.a.size() : 0;
                if (size > 0 || size2 > 0) {
                    dner bZ7 = dnet.h.bZ();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dnet dnetVar6 = (dnet) bZ7.b;
                    dnetVar6.a |= 1;
                    dnetVar6.b = 8;
                    if (size > 0) {
                        dneu bZ8 = dnfe.p.bZ();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        dnfe dnfeVar3 = (dnfe) bZ8.b;
                        c2.getClass();
                        dnfeVar3.l = c2;
                        dnfeVar3.a |= 2048;
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dnet dnetVar7 = (dnet) bZ7.b;
                        dnfe bK7 = bZ8.bK();
                        bK7.getClass();
                        dnetVar7.c = bK7;
                        dnetVar7.a |= 2;
                    }
                    if (size2 > 0) {
                        dneu bZ9 = dnfe.p.bZ();
                        if (bZ9.c) {
                            bZ9.bF();
                            bZ9.c = false;
                        }
                        dnfe dnfeVar4 = (dnfe) bZ9.b;
                        c3.getClass();
                        dnfeVar4.l = c3;
                        dnfeVar4.a |= 2048;
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        dnet dnetVar8 = (dnet) bZ7.b;
                        dnfe bK8 = bZ9.bK();
                        bK8.getClass();
                        dnetVar8.d = bK8;
                        dnetVar8.a |= 4;
                    }
                    a.add(bZ7.bK());
                }
            }
            if ((bowvVar.y || bowvVar.z) && byeeVar != null && (c = byeeVar.c()) != null && c.a.size() > 0) {
                dner bZ10 = dnet.h.bZ();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dnet dnetVar9 = (dnet) bZ10.b;
                dnetVar9.a |= 1;
                dnetVar9.b = 8;
                if (bowvVar.y) {
                    dnet dnetVar10 = (dnet) bZ10.b;
                    dnetVar10.g = 1;
                    dnetVar10.a |= 128;
                    dneu bZ11 = dnfe.p.bZ();
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    dnfe dnfeVar5 = (dnfe) bZ11.b;
                    c.getClass();
                    dnfeVar5.l = c;
                    dnfeVar5.a |= 2048;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dnet dnetVar11 = (dnet) bZ10.b;
                    dnfe bK9 = bZ11.bK();
                    bK9.getClass();
                    dnetVar11.d = bK9;
                    dnetVar11.a |= 4;
                } else {
                    dnet dnetVar12 = (dnet) bZ10.b;
                    dnetVar12.g = 2;
                    dnetVar12.a |= 128;
                    dneu bZ12 = dnfe.p.bZ();
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dnfe dnfeVar6 = (dnfe) bZ12.b;
                    c.getClass();
                    dnfeVar6.l = c;
                    dnfeVar6.a |= 2048;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dnet dnetVar13 = (dnet) bZ10.b;
                    dnfe bK10 = bZ12.bK();
                    bK10.getClass();
                    dnetVar13.c = bK10;
                    dnetVar13.a |= 2;
                }
                a.add(bZ10.bK());
            }
            bowt bowtVar = bowvVar.q;
            if (bowtVar.d.booleanValue()) {
                dner bZ13 = dnet.h.bZ();
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                dnet dnetVar14 = (dnet) bZ13.b;
                dnetVar14.a |= 1;
                dnetVar14.b = 14;
                dnfw b3 = bowtVar.b();
                dnfw c4 = bowtVar.c();
                if (b3 != null) {
                    dneu bZ14 = dnfe.p.bZ();
                    String a2 = bowt.a(b3);
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dnfe dnfeVar7 = (dnfe) bZ14.b;
                    a2.getClass();
                    dnfeVar7.a |= 2;
                    dnfeVar7.c = a2;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dnet dnetVar15 = (dnet) bZ13.b;
                    dnfe bK11 = bZ14.bK();
                    bK11.getClass();
                    dnetVar15.c = bK11;
                    dnetVar15.a |= 2;
                }
                if (c4 != null) {
                    dneu bZ15 = dnfe.p.bZ();
                    String a3 = bowt.a(c4);
                    if (bZ15.c) {
                        bZ15.bF();
                        bZ15.c = false;
                    }
                    dnfe dnfeVar8 = (dnfe) bZ15.b;
                    a3.getClass();
                    dnfeVar8.a |= 2;
                    dnfeVar8.c = a3;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dnet dnetVar16 = (dnet) bZ13.b;
                    dnfe bK12 = bZ15.bK();
                    bK12.getClass();
                    dnetVar16.d = bK12;
                    dnetVar16.a |= 4;
                }
                a.add(bZ13.bK());
            }
            f(a, 6, bowvVar.h);
            f(a, 9, bowvVar.j);
            f(a, 18, bowvVar.i);
            f(a, 10, bowvVar.k);
            i(a, bowvVar.l);
            i(a, bowvVar.m);
        } else if (bowvVar.o.a()) {
            bowy bowyVar = bowvVar.o;
            if (bowyVar.a()) {
                dneu bZ16 = dnfe.p.bZ();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dnfe dnfeVar9 = (dnfe) bZ16.b;
                dnfeVar9.a |= 4;
                dnfeVar9.d = false;
                dneu bZ17 = dnfe.p.bZ();
                if (bZ17.c) {
                    bZ17.bF();
                    bZ17.c = false;
                }
                dnfe dnfeVar10 = (dnfe) bZ17.b;
                dnfeVar10.a |= 4;
                dnfeVar10.d = true;
                if (bowyVar.b().equals(dqgh.MOVED)) {
                    bowz bowzVar = bowyVar.a;
                    akqq akqqVar3 = bowzVar.b;
                    String str2 = bowzVar.a;
                    if (akqqVar3 != null) {
                        dnog bZ18 = dnoh.d.bZ();
                        double d5 = akqqVar3.a;
                        if (bZ18.c) {
                            bZ18.bF();
                            bZ18.c = false;
                        }
                        dnoh dnohVar3 = (dnoh) bZ18.b;
                        int i3 = dnohVar3.a | 1;
                        dnohVar3.a = i3;
                        dnohVar3.b = d5;
                        double d6 = akqqVar3.b;
                        dnohVar3.a = i3 | 2;
                        dnohVar3.c = d6;
                        if (bZ17.c) {
                            bZ17.bF();
                            bZ17.c = false;
                        }
                        dnfe dnfeVar11 = (dnfe) bZ17.b;
                        dnoh bK13 = bZ18.bK();
                        bK13.getClass();
                        dnfeVar11.e = bK13;
                        dnfeVar11.a = 8 | dnfeVar11.a;
                        if (!dbsj.d(str2)) {
                            if (bZ17.c) {
                                bZ17.bF();
                                bZ17.c = false;
                            }
                            dnfe dnfeVar12 = (dnfe) bZ17.b;
                            str2.getClass();
                            dnfeVar12.a |= 2;
                            dnfeVar12.c = str2;
                        }
                    }
                }
                dner bZ19 = dnet.h.bZ();
                int i4 = bowyVar.b().af;
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                dnet dnetVar17 = (dnet) bZ19.b;
                dnetVar17.a |= 1;
                dnetVar17.b = i4;
                dnfe bK14 = bZ16.bK();
                bK14.getClass();
                dnetVar17.c = bK14;
                dnetVar17.a |= 2;
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                dnet dnetVar18 = (dnet) bZ19.b;
                dnfe bK15 = bZ17.bK();
                bK15.getClass();
                dnetVar18.d = bK15;
                dnetVar18.a |= 4;
                a.add(bZ19.bK());
            }
        } else {
            bowr bowrVar = bowvVar.l;
            if (bowrVar.a()) {
                dner bZ20 = dnet.h.bZ();
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                dnet dnetVar19 = (dnet) bZ20.b;
                dnetVar19.a |= 1;
                dnetVar19.b = 9;
                dneu bZ21 = dnfe.p.bZ();
                boolean booleanValue = bowrVar.b.booleanValue();
                if (bZ21.c) {
                    bZ21.bF();
                    bZ21.c = false;
                }
                dnfe dnfeVar13 = (dnfe) bZ21.b;
                dnfeVar13.a |= 4;
                dnfeVar13.d = booleanValue;
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                dnet dnetVar20 = (dnet) bZ20.b;
                dnfe bK16 = bZ21.bK();
                bK16.getClass();
                dnetVar20.c = bK16;
                dnetVar20.a |= 2;
                dneu bZ22 = dnfe.p.bZ();
                boolean booleanValue2 = bowrVar.c.booleanValue();
                if (bZ22.c) {
                    bZ22.bF();
                    bZ22.c = false;
                }
                dnfe dnfeVar14 = (dnfe) bZ22.b;
                dnfeVar14.a |= 4;
                dnfeVar14.d = booleanValue2;
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                dnet dnetVar21 = (dnet) bZ20.b;
                dnfe bK17 = bZ22.bK();
                bK17.getClass();
                dnetVar21.d = bK17;
                dnetVar21.a |= 4;
                a.add(bZ20.bK());
            }
        }
        String c5 = bowvVar.r.c();
        if (!dbsj.d(c5)) {
            dner bZ23 = dnet.h.bZ();
            if (bZ23.c) {
                bZ23.bF();
                bZ23.c = false;
            }
            dnet dnetVar22 = (dnet) bZ23.b;
            int i5 = dnetVar22.a | 1;
            dnetVar22.a = i5;
            dnetVar22.b = 13;
            c5.getClass();
            dnetVar22.a = i5 | 16;
            dnetVar22.f = c5;
            a.add(bZ23.bK());
        }
        if (a.isEmpty() && !bowvVar.v.b().isEmpty()) {
            dner bZ24 = dnet.h.bZ();
            if (bZ24.c) {
                bZ24.bF();
                bZ24.c = false;
            }
            dnet dnetVar23 = (dnet) bZ24.b;
            int i6 = dnetVar23.a | 1;
            dnetVar23.a = i6;
            dnetVar23.b = 13;
            dnetVar23.a = i6 | 16;
            dnetVar23.f = "uploading business hours photo(s)";
            a.add(bZ24.bK());
        }
        dniw bZ25 = dniz.f.bZ();
        bZ25.a(a);
        akqq aj = bowvVar.a.aj();
        if (bowvVar.b()) {
            dodb c6 = bowvVar.c();
            dbsk.s(c6);
            dodbVar = c6;
        } else {
            dodbVar = null;
        }
        dwgy a4 = a(aj, cjqmVar, bZ25, dodbVar, bowvVar.b() ? l(bowvVar) : bowvVar.b, dchl.k(bowvVar.a(), bpss.a), bowvVar.t, bowvVar.s);
        dnqe b4 = b(bowvVar.i(), bowvVar.u.b().size() + bowvVar.v.b().size(), a4);
        if (a4.c) {
            a4.bF();
            a4.c = false;
        }
        dwgz dwgzVar = (dwgz) a4.b;
        dwgz dwgzVar2 = dwgz.h;
        b4.getClass();
        dwgzVar.c = b4;
        dwgzVar.a |= 2;
        return a4.bK();
    }

    public final dwgz d(bptw bptwVar, List<bpsv> list, @dzsi akqq akqqVar, @dzsi String str, dnqe dnqeVar) {
        dodb dodbVar;
        dnet g = g(k(1, bptwVar.a()).bK(), bptwVar.c());
        dniw bZ = dniz.f.bZ();
        bZ.c(g);
        if (!bptwVar.e().equals(bptv.WHOLE_ROUTE) || !bptwVar.d().a()) {
            dodbVar = null;
        } else {
            doda bZ2 = dodb.d.bZ();
            String o = bptwVar.d().b().o();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dodb dodbVar2 = (dodb) bZ2.b;
            o.getClass();
            dodbVar2.a = 1 | dodbVar2.a;
            dodbVar2.b = o;
            String str2 = bptwVar.a().e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dodb dodbVar3 = (dodb) bZ2.b;
            str2.getClass();
            dodbVar3.a |= 2;
            dodbVar3.c = str2;
            dodbVar = bZ2.bK();
        }
        dwgy a = a(akqqVar, cjqm.a, bZ, dodbVar, bptwVar.a(), list, str, true);
        dnqe b = b(dnqeVar, 0, a);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dwgz dwgzVar = (dwgz) a.b;
        dwgz dwgzVar2 = dwgz.h;
        b.getClass();
        dwgzVar.c = b;
        dwgzVar.a |= 2;
        return a.bK();
    }

    public final dwgz e(List<bpsv> list, @dzsi dodb dodbVar, bokk bokkVar, dnet dnetVar, bokk bokkVar2, dnqe dnqeVar) {
        dniw bZ = dniz.f.bZ();
        bZ.c(g(dnetVar, bokkVar2));
        dwgy a = a(list.isEmpty() ? null : list.get(0).c().f(), cjqm.a, bZ, dodbVar, bokkVar, list, null, true);
        dnqe b = b(dnqeVar, 0, a);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dwgz dwgzVar = (dwgz) a.b;
        dwgz dwgzVar2 = dwgz.h;
        b.getClass();
        dwgzVar.c = b;
        dwgzVar.a |= 2;
        return a.bK();
    }
}
