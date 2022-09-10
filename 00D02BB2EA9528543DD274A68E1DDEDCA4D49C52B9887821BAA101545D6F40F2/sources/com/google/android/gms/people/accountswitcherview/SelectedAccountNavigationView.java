package com.google.android.gms.people.accountswitcherview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SelectedAccountNavigationView extends FrameLayout {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private Interpolator F;
    private int G;
    private AnimatorSet H;
    private cowu I;
    private cowu J;
    public int a;
    public ArrayList<cowu> b;
    public covp c;
    public covs d;
    public boolean e;
    public int f;
    private covq g;
    private covt h;
    private GoogleApiClient i;
    private covb j;
    private couy k;
    private cowu l;
    private covn m;
    private int n;
    private covr o;
    private float p;
    private float q;
    private int r;
    private VelocityTracker s;
    private int t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private float y;
    private int z;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.a = 0;
        this.e = true;
        this.b = new ArrayList<>(2);
        this.n = -1;
        this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        this.s = VelocityTracker.obtain();
        this.t = ViewConfiguration.getMinimumFlingVelocity();
        Resources resources = context.getResources();
        this.w = resources.getDimensionPixelSize(R.dimen.selected_account_avatar_size);
        this.D = getResources().getConfiguration().getLayoutDirection() == 1 ? true : z;
        this.F = AnimationUtils.loadInterpolator(context, 17563661);
        this.f = resources.getDimensionPixelSize(R.dimen.selected_account_height);
        this.G = resources.getDimensionPixelSize(R.dimen.avatar_margin_top);
    }

    private final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.v) {
            this.v = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void i(int i) {
        if (this.c != null) {
            getHandler().postDelayed(new covh(this), i);
        }
    }

    private final void j() {
        if (!this.e) {
            return;
        }
        if (this.d == null) {
            d();
        }
        ImageView imageView = this.d.j;
        if (imageView == null || imageView.getMeasuredWidth() != 0) {
            if (this.b.size() > 0) {
                cowu cowuVar = this.b.get(0);
                covs covsVar = this.d;
                covsVar.h.setVisibility(0);
                l(this.d.l, cowuVar);
                k(covsVar, covsVar.r, cowuVar);
            } else {
                this.d.h.setVisibility(8);
            }
            if (this.b.size() > 1) {
                this.d.i.setVisibility(0);
                l(this.d.m, this.b.get(1));
            } else {
                this.d.i.setVisibility(8);
            }
            this.y = -1.0f;
            return;
        }
        forceLayout();
    }

    private final void k(covs covsVar, ImageView imageView, cowu cowuVar) {
        if (imageView == null || covsVar.j == null || !covu.a(cowuVar)) {
            return;
        }
        if (!TextUtils.isEmpty(cowuVar.B())) {
            this.j.e(imageView);
            covb covbVar = this.j;
            int measuredWidth = covsVar.j.getMeasuredWidth();
            if (!covu.a(cowuVar)) {
                return;
            }
            covbVar.d(new cova(covbVar, imageView, cowuVar.b(), cowuVar.k(), measuredWidth));
            return;
        }
        this.j.e(imageView);
        imageView.setImageBitmap(this.j.b(getContext()));
    }

    private final void l(ImageView imageView, cowu cowuVar) {
        if (imageView == null || this.k == null || !covu.a(cowuVar)) {
            return;
        }
        couy couyVar = this.k;
        imageView.getContext();
        imageView.setImageBitmap(couyVar.b());
        if (!TextUtils.isEmpty(cowuVar.n())) {
            this.k.e(imageView);
            this.k.c();
        } else {
            this.k.e(imageView);
        }
        imageView.setVisibility(0);
        imageView.setContentDescription(getContext().getString(R.string.account_item, cowuVar.b()));
    }

    private final void m(cowu cowuVar, AnimatorSet.Builder builder, int i) {
        covs covsVar = this.d;
        o(covsVar.o, covsVar.p, cowuVar);
        this.d.n.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.n, "alpha", 1.0f);
        ofFloat.setStartDelay(i);
        ofFloat.setDuration(150L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d.c, "alpha", 0.0f);
        ofFloat2.setStartDelay(0L);
        ofFloat2.setDuration(150L);
        builder.with(ofFloat).with(ofFloat2);
    }

    private static final void n(View view) {
        if (view != null) {
            od.aF(view);
            od.aG(view);
            od.D(view, 1.0f);
            od.E(view, 1.0f);
            od.C(view, 1.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void o(android.widget.TextView r2, android.widget.TextView r3, defpackage.cowu r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L24
            boolean r1 = defpackage.covu.a(r4)
            if (r1 == 0) goto L24
            java.lang.String r1 = r4.e()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L1b
            java.lang.String r1 = r4.b()
            r2.setText(r1)
            goto L24
        L1b:
            java.lang.String r1 = r4.e()
            r2.setText(r1)
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            if (r3 == 0) goto L3f
            if (r2 == 0) goto L3a
            boolean r2 = defpackage.covu.a(r4)
            if (r2 == 0) goto L3a
            r3.setVisibility(r0)
            java.lang.String r2 = r4.b()
            r3.setText(r2)
            return
        L3a:
            r2 = 8
            r3.setVisibility(r2)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.o(android.widget.TextView, android.widget.TextView, cowu):void");
    }

    public final void a(int i) {
        View view;
        ImageView imageView;
        View view2;
        ImageView imageView2;
        cowu cowuVar;
        float f;
        ArrayList<cowu> arrayList = this.b;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (i == 0) {
            view = this.d.h;
        } else {
            view = this.d.i;
        }
        if (i == 0) {
            imageView = this.d.l;
        } else {
            imageView = this.d.m;
        }
        view.bringToFront();
        cowu cowuVar2 = this.b.get(i);
        if (this.x == 0.0f) {
            this.x = this.d.l.getWidth();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d.e, "alpha", 1.0f, 0.0f);
        int marginStart = this.D ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
        float f2 = this.w;
        float f3 = this.x;
        float f4 = f2 / f3;
        int i2 = marginLayoutParams.bottomMargin;
        int left = this.d.e.getLeft();
        int left2 = view.getLeft();
        float f5 = this.x;
        float f6 = this.w;
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", (left - (left2 + marginStart)) - ((f5 - f6) * 0.5f));
        ofFloat2.setDuration(450L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", (f2 - (f3 - i2)) * 0.5f);
        ofFloat3.setDuration(450L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", f4);
        ofFloat4.setDuration(300L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "scaleX", f4);
        ofFloat5.setDuration(300L);
        play.with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        if (i == 0) {
            view2 = this.d.s;
        } else {
            view2 = this.d.t;
        }
        if (i == 0) {
            imageView2 = this.d.v;
        } else {
            imageView2 = this.d.w;
        }
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.d.k.getDrawable());
        }
        if (view2 != null) {
            view2.setVisibility(0);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f);
            ofFloat6.setDuration(450L);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "scaleY", 1.0f);
            ofFloat7.setDuration(450L);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f);
            ofFloat8.setDuration(450L);
            play.with(ofFloat6).with(ofFloat8).with(ofFloat7);
        }
        covs covsVar = this.d;
        View view3 = covsVar.n;
        if (view3 == null || covsVar.c == null) {
            cowuVar = cowuVar2;
            f = 0.0f;
        } else {
            f = 0.0f;
            view3.setAlpha(0.0f);
            this.d.n.setTranslationX(0.0f);
            cowuVar = cowuVar2;
            m(cowuVar, play, 150);
        }
        ImageView imageView3 = this.d.j;
        if (imageView3 != null) {
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView3, "alpha", f);
            ofFloat9.setDuration(300L);
            play.with(ofFloat9);
        }
        covs covsVar2 = this.d;
        ImageView imageView4 = covsVar2.r;
        if (imageView4 != null) {
            k(covsVar2, imageView4, cowuVar);
            this.d.r.setVisibility(0);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.d.r, "alpha", 1.0f);
            ofFloat10.setDuration(300L);
            play.with(ofFloat10);
        }
        animatorSet.addListener(new covg(this));
        cowu cowuVar3 = this.l;
        this.l = this.b.get(i);
        this.b.add(i, cowuVar3);
        this.b.remove(i + 1);
        i(cpnx.a);
        animatorSet.setInterpolator(this.F);
        this.H = animatorSet;
        animatorSet.start();
    }

    public final void b() {
        if (this.I == null && this.J == null) {
            return;
        }
        this.b.clear();
        cowu cowuVar = this.I;
        if (cowuVar != null) {
            this.b.add(cowuVar);
        }
        cowu cowuVar2 = this.J;
        if (cowuVar2 != null) {
            this.b.add(cowuVar2);
        }
        this.I = null;
        this.J = null;
    }

    public final void c() {
        covn covnVar = this.m;
        if (covnVar != null) {
            covnVar.a();
        }
    }

    public final void d() {
        Context context = getContext();
        if (this.n == -1) {
            this.n = R.layout.selected_account;
        }
        if (this.h == null) {
            this.h = new covo(this);
        }
        LayoutInflater.from(context).inflate(this.n, this);
        covs a = this.h.a(this);
        this.d = a;
        if (this.e) {
            a.h.setOnClickListener(new covj(this));
            this.d.i.setOnClickListener(new covk(this));
        }
        ExpanderView expanderView = this.d.d;
        if (expanderView != null) {
            expanderView.setOnClickListener(new covl(this));
        }
        setOnClickListener(new covm(this));
    }

    public final void e() {
        if (this.d == null) {
            d();
        }
        if (this.e) {
            n(this.d.e);
            n(this.d.h);
            n(this.d.i);
            n(this.d.c);
            n(this.d.j);
            n(this.d.r);
            n(this.d.q);
        }
        covs covsVar = this.d;
        cowu cowuVar = this.l;
        if (covsVar.b != null && covu.a(cowuVar)) {
            covsVar.b.setContentDescription(getContext().getResources().getString(R.string.selected_account, this.l.b()));
        }
        if (covsVar.k != null && covu.a(cowuVar)) {
            ImageView imageView = covsVar.k;
            couy couyVar = this.k;
            getContext();
            imageView.setImageBitmap(couyVar.b());
            if (!TextUtils.isEmpty(cowuVar.n())) {
                this.k.e(covsVar.k);
                couy couyVar2 = this.k;
                ImageView imageView2 = covsVar.k;
                couyVar2.c();
            } else {
                this.k.e(covsVar.k);
            }
        }
        o(covsVar.f, covsVar.g, cowuVar);
        k(covsVar, covsVar.j, cowuVar);
        j();
        covr covrVar = this.o;
        if (covrVar != null) {
            covrVar.a();
        }
        if (this.e) {
            this.x = this.d.l.getWidth();
            View view = this.d.q;
            if (view != null) {
                view.setVisibility(8);
            }
            ImageView imageView3 = this.d.r;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            View view2 = this.d.n;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.d.s;
            if (view3 != null) {
                od.C(view3, 0.0f);
                od.D(this.d.s, 0.8f);
                od.E(this.d.s, 0.8f);
                this.d.s.setVisibility(8);
            }
            View view4 = this.d.t;
            if (view4 == null) {
                return;
            }
            od.C(view4, 0.0f);
            od.D(this.d.t, 0.8f);
            od.E(this.d.t, 0.8f);
            this.d.t.setVisibility(8);
        }
    }

    public final void f() {
        boolean z = false;
        setNavigationMode(this.a == 1 ? 0 : 1);
        covq covqVar = this.g;
        if (covqVar != null) {
            covqVar.a();
        }
        ExpanderView expanderView = this.d.d;
        if (this.a == 1) {
            z = true;
        }
        expanderView.setExpanded(z);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.u = false;
            this.v = motionEvent.getPointerId(0);
            this.u = false;
        } else if (action == 6) {
            h(motionEvent);
            this.v = -1;
            this.u = false;
        }
        return this.u;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.d == null) {
            d();
        }
        ImageView imageView = this.d.j;
        if (imageView != null) {
            imageView.measure(i, i2);
        }
        View view = this.d.a;
        if (view != null) {
            view.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0318, code lost:
        if (java.lang.Math.abs(r18.s.getXVelocity()) > r18.t) goto L130;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAvatarManager(couy couyVar) {
        this.k = couyVar;
    }

    public void setClient(GoogleApiClient googleApiClient) {
        this.i = googleApiClient;
        if (googleApiClient != null) {
            setOwnersCoverPhotoManager(new covb(getContext(), this.i));
        }
    }

    public void setDrawerCloseListener(covp covpVar) {
        this.c = covpVar;
    }

    public void setForceFullHeight(boolean z) {
        this.e = z;
    }

    public void setNavigationMode(int i) {
        if (this.a != i) {
            this.a = i;
            if (this.d == null) {
                d();
            }
            boolean z = true;
            if (this.a != 1) {
                z = false;
            }
            this.d.d.setExpanded(z);
        }
    }

    public void setOnAccountChangeListener(covn covnVar) {
        this.m = covnVar;
    }

    public void setOnNavigationModeChange(covq covqVar) {
        this.g = covqVar;
    }

    public void setOwnersCoverPhotoManager(covb covbVar) {
        this.j = covbVar;
    }

    public void setRecents(cowu cowuVar, cowu cowuVar2) {
        AnimatorSet animatorSet = this.H;
        if (animatorSet == null || !animatorSet.isRunning()) {
            ArrayList<cowu> arrayList = this.b;
            if (arrayList == null) {
                this.b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            if (cowuVar != null) {
                this.b.add(cowuVar);
            }
            if (cowuVar2 != null) {
                this.b.add(cowuVar2);
            }
            j();
            return;
        }
        this.I = cowuVar;
        this.J = cowuVar2;
    }

    @Deprecated
    public void setRecentsLayout(int i, covt covtVar, covr covrVar) {
        setSelectedAccountLayout(i, covtVar, covrVar);
    }

    public void setSelectedAccountLayout(int i, covt covtVar, covr covrVar) {
        this.n = i;
        this.h = covtVar;
        this.o = covrVar;
    }
}
