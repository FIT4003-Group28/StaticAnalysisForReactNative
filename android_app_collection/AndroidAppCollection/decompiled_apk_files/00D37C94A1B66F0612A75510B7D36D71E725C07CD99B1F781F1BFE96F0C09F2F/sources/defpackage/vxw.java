package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vxw  reason: default package */
/* loaded from: classes4.dex */
public class vxw extends dh implements axoo {
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
        aM();
    }

    @Override // defpackage.axoo
    /* renamed from: aL */
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

    protected final void aM() {
        if (!this.ah) {
            this.ah = true;
            vxj vxjVar = (vxj) this;
            eao eaoVar = (eao) lI();
            vxjVar.ah = (aadd) eaoVar.b.K.get();
            vxjVar.ai = eaoVar.c.iz();
            eaoVar.c.iA();
            vxjVar.aj = (vxk) eaoVar.c.ga.get();
            vxjVar.ak = (aafo) eaoVar.c.H.get();
            vxjVar.al = (yzj) eaoVar.b.je.get();
            vxjVar.am = (ajmr) eaoVar.b.kz.get();
            vxjVar.an = (aatp) eaoVar.b.xY.get();
            vxjVar.ao = new vxz(eaoVar.c.a(), (aafo) eaoVar.c.H.get(), (vxk) eaoVar.c.ga.get());
            vxjVar.ap = (aaqp) eaoVar.b.ih.get();
            vxjVar.aq = (aagi) eaoVar.b.dD.get();
            vxjVar.ar = (was) eaoVar.c.gs.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public void kt(Context context) {
        super.kt(context);
        aE();
        aM();
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
