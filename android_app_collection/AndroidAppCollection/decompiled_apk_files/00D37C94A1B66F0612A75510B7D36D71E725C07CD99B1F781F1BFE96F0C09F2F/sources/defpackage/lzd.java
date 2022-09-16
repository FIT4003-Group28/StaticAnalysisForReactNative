package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzd  reason: default package */
/* loaded from: classes3.dex */
public final class lzd extends lud implements lxs {
    public final axnm c;
    fsp d;
    public final int e;
    public int f;
    public fsn g;
    public lxo h;
    public boolean i;
    private lxr j;
    private lxu k;
    private final axnm l;
    private final Activity m;
    private final aadd n;
    private int o;

    public lzd(Activity activity, axnm axnmVar, axnm axnmVar2, aadd aaddVar) {
        super(activity, axnmVar2);
        this.g = null;
        this.i = false;
        this.c = axnmVar;
        this.l = axnmVar2;
        this.m = activity;
        this.n = aaddVar;
        this.e = activity.getResources().getDimensionPixelSize(R.dimen.bar_container_height) + activity.getResources().getDimensionPixelSize(R.dimen.bar_separator_height);
        this.f = 0;
        this.o = 1;
        this.g = (!r() || zdg.e(activity)) ? fsn.a : fsn.b;
    }

    private final void p() {
        lxu lxuVar = this.k;
        if (lxuVar == null || lxuVar.b) {
            return;
        }
        lxuVar.a();
        RecyclerView recyclerView = this.d.b;
        if (recyclerView == null) {
            return;
        }
        recyclerView.Z(this.k);
    }

    private final void q(int i) {
        this.o = i;
        g();
        if (j()) {
            alii aliiVar = (alii) ((LinearLayout) this.c.get()).getLayoutParams();
            if ("static".equals(eog.p(this.n).c()) || "static_autohide".equals(eog.p(this.n).c()) || "prehide".equals(eog.p(this.n).c())) {
                aliiVar.a = 0;
            } else if (aliiVar == null) {
            } else {
                if (this.o == 3) {
                    aliiVar.a = 0;
                } else {
                    aliiVar.a = 21;
                }
            }
        }
    }

    private final boolean r() {
        return "autohide".equals(eog.p(this.n).c()) || "static_autohide".equals(eog.p(this.n).c());
    }

    @Override // defpackage.lud
    protected final int a() {
        alii aliiVar = (alii) ((LinearLayout) this.c.get()).getLayoutParams();
        if (this.g.a()) {
            if (aliiVar == null || aliiVar.height != 0) {
                return 0;
            }
        } else if (aliiVar == null || aliiVar.height != this.e) {
            return this.e;
        }
        return aliiVar.height;
    }

    @Override // defpackage.lud
    protected final int b() {
        return 1;
    }

    @Override // defpackage.lud
    protected final ViewGroup c() {
        return (ViewGroup) this.c.get();
    }

    @Override // defpackage.lud
    protected final void f() {
        ((LinearLayout) this.c.get()).setVisibility(8);
        lxo lxoVar = this.h;
        if (lxoVar != null) {
            lxoVar.a();
            this.h = null;
        }
        k();
        ViewGroup viewGroup = (ViewGroup) ((LinearLayout) this.c.get()).getParent();
        if (viewGroup == this.l.get()) {
            viewGroup.removeView((View) this.c.get());
        }
    }

    @Override // defpackage.lud
    public final void h(fsx fsxVar) {
        fsp fspVar = fsxVar.d;
        if (fspVar == null) {
            q(1);
            return;
        }
        this.d = fspVar;
        if (!this.i) {
            if (!r() || zdg.e(this.m)) {
                this.g = fsn.a;
            } else {
                this.g = fsn.b;
            }
        }
        q(true != this.d.a ? 2 : 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final void i() {
        if (!o()) {
            ((LinearLayout) this.c.get()).setVisibility(0);
        }
        if (this.g.a()) {
            l();
        } else if (this.g.d != 2 && !o()) {
        } else {
            final lyz lyzVar = new lyz(this);
            ((LinearLayout) this.c.get()).post(new Runnable() { // from class: lzb
                @Override // java.lang.Runnable
                public final void run() {
                    lzd lzdVar = lzd.this;
                    lxn lxnVar = lyzVar;
                    try {
                        lzdVar.f = lzdVar.d.b.computeVerticalScrollOffset();
                        lzdVar.h = new lxo(lzdVar.e, 0, (View) lzdVar.c.get(), lxnVar, true != lzdVar.o() ? 1200 : 0, true != lzdVar.o() ? 400 : 100, false);
                        lzdVar.h.b();
                    } catch (IllegalArgumentException e) {
                        zep.d("Error hiding search chip bar", e);
                    }
                }
            });
        }
    }

    @Override // defpackage.lud
    public final boolean j() {
        LinearLayout linearLayout = (LinearLayout) ((LinearLayout) this.c.get()).findViewById(R.id.chip_bar_chips_container);
        if (linearLayout.getChildCount() > 1) {
            xo xoVar = ((RecyclerView) linearLayout.getChildAt(1)).m;
            if (this.o != 1 && xoVar != null && xoVar.b() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        lxr lxrVar = this.j;
        if (lxrVar != null) {
            lxrVar.c(this.d.b, (AppBarLayout) this.l.get());
        }
        p();
    }

    public final void l() {
        this.k = new lxu((View) this.c.get(), this.e, new lzc(this), this.f, true);
        this.d.b.v(this.k);
        lxr lxrVar = new lxr(this);
        this.j = lxrVar;
        lxrVar.b(this.d.b, (AppBarLayout) this.l.get());
    }

    @Override // defpackage.lxs
    public final void m() {
        p();
    }

    @Override // defpackage.lxs
    public final void n() {
        if (((LinearLayout) this.c.get()).getVisibility() != 0) {
            ((LinearLayout) this.c.get()).setVisibility(0);
        }
        ((LinearLayout) this.c.get()).post(new Runnable() { // from class: lza
            @Override // java.lang.Runnable
            public final void run() {
                lzd lzdVar = lzd.this;
                try {
                    new lxo(0, lzdVar.e, (View) lzdVar.c.get(), new lyz(lzdVar, 1), 0, 400, true).b();
                } catch (IllegalArgumentException e) {
                    zep.d("Error revealing search chip bar", e);
                }
            }
        });
        k();
    }

    public final boolean o() {
        return "prehide".equals(eog.p(this.n).c());
    }
}
