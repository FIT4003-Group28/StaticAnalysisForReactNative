package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wbe  reason: default package */
/* loaded from: classes4.dex */
public class wbe extends wbj implements axoo {
    private ContextWrapper af;
    private volatile axoe ag;
    private final Object ah = new Object();
    private boolean ai = false;

    private final void r() {
        if (this.af == null) {
            this.af = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.wbj, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        r();
        n();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axoe lH() {
        if (this.ag == null) {
            synchronized (this.ah) {
                if (this.ag == null) {
                    this.ag = new axoe(this);
                }
            }
        }
        return this.ag;
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.wbj, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        r();
        n();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.wbj, defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(super.lS(bundle), this));
    }

    protected final void n() {
        if (!this.ai) {
            this.ai = true;
            wca wcaVar = (wca) this;
            eao eaoVar = (eao) lI();
            wcaVar.ag = eaoVar.as();
            wcaVar.ah = eaoVar.ap();
            wcaVar.ai = eaoVar.aq();
            wcaVar.aj = eaoVar.ar();
            wcaVar.ak = (wdc) eaoVar.b.yG.get();
            wcaVar.al = (acth) eaoVar.c.L.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.af == null) {
            return null;
        }
        r();
        return this.af;
    }
}
