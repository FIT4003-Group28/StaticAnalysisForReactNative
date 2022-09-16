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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioz  reason: default package */
/* loaded from: classes3.dex */
public class ioz extends gbd implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private void n() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        n();
        bC();
    }

    @Override // defpackage.axoo
    /* renamed from: bB */
    public final axoe lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axoe(this);
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void bC() {
        if (!this.d) {
            this.d = true;
            iou iouVar = (iou) this;
            eao eaoVar = (eao) lI();
            iouVar.ar = axot.a(eaoVar.b.rN);
            iouVar.av = (aacz) eaoVar.b.D.get();
            iouVar.as = (fsx) eaoVar.c.iA.get();
            iouVar.at = (gbh) eaoVar.c.aa.get();
            iouVar.au = (gbq) eaoVar.c.l.get();
            iouVar.ae = (fyg) eaoVar.c.jT.get();
            iouVar.al = axot.a(eaoVar.c.iR);
            iouVar.am = (luf) eaoVar.c.iF.get();
            iouVar.aC = (gfr) eaoVar.b.nP.get();
            iouVar.cn = (sdb) eaoVar.c.ee.get();
            iouVar.aE = (aath) eaoVar.b.kn.get();
            iouVar.aF = (ite) eaoVar.b.oj.get();
            iouVar.aG = axot.a(eaoVar.b.nx);
            iouVar.aH = (ajmy) eaoVar.b.kC.get();
            iouVar.aI = (yzj) eaoVar.b.je.get();
            iouVar.aJ = (snc) eaoVar.b.v.get();
            iouVar.aK = eaoVar.c.lE;
            iouVar.aL = (yni) eaoVar.b.y.get();
            iouVar.aM = (ajyi) eaoVar.c.ah.get();
            iouVar.aN = (agca) eaoVar.b.lZ.get();
            iouVar.aO = (Handler) eaoVar.b.an.get();
            dyo dyoVar = eaoVar.b;
            iouVar.aP = dyoVar.kF;
            afwu afwuVar = (afwu) dyoVar.mu.get();
            iouVar.aQ = (agbz) eaoVar.b.mi.get();
            iouVar.aR = (AppTabsBar) eaoVar.c.iE.get();
            iouVar.aS = eaoVar.ae();
            iouVar.aT = eaoVar.ag();
            iouVar.aU = eaoVar.ak();
            iouVar.aV = eaoVar.aj();
            iouVar.aW = eaoVar.ah();
            iouVar.aX = eaoVar.af();
            iouVar.aY = eaoVar.ai();
            iouVar.aZ = eaoVar.al();
            iouVar.ba = (nfz) eaoVar.c.as.get();
            iouVar.bb = eaoVar.an();
            iouVar.bc = eaoVar.b();
            iouVar.bd = (aafo) eaoVar.c.H.get();
            iouVar.be = eaoVar.c.gw;
            iouVar.bf = (lve) eaoVar.Y.get();
            iouVar.cl = (lnj) eaoVar.c.dR.get();
            iouVar.bg = eaoVar.V();
            iouVar.bh = eaoVar.W();
            iouVar.bi = eaoVar.am();
            iouVar.bj = (yzv) eaoVar.b.jc.get();
            iouVar.bk = (ydq) eaoVar.b.xJ.get();
            iouVar.cm = (aacz) eaoVar.b.D.get();
            iouVar.bl = (aadd) eaoVar.b.K.get();
            iouVar.co = (aiiv) eaoVar.c.mh.get();
            iouVar.bm = (InlinePlaybackLifecycleController) eaoVar.c.x.get();
            iouVar.bn = eaoVar.c.iT();
            iouVar.bo = (ActiveStateScrollSelectionController) eaoVar.c.ed.get();
            iouVar.bp = eaoVar.c.iS();
            iouVar.bq = eaoVar.c.ef();
            iouVar.br = eaoVar.c.ee();
            iouVar.bs = eaoVar.H();
            iouVar.bt = (zjb) eaoVar.b.mm.get();
            iouVar.bu = (aakt) eaoVar.b.eJ.get();
            iouVar.bv = eaoVar.c.iK();
            iouVar.bw = eaoVar.F();
            iouVar.bx = eaoVar.S();
            iouVar.by = (akfw) eaoVar.c.gX.get();
            iouVar.bz = (jln) eaoVar.b.xP.get();
            iouVar.bA = (fcd) eaoVar.b.od.get();
            iouVar.bB = (acrr) eaoVar.b.aw.get();
            iouVar.bC = eaoVar.c.mr;
            iouVar.bD = (ScheduledExecutorService) eaoVar.b.h.get();
            iouVar.bE = (fwx) eaoVar.c.gJ.get();
            iouVar.bF = (fxh) eaoVar.Z.get();
            dyo dyoVar2 = eaoVar.b;
            iouVar.bG = dyoVar2.lS;
            iouVar.bH = dyoVar2.as;
            iouVar.bI = Optional.empty();
            dwq dwqVar = eaoVar.c;
            iouVar.bJ = dwqVar.iT;
            iouVar.bK = (nfk) dwqVar.aE.get();
            iouVar.bL = (acvh) eaoVar.b.ef.get();
            iouVar.bM = (ezq) eaoVar.b.a.aB.get();
            iouVar.bN = (LayerableFilterEntityController) eaoVar.c.jz.get();
            iouVar.bO = (lwb) eaoVar.c.fX.get();
            iouVar.bP = (lwm) eaoVar.aa.get();
            iouVar.bQ = (lvz) eaoVar.ab.get();
            iouVar.bR = (lyr) eaoVar.ac.get();
            iouVar.bS = (tdu) eaoVar.b.a.aR.get();
            iouVar.bT = (ajxq) eaoVar.c.jQ.get();
            iouVar.bU = (akcq) eaoVar.b.cP.get();
            iouVar.bV = (akvm) eaoVar.b.hl.get();
            iouVar.bW = (gfu) eaoVar.b.eA.get();
            iouVar.bX = eaoVar.c.dE();
            iouVar.bY = eaoVar.c.dG();
            iouVar.bZ = gad.i();
            iouVar.ca = (nml) eaoVar.c.fV.get();
            iouVar.cb = (mas) eaoVar.c.he.get();
            iouVar.cc = axot.a(eaoVar.c.fx);
            iouVar.cd = (axwt) eaoVar.b.nN.get();
            iouVar.ce = (zex) eaoVar.b.fr.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        n();
        bC();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.dp
    public Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        n();
        return this.a;
    }
}
