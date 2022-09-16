package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ablf  reason: default package */
/* loaded from: classes.dex */
public class ablf extends ablh implements axoo {
    private ContextWrapper b;
    private volatile axoe c;
    private final Object d = new Object();
    private boolean e = false;

    private final void p() {
        if (this.b == null) {
            this.b = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.ablh, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        p();
        n();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
    public final axoe lH() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new axoe(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        p();
        n();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    protected final void n() {
        if (!this.e) {
            this.e = true;
            ((ablu) this).b = (ajyi) ((eao) lI()).c.nb.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.b == null) {
            return null;
        }
        p();
        return this.b;
    }
}
