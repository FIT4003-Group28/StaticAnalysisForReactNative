package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: kkn  reason: default package */
/* loaded from: classes3.dex */
abstract class kkn implements kkc, fjp {
    protected final ajmy a;
    protected final Context b;
    protected View c;
    protected View d;
    protected View e;
    protected ImageView f;
    protected View g;
    protected View h;
    protected AnimatorSet i;
    protected AnimatorSet j;
    protected AnimatorSet k;
    protected AnimatorSet l;
    protected AnimatorSet m;
    protected AnimatorSet n;
    protected AnimatorSet o;
    protected Object p;
    protected wlv q;
    protected boolean r;
    protected boolean s = false;
    protected int t;
    protected int u;
    protected int v;
    protected int w;
    private final aadd x;

    public kkn(Context context, ajmy ajmyVar, aadd aaddVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
        this.b = context;
        aaddVar.getClass();
        this.x = aaddVar;
        d();
    }

    @Override // defpackage.fjp
    public final void a(Object obj, List list) {
        wlv wlvVar = this.q;
        if (wlvVar != null) {
            wlvVar.qL(obj, list);
        } else {
            k("Null listener when resolving clicks");
        }
    }

    @Override // defpackage.kkc
    public final void b(View view) {
        try {
            if (this.c != null) {
                return;
            }
            new yzh(this.b);
            h(view);
            ArrayList arrayList = new ArrayList();
            this.i = new AnimatorSet();
            Animator clone = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_icon).clone();
            clone.setTarget(this.f);
            arrayList.add(clone);
            this.i.playTogether(arrayList);
            ArrayList arrayList2 = new ArrayList();
            this.j = new AnimatorSet();
            Animator clone2 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_icon).clone();
            clone2.setTarget(this.f);
            arrayList2.add(clone2);
            this.j.playTogether(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            this.k = new AnimatorSet();
            Animator clone3 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_expanded_background).clone();
            clone3.setTarget(this.d);
            arrayList3.add(clone3);
            Animator clone4 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_metadata).clone();
            clone4.setTarget(this.e);
            arrayList3.add(clone4);
            this.k.playTogether(arrayList3);
            this.l = new AnimatorSet();
            ArrayList arrayList4 = new ArrayList();
            Animator clone5 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_expanded_background).clone();
            clone5.setTarget(this.d);
            arrayList4.add(clone5);
            Animator clone6 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_metadata).clone();
            clone6.setTarget(this.e);
            arrayList4.add(clone6);
            this.l.playTogether(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            this.m = new AnimatorSet();
            Animator clone7 = AnimatorInflater.loadAnimator(this.b, R.animator.show_ad_cta_collapsed_button).clone();
            clone7.setTarget(this.h);
            arrayList5.add(clone7);
            this.m.playTogether(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            this.n = new AnimatorSet();
            Animator clone8 = AnimatorInflater.loadAnimator(this.b, R.animator.hide_ad_cta_collapsed_button).clone();
            clone8.setTarget(this.h);
            arrayList6.add(clone8);
            this.n.playTogether(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            this.o = new AnimatorSet();
            arrayList7.add(this.j.clone());
            arrayList7.add(this.l.clone());
            arrayList7.add(this.n.clone());
            this.o.playTogether(arrayList7);
            this.o.setDuration(0L);
            l();
            m();
            i();
        } catch (Exception e) {
            afus.c(1, 1, "Error inflating YouTubeBaseCollapsibleAdCtaInnerOverlay:", e);
        }
    }

    @Override // defpackage.kkc
    public void c() {
        View view = this.c;
        if (view != null) {
            zgd.t(view, zgd.e(true != this.s ? 0 : 30), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.kkc
    public void d() {
        this.t = 1;
        this.u = 1;
        this.v = 1;
        this.w = 1;
        if (this.c != null) {
            i();
            l();
            m();
        }
        this.q = null;
        this.r = false;
        this.p = null;
    }

    @Override // defpackage.kkc
    public final void e(boolean z) {
        this.s = z;
    }

    @Override // defpackage.kkc
    public final void f(wlv wlvVar) {
        this.q = wlvVar;
    }

    @Override // defpackage.kkc
    public final void g(int i, boolean z) {
        if (this.f == null) {
            return;
        }
        int i2 = this.t;
        if (i2 == i && this.r == z) {
            return;
        }
        this.u = i2;
        this.t = i;
        this.r = z;
        l();
        m();
        int i3 = this.t;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            j(this.r);
        } else if (i4 == 2) {
            i();
        } else if (i4 == 3) {
            boolean z2 = this.r;
            j(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.k.clone());
            if (this.u == 5) {
                arrayList.add(this.n.clone());
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (!z2) {
                animatorSet.setDuration(0L);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.start();
        } else if (i4 != 4) {
        } else {
            boolean z3 = this.r;
            j(false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.m.clone());
            if (this.u == 4) {
                arrayList2.add(this.l.clone());
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (!z3) {
                animatorSet2.setDuration(0L);
            }
            animatorSet2.playTogether(arrayList2);
            animatorSet2.start();
        }
    }

    protected abstract void h(View view);

    protected final void i() {
        this.o.start();
    }

    protected final void j(boolean z) {
        AnimatorSet clone = this.i.clone();
        if (!z) {
            clone.setDuration(0L);
        }
        clone.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(String str) {
        if (xrz.j(this.x)) {
            String str2 = true != xrz.e(this.x) ? "PACF CTA Ctrl: " : "PACF CTA Exp: ";
            afus.b(2, 1, str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }

    protected final void l() {
        this.h.setClickable(false);
        this.f.setClickable(false);
        boolean z = this.t == 5;
        if (this.w == 2) {
            this.h.setClickable(z);
            this.f.setClickable(false);
        }
        if (this.w == 3) {
            this.h.setClickable(z);
            this.f.setClickable(z);
        }
    }

    protected final void m() {
        this.g.setClickable(false);
        this.d.setClickable(false);
        boolean z = this.t == 4;
        if (this.v == 2) {
            this.g.setClickable(z);
            this.d.setClickable(false);
        }
        if (this.v == 3) {
            this.g.setClickable(z);
            this.d.setClickable(z);
        }
    }
}
