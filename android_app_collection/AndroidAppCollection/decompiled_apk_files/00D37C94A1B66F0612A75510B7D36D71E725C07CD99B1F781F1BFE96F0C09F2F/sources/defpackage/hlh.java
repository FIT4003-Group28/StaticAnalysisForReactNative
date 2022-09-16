package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hlh  reason: default package */
/* loaded from: classes3.dex */
public abstract class hlh extends zwx implements axoo {
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
        p();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        p();
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

    protected final void p() {
        if (!this.d) {
            this.d = true;
            hnu hnuVar = (hnu) this;
            eao eaoVar = (eao) lI();
            hnuVar.az = (File) eaoVar.b.cS.get();
            hnuVar.aA = (SharedPreferences) eaoVar.b.t.get();
            hnuVar.aB = eaoVar.c.gv();
            hnuVar.aC = (aadd) eaoVar.b.K.get();
            hnuVar.aD = (ajmr) eaoVar.b.kz.get();
            hnuVar.aE = eaoVar.c.lY;
            hnuVar.ax = (aacz) eaoVar.b.D.get();
            hnuVar.e = (akvm) eaoVar.b.hl.get();
            hnuVar.ae = eaoVar.b.cI();
            hnuVar.af = eaoVar.q();
            hnuVar.ag = new hok(eaoVar.c.a());
            hnuVar.ah = (hoi) eaoVar.y.get();
            hnuVar.ai = new hni((afvn) eaoVar.b.au.get(), (aafo) eaoVar.c.H.get(), (Handler) eaoVar.b.an.get(), eaoVar.b.fV(), new zsz((acrr) eaoVar.b.aw.get()), (akys) eaoVar.b.mY.get(), eaoVar.c.ch(), (hwq) eaoVar.b.a.aG.get(), (wal) eaoVar.b.au.get(), (ajmy) eaoVar.b.kC.get(), (gfu) eaoVar.b.eA.get(), (vne) eaoVar.b.a.n.get());
            hnuVar.aj = new hoy(eaoVar.c.a(), new hox(eaoVar.c.a(), (ajmr) eaoVar.b.kz.get(), (ajxz) eaoVar.b.lV.get(), (aafo) eaoVar.c.H.get()));
            hnuVar.ak = new hms();
            hnuVar.al = new hmq();
            hnuVar.am = new hom();
            hnuVar.an = new hnk();
            hnuVar.ao = new hpi((hwq) eaoVar.b.a.aG.get(), (ajxz) eaoVar.b.lV.get(), (Handler) eaoVar.b.an.get(), new htj((Handler) eaoVar.b.an.get(), (hvy) eaoVar.p.get(), eaoVar.v(), eaoVar.t(), eaoVar.y(), eaoVar.A(), eaoVar.u(), eaoVar.B()), (hvy) eaoVar.p.get(), eaoVar.x(), (hoi) eaoVar.y.get());
            hnuVar.ap = eaoVar.x();
            hnuVar.aq = (hwq) eaoVar.b.a.aG.get();
            hnuVar.ar = axot.a(eaoVar.z);
            hnuVar.as = axot.a(eaoVar.A);
            hnuVar.at = axot.a(eaoVar.B);
            hnuVar.au = axot.a(eaoVar.C);
            hnuVar.av = eaoVar.c.lZ;
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
