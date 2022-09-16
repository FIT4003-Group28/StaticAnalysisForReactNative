package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cjul  reason: default package */
/* loaded from: classes.dex */
public final class cjul extends cjtp {
    final dbsg<ddho> a;
    private final List<cjuu> b;
    private final dzsj<duxm> c;
    private final long d;
    private final boolean e;

    public cjul(List<cjuu> list, dbsg<ddho> dbsgVar, cqat cqatVar, long j, dzsj<duxm> dzsjVar, dbsg<ddlp> dbsgVar2, boolean z) {
        super(cqatVar.e(), dbsgVar2);
        this.b = list;
        this.c = dzsjVar;
        this.a = dbsgVar;
        this.d = j;
        this.e = z;
    }

    private static void A(dwxc dwxcVar, Iterable<cjuu> iterable, Map<Integer, Integer> map) {
        if (!dcft.w(iterable)) {
            ddhk ddhkVar = ((dwxd) dwxcVar.b).b;
            if (ddhkVar == null) {
                ddhkVar = ddhk.k;
            }
            ddhh ddhhVar = (ddhh) ddhk.k.ca(ddhkVar);
            for (cjuu cjuuVar : iterable) {
                Integer num = map.get(Integer.valueOf(cjuuVar.d));
                dbsk.s(num);
                ddhhVar.a(num.intValue());
            }
            ddhk ddhkVar2 = (ddhk) ddhhVar.bK();
            if (dwxcVar.c) {
                dwxcVar.bF();
                dwxcVar.c = false;
            }
            dwxd dwxdVar = (dwxd) dwxcVar.b;
            ddhkVar2.getClass();
            dwxdVar.b = ddhkVar2;
            dwxdVar.a |= 1;
        }
    }

    private static Map<Integer, Integer> z(List<cjuu> list) {
        dcdg p = dcdn.p();
        for (int i = 0; i < list.size(); i++) {
            p.f(Integer.valueOf(list.get(i).d), Integer.valueOf(i));
        }
        return p.b();
    }

