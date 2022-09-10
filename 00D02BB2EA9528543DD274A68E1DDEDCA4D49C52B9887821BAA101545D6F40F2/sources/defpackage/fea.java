package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fea  reason: default package */
/* loaded from: classes6.dex */
public final class fea implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<ajae> b;

    public fea(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aiws aiwsVar = (aiws) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aiwsVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aiwsVar.aI = tr;
        aiwsVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aiwsVar.aK = sU;
        aiwsVar.aL = new cpv();
        aiwsVar.aM = dxjc.c(this.a.eW.ie());
        aiwsVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aiwsVar.b = this.a.wl();
        aiwsVar.c = this.a.wq();
        aiwsVar.d = this.a.wd();
        aiwsVar.e = this.a.eW.ot();
        aiwsVar.f = this.a.eW.jt();
        aiwsVar.g = this.a.eW.es();
        aiwsVar.ad = this.a.ds();
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        aiwsVar.ae = rR;
        aiwsVar.af = this.a.dn();
        aiwsVar.ag = new cqhn();
        Resources c = this.a.eW.a.c();
        dxjg.e(c);
        aiwsVar.ah = new ajex(c);
        Resources c2 = this.a.eW.a.c();
        dxjg.e(c2);
        aiwsVar.ai = new ajew(c2);
        aiwsVar.aj = this.a.m20do();
        aiwsVar.ak = this.a.uc();
        aiwsVar.al = dxjc.c(this.a.m());
        aiwsVar.am = this.a.ue();
        aiwsVar.an = dxjc.c(this.a.bh());
        aiwsVar.ao = this.a.cv();
        aiwsVar.ap = this.a.uf();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fdz(this);
            this.b = dzsjVar;
        }
        aiwsVar.aq = dxjc.c(dzsjVar);
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        aiwsVar.ar = rp;
        aiwsVar.as = new cpv();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        aiwsVar.at = rK;
        aiwsVar.au = dxjc.c(this.a.cB());
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        aiwsVar.av = sU2;
    }
}
