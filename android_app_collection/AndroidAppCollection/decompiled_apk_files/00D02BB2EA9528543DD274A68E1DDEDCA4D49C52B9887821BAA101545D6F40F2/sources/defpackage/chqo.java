package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chqo  reason: default package */
/* loaded from: classes4.dex */
public final class chqo implements degu<btzx<dwnd, dwnf>> {
    final /* synthetic */ chtq a;
    final /* synthetic */ String b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ chqz d;
    final /* synthetic */ chra e;

    public chqo(chra chraVar, chtq chtqVar, String str, Runnable runnable, chqz chqzVar) {
        this.e = chraVar;
        this.a = chtqVar;
        this.b = str;
        this.c = runnable;
        this.d = chqzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof btzs)) {
            dcqe dcqeVar = chra.a;
        } else if (!dbsj.e(this.b).equals(this.d.c)) {
        } else {
            dcqe dcqeVar2 = chra.a;
            ((btzs) th).b();
            this.e.p.add(this.a);
            this.e.af();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<dwnd, dwnf> btzxVar) {
        dwnf b = btzxVar.b();
        chra chraVar = this.e;
        chtq chtqVar = this.a;
        dccx dccxVar = new dccx();
        String str = b.c;
        for (dwmx dwmxVar : b.d) {
            if (dwmxVar.g.size() != 0) {
                dvyw dvywVar = dwmxVar.c;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                dwfl dwflVar = dwmxVar.g.get(0).b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                chxr a = chsp.a(dvywVar.g, dbsg.i(dwflVar.q));
                String str2 = dvywVar.i;
                dose bZ = dosf.f.bZ();
                dwfl dwflVar2 = dwmxVar.g.get(0).b;
                if (dwflVar2 == null) {
                    dwflVar2 = dwfl.w;
                }
                long j = dwflVar2.o;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dosf dosfVar = (dosf) bZ.b;
                dosfVar.a |= 1;
                dosfVar.b = j;
                dosf bK = bZ.bK();
                dcbg s = dcbg.b(dwmxVar.g).o(chsj.a).s(chsk.a);
                chwa bZ2 = chwb.c.bZ();
                if ((dwmxVar.a & 16) != 0) {
                    dqbz dqbzVar = dwmxVar.f;
                    if (dqbzVar == null) {
                        dqbzVar = dqbz.b;
                    }
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    chwb chwbVar = (chwb) bZ2.b;
                    dqbzVar.getClass();
                    chwbVar.b = dqbzVar;
                    chwbVar.a |= 1;
                }
                chvz bZ3 = chxl.x.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar = (chxl) bZ3.b;
                chxlVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                chxlVar.w = true;
                chxl chxlVar2 = (chxl) bZ3.b;
                a.getClass();
                chxlVar2.b = a;
                int i = chxlVar2.a | 1;
                chxlVar2.a = i;
                String str3 = dwmxVar.b;
                str3.getClass();
                chxlVar2.a = i | 2;
                chxlVar2.c = str3;
                dwlh e = chsp.e(dvywVar);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar3 = (chxl) bZ3.b;
                e.getClass();
                chxlVar3.d = e;
                chxlVar3.a |= 4;
                chxm bZ4 = chxp.k.bZ();
                bZ4.a(s);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar4 = (chxl) bZ3.b;
                chxp bK2 = bZ4.bK();
                bK2.getClass();
                chxlVar4.i = bK2;
                chxlVar4.a |= 64;
                dsrj<dwmz> dsrjVar = dwmxVar.g;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar5 = (chxl) bZ3.b;
                dsrj<dwmz> dsrjVar2 = chxlVar5.p;
                if (!dsrjVar2.a()) {
                    chxlVar5.p = dsqw.cl(dsrjVar2);
                }
                dsod.bv(dsrjVar, chxlVar5.p);
                chxi bZ5 = chxk.g.bZ();
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                chxk chxkVar = (chxk) bZ5.b;
                chwb bK3 = bZ2.bK();
                bK3.getClass();
                chxkVar.c = bK3;
                chxkVar.b = 3;
                bZ3.c(bZ5);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar6 = (chxl) bZ3.b;
                bK.getClass();
                chxlVar6.b();
                chxlVar6.g.add(bK);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chxl chxlVar7 = (chxl) bZ3.b;
                chxlVar7.a |= 32;
                chxlVar7.h = true;
                dccxVar.g(bZ3.bK());
            }
        }
        if (chraVar.ag(chtqVar, dccxVar.f(), dbsj.e(this.b), b.c, null)) {
            this.e.p.remove(this.a);
        }
        if ((b.a & 8) != 0) {
            dqkf dqkfVar = b.e;
            if (dqkfVar == null) {
                dqkfVar = dqkf.f;
            }
            chtz bZ6 = chua.c.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            chua chuaVar = (chua) bZ6.b;
            dqkfVar.getClass();
            chuaVar.b = dqkfVar;
            chuaVar.a |= 1;
            chua bK4 = bZ6.bK();
            this.e.m.put(this.a, bK4);
            this.e.v.a(bK4);
        }
        this.c.run();
    }
}
