package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: akmz  reason: default package */
/* loaded from: classes.dex */
class akmz extends aljp implements axoo {
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
    public void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aE();
        aH();
    }

    @Override // defpackage.axoo
    /* renamed from: aG */
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

    protected final void aH() {
        if (!this.ah) {
            this.ah = true;
            akmx akmxVar = (akmx) this;
            eao eaoVar = (eao) lI();
            akmxVar.ae = (ajmy) eaoVar.b.kC.get();
            akmxVar.af = eaoVar.c.iK();
            dwq dwqVar = eaoVar.c;
            azqb azqbVar = dwqVar.f;
            azqb azqbVar2 = dwqVar.H;
            dyo dyoVar = eaoVar.b;
            akmxVar.ag = new akkv(azqbVar, azqbVar2, dyoVar.mm, dyoVar.mn, dyoVar.a.bu);
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
        if (super.rb() == null && this.ae == null) {
            return null;
        }
        aE();
        return this.ae;
    }
}
