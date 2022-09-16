package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wgn  reason: default package */
/* loaded from: classes4.dex */
public class wgn extends vwy implements axoo {
    private ContextWrapper af;
    private volatile axoe ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void aG() {
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
        aG();
        aH();
    }

    @Override // defpackage.axoo
    /* renamed from: aF */
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

    protected final void aH() {
        if (!this.ai) {
            this.ai = true;
            wgw wgwVar = (wgw) this;
            eao eaoVar = (eao) lI();
            wgwVar.af = (yzj) eaoVar.b.je.get();
            wgwVar.ag = (aasc) eaoVar.b.mG.get();
            wgwVar.ah = (yni) eaoVar.b.y.get();
            wgwVar.ai = eaoVar.b.cI();
            wgwVar.aj = (ajmy) eaoVar.b.kC.get();
            wgwVar.ak = (whp) eaoVar.b.df.get();
            wgwVar.al = (wge) eaoVar.b.mH.get();
            wgwVar.am = eaoVar.c.iI();
            wgwVar.an = (afvn) eaoVar.b.au.get();
            wgwVar.ao = eaoVar.c.fx();
            wgwVar.ap = (aafo) eaoVar.c.H.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aG();
        aH();
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
        aG();
        return this.af;
    }
}
