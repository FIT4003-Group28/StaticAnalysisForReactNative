package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acjl  reason: default package */
/* loaded from: classes.dex */
class acjl extends dp implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        o();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        o();
    }

    @Override // defpackage.axon
    public final Object lI() {
        return lH().lI();
    }

    @Override // defpackage.dp
    public final LayoutInflater lS(Bundle bundle) {
        return LayoutInflater.from(axoe.c(ax(), this));
    }

    @Override // defpackage.axoo
    /* renamed from: n */
    public final axoe lH() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axoe(this);
                }
            }
        }
        return this.b;
    }

    protected final void o() {
        if (!this.d) {
            this.d = true;
            aclr aclrVar = (aclr) this;
            eao eaoVar = (eao) lI();
            eaoVar.b.cI();
            aclrVar.a = (abzn) eaoVar.c.ht.get();
            aclrVar.b = (aclq) eaoVar.c.nt.get();
            aclrVar.c = (ajmy) eaoVar.b.kC.get();
            aclrVar.d = (ache) eaoVar.b.a.bn.get();
            aclrVar.e = (aafo) eaoVar.c.H.get();
            aclrVar.ae = eaoVar.c.iK();
            aclrVar.af = (abtc) eaoVar.c.ne.get();
            aclrVar.ag = (Executor) eaoVar.b.h.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
