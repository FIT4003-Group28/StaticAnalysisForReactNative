package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lmd  reason: default package */
/* loaded from: classes3.dex */
public class lmd extends aknr {
    private boolean aK = false;
    private ContextWrapper ae;

    private final void aJ() {
        if (this.ae == null) {
            this.ae = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.aknb, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aJ();
        aE();
    }

    @Override // defpackage.aknb
    public final void aE() {
        if (!this.aK) {
            this.aK = true;
            lmc lmcVar = (lmc) this;
            eao eaoVar = (eao) lI();
            lmcVar.ao = (akpj) eaoVar.b.a.bh.get();
            lmcVar.ap = (aknz) eaoVar.b.a.bi.get();
            lmcVar.aq = axot.a(eaoVar.c.mP);
            lmcVar.ar = axot.a(eaoVar.c.mQ);
            lmcVar.as = (Handler) eaoVar.b.an.get();
            lmcVar.at = (Executor) eaoVar.b.x.get();
            lmcVar.au = (ajgz) eaoVar.c.cA.get();
            lmcVar.av = eaoVar.b.cI();
            lmcVar.aw = (yzj) eaoVar.b.je.get();
            lmcVar.ax = (yni) eaoVar.b.y.get();
            lmcVar.ay = (ScheduledExecutorService) eaoVar.b.h.get();
            lmcVar.az = (ankw) eaoVar.b.aA.get();
            lmcVar.aA = (ajmy) eaoVar.b.kC.get();
            lmcVar.aB = (aaun) eaoVar.b.xW.get();
            lmcVar.aC = (ces) eaoVar.b.fC.get();
            lmcVar.aD = (SharedPreferences) eaoVar.b.t.get();
            lmcVar.aE = eaoVar.c.iK();
            lmcVar.aF = (ajsk) eaoVar.c.ae.get();
            lmcVar.aG = (aafo) eaoVar.c.H.get();
            lmcVar.aH = (snc) eaoVar.b.v.get();
            lmcVar.aJ = (aacz) eaoVar.b.D.get();
            lmcVar.aI = eaoVar.c.gt();
            lmcVar.ae = (feu) eaoVar.b.wt.get();
        }
    }

    @Override // defpackage.aknb, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aJ();
        aE();
    }

    @Override // defpackage.aknb, defpackage.dh, defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(super.lS(bundle), this));
    }

    @Override // defpackage.aknb, defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.ae == null) {
            return null;
        }
        aJ();
        return this.ae;
    }
}
