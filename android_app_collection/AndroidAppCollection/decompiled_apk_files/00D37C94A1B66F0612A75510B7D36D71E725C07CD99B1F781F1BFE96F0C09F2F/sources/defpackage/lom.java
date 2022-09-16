package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lom  reason: default package */
/* loaded from: classes3.dex */
public class lom extends dh implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aG() {
        if (this.ae == null) {
            this.ae = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aG();
        aF();
    }

    @Override // defpackage.axoo
    /* renamed from: aE */
    public final axoe lH() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new axoe(this);
                }
            }
        }
        return this.af;
    }

    protected final void aF() {
        if (!this.ah) {
            this.ah = true;
            lpw lpwVar = (lpw) this;
            eao eaoVar = (eao) lI();
            lpwVar.ae = eaoVar.c.F();
            lpwVar.af = eaoVar.aD;
            lpwVar.ag = eaoVar.aE;
            lpwVar.ah = eaoVar.ay;
            lpwVar.ai = eaoVar.aF;
            lpwVar.aj = (yni) eaoVar.b.y.get();
            lpwVar.ak = (fsx) eaoVar.c.iA.get();
            lpwVar.al = (advc) eaoVar.c.jC.get();
            lpwVar.am = eaoVar.c.iK();
            lpwVar.an = (afvn) eaoVar.b.au.get();
            lpwVar.ao = (fyy) eaoVar.c.am.get();
            lpwVar.ap = (aafo) eaoVar.c.H.get();
            lpwVar.aq = (gfu) eaoVar.b.eA.get();
            lpwVar.ar = (aadd) eaoVar.b.K.get();
            lpwVar.as = (ayor) eaoVar.b.iz.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        aG();
        aF();
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
        if (super.rb() == null && this.ae == null) {
            return null;
        }
        aG();
        return this.ae;
    }
}
