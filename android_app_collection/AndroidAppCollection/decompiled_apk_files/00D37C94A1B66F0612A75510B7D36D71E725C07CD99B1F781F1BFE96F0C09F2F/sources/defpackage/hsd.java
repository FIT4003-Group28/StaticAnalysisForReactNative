package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hsd  reason: default package */
/* loaded from: classes3.dex */
abstract class hsd extends hro implements axoo {
    private ContextWrapper aj;
    private volatile axoe ak;
    private final Object al = new Object();
    private boolean am = false;

    private final void aL() {
        if (this.aj == null) {
            this.aj = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aL();
        aJ();
    }

    @Override // defpackage.axoo
    /* renamed from: aI */
    public final axoe lH() {
        if (this.ak == null) {
            synchronized (this.al) {
                if (this.ak == null) {
                    this.ak = new axoe(this);
                }
            }
        }
        return this.ak;
    }

    protected final void aJ() {
        if (!this.am) {
            this.am = true;
            hsy hsyVar = (hsy) this;
            eao eaoVar = (eao) lI();
            ajxz ajxzVar = (ajxz) eaoVar.b.lV.get();
            hsyVar.ae = eaoVar.C();
            hsyVar.af = (acth) eaoVar.c.L.get();
            hwq hwqVar = (hwq) eaoVar.b.a.aG.get();
            afvn afvnVar = (afvn) eaoVar.b.au.get();
            hsyVar.aj = (abdx) eaoVar.b.a.aH.get();
            hsyVar.ak = eaoVar.v();
            hsyVar.al = eaoVar.y();
            hsyVar.am = eaoVar.z();
            hsyVar.an = (Executor) eaoVar.b.x.get();
            hsyVar.ao = new htc(eaoVar.w(), (acth) eaoVar.c.L.get());
            hsyVar.ap = new htx(eaoVar.s(), (Handler) eaoVar.b.an.get(), (acth) eaoVar.c.L.get());
            hsyVar.aq = (gfu) eaoVar.b.eA.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aL();
        aJ();
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
        if (super.rb() == null && this.aj == null) {
            return null;
        }
        aL();
        return this.aj;
    }
}
