package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lwk  reason: default package */
/* loaded from: classes3.dex */
public final class lwk extends lud implements lxs {
    public fsf c;
    public lxu d;
    public final axnm e;
    public final lwq f;
    public final int g;
    public fsh h;
    public lxo i;
    private final boolean j;
    private boolean k;
    private int l;
    private lxr m;
    private final axnm n;
    private aypg o;

    public lwk(Activity activity, axnm axnmVar, axnm axnmVar2, ampq ampqVar, aadd aaddVar, axxi axxiVar, ayor ayorVar, ypf ypfVar) {
        super(activity, axnmVar2);
        this.e = axnmVar;
        this.n = axnmVar2;
        this.f = (lwq) ampqVar.f();
        this.l = 1;
        this.g = activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_height) + activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_separator_height);
        asxp asxpVar = aaddVar.a().e;
        this.j = (asxpVar == null ? asxp.a : asxpVar).aL;
        this.c = fsf.b;
        ypfVar.g(new lyp(axxiVar, ayorVar, ((LinearLayout) axnmVar.get()).findViewById(R.id.feed_filter_bar_separator), 1));
    }

    private final void s() {
        lxu lxuVar = this.d;
        if (lxuVar == null || lxuVar.b) {
            return;
        }
        fhg fhgVar = this.h.e;
        if (fhgVar != null) {
            fhgVar.c(1);
        }
        this.d.a();
        RecyclerView recyclerView = this.h.f;
        if (recyclerView == null) {
            return;
        }
        recyclerView.post(new lwh(this, 1));
    }

    @Override // defpackage.lud
    protected final int a() {
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) this.e.get()).getLayoutParams();
        if (this.c.a()) {
            if (layoutParams == null || layoutParams.height != 0) {
                return 0;
            }
        } else if (layoutParams == null || layoutParams.height != this.g) {
            return this.g;
        }
        return layoutParams.height;
    }

    @Override // defpackage.lud
    protected final int b() {
        return this.h.c() ? 2 : 1;
    }

    @Override // defpackage.lud
    protected final ViewGroup c() {
        return (ViewGroup) this.e.get();
    }

    @Override // defpackage.lud
    protected final void f() {
        lxo lxoVar = this.i;
        if (lxoVar != null) {
            lxoVar.a();
            this.i = null;
        }
        if (r()) {
            aypg aypgVar = this.o;
            aypgVar.getClass();
            ayqi.c((AtomicReference) aypgVar);
            this.o = null;
        }
        k();
        ViewGroup viewGroup = (ViewGroup) ((LinearLayout) this.e.get()).getParent();
        if (viewGroup == this.n.get()) {
            viewGroup.removeView((View) this.e.get());
        }
    }

    @Override // defpackage.lud
    public final void h(fsx fsxVar) {
        fsi fsiVar;
        fsh fshVar = fsxVar.b;
        if (fshVar == null || fshVar.b == null) {
            q(1);
            return;
        }
        if (r()) {
            aypg aypgVar = this.o;
            aypgVar.getClass();
            ayqi.c((AtomicReference) aypgVar);
            this.o = null;
        }
        fsh fshVar2 = this.h;
        if (fshVar2 == null || fshVar2.b != fshVar.b) {
            this.k = false;
            if (this.l != 1 && (fsiVar = fshVar.d) != null) {
                fsiVar.a();
            }
        }
        this.h = fshVar;
        if (!fshVar.c()) {
            this.o = this.h.b.au(new lwg(this, 1), new lwg(this), new aypv() { // from class: lwe
                @Override // defpackage.aypv
                public final void a() {
                    lwk.this.q(1);
                }
            });
        }
        fsh fshVar3 = this.h;
        if (fshVar3.g || TextUtils.equals(fshVar3.a, "FEactivity") || TextUtils.equals(this.h.a, "FEnotifications_inbox") || this.h.c() || (this.h.b() && this.j)) {
            this.c = fsf.a;
        }
        if (this.c == fsf.c) {
            this.c = fsf.a;
        }
        int i = 4;
        if (!this.h.c() && true == this.h.c) {
            i = 5;
        }
        q(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final void i() {
        if (!this.c.a()) {
            ((LinearLayout) this.e.get()).setVisibility(0);
            l();
        }
        if (this.c.a()) {
            ((LinearLayout) this.e.get()).setVisibility(0);
            p();
        } else if (!this.c.b()) {
        } else {
            final lwc lwcVar = new lwc(this);
            ((LinearLayout) this.e.get()).post(new Runnable() { // from class: lwi
                @Override // java.lang.Runnable
                public final void run() {
                    lwk lwkVar = lwk.this;
                    try {
                        lwkVar.i = new lxo(lwkVar.g, 0, (View) lwkVar.e.get(), lwcVar, 1200, 400, true);
                        lwkVar.i.b();
                    } catch (IllegalArgumentException e) {
                        zep.d("Error hiding feed filter bar", e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final boolean j() {
        return this.l != 1;
    }

    public final void k() {
        lxr lxrVar = this.m;
        if (lxrVar != null) {
            lxrVar.c(this.h.f, (AppBarLayout) this.n.get());
        }
        s();
    }

    public final void l() {
        final lwq lwqVar;
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.h.h) {
            o();
        }
        if (this.h.b() && (lwqVar = this.f) != null) {
            ylx.i(ylx.c(lwqVar.e, lwqVar.d.a(), new ampg() { // from class: lwn
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
                    if (r0 < defpackage.lwq.a) goto L3;
                 */
                @Override // defpackage.ampg
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r9) {
                    /*
                        r8 = this;
                        lwq r0 = defpackage.lwq.this
                        lxz r9 = (defpackage.lxz) r9
                        int r1 = r9.d
                        r2 = 1
                        r3 = 0
                        r4 = 3
                        if (r1 < r4) goto Ld
                    Lb:
                        r2 = 0
                        goto L2a
                    Ld:
                        snc r0 = r0.f
                        long r4 = r9.c
                        r6 = -1
                        int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r9 != 0) goto L18
                        goto L2a
                    L18:
                        long r0 = r0.c()
                        long r0 = r0 - r4
                        r4 = 0
                        int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r9 >= 0) goto L24
                        goto Lb
                    L24:
                        long r4 = defpackage.lwq.a
                        int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                        if (r9 < 0) goto Lb
                    L2a:
                        java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lwn.apply(java.lang.Object):java.lang.Object");
                }
            }), new ylw() { // from class: lwd
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    fsh fshVar;
                    lwq lwqVar2;
                    lwk lwkVar = lwk.this;
                    if (!((Boolean) obj).booleanValue() || (fshVar = lwkVar.h) == null || !fshVar.b() || (lwqVar2 = lwkVar.f) == null) {
                        return;
                    }
                    Context context = lwkVar.a;
                    if (lwqVar2.b == null) {
                        return;
                    }
                    String string = context.getResources().getString(R.string.feed_filter_bar_tutorial_description);
                    akfp a = akfq.a();
                    a.a = (View) lwqVar2.c.get();
                    a.c = string;
                    a.h(2);
                    a.c(2);
                    a.f(-1);
                    a.f = new lwp(lwqVar2);
                    lwqVar2.b.c(a.a());
                    lwkVar.o();
                }
            });
        }
        fsi fsiVar = this.h.d;
        if (fsiVar == null) {
            return;
        }
        fsiVar.a();
    }

    @Override // defpackage.lxs
    public final void m() {
        s();
    }

    @Override // defpackage.lxs
    public final void n() {
        ((LinearLayout) this.e.get()).post(new lwh(this));
        k();
    }

    public final void o() {
        lxo lxoVar = this.i;
        if (lxoVar != null) {
            if (lxoVar.a.isStarted()) {
                return;
            }
            this.i.a();
        }
        if (this.c.b()) {
            this.c = fsf.a;
        }
    }

    public final void p() {
        this.h.e.c(3);
        this.d = new lxu((View) this.e.get(), this.g, new lwj(this), 0, false);
        this.h.f.v(this.d);
        lxr lxrVar = new lxr(this);
        this.m = lxrVar;
        lxrVar.b(this.h.f, (AppBarLayout) this.n.get());
    }

    public final void q(int i) {
        alii aliiVar;
        if (this.j || this.l != i) {
            this.l = i;
            g();
            if (!j() || (aliiVar = (alii) ((LinearLayout) this.e.get()).getLayoutParams()) == null) {
                return;
            }
            int i2 = this.l == 5 ? 0 : 21;
            if (i2 == aliiVar.a) {
                return;
            }
            aliiVar.a = i2;
        }
    }

    final boolean r() {
        return this.o != null;
    }
}
