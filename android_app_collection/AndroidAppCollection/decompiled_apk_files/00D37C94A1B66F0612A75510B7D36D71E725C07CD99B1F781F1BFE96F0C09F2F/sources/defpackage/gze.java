package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gze  reason: default package */
/* loaded from: classes3.dex */
public class gze extends dp implements axoo {
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
        p();
    }

    @Override // defpackage.dp, defpackage.i
    public final ae getDefaultViewModelProviderFactory() {
        return awwc.s(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        a();
        p();
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

    protected final void p() {
        if (!this.d) {
            this.d = true;
            gzt gztVar = (gzt) this;
            eao eaoVar = (eao) lI();
            gztVar.a = eaoVar.b.cI();
            gztVar.b = (hai) eaoVar.k.get();
            gztVar.aC = (gyn) eaoVar.c.hA.get();
            gztVar.c = (hkl) eaoVar.b.yP.get();
            gztVar.d = (hci) eaoVar.l.get();
            gztVar.e = eaoVar.k();
            gztVar.ae = eaoVar.c.h();
            gztVar.af = eaoVar.l();
            gztVar.ag = (hvy) eaoVar.p.get();
            gztVar.ah = (hay) eaoVar.q.get();
            gztVar.ai = eaoVar.j();
            gztVar.aj = (hkg) eaoVar.c.jk.get();
            dwq dwqVar = eaoVar.c;
            azqb azqbVar = dwqVar.gd;
            azqb azqbVar2 = dwqVar.s;
            dyo dyoVar = eaoVar.b;
            gztVar.ak = new hgp(azqbVar, azqbVar2, dyoVar.rN, dwqVar.hB, dyoVar.x, dyoVar.yP);
            gztVar.al = eaoVar.v;
            gztVar.aD = (zrg) eaoVar.c.hC.get();
            gztVar.am = (ayor) eaoVar.b.iz.get();
            gztVar.an = new hfw((hfn) eaoVar.c.hB.get());
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
