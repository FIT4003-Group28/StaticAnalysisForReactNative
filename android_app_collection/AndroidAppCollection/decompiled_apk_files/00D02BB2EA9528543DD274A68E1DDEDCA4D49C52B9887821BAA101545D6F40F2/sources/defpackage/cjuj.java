package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjuj  reason: default package */
/* loaded from: classes4.dex */
public final class cjuj extends cjtk {
    private final dhjx a;
    private final dpld b;
    @dzsi
    private final List<dnpo> c;
    private final dpxk d;
    private final int e;

    public cjuj(dhjx dhjxVar, dpld dpldVar, cqat cqatVar, @dzsi List<dnpo> list, dpxk dpxkVar, int i) {
        super(cqatVar.e());
        dbsk.s(dhjxVar);
        this.a = dhjxVar;
        this.b = dpldVar;
        this.c = list;
        this.d = dpxkVar;
        this.e = i;
    }

    private final synchronized dbsg<List<ddhk>> b() {
        List<dnpo> list = this.c;
        if (list == null || list.isEmpty()) {
            return dbpy.a;
        }
        List<dnpo> list2 = this.c;
        ArrayList a = dchl.a();
        if (!list2.isEmpty()) {
            ddhh ddhhVar = (ddhh) ddhk.k.bZ();
            if (ddhhVar.c) {
                ddhhVar.bF();
                ddhhVar.c = false;
            }
            ddhk ddhkVar = (ddhk) ddhhVar.b;
            ddhkVar.a |= 1;
            ddhkVar.b = 5600;
            a.add(ddhhVar);
            for (int i = 0; i < list2.size(); i++) {
                ddhhVar.a(a.size());
                dnpo dnpoVar = list2.get(i);
                ddhh ddhhVar2 = (ddhh) ddhk.k.bZ();
                if (ddhhVar2.c) {
                    ddhhVar2.bF();
                    ddhhVar2.c = false;
                }
                ddhk ddhkVar2 = (ddhk) ddhhVar2.b;
                int i2 = ddhkVar2.a | 1;
                ddhkVar2.a = i2;
                ddhkVar2.b = 5210;
                ddhkVar2.a = i2 | 2;
                ddhkVar2.c = i;
                int a2 = dnpl.a(dnpoVar.h);
                if (a2 != 0) {
                    if (a2 == 3) {
                        ddhj ddhjVar = ddhj.VISIBILITY_HIDDEN;
                        if (ddhhVar2.c) {
                            ddhhVar2.bF();
                            ddhhVar2.c = false;
                        }
                        ddhk ddhkVar3 = (ddhk) ddhhVar2.b;
                        ddhkVar3.h = ddhjVar.g;
                        ddhkVar3.a |= 32;
                    } else if (a2 == 4) {
                        ddhj ddhjVar2 = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
                        if (ddhhVar2.c) {
                            ddhhVar2.bF();
                            ddhhVar2.c = false;
                        }
                        ddhk ddhkVar4 = (ddhk) ddhhVar2.b;
                        ddhkVar4.h = ddhjVar2.g;
                        ddhkVar4.a |= 32;
                    }
                }
                ddhhVar2.k(ddet.E, cjss.a(dnpoVar));
                a.add(ddhhVar2);
                for (int i3 = 0; i3 < dnpoVar.o.size(); i3++) {
                    ddhh ddhhVar3 = (ddhh) ddhk.k.bZ();
                    int i4 = dnpoVar.o.get(i3).b;
                    if (ddhhVar3.c) {
                        ddhhVar3.bF();
                        ddhhVar3.c = false;
                    }
                    ddhk ddhkVar5 = (ddhk) ddhhVar3.b;
                    int i5 = ddhkVar5.a | 1;
                    ddhkVar5.a = i5;
                    ddhkVar5.b = i4;
                    ddhkVar5.a = i5 | 2;
                    ddhkVar5.c = i3;
                    dsqv<ddhk, ddet> dsqvVar = ddet.E;
                    ddes bZ = ddet.D.bZ();
                    deam bZ2 = dean.p.bZ();
                    dneb dnebVar = dnpoVar.o.get(i3).c;
                    if (dnebVar == null) {
                        dnebVar = dneb.f;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dean deanVar = (dean) bZ2.b;
                    dnebVar.getClass();
                    deanVar.k = dnebVar;
                    deanVar.a |= 64;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddet ddetVar = (ddet) bZ.b;
                    dean bK = bZ2.bK();
                    bK.getClass();
                    ddetVar.d = bK;
                    ddetVar.a |= 2;
                    ddhhVar3.k(dsqvVar, bZ.bK());
                    ddhhVar2.a(a.size());
                    a.add(ddhhVar3);
                }
            }
        }
        dccx F = dcdc.F();
        int size = a.size();
        for (int i6 = 0; i6 < size; i6++) {
            F.g((ddhk) ((ddhh) a.get(i6)).bK());
        }
        return dbsg.i(F.f());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dwwu bZ = dwwv.g.bZ();
        dhjx dhjxVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwwv dwwvVar = (dwwv) bZ.b;
        dhjxVar.getClass();
        dwwvVar.b = dhjxVar;
        int i = dwwvVar.a | 1;
        dwwvVar.a = i;
        dpld dpldVar = this.b;
        dpldVar.getClass();
        dwwvVar.c = dpldVar;
        int i2 = i | 2;
        dwwvVar.a = i2;
        dpxk dpxkVar = this.d;
        dpxkVar.getClass();
        dwwvVar.e = dpxkVar;
        int i3 = i2 | 4;
        dwwvVar.a = i3;
        int i4 = this.e;
        dwwvVar.a = i3 | 8;
        dwwvVar.f = i4;
        List<dnpo> list = this.c;
        if (list != null) {
            dwwv dwwvVar2 = (dwwv) bZ.b;
            dwwvVar2.c();
            dsod.bv(list, dwwvVar2.d);
        }
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwwv bK = bZ.bK();
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.p = bK;
        dwunVar.a |= 2048;
        dbsg<List<ddhk>> b = b();
        if (b.a()) {
            dnqg k = k();
            if (k.c) {
                k.bF();
                k.c = false;
            }
            dnqh dnqhVar = dnqh.p;
            ((dnqh) k.b).i = dnqh.ck();
            k.a(b.b());
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar3 = (dwun) dwumVar.b;
            dnqh bK2 = k.bK();
            bK2.getClass();
            dwunVar3.e = bK2;
            dwunVar3.a |= 4;
        }
    }

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}
