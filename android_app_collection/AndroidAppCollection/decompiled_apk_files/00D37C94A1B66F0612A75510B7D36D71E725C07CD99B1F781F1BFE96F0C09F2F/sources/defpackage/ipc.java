package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ipc  reason: default package */
/* loaded from: classes3.dex */
public class ipc extends dh implements axoo {
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
            iqa iqaVar = (iqa) this;
            eao eaoVar = (eao) lI();
            iqaVar.ao = eaoVar.b.cI();
            iqaVar.ap = (feu) eaoVar.b.wt.get();
            dyo dyoVar = eaoVar.b;
            azqb azqbVar = dyoVar.yc;
            azqb azqbVar2 = dyoVar.je;
            dwq dwqVar = eaoVar.c;
            iqaVar.aq = new nih(azqbVar, azqbVar2, dwqVar.dE, dwqVar.cW, dyoVar.y, dyoVar.dD, eaoVar.ad);
            iqaVar.ar = ohn.b((gfs) eaoVar.c.cf.get(), 2132083918, 2132083919);
            iqaVar.as = eaoVar.c.aE();
            iqaVar.at = (yni) eaoVar.b.y.get();
            iqaVar.au = (fud) eaoVar.ae.get();
            iqaVar.av = (fvf) eaoVar.af.get();
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
