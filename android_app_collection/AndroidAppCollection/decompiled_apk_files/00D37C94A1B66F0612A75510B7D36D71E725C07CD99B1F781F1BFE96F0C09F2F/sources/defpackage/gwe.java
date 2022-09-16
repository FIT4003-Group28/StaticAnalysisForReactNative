package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gwe  reason: default package */
/* loaded from: classes3.dex */
public abstract class gwe extends actq implements axoo {
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
            gxk gxkVar = (gxk) this;
            eao eaoVar = (eao) lI();
            gxkVar.ae = eaoVar.b.cI();
            gxkVar.af = axot.a(eaoVar.c.jj);
            gxkVar.ag = (hkl) eaoVar.b.yP.get();
            gxkVar.ah = (gfu) eaoVar.b.eA.get();
            gxkVar.bi = (gyn) eaoVar.c.hA.get();
            gxkVar.ai = (hhl) eaoVar.c.jH.get();
            gxkVar.aj = (hew) eaoVar.c.hz.get();
            gxkVar.ak = (hef) eaoVar.c.lR.get();
            gxkVar.al = (hfn) eaoVar.c.hB.get();
            gxkVar.am = eaoVar.l();
            gxkVar.an = eaoVar.k();
            gxkVar.ao = (hkg) eaoVar.c.jk.get();
            gxkVar.ap = (aafo) eaoVar.c.H.get();
            gxkVar.bj = (vne) eaoVar.b.a.n.get();
            gxkVar.aq = (hho) eaoVar.c.lT.get();
            gxkVar.ar = eaoVar.j();
            gxkVar.as = (Executor) eaoVar.b.x.get();
            gxkVar.at = (Executor) eaoVar.b.h.get();
            gxkVar.au = new hfy((hew) eaoVar.c.hz.get(), (hfn) eaoVar.c.hB.get());
            gxkVar.av = new hfv(eaoVar.c.a(), eaoVar.b.fk(), (hfn) eaoVar.c.hB.get());
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
