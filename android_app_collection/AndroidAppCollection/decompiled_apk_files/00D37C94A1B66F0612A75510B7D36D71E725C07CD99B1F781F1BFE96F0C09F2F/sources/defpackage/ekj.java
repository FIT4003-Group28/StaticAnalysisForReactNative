package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ekj  reason: default package */
/* loaded from: classes3.dex */
class ekj extends gbd implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void n() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        n();
        aI();
    }

    @Override // defpackage.axoo
    /* renamed from: aH */
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

    protected final void aI() {
        if (!this.d) {
            this.d = true;
            eki ekiVar = (eki) this;
            eao eaoVar = (eao) lI();
            ekiVar.ar = axot.a(eaoVar.b.rN);
            ekiVar.av = (aacz) eaoVar.b.D.get();
            ekiVar.as = (fsx) eaoVar.c.iA.get();
            ekiVar.at = (gbh) eaoVar.c.aa.get();
            ekiVar.au = (gbq) eaoVar.c.l.get();
            ekiVar.b = (afvn) eaoVar.b.au.get();
            ekiVar.c = (yni) eaoVar.b.y.get();
            ekiVar.d = (yzj) eaoVar.b.je.get();
            ekiVar.e = (aaub) eaoVar.b.yf.get();
            ekiVar.ae = (ajmy) eaoVar.b.kC.get();
            ekiVar.af = (was) eaoVar.c.gs.get();
            ekiVar.ag = (eis) eaoVar.c.hL.get();
            ekiVar.ah = (aafo) eaoVar.c.H.get();
            ekiVar.ai = (akjm) eaoVar.b.zG.get();
            ekiVar.aj = (Executor) eaoVar.b.x.get();
            ajxz ajxzVar = (ajxz) eaoVar.b.lV.get();
            ekiVar.ak = eaoVar.c.hK;
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        n();
        aI();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        n();
        return this.a;
    }
}
