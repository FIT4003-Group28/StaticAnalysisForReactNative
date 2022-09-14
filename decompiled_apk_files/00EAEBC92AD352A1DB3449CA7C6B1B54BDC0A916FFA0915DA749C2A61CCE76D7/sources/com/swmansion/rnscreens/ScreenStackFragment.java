package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.q;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes.dex */
public class ScreenStackFragment extends ScreenFragment {
    private static final float b0 = q.b(4.0f);
    private AppBarLayout Y;
    private Toolbar Z;
    private boolean a0;

    /* loaded from: classes.dex */
    private static class a extends CoordinatorLayout {
        private final ScreenFragment A;

        public a(Context context, ScreenFragment screenFragment) {
            super(context);
            this.A = screenFragment;
        }

        @Override // android.view.View
        protected void onAnimationEnd() {
            super.onAnimationEnd();
            this.A.n0();
        }
    }

    @SuppressLint({"ValidFragment"})
    public ScreenStackFragment(b bVar) {
        super(bVar);
    }

    private void t0() {
        ViewParent parent = F().getParent();
        if (parent instanceof f) {
            ((f) parent).f();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment, androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a aVar = new a(n(), this);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.a(new AppBarLayout.ScrollingViewBehavior());
        this.X.setLayoutParams(fVar);
        b bVar = this.X;
        ScreenFragment.b(bVar);
        aVar.addView(bVar);
        this.Y = new AppBarLayout(n());
        this.Y.setBackgroundColor(0);
        this.Y.setLayoutParams(new AppBarLayout.d(-1, -2));
        aVar.addView(this.Y);
        if (this.a0) {
            this.Y.setTargetElevation(0.0f);
        }
        Toolbar toolbar = this.Z;
        if (toolbar != null) {
            AppBarLayout appBarLayout = this.Y;
            ScreenFragment.b(toolbar);
            appBarLayout.addView(toolbar);
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public Animation a(int i, boolean z, int i2) {
        if (!z || i != 0) {
            return null;
        }
        t0();
        return null;
    }

    public void a(Toolbar toolbar) {
        AppBarLayout appBarLayout = this.Y;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        this.Z = toolbar;
        AppBarLayout.d dVar = new AppBarLayout.d(-1, -2);
        dVar.a(0);
        this.Z.setLayoutParams(dVar);
    }

    public void h(boolean z) {
        if (this.a0 != z) {
            this.Y.setTargetElevation(z ? 0.0f : b0);
            this.a0 = z;
        }
    }

    @Override // com.swmansion.rnscreens.ScreenFragment
    public void n0() {
        super.n0();
        t0();
    }

    public boolean o0() {
        d container = this.X.getContainer();
        if (container instanceof f) {
            if (((f) container).getRootScreen() != m0()) {
                return true;
            }
            Fragment v = v();
            if (!(v instanceof ScreenStackFragment)) {
                return false;
            }
            return ((ScreenStackFragment) v).o0();
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    public void p0() {
        d container = this.X.getContainer();
        if (container instanceof f) {
            ((f) container).a(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
    }

    public boolean q0() {
        return this.X.b();
    }

    public void r0() {
        View childAt = this.X.getChildAt(0);
        if (childAt instanceof g) {
            ((g) childAt).b();
        }
    }

    public void s0() {
        Toolbar toolbar;
        if (this.Y != null && (toolbar = this.Z) != null) {
            ViewParent parent = toolbar.getParent();
            AppBarLayout appBarLayout = this.Y;
            if (parent == appBarLayout) {
                appBarLayout.removeView(this.Z);
            }
        }
        this.Z = null;
    }
}
