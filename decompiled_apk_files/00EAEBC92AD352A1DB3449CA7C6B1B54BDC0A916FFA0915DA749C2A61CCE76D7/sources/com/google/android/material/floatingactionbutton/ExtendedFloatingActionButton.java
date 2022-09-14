package com.google.android.material.floatingactionbutton;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.e.a.c.k;
import c.e.a.c.l.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private final Rect s;
    private final com.google.android.material.floatingactionbutton.d t;
    private final com.google.android.material.floatingactionbutton.d u;
    private final com.google.android.material.floatingactionbutton.d v;
    private final com.google.android.material.floatingactionbutton.d w;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> x;
    private boolean y;

    /* loaded from: classes.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f8065a;

        /* renamed from: b  reason: collision with root package name */
        private d f8066b;

        /* renamed from: c  reason: collision with root package name */
        private d f8067c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8068d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f8069e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f8068d = false;
            this.f8069e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f8068d = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f8069e = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            Rect rect = extendedFloatingActionButton.s;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : extendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i = rect.bottom;
            } else if (extendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                v.e(extendedFloatingActionButton, i);
            }
            if (i2 == 0) {
                return;
            }
            v.d(extendedFloatingActionButton, i2);
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f8068d || this.f8069e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).c() == view.getId();
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f8065a == null) {
                this.f8065a = new Rect();
            }
            Rect rect = this.f8065a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        private boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                b(extendedFloatingActionButton);
                return true;
            }
            a(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void a(CoordinatorLayout.f fVar) {
            if (fVar.f1468h == 0) {
                fVar.f1468h = 80;
            }
        }

        protected void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.a(this.f8069e ? extendedFloatingActionButton.u : extendedFloatingActionButton.v, this.f8069e ? this.f8067c : this.f8066b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> b2 = coordinatorLayout.b(extendedFloatingActionButton);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b2.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.c(extendedFloatingActionButton, i);
            a(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect rect2 = extendedFloatingActionButton.s;
            rect.set(extendedFloatingActionButton.getLeft() + rect2.left, extendedFloatingActionButton.getTop() + rect2.top, extendedFloatingActionButton.getRight() - rect2.right, extendedFloatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: a */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, extendedFloatingActionButton);
                return false;
            }
        }

        protected void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.a(this.f8069e ? extendedFloatingActionButton.t : extendedFloatingActionButton.w, this.f8069e ? this.f8067c : this.f8066b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.d f8071b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f8072c;

        a(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.d dVar, d dVar2) {
            this.f8071b = dVar;
            this.f8072c = dVar2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8070a = true;
            this.f8071b.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8071b.a();
            if (!this.f8070a) {
                this.f8071b.a(this.f8072c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f8071b.onAnimationStart(animator);
            this.f8070a = false;
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
    }

    static {
        new b(Float.class, "width");
        new c(Float.class, "height");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.android.material.floatingactionbutton.d dVar, d dVar2) {
        if (dVar.g()) {
            return;
        }
        if (!b()) {
            dVar.c();
            dVar.a(dVar2);
            return;
        }
        measure(0, 0);
        AnimatorSet e2 = dVar.e();
        e2.addListener(new a(this, dVar, dVar2));
        for (Animator.AnimatorListener animatorListener : dVar.f()) {
            e2.addListener(animatorListener);
        }
        e2.start();
    }

    private boolean b() {
        return v.I(this) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* renamed from: getBehavior */
    public CoordinatorLayout.c<ExtendedFloatingActionButton> mo265getBehavior() {
        return this.x;
    }

    int getCollapsedSize() {
        return (Math.min(v.u(this), v.t(this)) * 2) + getIconSize();
    }

    public h getExtendMotionSpec() {
        return this.u.d();
    }

    public h getHideMotionSpec() {
        return this.w.d();
    }

    public h getShowMotionSpec() {
        return this.v.d();
    }

    public h getShrinkMotionSpec() {
        return this.t.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.y || !TextUtils.isEmpty(getText()) || getIcon() == null) {
            return;
        }
        this.y = false;
        this.t.c();
    }

    public void setExtendMotionSpec(h hVar) {
        this.u.a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(h.a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.y == z) {
            return;
        }
        com.google.android.material.floatingactionbutton.d dVar = z ? this.u : this.t;
        if (dVar.g()) {
            return;
        }
        dVar.c();
    }

    public void setHideMotionSpec(h hVar) {
        this.w.a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(h.a(getContext(), i));
    }

    public void setShowMotionSpec(h hVar) {
        this.v.a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(h.a(getContext(), i));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.t.a(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(h.a(getContext(), i));
    }
}
