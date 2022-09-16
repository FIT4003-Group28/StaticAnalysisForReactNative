package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acjj  reason: default package */
/* loaded from: classes.dex */
public class acjj extends akeb {
    private ContextWrapper a;
    private boolean b = false;

    private final void a() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.akdk, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        n();
    }

    @Override // defpackage.akdk, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        n();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(LayoutInflater.from(axoe.c(ax(), this)), this));
    }

    @Override // defpackage.akdk
    public final void n() {
        if (!this.b) {
            this.b = true;
            acll acllVar = (acll) this;
            eao eaoVar = (eao) lI();
            acllVar.aQ = (acti) eaoVar.c.je.get();
            acllVar.aR = (akdr) eaoVar.b.yY.get();
            acllVar.au = (Handler) eaoVar.b.an.get();
            acllVar.av = (aafo) eaoVar.c.H.get();
            acllVar.aw = (ajmy) eaoVar.b.kC.get();
            acllVar.ax = (wal) eaoVar.b.au.get();
            acllVar.ay = (ajhr) eaoVar.c.dQ.get();
            acllVar.az = (ache) eaoVar.b.a.bn.get();
            acllVar.aA = (abzn) eaoVar.c.ht.get();
            SparseBooleanArray sparseBooleanArray = abwv.a;
            ConnectivityManager connectivityManager = (ConnectivityManager) eaoVar.c.a().getSystemService("connectivity");
            acllVar.aB = (aclk) eaoVar.c.nr.get();
            acllVar.aC = (afre) eaoVar.c.hv.get();
            afvn afvnVar = (afvn) eaoVar.b.au.get();
            aawp aawpVar = (aawp) eaoVar.b.a.ah.get();
            eaoVar.c.iA();
            eaoVar.c.iz();
            acllVar.aD = (achm) eaoVar.c.hx.get();
            acllVar.aE = (snc) eaoVar.b.v.get();
            acllVar.aF = eaoVar.c.hQ();
            acllVar.aG = eaoVar.c.hz();
            acllVar.aH = (akfo) eaoVar.c.af.get();
            acly aclyVar = (acly) eaoVar.b.yO.get();
            acllVar.aI = eaoVar.c.hD();
            dyo dyoVar = eaoVar.b;
            acllVar.aJ = new aciy(dyoVar.a.bq, dyoVar.x);
            acllVar.aK = (SharedPreferences) eaoVar.b.t.get();
            acllVar.aL = eaoVar.c.iV();
            acllVar.aM = (acgf) eaoVar.b.a.F.get();
            acllVar.aN = (abzb) eaoVar.b.a.bq.get();
            acllVar.aO = eaoVar.c.hh();
            acllVar.aP = (acti) eaoVar.c.je.get();
        }
    }

    @Override // defpackage.akdk, defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
