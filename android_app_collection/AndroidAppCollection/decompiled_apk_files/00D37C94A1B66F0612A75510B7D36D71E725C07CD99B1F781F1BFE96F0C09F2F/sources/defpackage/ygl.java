package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* compiled from: PG */
/* renamed from: ygl  reason: default package */
/* loaded from: classes4.dex */
class ygl extends dh implements axoo {
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
    public final void T(Activity activity) {
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
            yhg yhgVar = (yhg) this;
            eao eaoVar = (eao) lI();
            yhgVar.ah = (acth) eaoVar.c.L.get();
            yhgVar.ai = eaoVar.c.he();
            yhgVar.aj = (yzj) eaoVar.b.je.get();
            yhgVar.ak = eaoVar.c.iK();
            yhgVar.al = (yni) eaoVar.b.y.get();
            dwq dwqVar = eaoVar.c;
            yhgVar.am = dwqVar.ah;
            yhgVar.an = dwqVar.kX;
            yhgVar.ao = (ydq) eaoVar.b.xJ.get();
            yhgVar.ap = (dt) eaoVar.c.s.get();
            yhgVar.aq = (aaqp) eaoVar.b.ih.get();
            yhgVar.ar = (aadd) eaoVar.b.K.get();
            yhgVar.as = (aynx) eaoVar.b.yK.get();
            yhgVar.at = eaoVar.c.iT();
            yln ylnVar = (yln) eaoVar.b.Ag.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public void kt(Context context) {
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
