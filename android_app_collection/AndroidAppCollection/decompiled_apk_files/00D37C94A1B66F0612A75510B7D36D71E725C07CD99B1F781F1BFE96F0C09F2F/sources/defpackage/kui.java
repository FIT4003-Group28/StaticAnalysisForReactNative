package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kui  reason: default package */
/* loaded from: classes3.dex */
class kui extends gbd implements axoo {
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
        q();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        n();
        q();
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
    /* renamed from: p */
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

    protected final void q() {
        if (!this.d) {
            this.d = true;
            kvz kvzVar = (kvz) this;
            eao eaoVar = (eao) lI();
            kvzVar.ar = axot.a(eaoVar.b.rN);
            kvzVar.av = (aacz) eaoVar.b.D.get();
            kvzVar.as = (fsx) eaoVar.c.iA.get();
            kvzVar.at = (gbh) eaoVar.c.aa.get();
            kvzVar.au = (gbq) eaoVar.c.l.get();
            dyo dyoVar = eaoVar.b;
            kvzVar.a = dyoVar.xZ;
            kvzVar.b = dyoVar.a.ad;
            kvzVar.c = (Executor) dyoVar.h.get();
            kvzVar.d = (Executor) eaoVar.b.x.get();
            kvzVar.e = (lbl) eaoVar.b.uB.get();
            kvzVar.aP = (sdb) eaoVar.c.ee.get();
            kvzVar.ae = (acvh) eaoVar.b.ef.get();
            kvzVar.aN = (aacz) eaoVar.b.D.get();
            kvzVar.af = (SharedPreferences) eaoVar.b.t.get();
            kvzVar.ag = (aadd) eaoVar.b.K.get();
            kvzVar.ah = (ezh) eaoVar.c.A.get();
            kvzVar.ai = (akho) eaoVar.b.zx.get();
            kvzVar.aj = (afvn) eaoVar.b.au.get();
            kvzVar.ak = (lvl) eaoVar.c.iC.get();
            kvzVar.al = (akfw) eaoVar.c.gX.get();
            kvzVar.am = eaoVar.c.dE();
            kvzVar.an = (akhn) eaoVar.b.ux.get();
            kvzVar.ao = eaoVar.c.dG();
            kvzVar.aO = egd.C((aadd) eaoVar.b.a.bF.c.K.get());
            kvzVar.aw = (akvm) eaoVar.b.hl.get();
            kvzVar.ax = (aafo) eaoVar.c.H.get();
            kvzVar.ay = (ajmy) eaoVar.b.kC.get();
            kvzVar.az = (axxv) eaoVar.b.a.aW.get();
            kvzVar.aA = (axxo) eaoVar.b.a.ak.get();
        }
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
