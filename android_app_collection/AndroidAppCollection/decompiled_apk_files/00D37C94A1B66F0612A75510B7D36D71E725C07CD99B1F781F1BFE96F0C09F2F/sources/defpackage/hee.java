package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hee  reason: default package */
/* loaded from: classes3.dex */
public abstract class hee extends hqv implements axoo {
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
        o();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        o();
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

    /* JADX WARN: Type inference failed for: r2v24, types: [hki, java.lang.Object] */
    protected final void o() {
        if (!this.d) {
            this.d = true;
            hes hesVar = (hes) this;
            eao eaoVar = (eao) lI();
            hesVar.ay = new dxy(eaoVar.b, eaoVar.aQ, eaoVar.c);
            hesVar.c = (Handler) eaoVar.b.an.get();
            hesVar.d = (hef) eaoVar.c.lR.get();
            hesVar.e = (gfu) eaoVar.b.eA.get();
            hesVar.ae = (hkl) eaoVar.b.yP.get();
            hesVar.af = (aafo) eaoVar.c.H.get();
            hesVar.ax = new hhe(eaoVar.c.k(), (hkl) eaoVar.b.yP.get());
            hesVar.ag = eaoVar.c.jL();
            hesVar.av = (gyn) eaoVar.c.hA.get();
            hesVar.ah = eaoVar.b.cI();
            hesVar.ai = (hhl) eaoVar.c.jH.get();
            hesVar.aw = (vne) eaoVar.b.a.aE.get();
            hesVar.aj = (hfn) eaoVar.c.hB.get();
            hesVar.ak = (hkg) eaoVar.c.jk.get();
            hesVar.al = (hho) eaoVar.c.lT.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
