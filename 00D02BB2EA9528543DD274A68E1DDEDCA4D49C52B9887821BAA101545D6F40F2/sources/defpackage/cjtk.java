package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjtk  reason: default package */
/* loaded from: classes.dex */
public class cjtk {
    private boolean f = false;
    private final long n;
    @dzsi
    private dnqh o;
    @dzsi
    private String p;
    private boolean q;
    @dzsi
    private Integer r;

    public cjtk(long j) {
        this.n = j;
    }

    public synchronized void C(dwum dwumVar) {
        this.f = true;
        long j = this.n;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        int i = dwunVar.a | 1;
        dwunVar.a = i;
        dwunVar.c = j;
        dnqh dnqhVar = this.o;
        if (dnqhVar != null) {
            dnqhVar.getClass();
            dwunVar.e = dnqhVar;
            i |= 4;
            dwunVar.a = i;
        }
        String str = this.p;
        if (str != null) {
            str.getClass();
            i |= 2;
            dwunVar.a = i;
            dwunVar.d = str;
        }
        if (this.q) {
            dwunVar.a = i | 32;
            dwunVar.j = true;
        }
        Integer num = this.r;
        if (num != null) {
            ddmj bZ = ddmk.c.bZ();
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddmk ddmkVar = (ddmk) bZ.b;
            ddmkVar.a = 1 | ddmkVar.a;
            ddmkVar.b = intValue;
            ddmk bK = bZ.bK();
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar3 = (dwun) dwumVar.b;
            bK.getClass();
            dwunVar3.l = bK;
            dwunVar3.a |= 64;
        }
    }

    public boolean f() {
        return false;
    }

    public final synchronized long g() {
        return this.n;
    }

    public synchronized long h() {
        return this.n;
    }

    @Deprecated
    public final synchronized void i(@dzsi dnqh dnqhVar) {
        this.o = dnqhVar;
    }

    @dzsi
    public final synchronized dnqh j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized dnqg k() {
        dnqh dnqhVar = this.o;
        if (dnqhVar != null) {
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            return (dnqg) dsqpVar;
        }
        return dnqh.p.bZ();
    }

    public final synchronized dwun l() {
        dwum dwumVar;
        dwumVar = (dwum) dwun.w.bZ();
        C(dwumVar);
        dbsk.l(this.f);
        this.f = false;
        return (dwun) dwumVar.bK();
    }

