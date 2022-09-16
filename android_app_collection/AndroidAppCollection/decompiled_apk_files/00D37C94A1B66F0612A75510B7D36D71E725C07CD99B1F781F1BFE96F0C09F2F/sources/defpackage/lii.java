package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lii  reason: default package */
/* loaded from: classes3.dex */
public class lii extends bja implements axoo {
    private ContextWrapper af;
    private volatile axoe ag;
    private final Object ah = new Object();
    private boolean aj = false;

    private final void aL() {
        if (this.af == null) {
            this.af = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.af;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aL();
        aN();
    }

    @Override // defpackage.axoo
    /* renamed from: aM */
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

    protected final void aN() {
        if (!this.aj) {
            this.aj = true;
            ((lie) this).af = ((eao) lI()).c.gk;
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aL();
        aN();
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
        if (super.rb() == null && this.af == null) {
            return null;
        }
        aL();
        return this.af;
    }
}
