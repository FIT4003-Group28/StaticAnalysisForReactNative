package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iph  reason: default package */
/* loaded from: classes3.dex */
public class iph extends dh implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aG() {
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
        aF();
    }

    @Override // defpackage.axoo
    /* renamed from: aE */
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

    protected final void aF() {
        if (!this.ah) {
            this.ah = true;
            irh irhVar = (irh) this;
            eao eaoVar = (eao) lI();
            irhVar.af = (aafo) eaoVar.c.H.get();
            irhVar.ag = (afvn) eaoVar.b.au.get();
            irhVar.ah = (afwc) eaoVar.b.vo.get();
            irhVar.ai = (acth) eaoVar.c.L.get();
            eaoVar.c.hf();
            irhVar.aj = eaoVar.c.he();
            yni yniVar = (yni) eaoVar.b.y.get();
            irhVar.ak = (yzj) eaoVar.b.je.get();
            irhVar.al = eaoVar.ag;
            dwq dwqVar = eaoVar.c;
            irhVar.am = new xzn(dwqVar.f, dwqVar.H, eaoVar.b.xJ, dwqVar.hN, dwqVar.hO);
            dwq dwqVar2 = eaoVar.c;
            irhVar.an = new yag(dwqVar2.f, dwqVar2.H, eaoVar.b.a.v, dwqVar2.hO);
            irhVar.ao = (ycs) eaoVar.b.a.v.get();
            irhVar.ap = new yao(eaoVar.c.f, eaoVar.ah, eaoVar.ai);
            irhVar.aA = (YpcOffersListDialogFragmentController) eaoVar.c.gx.get();
            irhVar.aq = eaoVar.c.iK();
            irhVar.ar = (feu) eaoVar.b.wt.get();
            irhVar.as = new xyw();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aG();
        aF();
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
        aG();
        return this.ae;
    }
}
