package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hlf  reason: default package */
/* loaded from: classes3.dex */
public abstract class hlf extends actq implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
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
        a();
        s();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        s();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.axoo
    /* renamed from: n */
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

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }

    protected final void s() {
        if (!this.d) {
            this.d = true;
            hmc hmcVar = (hmc) this;
            eao eaoVar = (eao) lI();
            hmcVar.c = eaoVar.b.cI();
            hmcVar.d = (aadd) eaoVar.b.K.get();
            hmcVar.aA = (aacz) eaoVar.b.D.get();
            hmcVar.e = axot.a(eaoVar.c.jj);
            hmcVar.ae = eaoVar.u();
            hmcVar.aB = (vne) eaoVar.b.a.n.get();
            hmcVar.af = (hwq) eaoVar.b.a.aG.get();
            hmcVar.ag = (zwj) eaoVar.c.lX.get();
            hmcVar.al = (hkl) eaoVar.b.yP.get();
        }
    }
}
