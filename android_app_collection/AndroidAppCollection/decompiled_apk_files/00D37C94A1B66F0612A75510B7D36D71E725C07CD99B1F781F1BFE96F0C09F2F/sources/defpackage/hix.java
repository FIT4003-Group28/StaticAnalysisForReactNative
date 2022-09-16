package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hix  reason: default package */
/* loaded from: classes3.dex */
public class hix extends dp implements axoo {
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
    public final void T(Activity activity) {
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

    @Override // defpackage.axoo
    /* renamed from: ma */
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

    /* JADX WARN: Type inference failed for: r2v13, types: [hki, java.lang.Object] */
    protected final void n() {
        if (!this.d) {
            this.d = true;
            hjm hjmVar = (hjm) this;
            eao eaoVar = (eao) lI();
            hjmVar.at = eaoVar.b.cI();
            hjmVar.au = new hjh((dt) eaoVar.c.s.get());
            hjmVar.av = new hjn();
            azqb azqbVar = eaoVar.b.x;
            dwq dwqVar = eaoVar.c;
            hjmVar.aw = new hjc(azqbVar, dwqVar.s, dwqVar.jk);
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) eaoVar.b.h.get();
            hjmVar.ax = eaoVar.c.jL();
            hjmVar.aD = (gyn) eaoVar.c.hA.get();
            hjmVar.ay = (hhl) eaoVar.c.jH.get();
            hjmVar.az = (hkg) eaoVar.c.jk.get();
            hkl hklVar = (hkl) eaoVar.b.yP.get();
            hjmVar.aA = (hfn) eaoVar.c.hB.get();
            hjmVar.aB = (hho) eaoVar.c.lT.get();
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
