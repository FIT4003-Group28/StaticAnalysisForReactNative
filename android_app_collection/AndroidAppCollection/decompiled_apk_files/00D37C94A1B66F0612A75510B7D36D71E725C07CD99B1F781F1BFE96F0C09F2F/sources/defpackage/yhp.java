package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yhp  reason: default package */
/* loaded from: classes4.dex */
public class yhp extends dh implements axoo {
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
            yhw yhwVar = (yhw) this;
            eao eaoVar = (eao) lI();
            yhwVar.ae = eaoVar.c.a();
            yhwVar.af = (aafo) eaoVar.c.na.get();
            yhwVar.ag = (afvn) eaoVar.b.au.get();
            vzc vzcVar = (vzc) eaoVar.b.hY.get();
            yhwVar.ah = (ajmr) eaoVar.b.kz.get();
            yhwVar.ai = eaoVar.c.hf();
            yhwVar.aj = (yzj) eaoVar.b.je.get();
            yhwVar.ak = (afwc) eaoVar.b.vo.get();
            yhwVar.al = (ajxz) eaoVar.b.lV.get();
            yhwVar.am = (yni) eaoVar.b.y.get();
            yhwVar.an = (acth) eaoVar.c.L.get();
            yhwVar.ao = eaoVar.c.gb();
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
