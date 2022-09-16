package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hyo  reason: default package */
/* loaded from: classes3.dex */
public class hyo extends ibl implements axoo {
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
    public void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        mx();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        a();
        mx();
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
    /* renamed from: mw */
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

    protected final void mx() {
        if (!this.d) {
            this.d = true;
            ico icoVar = (ico) this;
            eao eaoVar = (eao) lI();
            icoVar.d = (ihp) eaoVar.b.vV.get();
            icoVar.e = (ifm) eaoVar.b.vX.get();
            icoVar.ae = (gts) eaoVar.b.me.get();
            icoVar.af = (iai) eaoVar.H.get();
            icoVar.ag = (hyx) eaoVar.c.hl.get();
            icoVar.bB = (aafd) eaoVar.b.vJ.get();
            icoVar.ah = (ifu) eaoVar.b.a.aK.get();
            icoVar.ai = (icx) eaoVar.c.ma.get();
            icoVar.aj = (ReelPlaybackErrorLogger) eaoVar.c.mb.get();
            icoVar.ak = new ian((iee) eaoVar.c.hb.get(), (vne) eaoVar.b.a.aL.get(), (acth) eaoVar.c.L.get(), (iei) eaoVar.E.get());
            dwq dwqVar = eaoVar.c;
            icoVar.al = new ieu(dwqVar.f, eaoVar.b.kC, dwqVar.mc, dwqVar.L, eaoVar.M, eaoVar.E, eaoVar.N, eaoVar.O, eaoVar.T);
            icoVar.am = (iak) eaoVar.b.md.get();
            icoVar.an = (icr) eaoVar.I.get();
            icoVar.ao = (iee) eaoVar.c.hb.get();
            icoVar.ap = (icw) eaoVar.D.get();
            iel ielVar = (iel) eaoVar.G.get();
            icoVar.aq = new ias((acth) eaoVar.c.L.get(), (iei) eaoVar.E.get(), (iel) eaoVar.G.get());
            icoVar.ar = new idx(eaoVar.c.hb, eaoVar.E);
            icoVar.as = (hyu) eaoVar.b.a.R.get();
            icoVar.at = (iex) eaoVar.S.get();
            icoVar.au = (edd) eaoVar.b.rS.get();
            icoVar.av = eaoVar.c.iq();
            aikh aF = ((airw) eaoVar.c.a.vW.get()).aF();
            axzl.o(aF);
            icoVar.by = aF;
            aijf r = ((airw) eaoVar.c.a.vW.get()).r();
            axzl.o(r);
            icoVar.aw = r;
            icoVar.ax = eaoVar.c.io();
            icoVar.ay = (airw) eaoVar.b.vW.get();
            icoVar.az = (snc) eaoVar.b.v.get();
            icoVar.aA = (yni) eaoVar.b.y.get();
            icoVar.aB = (ajmy) eaoVar.b.kC.get();
            hqp hqpVar = (hqp) eaoVar.c.jl.get();
            icoVar.aC = (aafo) eaoVar.c.H.get();
            icoVar.aD = (afvn) eaoVar.b.au.get();
            icoVar.aE = (afwc) eaoVar.b.vo.get();
            icoVar.aF = (yzj) eaoVar.b.je.get();
            icoVar.aG = eaoVar.c.jA();
            icoVar.aH = (acth) eaoVar.c.L.get();
            icoVar.aI = (ahub) eaoVar.b.rO.get();
            icoVar.aJ = axot.a(eaoVar.b.eA);
            icoVar.aK = eaoVar.c.h();
            icoVar.aL = (Handler) eaoVar.b.an.get();
            icoVar.aM = (aiba) eaoVar.U.get();
            icoVar.aN = (SubtitlesOverlayPresenter) eaoVar.V.get();
            icoVar.aO = (aibi) eaoVar.c.et.get();
            icoVar.aP = axot.a(eaoVar.W);
            icoVar.aQ = axot.a(eaoVar.X);
            icoVar.aR = axot.a(eaoVar.c.cy);
            icoVar.aS = axot.a(eaoVar.c.me);
            icoVar.aT = (zdp) eaoVar.b.hN.get();
            icoVar.aU = (yrj) eaoVar.b.as.get();
            icoVar.aV = (afkf) eaoVar.b.gD.get();
            icoVar.bA = eaoVar.b.jH();
            icoVar.aW = (afst) eaoVar.b.hx.get();
            icoVar.bz = (aacz) eaoVar.b.D.get();
            icoVar.aX = (aadd) eaoVar.b.K.get();
            icoVar.aY = eaoVar.b.gp();
            icoVar.aZ = eaoVar.b.gq();
            icoVar.ba = eaoVar.b.gr();
            icoVar.bb = (acuu) eaoVar.b.ye.get();
            icoVar.bc = eaoVar.c.iH();
            icoVar.bd = amvn.r((apx) eaoVar.c.mb.get());
            icoVar.be = (yve) eaoVar.b.hX.get();
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
