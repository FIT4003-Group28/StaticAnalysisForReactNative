package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acje  reason: default package */
/* loaded from: classes.dex */
public class acje extends dp implements axoo {
    private ContextWrapper a;
    private volatile axoe b;
    private final Object c = new Object();
    private boolean d = false;

    private final void o() {
        if (this.a == null) {
            this.a = axoe.b(super.rb(), this);
        }
    }

    @Override // defpackage.dp
    public void T(Activity activity) {
        super.T(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axoe.a(contextWrapper) != activity) {
            z = false;
        }
        awwc.n(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        o();
        n();
    }

    @Override // defpackage.axoo
    /* renamed from: a */
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

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        o();
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
        if (!this.d) {
            this.d = true;
            acjs acjsVar = (acjs) this;
            eao eaoVar = (eao) lI();
            acjsVar.a = (abiq) eaoVar.c.ck.get();
            acjsVar.b = (abie) eaoVar.c.cB.get();
            acjsVar.c = eaoVar.b.cI();
            acjsVar.d = eaoVar.c.iK();
            acjsVar.e = (abks) eaoVar.b.xt.get();
            acjsVar.ae = eaoVar.c.hz();
            acjsVar.as = eaoVar.c.kz();
            eaoVar.c.fr();
            acjsVar.af = (ajjr) eaoVar.b.dU.get();
            acjsVar.ag = (tdu) eaoVar.b.xx.get();
            dwq dwqVar = eaoVar.c;
            acjsVar.ah = dwqVar.aL;
            acjsVar.ai = dwqVar.hk();
            acjsVar.aj = (ajyi) eaoVar.c.cx.get();
        }
    }

    @Override // defpackage.dp
    public final Context rb() {
        if (super.rb() == null && this.a == null) {
            return null;
        }
        o();
        return this.a;
    }
}
