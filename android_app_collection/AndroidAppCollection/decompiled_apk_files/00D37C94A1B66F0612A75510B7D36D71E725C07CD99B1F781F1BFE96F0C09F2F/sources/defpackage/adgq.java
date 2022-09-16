package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adgq  reason: default package */
/* loaded from: classes.dex */
public class adgq extends bew implements axoo {
    private ContextWrapper ae;
    private volatile axoe af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aI() {
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
        aI();
        aH();
    }

    @Override // defpackage.axoo
    /* renamed from: aG */
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

    protected final void aH() {
        if (!this.ah) {
            this.ah = true;
            adhb adhbVar = (adhb) this;
            eao eaoVar = (eao) lI();
            adhbVar.af = (bgo) eaoVar.b.jC.get();
            adhbVar.ag = eaoVar.b.jK;
            adhbVar.ah = (adfa) eaoVar.c.jU.get();
            adhbVar.ai = eaoVar.b.de();
            adhbVar.aj = (yni) eaoVar.b.y.get();
            adhbVar.ak = (adgl) eaoVar.b.jS.get();
            adhbVar.al = (acyz) eaoVar.b.jw.get();
            adhbVar.am = new acyx((qst) eaoVar.b.a.br.get(), (aczd) eaoVar.b.kj.get());
            dyo dyoVar = eaoVar.b;
            adhbVar.an = dyoVar.jL;
            adhbVar.ao = dyoVar.gK().booleanValue();
            dyo dyoVar2 = eaoVar.b;
            adhbVar.ap = dyoVar2.a.bs;
            adhbVar.aq = (acwu) dyoVar2.iH.get();
            adhbVar.ar = (aczr) eaoVar.b.bg.get();
            adhbVar.as = (acth) eaoVar.c.L.get();
            adhbVar.at = (Executor) eaoVar.b.x.get();
            adhbVar.au = (adgj) eaoVar.b.jM.get();
        }
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        aI();
        aH();
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
        aI();
        return this.ae;
    }
}
