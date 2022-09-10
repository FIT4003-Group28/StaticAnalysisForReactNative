package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iqr  reason: default package */
/* loaded from: classes.dex */
public final class iqr {
    private akqi a = akqi.a;
    private final dxio<akox> b;
    private final Resources c;
    private final akwu d;
    private final cjqq e;
    private final btvo f;

    public iqr(dxio<akox> dxioVar, Resources resources, cjqq cjqqVar, btvo btvoVar, akwu akwuVar) {
        this.b = dxioVar;
        this.c = resources;
        this.f = btvoVar;
        this.d = akwuVar;
        this.e = cjqqVar;
    }

    private final void c(boolean z, akqi akqiVar) {
        ddhj ddhjVar;
        cjta b = cjtd.b();
        b.d = dtxj.dl;
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = akqiVar.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b.s(bZ.bK());
        if (z) {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        } else {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        }
        b.w(ddhjVar);
        this.e.g().d(b.a());
    }

    public final void a(ilo iloVar) {
        akwr a = this.d.a();
        akqi akqiVar = new akqi(iloVar.ai().c);
        if (akqiVar.p(this.a)) {
            return;
        }
        if (!a.k() || !iloVar.n || akqiVar.equals(akqi.a)) {
            if (!a.j() || !iloVar.n || iloVar.i || akqiVar.equals(akqi.a)) {
                b();
                return;
            }
            dnip bZ = dniu.i.bZ();
            String o = akqiVar.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dniu dniuVar = (dniu) bZ.b;
            o.getClass();
            dniuVar.a |= 1;
            dniuVar.b = o;
            dniu dniuVar2 = (dniu) bZ.b;
            dniuVar2.h = 1;
            dniuVar2.a |= 128;
            dniu bK = bZ.bK();
            dnbh dnbhVar = btpf.d(this.c.getConfiguration()).e ? dnbh.CLIENT_MOBILE_TABLET : dnbh.CLIENT_MOBILE_PHONE;
            akox a2 = this.b.a();
            Resources resources = this.c;
            akrw akrwVar = new akrw("shl." + akqiVar.hashCode(), akry.SPOTLIGHT_HIGHLIGHTING);
            alyk q = alyl.q();
            alvg alvgVar = (alvg) q;
            alvgVar.d = bK;
            alvgVar.e = dnbhVar;
            q.h(this.f.getSpotlightHighlightingParameters().c);
            alyl p = q.b().p(a2.aj().ar());
            dxio<amom> c = a2.f.a().c();
            bnsn a3 = a2.i.a();
            akzh k = a2.k();
            ammc ammcVar = a2.t;
            bvkx bvkxVar = a2.u;
            amoh amohVar = a2.c;
            dbsk.s(amohVar);
            amco e = a2.h.a().e(akrwVar, p);
            cqat cqatVar = a2.a;
            dbsk.s(cqatVar);
            btvt btvtVar = a2.b;
            Executor executor = a2.y;
            Executor executor2 = a2.z;
            alyx a4 = a2.g.a();
            dbsk.s(a4);
            amyj amyjVar = a2.C;
            akrz akrzVar = a2.e;
            boolean A = a2.A();
            int b = aluv.b(resources);
            this.b.a().O("spotlight_area_highlighting", new amml(a3, k, akrwVar, p, new anbe(btvtVar, cqatVar), new amox(akrwVar, p, new amoj(2, b + b, false, true), null, amohVar, e, cqatVar, executor2, c, false, akrzVar, A), new aluz(a4), null, 2, true, 256, 256, false, true, ammcVar, bvkxVar, amohVar, e, executor, null, null, amyjVar, null, null, akrzVar));
            this.a = akqiVar;
            c(false, akqiVar);
            return;
        }
        c(true, akqiVar);
    }

    public final void b() {
        if (!this.a.equals(akqi.a)) {
            this.b.a().Q("spotlight_area_highlighting");
            this.a = akqi.a;
        }
    }
}
