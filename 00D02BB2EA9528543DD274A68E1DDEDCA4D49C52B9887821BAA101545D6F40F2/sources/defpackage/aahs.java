package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aahs  reason: default package */
/* loaded from: classes2.dex */
public class aahs implements aahd {
    public final Executor a;
    public final dxio<axwo> b;
    public final axwi c;
    @dzsi
    public cqkp d;
    @dzsi
    public diwb g;
    public boolean h;
    public boolean i;
    private final Activity k;
    private final btvo l;
    private final Executor m;
    private final dxio<baju> n;
    private final dxio<cztz> o;
    private final dxio<akfa> q;
    private final dxio<afef> r;
    private boolean s;
    public String e = "";
    public dpuk f = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
    public String j = "";
    private final aahx p = new aahx();

    public aahs(Activity activity, btvo btvoVar, Executor executor, Executor executor2, dxio<baju> dxioVar, dxio<axwo> dxioVar2, dxio<cztz> dxioVar3, axwi axwiVar, dxio<akfa> dxioVar4, dxio<afef> dxioVar5) {
        this.k = activity;
        this.l = btvoVar;
        this.a = executor;
        this.m = executor2;
        this.n = dxioVar;
        this.b = dxioVar2;
        this.o = dxioVar3;
        this.c = axwiVar;
        this.q = dxioVar4;
        this.r = dxioVar5;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        boolean z = false;
        if (this.l.getEnableFeatureParameters().aO && this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aahd
    public final void b() {
        final boolean z = !this.i;
        diwb diwbVar = this.g;
        dbsk.s(diwbVar);
        final dppl NV = this.p.NV(diwbVar);
        String str = diwbVar.c;
        dpuk b = dpuk.b(diwbVar.d);
        if (b == null) {
            b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        final azxb g = azxb.g(str, b);
        if (!this.i) {
            g(true, new defg(this, NV) { // from class: aahg
                private final aahs a;
                private final dppl b;

                {
                    this.a = this;
                    this.b = NV;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    aahs aahsVar = this.a;
                    dppl dpplVar = this.b;
                    baad baadVar = (baad) obj;
                    if (baadVar == null) {
                        return deha.b(new Throwable("Cannot find the list."));
                    }
                    baadVar.b(aahsVar.c.e(baadVar, dpplVar));
                    return aahsVar.c.j(baadVar);
                }
            }, new mw(this, g, z) { // from class: aahh
                private final aahs a;
                private final azxb b;
                private final boolean c;

                {
                    this.a = this;
                    this.b = g;
                    this.c = z;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    aahs aahsVar = this.a;
                    azxb azxbVar = this.b;
                    boolean z2 = this.c;
                    baad baadVar = (baad) obj;
                    if (baadVar != null && baadVar.h(azxbVar)) {
                        aahsVar.i(z2, false, aahsVar.f(baadVar), true);
                    }
                }
            });
        } else {
            g(true, new defg(this, g) { // from class: aahi
                private final aahs a;
                private final azxb b;

                {
                    this.a = this;
                    this.b = g;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    aahs aahsVar = this.a;
                    azxb azxbVar = this.b;
                    baad baadVar = (baad) obj;
                    if (baadVar == null) {
                        return deha.b(new Throwable("Cannot find the list."));
                    }
                    if (!baadVar.f(azxbVar)) {
                        return deha.b(new Throwable("Cannot remove item from the list."));
                    }
                    return aahsVar.c.j(baadVar);
                }
            }, new mw(this, g, z) { // from class: aahj
                private final aahs a;
                private final azxb b;
                private final boolean c;

                {
                    this.a = this;
                    this.b = g;
                    this.c = z;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    aahs aahsVar = this.a;
                    azxb azxbVar = this.b;
                    boolean z2 = this.c;
                    baad baadVar = (baad) obj;
                    if (baadVar != null && !baadVar.h(azxbVar)) {
                        aahsVar.i(z2, false, aahsVar.f(baadVar), true);
                    }
                }
            });
        }
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return null;
    }

    public final Boolean d() {
        return Boolean.valueOf(this.i);
    }

    public final String e() {
        return this.j.isEmpty() ? "" : this.k.getString(R.string.SAVE_EXPERIENCE_SAVED_IN_LIST, new Object[]{this.j});
    }

    public final String f(baad baadVar) {
        return baadVar.E(this.k);
    }

    public final void g(boolean z, final defg<baad, baad> defgVar, final mw<baad> mwVar) {
        if (!z) {
            h(defgVar, mwVar);
        } else if (btlu.i(this.q.a().j()) == btlt.INCOGNITO) {
            afdt afdtVar = afdt.a;
            this.r.a().r();
        } else {
            this.n.a().b(new aaho(), new bvqg(this, defgVar, mwVar) { // from class: aahm
                private final aahs a;
                private final defg b;
                private final mw c;

                {
                    this.a = this;
                    this.b = defgVar;
                    this.c = mwVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    aahs aahsVar = this.a;
                    defg<baad, baad> defgVar2 = this.b;
                    mw<baad> mwVar2 = this.c;
                    if (((Boolean) obj).booleanValue()) {
                        aahsVar.h(defgVar2, mwVar2);
                    } else {
                        aahsVar.i(false, true, "", true);
                    }
                }
            });
        }
    }

    public final void h(defg<baad, baad> defgVar, mw<baad> mwVar) {
        dehn<baad> i = this.c.i(baab.WANT_TO_GO);
        if (i == null) {
            return;
        }
        deha.q(deew.g(i, defgVar, this.m), new aahr(this, mwVar, this.i, this.j), this.m);
    }

    public final void i(boolean z, boolean z2, String str, boolean z3) {
        bvrj.UI_THREAD.c();
        this.i = z;
        this.s = z2;
        if (true != z) {
            str = "";
        }
        this.j = str;
        if (z3) {
            this.o.a().d(this.k.getWindowManager(), true);
            cztq a = cztt.a(this.o.a());
            a.d(cztr.LONG);
            if (this.s) {
                a.e(R.string.SAVE_EXPERIENCE_FAIL_TO_UPDATE_PROMPT, new Object[0]);
            } else if (this.i) {
                a.c = e();
                a = a.a(R.string.SAVE_EXPERIENCE_AFTER_SAVE_SNACKBAR_ACTION, new View.OnClickListener(this) { // from class: aahn
                    private final aahs a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.b.a().k(baab.WANT_TO_GO);
                    }
                });
            } else {
                a.e(R.string.SAVE_EXPERIENCE_REMOVE_FROM_LIST, new Object[0]);
            }
            a.c();
        }
        cqkp cqkpVar = this.d;
        if (cqkpVar != null) {
            cqkx.p(cqkpVar);
        }
    }
}
