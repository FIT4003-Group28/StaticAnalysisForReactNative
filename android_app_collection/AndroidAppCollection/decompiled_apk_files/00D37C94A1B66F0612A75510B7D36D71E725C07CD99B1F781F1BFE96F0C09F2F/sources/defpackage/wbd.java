package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: wbd  reason: default package */
/* loaded from: classes4.dex */
class wbd extends dh implements axoo {
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
            wby wbyVar = (wby) this;
            eao eaoVar = (eao) lI();
            wbyVar.af = eaoVar.as();
            wbyVar.ag = eaoVar.ap();
            wbyVar.ah = eaoVar.aq();
            azqb azqbVar = eaoVar.c.f;
            dyo dyoVar = eaoVar.b;
            azqb azqbVar2 = dyoVar.au;
            dxs dxsVar = dyoVar.a;
            wbyVar.ai = new wcm(azqbVar, azqbVar2, azqbVar2, dxsVar.bj, azqbVar, dyoVar.an, eaoVar.aG, dxsVar.bk);
            wbyVar.aj = eaoVar.ar();
            wbyVar.ak = (wdc) eaoVar.b.yG.get();
            wbyVar.al = (acth) eaoVar.c.L.get();
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
