package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aknb  reason: default package */
/* loaded from: classes.dex */
public class aknb extends dh implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private void aG() {
        if (this.ae == null) {
            this.ae = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aG();
        aE();
    }

    public void aE() {
        if (!this.ah) {
            this.ah = true;
            aknr aknrVar = (aknr) this;
            eao eaoVar = (eao) lI();
            aknrVar.ao = (akpj) eaoVar.b.a.bh.get();
            aknrVar.ap = (aknz) eaoVar.b.a.bi.get();
            aknrVar.aq = axot.a(eaoVar.c.mP);
            aknrVar.ar = axot.a(eaoVar.c.mQ);
            aknrVar.as = (Handler) eaoVar.b.an.get();
            aknrVar.at = (Executor) eaoVar.b.x.get();
            aknrVar.au = (ajgz) eaoVar.c.cA.get();
            aknrVar.av = eaoVar.b.cI();
            aknrVar.aw = (yzj) eaoVar.b.je.get();
            aknrVar.ax = (yni) eaoVar.b.y.get();
            aknrVar.ay = (ScheduledExecutorService) eaoVar.b.h.get();
            aknrVar.az = (ankw) eaoVar.b.aA.get();
            aknrVar.aA = (ajmy) eaoVar.b.kC.get();
            aknrVar.aB = (aaun) eaoVar.b.xW.get();
            aknrVar.aC = (ces) eaoVar.b.fC.get();
            aknrVar.aD = (SharedPreferences) eaoVar.b.t.get();
            aknrVar.aE = eaoVar.c.iK();
            aknrVar.aF = (ajsk) eaoVar.c.ae.get();
            aknrVar.aG = (aafo) eaoVar.c.H.get();
            aknrVar.aH = (snc) eaoVar.b.v.get();
            aknrVar.aJ = (aacz) eaoVar.b.D.get();
            aknrVar.aI = eaoVar.c.gt();
        }
    }

    @Override // defpackage.axoo
    /* renamed from: aF */
    public final axoe lH() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new axoe(this);
                }
            }
        }
        return this.af;
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        aG();
        aE();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dh, defpackage.dp
    public LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(super.lS(bundle), this));
    }

    @Override // defpackage.dp
    public Context rb() {
        if (super.rb() == null && this.ae == null) {
            return null;
        }
        aG();
        return this.ae;
    }
}
