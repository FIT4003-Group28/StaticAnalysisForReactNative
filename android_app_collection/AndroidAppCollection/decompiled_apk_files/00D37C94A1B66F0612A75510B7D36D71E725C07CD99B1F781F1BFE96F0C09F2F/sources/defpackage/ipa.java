package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ipa  reason: default package */
/* loaded from: classes3.dex */
class ipa extends iou {
    private ContextWrapper cq;
    private boolean cr = false;

    private final void bD() {
        if (this.cq == null) {
            this.cq = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.ioz, defpackage.gbd, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.cq;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        bD();
        bC();
    }

    @Override // defpackage.ioz
    protected final void bC() {
        if (!this.cr) {
            this.cr = true;
            ipm ipmVar = (ipm) this;
            eao eaoVar = (eao) lI();
            ipmVar.ar = axot.a(eaoVar.b.rN);
            ipmVar.av = (aacz) eaoVar.b.D.get();
            ipmVar.as = (fsx) eaoVar.c.iA.get();
            ipmVar.at = (gbh) eaoVar.c.aa.get();
            ipmVar.au = (gbq) eaoVar.c.l.get();
            ipmVar.ae = (fyg) eaoVar.c.jT.get();
            ipmVar.al = axot.a(eaoVar.c.iR);
            ipmVar.am = (luf) eaoVar.c.iF.get();
            ipmVar.aC = (gfr) eaoVar.b.nP.get();
            ipmVar.cn = (sdb) eaoVar.c.ee.get();
            ipmVar.aE = (aath) eaoVar.b.kn.get();
            ipmVar.aF = (ite) eaoVar.b.oj.get();
            ipmVar.aG = axot.a(eaoVar.b.nx);
            ipmVar.aH = (ajmy) eaoVar.b.kC.get();
            ipmVar.aI = (yzj) eaoVar.b.je.get();
            ipmVar.aJ = (snc) eaoVar.b.v.get();
            ipmVar.aK = eaoVar.c.lE;
            ipmVar.aL = (yni) eaoVar.b.y.get();
            ipmVar.aM = (ajyi) eaoVar.c.ah.get();
            ipmVar.aN = (agca) eaoVar.b.lZ.get();
            ipmVar.aO = (Handler) eaoVar.b.an.get();
            dyo dyoVar = eaoVar.b;
            ipmVar.aP = dyoVar.kF;
            afwu afwuVar = (afwu) dyoVar.mu.get();
            ipmVar.aQ = (agbz) eaoVar.b.mi.get();
            ipmVar.aR = (AppTabsBar) eaoVar.c.iE.get();
            ipmVar.aS = eaoVar.ae();
            ipmVar.aT = eaoVar.ag();
            ipmVar.aU = eaoVar.ak();
            ipmVar.aV = eaoVar.aj();
            ipmVar.aW = eaoVar.ah();
            ipmVar.aX = eaoVar.af();
            ipmVar.aY = eaoVar.ai();
            ipmVar.aZ = eaoVar.al();
            ipmVar.ba = (nfz) eaoVar.c.as.get();
            ipmVar.bb = eaoVar.an();
            ipmVar.bc = eaoVar.b();
            ipmVar.bd = (aafo) eaoVar.c.H.get();
            ipmVar.be = eaoVar.c.gw;
            ipmVar.bf = (lve) eaoVar.Y.get();
            ipmVar.cl = (lnj) eaoVar.c.dR.get();
            ipmVar.bg = eaoVar.V();
            ipmVar.bh = eaoVar.W();
            ipmVar.bi = eaoVar.am();
            ipmVar.bj = (yzv) eaoVar.b.jc.get();
            ipmVar.bk = (ydq) eaoVar.b.xJ.get();
            ipmVar.cm = (aacz) eaoVar.b.D.get();
            ipmVar.bl = (aadd) eaoVar.b.K.get();
            ipmVar.co = (aiiv) eaoVar.c.mh.get();
            ipmVar.bm = (InlinePlaybackLifecycleController) eaoVar.c.x.get();
            ipmVar.bn = eaoVar.c.iT();
            ipmVar.bo = (ActiveStateScrollSelectionController) eaoVar.c.ed.get();
            ipmVar.bp = eaoVar.c.iS();
            ipmVar.bq = eaoVar.c.ef();
            ipmVar.br = eaoVar.c.ee();
            ipmVar.bs = eaoVar.H();
            ipmVar.bt = (zjb) eaoVar.b.mm.get();
            ipmVar.bu = (aakt) eaoVar.b.eJ.get();
            ipmVar.bv = eaoVar.c.iK();
            ipmVar.bw = eaoVar.F();
            ipmVar.bx = eaoVar.S();
            ipmVar.by = (akfw) eaoVar.c.gX.get();
            ipmVar.bz = (jln) eaoVar.b.xP.get();
            ipmVar.bA = (fcd) eaoVar.b.od.get();
            ipmVar.bB = (acrr) eaoVar.b.aw.get();
            ipmVar.bC = eaoVar.c.mr;
            ipmVar.bD = (ScheduledExecutorService) eaoVar.b.h.get();
            ipmVar.bE = (fwx) eaoVar.c.gJ.get();
            ipmVar.bF = (fxh) eaoVar.Z.get();
            dyo dyoVar2 = eaoVar.b;
            ipmVar.bG = dyoVar2.lS;
            ipmVar.bH = dyoVar2.as;
            ipmVar.bI = Optional.empty();
            dwq dwqVar = eaoVar.c;
            ipmVar.bJ = dwqVar.iT;
            ipmVar.bK = (nfk) dwqVar.aE.get();
            ipmVar.bL = (acvh) eaoVar.b.ef.get();
            ipmVar.bM = (ezq) eaoVar.b.a.aB.get();
            ipmVar.bN = (LayerableFilterEntityController) eaoVar.c.jz.get();
            ipmVar.bO = (lwb) eaoVar.c.fX.get();
            ipmVar.bP = (lwm) eaoVar.aa.get();
            ipmVar.bQ = (lvz) eaoVar.ab.get();
            ipmVar.bR = (lyr) eaoVar.ac.get();
            ipmVar.bS = (tdu) eaoVar.b.a.aR.get();
            ipmVar.bT = (ajxq) eaoVar.c.jQ.get();
            ipmVar.bU = (akcq) eaoVar.b.cP.get();
            ipmVar.bV = (akvm) eaoVar.b.hl.get();
            ipmVar.bW = (gfu) eaoVar.b.eA.get();
            ipmVar.bX = eaoVar.c.dE();
            ipmVar.bY = eaoVar.c.dG();
            ipmVar.bZ = gad.i();
            ipmVar.ca = (nml) eaoVar.c.fV.get();
            ipmVar.cb = (mas) eaoVar.c.he.get();
            ipmVar.cc = axot.a(eaoVar.c.fx);
            ipmVar.cd = (axwt) eaoVar.b.nN.get();
            ipmVar.ce = (zex) eaoVar.b.fr.get();
            ipmVar.cq = eaoVar.b.v();
            ipmVar.cr = (fcl) eaoVar.b.kI.get();
            ipmVar.cs = axot.a(eaoVar.c.jw);
        }
    }

    @Override // defpackage.ioz, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        bD();
        bC();
    }

    @Override // defpackage.ioz, defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(super.lS(bundle), this));
    }

    @Override // defpackage.iou, defpackage.ioz, defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.cq == null) {
            return null;
        }
        bD();
        return this.cq;
    }
}
