package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agwm  reason: default package */
/* loaded from: classes2.dex */
public final class agwm implements agwh {
    public static final /* synthetic */ int d = 0;
    private static final dnqh e;
    public final dxio<akfa> a;
    public final anhk b;
    public final Map<dbsi<btlu, dirf>, dehn<dirj>> c = new HashMap();
    private final Executor f;
    private final butu g;
    private final buyw h;
    private final bvai i;
    private final buml j;

    static {
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        e = bZ.bK();
    }

    public agwm(dxio<akfa> dxioVar, butu butuVar, buyw buywVar, bvai bvaiVar, buml bumlVar, anhk anhkVar, Executor executor) {
        this.a = dxioVar;
        this.g = butuVar;
        this.h = buywVar;
        this.i = bvaiVar;
        this.f = executor;
        this.j = bumlVar;
        this.b = anhkVar;
    }

    @Override // defpackage.agwh
    public final synchronized dehn<dirj> a(btlu btluVar, List<dkzo> list, List<dlas> list2, dkzq dkzqVar) {
        dire bZ = dirf.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dirf dirfVar = (dirf) bZ.b;
        dsrj<dkzo> dsrjVar = dirfVar.b;
        if (!dsrjVar.a()) {
            dirfVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dirfVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dirf dirfVar2 = (dirf) bZ.b;
        dsrj<dlas> dsrjVar2 = dirfVar2.c;
        if (!dsrjVar2.a()) {
            dirfVar2.c = dsqw.cl(dsrjVar2);
        }
        dsod.bv(list2, dirfVar2.c);
        dnqh dnqhVar = e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dirf dirfVar3 = (dirf) bZ.b;
        dnqhVar.getClass();
        dirfVar3.e = dnqhVar;
        int i = dirfVar3.a | 2;
        dirfVar3.a = i;
        dirfVar3.d = dkzqVar.d;
        dirfVar3.a = i | 1;
        dirf bK = bZ.bK();
        dbsi<btlu, dirf> a = dbsi.a(btluVar, bK);
        dehn<dirj> dehnVar = this.c.get(a);
        if (dehnVar != null) {
            return dehnVar;
        }
        deig d2 = deig.d();
        this.c.put(a, d2);
        this.h.a().e = btluVar;
        this.h.c().b(bK, new agwi(this, btluVar, d2, a), this.f);
        return d2;
    }

    @Override // defpackage.agwh
    public final dehn<diqz> b(btlu btluVar, diqx diqxVar) {
        if ((diqxVar.a & 2) != 0) {
            dsqp dsqpVar = (dsqp) diqxVar.cu(5);
            dsqpVar.bC(diqxVar);
            diqu diquVar = (diqu) dsqpVar;
            diqw diqwVar = diqxVar.b;
            if (diqwVar == null) {
                diqwVar = diqw.c;
            }
            dsqp dsqpVar2 = (dsqp) diqwVar.cu(5);
            dsqpVar2.bC(diqwVar);
            diqv diqvVar = (diqv) dsqpVar2;
            dnwb a = this.b.a();
            if (diqvVar.c) {
                diqvVar.bF();
                diqvVar.c = false;
            }
            diqw diqwVar2 = (diqw) diqvVar.b;
            a.getClass();
            diqwVar2.b = a;
            diqwVar2.a |= 2;
            if (diquVar.c) {
                diquVar.bF();
                diquVar.c = false;
            }
            diqx diqxVar2 = (diqx) diquVar.b;
            diqw bK = diqvVar.bK();
            bK.getClass();
            diqxVar2.b = bK;
            diqxVar2.a |= 2;
            diqxVar = (diqx) diquVar.bK();
        }
        deig d2 = deig.d();
        this.g.a().e = btluVar;
        this.g.c().b(diqxVar, new agwj(d2), this.f);
        return d2;
    }

    @Override // defpackage.agwh
    public final dehn<dlbu> c(btlu btluVar, akqs akqsVar, dkzq dkzqVar) {
        deig d2 = deig.d();
        dlbp bZ = dlbq.f.bZ();
        dpup bZ2 = dpuq.d.bZ();
        dpum h = akqsVar.a.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpuq dpuqVar = (dpuq) bZ2.b;
        h.getClass();
        dpuqVar.b = h;
        dpuqVar.a |= 1;
        dpum h2 = akqsVar.b.h();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpuq dpuqVar2 = (dpuq) bZ2.b;
        h2.getClass();
        dpuqVar2.c = h2;
        dpuqVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlbq dlbqVar = (dlbq) bZ.b;
        dpuq bK = bZ2.bK();
        bK.getClass();
        dlbqVar.b = bK;
        dlbqVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlbq dlbqVar2 = (dlbq) bZ.b;
        dlbqVar2.a |= 2;
        dlbqVar2.c = true;
        dnqh dnqhVar = e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlbq dlbqVar3 = (dlbq) bZ.b;
        dnqhVar.getClass();
        dlbqVar3.e = dnqhVar;
        int i = dlbqVar3.a | 8;
        dlbqVar3.a = i;
        dlbqVar3.d = dkzqVar.d;
        dlbqVar3.a = i | 4;
        this.i.a().e = btluVar;
        this.i.c().b(bZ.bK(), new agwk(d2), this.f);
        return d2;
    }

    @Override // defpackage.agwh
    public final dehn<diql> d(btlu btluVar, dldl dldlVar) {
        deig d2 = deig.d();
        this.j.a().e = btluVar;
        bumn c = this.j.c();
        diqi bZ = diqj.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diqj diqjVar = (diqj) bZ.b;
        dldlVar.getClass();
        dsrj<dldl> dsrjVar = diqjVar.b;
        if (!dsrjVar.a()) {
            diqjVar.b = dsqw.cl(dsrjVar);
        }
        diqjVar.b.add(dldlVar);
        dnqh dnqhVar = e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        diqj diqjVar2 = (diqj) bZ.b;
        dnqhVar.getClass();
        diqjVar2.c = dnqhVar;
        diqjVar2.a |= 1;
        c.b(bZ.bK(), new agwl(d2), this.f);
        return d2;
    }
}
