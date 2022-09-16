package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: mao  reason: default package */
/* loaded from: classes3.dex */
class mao extends aljp implements axoo {
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
            mar marVar = (mar) this;
            eao eaoVar = (eao) lI();
            Activity a = eaoVar.c.a();
            gew aU = eaoVar.c.aU();
            acth acthVar = (acth) eaoVar.c.L.get();
            dwq dwqVar = eaoVar.c;
            marVar.ae = new mat(a, aU, acthVar, dwqVar.ah, dwqVar.iT(), (tdu) eaoVar.b.xx.get(), axot.a(eaoVar.c.cd), eaoVar.c.cQ);
            marVar.af = eaoVar.c.aO();
            marVar.ag = (aafo) eaoVar.c.H.get();
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
