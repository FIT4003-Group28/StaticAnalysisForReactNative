package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akmy  reason: default package */
/* loaded from: classes.dex */
public class akmy extends dh implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aE() {
        if (this.ae == null) {
            this.ae = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aE();
        aG();
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

    protected final void aG() {
        if (!this.ah) {
            this.ah = true;
            akmu akmuVar = (akmu) this;
            eao eaoVar = (eao) lI();
            akmuVar.af = eaoVar.b.cI();
            akmuVar.ag = (ajyi) eaoVar.c.ah.get();
            akmuVar.ah = eaoVar.c.iK();
            akmuVar.ai = (yni) eaoVar.b.y.get();
            akmuVar.aj = (aafo) eaoVar.c.H.get();
            akmuVar.ak = (snc) eaoVar.b.v.get();
            akmuVar.al = eaoVar.c.gs();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aE();
        aG();
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
        if (super.rb() == null && this.ae == null) {
            return null;
        }
        aE();
        return this.ae;
    }
}