    @Override // defpackage.cjtp, defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        ddho ddhoVar;
        ddho ddhoVar2;
        super.C(dwumVar);
        long j = this.d;
        if (j != -1) {
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar = (dwun) dwumVar.b;
            dwun dwunVar2 = dwun.w;
            dwunVar.a |= 1;
            dwunVar.c = j;
        }
        if (this.c.a().F) {
            dcdd a = dcde.a();
            for (cjuu cjuuVar : this.b) {
                cjsh cjshVar = cjuuVar.e;
                String o = o();
                dbsk.s(o);
                if (cjshVar.h(o) && !cjshVar.g()) {
                    a.b(Integer.valueOf(cjshVar.f()), cjuuVar);
                }
            }
            dcde a2 = a.a();
            if (this.e) {
                dnqg k = k();
                int i = ddda.KG.b;
                if (k.c) {
                    k.bF();
                    k.c = false;
                }
                dnqh dnqhVar = (dnqh) k.b;
                dnqh dnqhVar2 = dnqh.p;
                dnqhVar.a |= 64;
                dnqhVar.g = i;
                dnqh bK = k.bK();
                if (dwumVar.c) {
                    dwumVar.bF();
                    dwumVar.c = false;
                }
                dwun dwunVar3 = (dwun) dwumVar.b;
                dwun dwunVar4 = dwun.w;
                bK.getClass();
                dwunVar3.e = bK;
                dwunVar3.a |= 4;
                dccx F = dcdc.F();
                for (cjuu cjuuVar2 : this.b) {
                    cjsh cjshVar2 = cjuuVar2.e;
                    String o2 = o();
                    dbsk.s(o2);
                    if (!cjshVar2.h(o2)) {
                        dusr bZ = duss.d.bZ();
                        cjsh cjshVar3 = cjuuVar2.e;
                        dbsg<cjrc> a3 = cjshVar3.a();
                        dbsk.l(a3.a() && cjshVar3.b().a());
                        dwxa bZ2 = dwxb.d.bZ();
                        ddxz c = a3.b().c();
                        if (c != null) {
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dwxb dwxbVar = (dwxb) bZ2.b;
                            c.getClass();
                            dwxbVar.b = c;
                            dwxbVar.a |= 1;
                        }
                        ddhm c2 = cjshVar3.b().b().c();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dwxb dwxbVar2 = (dwxb) bZ2.b;
                        c2.getClass();
                        dwxbVar2.c = c2;
                        dwxbVar2.a |= 2;
                        dwxb bK2 = bZ2.bK();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        duss dussVar = (duss) bZ.b;
                        bK2.getClass();
                        dussVar.b = bK2;
                        dussVar.a |= 1;
                        dccx F2 = dcdc.F();
                        dccx F3 = dcdc.F();
                        ArrayDeque arrayDeque = new ArrayDeque();
                        arrayDeque.push(cjuuVar2);
                        while (!arrayDeque.isEmpty()) {
                            cjuu cjuuVar3 = (cjuu) arrayDeque.pop();
                            F3.g(cjuuVar3);
                            arrayDeque.addAll(a2.f(Integer.valueOf(cjuuVar3.d)));
                        }
                        dcdc f = F3.f();
                        Map<Integer, Integer> z = z(f);
                        for (int i2 = 0; i2 < f.size(); i2++) {
                            cjuu cjuuVar4 = (cjuu) f.get(i2);
                            dwxc a4 = cjuuVar4.a();
                            A(a4, a2.f(Integer.valueOf(cjuuVar4.d)), z);
                            F2.g(a4.bK());
                        }
                        dcdc f2 = F2.f();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        duss dussVar2 = (duss) bZ.b;
                        dsrj<dwxd> dsrjVar = dussVar2.c;
                        if (!dsrjVar.a()) {
                            dussVar2.c = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(f2, dussVar2.c);
                        F.g(bZ.bK());
                    }
                }
                dcdc f3 = F.f();
                if (dwumVar.c) {
                    dwumVar.bF();
                    dwumVar.c = false;
                }
                dwun dwunVar5 = (dwun) dwumVar.b;
                dsrj<duss> dsrjVar2 = dwunVar5.k;
                if (!dsrjVar2.a()) {
                    dwunVar5.k = dsqw.cl(dsrjVar2);
                }
                dsod.bv(f3, dwunVar5.k);
                return;
            }
            dnqg k2 = k();
            int i3 = ddda.Kj.b;
            if (k2.c) {
                k2.bF();
                k2.c = false;
            }
            dnqh dnqhVar3 = (dnqh) k2.b;
            dnqh dnqhVar4 = dnqh.p;
            dnqhVar3.a |= 64;
            dnqhVar3.g = i3;
            dnqh bK3 = k2.bK();
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar6 = (dwun) dwumVar.b;
            dwun dwunVar7 = dwun.w;
            bK3.getClass();
            dwunVar6.e = bK3;
            dwunVar6.a |= 4;
            dccx F4 = dcdc.F();
            if (this.a.a()) {
                ddhoVar2 = this.a.b();
            } else {
                ddhoVar2 = dtxy.a;
            }
            ddhh a5 = cjth.a(cjtd.a(ddhoVar2), 0L, 0);
            Map<Integer, Integer> z2 = z(this.b);
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                cjuu cjuuVar5 = this.b.get(i4);
                dwxc a6 = cjuuVar5.a();
                A(a6, a2.f(Integer.valueOf(cjuuVar5.d)), z2);
                F4.g(a6.bK());
                cjsh cjshVar4 = cjuuVar5.e;
                String o3 = o();
                dbsk.s(o3);
                if (cjshVar4.h(o3) && !cjshVar4.g()) {
                }
                a5.a(i4);
            }
            ddhk ddhkVar = (ddhk) a5.bK();
            dwxc bZ3 = dwxd.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwxd dwxdVar = (dwxd) bZ3.b;
            ddhkVar.getClass();
            dwxdVar.b = ddhkVar;
            dwxdVar.a |= 1;
            F4.g(bZ3.bK());
            dwumVar.a(F4.f());
            return;
        }
        dnqg k3 = k();
        int i5 = ddda.Kj.b;
        if (k3.c) {
            k3.bF();
            k3.c = false;
        }
        dnqh dnqhVar5 = (dnqh) k3.b;
        dnqh dnqhVar6 = dnqh.p;
        dnqhVar5.a |= 64;
        dnqhVar5.g = i5;
        dnqh bK4 = k3.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar8 = (dwun) dwumVar.b;
        dwun dwunVar9 = dwun.w;
        bK4.getClass();
        dwunVar8.e = bK4;
        dwunVar8.a |= 4;
        dccx F5 = dcdc.F();
        if (this.a.a()) {
            ddhoVar = this.a.b();
        } else {
            ddhoVar = dtxy.a;
        }
        ddhh a7 = cjth.a(cjtd.a(ddhoVar), 0L, 0);
        for (int i6 = 0; i6 < this.b.size(); i6++) {
            cjuu cjuuVar6 = this.b.get(i6);
            F5.g(cjth.c(cjuuVar6.a, cjuuVar6.b - cjuuVar6.c, cjuuVar6.d).bK());
            a7.a(i6);
        }
        ddhk ddhkVar2 = (ddhk) a7.bK();
        dwxc bZ4 = dwxd.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwxd dwxdVar2 = (dwxd) bZ4.b;
        ddhkVar2.getClass();
        dwxdVar2.b = ddhkVar2;
        dwxdVar2.a |= 1;
        F5.g(bZ4.bK());
        dwumVar.a(F5.f());
    }

    @Override // defpackage.cjtp
    public final synchronized void D(ddmz ddmzVar) {
        super.D(ddmzVar);
        if (this.c.a().O) {
            return;
        }
        ddsx bZ = ddta.c.bZ();
        for (cjuu cjuuVar : this.b) {
            cjtd cjtdVar = cjuuVar.a;
            ddsy bZ2 = ddsz.g.bZ();
            String str = cjtdVar.e;
            if (str != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddsz ddszVar = (ddsz) bZ2.b;
                str.getClass();
                ddszVar.a |= 1;
                ddszVar.b = str;
            }
            ddho ddhoVar = cjtdVar.g;
            if (ddhoVar != null) {
                int b = ddhoVar.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddsz ddszVar2 = (ddsz) bZ2.b;
                ddszVar2.a |= 4;
                ddszVar2.e = b;
            }
            String str2 = cjtdVar.d;
            if (str2 != null && !str2.isEmpty()) {
                ddsv bZ3 = ddsw.c.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddsw ddswVar = (ddsw) bZ3.b;
                str2.getClass();
                ddswVar.a |= 2;
                ddswVar.b = str2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddsz ddszVar3 = (ddsz) bZ2.b;
                ddsw bK = bZ3.bK();
                bK.getClass();
                dsrj<ddsw> dsrjVar = ddszVar3.c;
                if (!dsrjVar.a()) {
                    ddszVar3.c = dsqw.cl(dsrjVar);
                }
                ddszVar3.c.add(bK);
            }
            ddet k = cjtdVar.k();
            if (k != null) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddsz ddszVar4 = (ddsz) bZ2.b;
                k.getClass();
                ddszVar4.f = k;
                ddszVar4.a |= 8;
            }
            long j = cjuuVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddsz ddszVar5 = (ddsz) bZ2.b;
            ddszVar5.a |= 2;
            ddszVar5.d = j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddta ddtaVar = (ddta) bZ.b;
            ddsz bK2 = bZ2.bK();
            bK2.getClass();
            dsrj<ddsz> dsrjVar2 = ddtaVar.a;
            if (!dsrjVar2.a()) {
                ddtaVar.a = dsqw.cl(dsrjVar2);
            }
            ddtaVar.a.add(bK2);
        }
        if (this.a.a()) {
            ddhh ddhhVar = (ddhh) ddhk.k.bZ();
            int b2 = this.a.b().b();
            if (ddhhVar.c) {
                ddhhVar.bF();
                ddhhVar.c = false;
            }
            ddhk ddhkVar = (ddhk) ddhhVar.b;
            ddhkVar.a |= 1;
            ddhkVar.b = b2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddta ddtaVar2 = (ddta) bZ.b;
            ddhk ddhkVar2 = (ddhk) ddhhVar.bK();
            ddhkVar2.getClass();
            dsrj<ddhk> dsrjVar3 = ddtaVar2.b;
            if (!dsrjVar3.a()) {
                ddtaVar2.b = dsqw.cl(dsrjVar3);
            }
            ddtaVar2.b.add(ddhkVar2);
        }
        if (ddmzVar.c) {
            ddmzVar.bF();
            ddmzVar.c = false;
        }
        ddna ddnaVar = (ddna) ddmzVar.b;
        ddta bK3 = bZ.bK();
        ddna ddnaVar2 = ddna.v;
        bK3.getClass();
        ddnaVar.d = bK3;
        ddnaVar.a |= 64;
    }
}