    public final dumg m(dume dumeVar, List<ahnc> list, List<duty> list2, List<Integer> list3) {
        dwun l = l();
        dumf bZ = dumg.z.bZ();
        long j = l.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumg dumgVar = (dumg) bZ.b;
        dumgVar.a |= 1;
        dumgVar.c = j;
        if ((l.a & 128) != 0) {
            ddna ddnaVar = l.m;
            if (ddnaVar == null) {
                ddnaVar = ddna.v;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar2 = (dumg) bZ.b;
            ddnaVar.getClass();
            dumgVar2.p = ddnaVar;
            dumgVar2.a |= 256;
        }
        if (l.b.size() > 0) {
            dsrj<dtaq> dsrjVar = l.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar3 = (dumg) bZ.b;
            dumgVar3.c();
            dsod.bv(dsrjVar, dumgVar3.b);
        }
        if ((l.a & 2) != 0) {
            String str = l.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar4 = (dumg) bZ.b;
            str.getClass();
            dumgVar4.a |= 2;
            dumgVar4.d = str;
        }
        if ((l.a & 8192) != 0) {
            dvfy dvfyVar = l.r;
            if (dvfyVar == null) {
                dvfyVar = dvfy.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar5 = (dumg) bZ.b;
            dvfyVar.getClass();
            dumgVar5.u = dvfyVar;
            dumgVar5.a |= 8192;
        }
        if ((l.a & 4) != 0) {
            dnqh dnqhVar = l.e;
            if (dnqhVar == null) {
                dnqhVar = dnqh.p;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar6 = (dumg) bZ.b;
            dnqhVar.getClass();
            dumgVar6.e = dnqhVar;
            dumgVar6.a |= 4;
        }
        if (l.f.size() > 0) {
            dsrj<dwxd> dsrjVar2 = l.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar7 = (dumg) bZ.b;
            dsrj<dwxd> dsrjVar3 = dumgVar7.f;
            if (!dsrjVar3.a()) {
                dumgVar7.f = dsqw.cl(dsrjVar3);
            }
            dsod.bv(dsrjVar2, dumgVar7.f);
        }
        if (l.g.size() > 0) {
            dsrj<ddhk> dsrjVar4 = l.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar8 = (dumg) bZ.b;
            dsrj<ddhk> dsrjVar5 = dumgVar8.g;
            if (!dsrjVar5.a()) {
                dumgVar8.g = dsqw.cl(dsrjVar5);
            }
            dsod.bv(dsrjVar4, dumgVar8.g);
        }
        if ((l.a & 256) != 0) {
            dvnq dvnqVar = l.n;
            if (dvnqVar == null) {
                dvnqVar = dvnq.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar9 = (dumg) bZ.b;
            dvnqVar.getClass();
            dumgVar9.q = dvnqVar;
            dumgVar9.a |= 512;
        }
        if ((l.a & 1024) != 0) {
            dvkw dvkwVar = l.o;
            if (dvkwVar == null) {
                dvkwVar = dvkw.k;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar10 = (dumg) bZ.b;
            dvkwVar.getClass();
            dumgVar10.r = dvkwVar;
            dumgVar10.a |= 1024;
        }
        if ((l.a & 2048) != 0) {
            dwwv dwwvVar = l.p;
            if (dwwvVar == null) {
                dwwvVar = dwwv.g;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar11 = (dumg) bZ.b;
            dwwvVar.getClass();
            dumgVar11.s = dwwvVar;
            dumgVar11.a |= 2048;
        }
        if ((l.a & 4096) != 0) {
            dofv dofvVar = l.q;
            if (dofvVar == null) {
                dofvVar = dofv.a;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar12 = (dumg) bZ.b;
            dofvVar.getClass();
            dumgVar12.t = dofvVar;
            dumgVar12.a |= 4096;
        }
        if (l.s.size() > 0) {
            dsrj<doem> dsrjVar6 = l.s;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar13 = (dumg) bZ.b;
            dsrj<doem> dsrjVar7 = dumgVar13.v;
            if (!dsrjVar7.a()) {
                dumgVar13.v = dsqw.cl(dsrjVar7);
            }
            dsod.bv(dsrjVar6, dumgVar13.v);
        }
        if ((l.a & 16384) != 0) {
            dnop dnopVar = l.t;
            if (dnopVar == null) {
                dnopVar = dnop.j;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar14 = (dumg) bZ.b;
            dnopVar.getClass();
            dumgVar14.w = dnopVar;
            dumgVar14.a |= 16384;
        }
        if ((l.a & 32768) != 0) {
            dvra dvraVar = l.u;
            if (dvraVar == null) {
                dvraVar = dvra.f;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar15 = (dumg) bZ.b;
            dvraVar.getClass();
            dumgVar15.x = dvraVar;
            dumgVar15.a |= 32768;
        }
        if ((l.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
            eacd eacdVar = l.v;
            if (eacdVar == null) {
                eacdVar = eacd.u;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar16 = (dumg) bZ.b;
            eacdVar.getClass();
            dumgVar16.y = eacdVar;
            dumgVar16.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((l.a & 8) != 0) {
            boolean z = l.h;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar17 = (dumg) bZ.b;
            dumgVar17.a |= 8;
            dumgVar17.h = z;
        }
        if ((l.a & 32) != 0) {
            boolean z2 = l.j;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar18 = (dumg) bZ.b;
            dumgVar18.a |= 32;
            dumgVar18.j = z2;
        }
        if ((l.a & 16) != 0) {
            boolean z3 = l.i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar19 = (dumg) bZ.b;
            dumgVar19.a |= 16;
            dumgVar19.i = z3;
        }
        if ((l.a & 64) != 0) {
            ddmk ddmkVar = l.l;
            if (ddmkVar == null) {
                ddmkVar = ddmk.c;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar20 = (dumg) bZ.b;
            ddmkVar.getClass();
            dumgVar20.l = ddmkVar;
            dumgVar20.a |= 64;
        }
        for (ahnc ahncVar : list) {
            dtaq a = ahncVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar21 = (dumg) bZ.b;
            a.getClass();
            dumgVar21.c();
            dumgVar21.b.add(a);
        }
        if (l.k.size() > 0) {
            dsrj<duss> dsrjVar8 = l.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dumg dumgVar22 = (dumg) bZ.b;
            dsrj<duss> dsrjVar9 = dumgVar22.k;
            if (!dsrjVar9.a()) {
                dumgVar22.k = dsqw.cl(dsrjVar9);
            }
            dsod.bv(dsrjVar8, dumgVar22.k);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumg dumgVar23 = (dumg) bZ.b;
        dumeVar.getClass();
        dumgVar23.m = dumeVar;
        dumgVar23.a |= 128;
        dumg dumgVar24 = (dumg) bZ.b;
        dsrj<duty> dsrjVar10 = dumgVar24.n;
        if (!dsrjVar10.a()) {
            dumgVar24.n = dsqw.cl(dsrjVar10);
        }
        dsod.bv(list2, dumgVar24.n);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dumg dumgVar25 = (dumg) bZ.b;
        dsrf dsrfVar = dumgVar25.o;
        if (!dsrfVar.a()) {
            dumgVar25.o = dsqw.cg(dsrfVar);
        }
        dsod.bv(list3, dumgVar25.o);
        return bZ.bK();
    }

    public final synchronized void n(String str) {
        this.p = str;
    }

    @dzsi
    public final synchronized String o() {
        return this.p;
    }

    public final synchronized void p() {
        this.q = true;
    }

    public boolean q() {
        return false;
    }

    public final synchronized void r() {
        dnqg bZ;
        dnqh dnqhVar = this.o;
        if (dnqhVar != null) {
            bZ = dnqh.p.ca(dnqhVar);
        } else {
            bZ = dnqh.p.bZ();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ.b;
        dnqhVar2.a |= ImageMetadata.LENS_APERTURE;
        dnqhVar2.n = true;
        this.o = bZ.bK();
    }

    public final synchronized void s(int i) {
        this.r = Integer.valueOf(i);
    }
}
