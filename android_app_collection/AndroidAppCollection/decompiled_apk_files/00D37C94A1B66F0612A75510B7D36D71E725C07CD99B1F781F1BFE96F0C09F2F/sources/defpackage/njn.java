package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: njn  reason: default package */
/* loaded from: classes3.dex */
public abstract class njn extends akas implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aK() {
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
        aK();
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
            nju njuVar = (nju) this;
            eao eaoVar = (eao) lI();
            njuVar.ae = (yni) eaoVar.b.y.get();
            njuVar.af = eaoVar.c.ir();
            njuVar.ag = (ajxz) eaoVar.b.lV.get();
            njuVar.ah = (jxv) eaoVar.c.mR.get();
            njuVar.ai = (jzb) eaoVar.c.ep.get();
            njuVar.aj = (jxy) eaoVar.c.mS.get();
            njuVar.ak = (jya) eaoVar.c.mT.get();
            njuVar.al = (jyu) eaoVar.c.bg.get();
            njuVar.am = (jxr) eaoVar.c.er.get();
            njuVar.an = (jzd) eaoVar.c.eL.get();
            njuVar.ao = (jyf) eaoVar.c.mA.get();
            njuVar.ap = (jyk) eaoVar.c.ew.get();
            njuVar.aq = (SingleLoopMenuItemController) eaoVar.c.jy.get();
            njuVar.ar = (ajgz) eaoVar.c.cA.get();
            njuVar.az = (aacz) eaoVar.b.D.get();
            njuVar.as = (airw) eaoVar.c.n.get();
            njuVar.at = (goh) eaoVar.c.mU.get();
            njuVar.au = (MusicDeeplinkMenuItemController) eaoVar.c.jA.get();
            njuVar.av = (acti) eaoVar.c.au.get();
            njuVar.aA = (mdv) eaoVar.c.jV();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aK();
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
        aK();
        return this.ae;
    }
}
