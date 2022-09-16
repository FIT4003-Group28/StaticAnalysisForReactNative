package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hse  reason: default package */
/* loaded from: classes3.dex */
public class hse extends dp implements axoo {
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
            eao eaoVar = (eao) lI();
            Activity a = eaoVar.c.a();
            eaoVar.C();
            hsq v = eaoVar.v();
            hub y = eaoVar.y();
            hrd t = eaoVar.t();
            hut A = eaoVar.A();
            hvl hvlVar = (hvl) ((dya) eaoVar.r()).p.get();
            axzl.o(hvlVar);
            hvl hvlVar2 = (hvl) ((dya) eaoVar.r()).m.get();
            axzl.o(hvlVar2);
            hvd B = eaoVar.B();
            hvh hvhVar = (hvh) ((dya) eaoVar.r()).o.get();
            axzl.o(hvhVar);
            acth acthVar = (acth) eaoVar.c.L.get();
            hux huxVar = (hux) ((dya) eaoVar.r()).k.get();
            axzl.o(huxVar);
            hta w = eaoVar.w();
            hvk hvkVar = (hvk) ((dya) eaoVar.r()).j.get();
            axzl.o(hvkVar);
            ((htl) this).a = new htf(a, v, y, t, A, hvlVar, hvlVar2, B, hvhVar, acthVar, huxVar, w, hvkVar, eaoVar.z(), null);
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
