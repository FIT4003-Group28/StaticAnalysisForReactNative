package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jvt  reason: default package */
/* loaded from: classes3.dex */
public class jvt extends dp implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        q();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        q();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.axoo
    /* renamed from: p */
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

    protected final void q() {
        if (!this.d) {
            this.d = true;
            jwi jwiVar = (jwi) this;
            eao eaoVar = (eao) lI();
            jwiVar.a = (nub) eaoVar.c.dX.get();
            jwiVar.b = (ntx) eaoVar.c.dX.get();
            jwiVar.c = (yzj) eaoVar.b.je.get();
            jwiVar.d = (yni) eaoVar.b.y.get();
            jwiVar.e = (airw) eaoVar.c.n.get();
            jwiVar.ae = (YouTubePlayerOverlaysLayout) eaoVar.c.dj.get();
            jwiVar.af = eaoVar.c.mI;
            jwiVar.ag = (enr) eaoVar.at.get();
            jwiVar.ah = eaoVar.c.K();
            jwiVar.ai = (ahiw) eaoVar.b.ig.get();
            jvw jvwVar = (jvw) ((airw) eaoVar.c.n.get()).z();
            axzl.o(jvwVar);
            jwiVar.aj = jvwVar;
            jwiVar.ak = (aiop) eaoVar.au.get();
            jwiVar.al = (jvn) eaoVar.c.mJ.get();
            jwiVar.am = (wjy) eaoVar.b.sn.get();
            jwiVar.an = (ahub) eaoVar.b.rO.get();
            jwiVar.ao = (acti) eaoVar.c.au.get();
            jwiVar.ap = (ajas) eaoVar.b.vB.get();
            jwiVar.aq = (adft) eaoVar.c.kv.get();
            dwq dwqVar = eaoVar.c;
            jwiVar.ar = dwqVar.bE;
            jwiVar.as = dwqVar.mK;
            jwiVar.at = (ahsn) dwqVar.ab.get();
            jwiVar.au = (adoa) eaoVar.b.jq.get();
            jwiVar.av = (PlayerCollapsedStateMonitor) eaoVar.av.get();
            jwiVar.aw = (jvl) eaoVar.c.mL.get();
            jwiVar.ax = (jvx) eaoVar.aw.get();
            jwiVar.ay = eaoVar.c.ir();
            aiky w = ((airw) eaoVar.c.n.get()).w();
            axzl.o(w);
            jwiVar.az = w;
            jwiVar.aA = eaoVar.c.ip();
            jwiVar.aB = (ahkv) eaoVar.b.uI.get();
            jwiVar.aC = (jwb) eaoVar.ax.get();
            jwiVar.aD = eaoVar.c.dH;
            jwiVar.aE = (evm) eaoVar.b.xj.get();
            jwiVar.aF = (ghv) eaoVar.c.iY.get();
            jwiVar.aG = (yzm) eaoVar.c.B.get();
            jwiVar.aH = (BandaidConnectionOpenerController) eaoVar.b.wF.get();
            jwiVar.aI = eaoVar.b.wN;
            jwiVar.aJ = (fdw) eaoVar.c.al.get();
            jwiVar.aK = (oez) eaoVar.c.bm.get();
            jwiVar.aL = (feh) eaoVar.c.aV.get();
            jwiVar.aM = (ofu) eaoVar.c.ak.get();
            jwiVar.aN = (ezh) eaoVar.c.A.get();
            jwiVar.aU = (aacz) eaoVar.b.D.get();
            jwiVar.aO = (aadd) eaoVar.b.K.get();
            jwiVar.aP = (Executor) eaoVar.b.Q.get();
            jwiVar.aQ = (fnf) eaoVar.b.rB.get();
            jwiVar.aV = eaoVar.c.gj();
            jwiVar.aR = (gfu) eaoVar.b.eA.get();
            ahxx ahxxVar = (ahxx) eaoVar.b.xm.get();
            jwiVar.aS = (ghs) eaoVar.c.bu.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
