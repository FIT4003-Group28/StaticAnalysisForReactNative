package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hlg  reason: default package */
/* loaded from: classes3.dex */
public abstract class hlg extends hqv implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void o() {
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
        o();
        n();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        o();
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

    @Override // defpackage.axoo
    /* renamed from: mo */
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

    protected final void n() {
        if (!this.d) {
            this.d = true;
            hml hmlVar = (hml) this;
            eao eaoVar = (eao) lI();
            hmlVar.ay = new dxy(eaoVar.b, eaoVar.aQ, eaoVar.c);
            hmlVar.b = (Handler) eaoVar.b.an.get();
            hmlVar.at = (aacz) eaoVar.b.D.get();
            hmlVar.c = (aafo) eaoVar.c.H.get();
            hoz hozVar = (hoz) hqb.f(eaoVar.a, hoz.class);
            axzl.o(hozVar);
            hmlVar.d = new hpc((abbr) eaoVar.b.wo.get(), (afvn) eaoVar.b.au.get(), hozVar);
            hmlVar.e = eaoVar.c.gx();
            hmlVar.ae = eaoVar.c.gw();
            hmlVar.af = eaoVar.c.gw();
            hmlVar.ag = new zqr((snc) eaoVar.b.v.get());
            hmlVar.aw = (vne) eaoVar.b.a.n.get();
            hmlVar.ah = eaoVar.s();
            hmlVar.ai = eaoVar.z();
            hmlVar.aj = (gfu) eaoVar.b.eA.get();
            hmlVar.au = new akdy();
            hmlVar.ak = eaoVar.p();
            hmlVar.al = (hkl) eaoVar.b.yP.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        o();
        return this.a;
    }
}
