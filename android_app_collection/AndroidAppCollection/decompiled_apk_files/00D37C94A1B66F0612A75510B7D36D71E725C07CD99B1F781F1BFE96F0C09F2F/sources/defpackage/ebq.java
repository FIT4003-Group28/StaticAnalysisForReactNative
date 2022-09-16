package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ebq  reason: default package */
/* loaded from: classes3.dex */
public abstract class ebq extends actq implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void s() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        s();
        n();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axoe lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axoe(this);
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        s();
        n();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    protected final void n() {
        if (!this.d) {
            this.d = true;
            eby ebyVar = (eby) this;
            eao eaoVar = (eao) lI();
            ebyVar.a = (dt) eaoVar.c.s.get();
            dwq dwqVar = eaoVar.c;
            ebyVar.b = new fjy(dwqVar.f, dwqVar.dB);
            ebyVar.c = (aafo) eaoVar.c.H.get();
            ebyVar.d = (ajmy) eaoVar.b.kC.get();
            ebyVar.e = eaoVar.b.cI();
            ebyVar.ae = (ajxz) eaoVar.b.lV.get();
            ebyVar.af = eaoVar.b.G();
            ebyVar.ag = (ecd) eaoVar.c.iU.get();
            ebyVar.ah = eaoVar.c.iU();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        s();
        return this.a;
    }
}
