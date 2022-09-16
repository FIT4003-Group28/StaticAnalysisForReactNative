package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.File;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aciz  reason: default package */
/* loaded from: classes.dex */
abstract class aciz extends actq implements axoo {
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
        aT();
    }

    @Override // defpackage.axoo
    /* renamed from: aS */
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

    protected final void aT() {
        if (!this.d) {
            this.d = true;
            acid acidVar = (acid) this;
            eao eaoVar = (eao) lI();
            File file = (File) eaoVar.b.cS.get();
            acidVar.a = (acti) eaoVar.c.je.get();
            acidVar.b = (Handler) eaoVar.b.an.get();
            acidVar.c = (aafo) eaoVar.c.H.get();
            acidVar.d = (Executor) eaoVar.b.h.get();
            acidVar.e = (ache) eaoVar.b.a.bn.get();
            acidVar.ae = (abzn) eaoVar.c.ht.get();
            acidVar.af = (acic) eaoVar.c.nd.get();
            acidVar.ag = (abtc) eaoVar.c.ne.get();
            acidVar.ah = (ajmy) eaoVar.b.kC.get();
            acidVar.ai = (ajzv) eaoVar.c.nf.get();
            acidVar.aj = eaoVar.c.hz();
            acidVar.ak = (aayl) eaoVar.b.a.bo.get();
            acly aclyVar = (acly) eaoVar.b.yO.get();
            acidVar.al = eaoVar.c.hD();
            acidVar.am = (akfo) eaoVar.c.af.get();
            acidVar.an = (SharedPreferences) eaoVar.b.t.get();
            acidVar.ao = (acgf) eaoVar.b.a.F.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        aT();
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
        a();
        return this.a;
    }
}
