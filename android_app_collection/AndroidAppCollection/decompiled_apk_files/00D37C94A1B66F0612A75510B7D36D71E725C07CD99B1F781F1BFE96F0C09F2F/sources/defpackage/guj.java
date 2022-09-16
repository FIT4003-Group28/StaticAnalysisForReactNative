package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
/* compiled from: PG */
/* renamed from: guj  reason: default package */
/* loaded from: classes3.dex */
class guj extends aljp implements axoo {
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
            guo guoVar = (guo) this;
            eao eaoVar = (eao) lI();
            dyo dyoVar = eaoVar.b;
            guoVar.ae = new gur(dyoVar.kn, dyoVar.x, eaoVar.c.L, dyoVar.a.aB, dyoVar.ef);
            guoVar.af = (ReelBrowseFragmentToolbarController) eaoVar.h.get();
            guoVar.ag = (ReelBrowseFragmentFeedController) eaoVar.i.get();
            guoVar.ah = (guw) eaoVar.j.get();
            guoVar.ai = eaoVar.c.h();
            guoVar.aj = (acth) eaoVar.c.L.get();
            guoVar.al = (aadd) eaoVar.b.K.get();
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
