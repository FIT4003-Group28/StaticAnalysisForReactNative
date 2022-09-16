package defpackage;

import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: lxd  reason: default package */
/* loaded from: classes3.dex */
public final class lxd implements lxk {
    public acti a;
    public LinearLayout b;
    public aoob c;
    private RecyclerView e;
    private boolean f = false;
    final lxw d = new lxw(this);

    public lxd(RecyclerView recyclerView, LinearLayout linearLayout, acti actiVar) {
        this.e = recyclerView;
        this.b = linearLayout;
        this.a = actiVar;
    }

    public static void j(View view, boolean z, int i) {
        if (lj.e(view) != 1 ? z : !z) {
            i = -i;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, i);
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    @Override // defpackage.lxk
    public final ampq a() {
        int i;
        float f;
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            f = this.b.getTranslationX();
            i = ((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).getMarginEnd();
        } else {
            i = 0;
            f = 0.0f;
        }
        return ampq.j(new lxj(i, f, this.d.a));
    }

    @Override // defpackage.lxk
    public final void b() {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.aG(this.d);
            this.e = null;
            this.b = null;
        }
    }

    @Override // defpackage.lxk
    public final void c(boolean z) {
        RecyclerView recyclerView;
        lxw lxwVar = this.d;
        lxwVar.a.c = !z;
        if (z || (recyclerView = this.e) == null) {
            return;
        }
        lxwVar.j(recyclerView, 0, 0);
    }

    @Override // defpackage.lxk
    public final void d(lxj lxjVar) {
        if (lxjVar.c == null || this.e == null) {
            return;
        }
        f(lxjVar.a, lxjVar.b);
        lxw lxwVar = this.d;
        lxwVar.a = lxjVar.c;
        lxwVar.j(this.e, 0, 0);
    }

    @Override // defpackage.lxk
    public final void e(acti actiVar) {
        this.a = actiVar;
    }

    final void f(int i, float f) {
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMarginEnd(i);
            LinearLayout linearLayout2 = this.b;
            linearLayout2.getClass();
            linearLayout2.setTranslationX(f);
            this.b.setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.lxk
    public final void g(boolean z) {
        this.f = z;
    }

    @Override // defpackage.lxk
    public final void h(aoob aoobVar) {
        this.c = aoobVar;
    }

    @Override // defpackage.lxk
    public final void i() {
        LinearLayout linearLayout;
        if (!this.f && (linearLayout = this.b) != null) {
            f(-((RelativeLayout.LayoutParams) linearLayout.getLayoutParams()).width, 0.0f);
            this.d.a = lxv.a();
        }
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.aG(this.d);
            this.e.aE(this.d);
        }
    }
}
