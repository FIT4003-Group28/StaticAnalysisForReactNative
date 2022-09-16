package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: ipg  reason: default package */
/* loaded from: classes3.dex */
class ipg extends dh implements axoo {
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
            iqw iqwVar = (iqw) this;
            eao eaoVar = (eao) lI();
            iqwVar.ah = eaoVar.c.im();
            iqwVar.ai = (ajmy) eaoVar.b.kC.get();
            iqwVar.ak = (adoa) eaoVar.b.jq.get();
            iqwVar.al = eaoVar.c.ir();
            iqwVar.am = eaoVar.c.ip();
            iqwVar.an = (yni) eaoVar.b.y.get();
            iqwVar.ao = (izq) eaoVar.c.ab.get();
            iqwVar.ap = eaoVar.c.in();
            iqwVar.aq = (niz) eaoVar.c.ab.get();
            iqwVar.ar = (nxh) eaoVar.c.r.get();
            iqwVar.aE = (aacz) eaoVar.b.D.get();
            iqwVar.as = (fvf) eaoVar.c.bf.get();
            iqwVar.aA = (yzj) eaoVar.b.je.get();
            iqwVar.aB = eaoVar.b.cI();
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
