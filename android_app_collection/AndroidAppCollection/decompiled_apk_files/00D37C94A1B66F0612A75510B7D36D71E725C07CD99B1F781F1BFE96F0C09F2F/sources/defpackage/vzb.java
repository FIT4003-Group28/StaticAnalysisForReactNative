package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vzb  reason: default package */
/* loaded from: classes4.dex */
public class vzb extends vwy implements axoo {
    private ContextWrapper af;
    private volatile axoe ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void aF() {
        if (this.af == null) {
            this.af = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aF();
        aI();
    }

    @Override // defpackage.axoo
    /* renamed from: aH */
    public final axoe lH() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new axoe(this);
                }
            }
        }
        return this.ag;
    }

    protected final void aI() {
        if (!this.ai) {
            this.ai = true;
            vyy vyyVar = (vyy) this;
            eao eaoVar = (eao) lI();
            vyyVar.af = (yzj) eaoVar.b.je.get();
            vyyVar.ag = (aasc) eaoVar.b.mG.get();
            vyyVar.ah = eaoVar.c.fx();
            vyyVar.ai = (wge) eaoVar.b.mH.get();
            dwq dwqVar = eaoVar.c;
            vyyVar.aj = dwqVar.H;
            vyyVar.ak = dwqVar.iU();
            vyyVar.al = (yni) eaoVar.b.y.get();
            vyyVar.am = (afvn) eaoVar.b.au.get();
            vyyVar.an = eaoVar.b.cI();
            vyyVar.ao = (ajmy) eaoVar.b.kC.get();
            vyyVar.ap = (whp) eaoVar.b.df.get();
            vyyVar.aq = eaoVar.c.iI();
            vyyVar.at = (vyw) eaoVar.c.mV.get();
            vyyVar.ar = (ajxz) eaoVar.b.lV.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aF();
        aI();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dh, defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(super.lS(bundle), this));
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.af == null) {
            return null;
        }
        aF();
        return this.af;
    }
}
