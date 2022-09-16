package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nom  reason: default package */
/* loaded from: classes3.dex */
abstract class nom extends ne {
    protected final Context a;
    protected boolean b;
    protected RecyclerView c;
    protected FrameLayout d;
    protected FrameLayout e;
    protected TextView f;
    protected Animation g;
    protected Animation h;
    protected boolean i;
    protected final acti k;
    protected boolean m;
    protected ampq j = amon.a;
    protected ampq l = amon.a;

    public nom(Context context, acti actiVar) {
        this.a = context;
        this.k = actiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.e = frameLayout;
        this.c = recyclerView;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(boolean z) {
        FrameLayout frameLayout;
        this.m = z;
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.setVisibility(true != z ? 8 : 0);
        if (z) {
            if (this.d.getParent() == null && (frameLayout = this.e) != null) {
                frameLayout.addView(this.d);
            }
            if (!this.l.h()) {
                return;
            }
            this.k.u((acum) this.l.c(), null);
            return;
        }
        FrameLayout frameLayout3 = this.e;
        if (frameLayout3 == null) {
            return;
        }
        frameLayout3.removeView(this.d);
        if (!this.l.h()) {
            return;
        }
        this.k.q((acum) this.l.c(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(String str) {
        b();
        if (this.h == null) {
            this.h = AnimationUtils.loadAnimation(this.a, R.anim.new_comments_fade_in);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.a, R.anim.new_comments_fade_out);
            this.g = loadAnimation;
            loadAnimation.setAnimationListener(new nol(this));
        }
        this.f.setText((CharSequence) this.j.e(str));
        c(true);
        this.d.bringToFront();
        this.g.cancel();
        this.h.cancel();
        this.f.startAnimation(this.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.i) {
            return;
        }
        this.i = true;
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            return;
        }
        recyclerView.aE(this);
    }

    public void f() {
        if (!this.i) {
            return;
        }
        this.i = false;
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.aG(this);
        }
        c(false);
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b = true;
        } else if (i != 0) {
        } else {
            this.b = false;
        }
    }
}
