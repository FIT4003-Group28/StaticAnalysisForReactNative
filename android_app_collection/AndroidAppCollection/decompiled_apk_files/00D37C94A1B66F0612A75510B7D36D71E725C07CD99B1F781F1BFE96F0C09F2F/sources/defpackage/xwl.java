package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xwl  reason: default package */
/* loaded from: classes4.dex */
public class xwl extends xvb implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aE() {
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
        aE();
        aW();
    }

    @Override // defpackage.axoo
    /* renamed from: aV */
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

    protected final void aW() {
        if (!this.ah) {
            this.ah = true;
            xuz xuzVar = (xuz) this;
            eao eaoVar = (eao) lI();
            xuzVar.ae = (ajmy) eaoVar.b.kC.get();
            xuzVar.af = (aafo) eaoVar.c.H.get();
            xuzVar.ag = (xrw) eaoVar.b.a.ay.get();
            xuzVar.ah = (ajyi) eaoVar.c.ah.get();
            xuzVar.ai = (afvn) eaoVar.b.au.get();
            xuzVar.aj = (akys) eaoVar.b.mY.get();
            xuzVar.ak = eaoVar.b.cI();
            xuzVar.al = eaoVar.c.iK();
            xuzVar.am = new xty(eaoVar.c.a(), (ajxz) eaoVar.b.lV.get());
            xuzVar.an = (ajmr) eaoVar.b.kz.get();
            dxs dxsVar = eaoVar.b.a;
            xuzVar.ao = new xwy(dxsVar.bl, eaoVar.c.H, dxsVar.aA);
            xuzVar.ap = (xqj) eaoVar.b.a.aA.get();
            eaoVar.c.iA();
            xuzVar.aq = (aagi) eaoVar.b.dD.get();
            xuzVar.ar = (akfc) eaoVar.aI.get();
            xuzVar.as = (akge) eaoVar.aH.get();
            xuzVar.bj = eaoVar.c.cv();
            xuzVar.at = (Executor) eaoVar.b.x.get();
            xuzVar.au = (ayor) eaoVar.b.iz.get();
            xuzVar.av = (snc) eaoVar.b.v.get();
            xuzVar.aw = (xrl) eaoVar.b.a.bl.get();
            xuzVar.ax = new xqv((xrl) eaoVar.b.a.bl.get(), (xrw) eaoVar.b.a.ay.get());
            xuzVar.ay = (xse) eaoVar.b.yJ.get();
            xuzVar.bk = (vne) eaoVar.b.a.bm.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aE();
        aW();
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
        aE();
        return this.ae;
    }
}
