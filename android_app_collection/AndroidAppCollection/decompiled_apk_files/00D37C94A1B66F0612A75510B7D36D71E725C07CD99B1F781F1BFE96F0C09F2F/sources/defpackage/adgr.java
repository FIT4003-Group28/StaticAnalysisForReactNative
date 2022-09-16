package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adgr  reason: default package */
/* loaded from: classes.dex */
public class adgr extends bfm implements axoo {
    private ContextWrapper ag;
    private volatile axoe ah;
    private final Object ai = new Object();
    private boolean aj = false;

    private final void aH() {
        if (this.ag == null) {
            this.ag = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aH();
        aG();
    }

    @Override // defpackage.axoo
    /* renamed from: aF */
    public final axoe lH() {
        if (this.ah == null) {
            synchronized (this.ai) {
                if (this.ah == null) {
                    this.ah = new axoe(this);
                }
            }
        }
        return this.ah;
    }

    protected final void aG() {
        if (!this.aj) {
            this.aj = true;
            ((adhe) this).ag = ((eao) lI()).b.jT;
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aH();
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
        if (super.rb() == null && this.ag == null) {
            return null;
        }
        aH();
        return this.ag;
    }
}
