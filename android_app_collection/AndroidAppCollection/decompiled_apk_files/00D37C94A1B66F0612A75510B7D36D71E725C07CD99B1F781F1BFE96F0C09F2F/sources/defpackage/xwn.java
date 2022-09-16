package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: xwn  reason: default package */
/* loaded from: classes4.dex */
abstract class xwn extends xwc implements axoo {
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
        aL();
    }

    @Override // defpackage.axoo
    /* renamed from: aK */
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

    protected final void aL() {
        if (!this.ah) {
            this.ah = true;
            xwb xwbVar = (xwb) this;
            eao eaoVar = (eao) lI();
            xwbVar.aG = (aacz) eaoVar.b.D.get();
            xwbVar.ae = (aafo) eaoVar.c.H.get();
            xwbVar.aI = eaoVar.b.r();
            xwbVar.af = eaoVar.c.iX();
            xwbVar.ag = (ajvj) eaoVar.b.xq.get();
            xwbVar.ah = eaoVar.c.iY();
            xwbVar.ai = (ajmr) eaoVar.b.kz.get();
            xwbVar.aj = (ajxz) eaoVar.b.lV.get();
            xwbVar.ak = eaoVar.b.cI();
            xwbVar.al = (akfc) eaoVar.aK.get();
            xwbVar.am = (akge) eaoVar.aJ.get();
            xwbVar.an = (Context) eaoVar.c.ge.get();
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
        aL();
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
