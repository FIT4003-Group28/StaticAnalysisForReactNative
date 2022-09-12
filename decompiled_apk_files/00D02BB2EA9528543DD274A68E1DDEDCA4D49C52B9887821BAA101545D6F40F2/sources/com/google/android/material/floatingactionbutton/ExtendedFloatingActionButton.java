package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ajh {
    public static final Property<View, Float> o = new czzg(Float.class);
    public static final Property<View, Float> p = new czzh(Float.class);
    public static final Property<View, Float> q = new czzi(Float.class);
    public static final Property<View, Float> r = new czzj(Float.class);
    public static final /* synthetic */ int s = 0;
    private static final int t = 2132018744;
    public int c;
    public final daad d;
    public final daad e;
    public final daad h;
    public final daad i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public ColorStateList n;
    private final czyy u;
    private final int v;
    private final aji<ExtendedFloatingActionButton> w;
    private boolean x;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends aji<T> {
        private Rect a;
        private boolean b;
        private boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, daae.b);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean u(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ajl) {
                return ((ajl) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean v(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((ajl) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!v(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            daak.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.k()) {
                s(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        private final boolean x(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!v(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ajl) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                s(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        @Override // defpackage.aji
        public final void a(ajl ajlVar) {
            if (ajlVar.h == 0) {
                ajlVar.h = 80;
            }
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            } else if (!u(view2)) {
                return false;
            } else {
                x(view2, extendedFloatingActionButton);
                return false;
            }
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> l = coordinatorLayout.l(extendedFloatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = l.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (u(view2) && x(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (w(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.h(extendedFloatingActionButton, i);
            return true;
        }

        @Override // defpackage.aji
        public final /* bridge */ /* synthetic */ boolean m(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        protected final void s(ExtendedFloatingActionButton extendedFloatingActionButton) {
            daad daadVar;
            if (this.c) {
                int i = ExtendedFloatingActionButton.s;
                daadVar = extendedFloatingActionButton.d;
            } else {
                int i2 = ExtendedFloatingActionButton.s;
                daadVar = extendedFloatingActionButton.i;
            }
            extendedFloatingActionButton.j(daadVar);
        }

        protected final void t(ExtendedFloatingActionButton extendedFloatingActionButton) {
            daad daadVar;
            if (this.c) {
                int i = ExtendedFloatingActionButton.s;
                daadVar = extendedFloatingActionButton.e;
            } else {
                int i2 = ExtendedFloatingActionButton.s;
                daadVar = extendedFloatingActionButton.h;
            }
            extendedFloatingActionButton.j(daadVar);
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    private final void k() {
        this.n = getTextColors();
    }

    @Override // defpackage.ajh
    public final aji<ExtendedFloatingActionButton> a() {
        return this.w;
    }

    public final void b(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final void e() {
        j(this.e);
    }

    public final void f() {
        j(this.d);
    }

    public final boolean g() {
        return getVisibility() != 0 ? this.c == 2 : this.c != 1;
    }

    public final int h() {
        int i = this.v;
        if (i < 0) {
            int min = Math.min(od.w(this), od.x(this));
            return min + min + this.g;
        }
        return i;
    }

    public final int i() {
        return (h() - this.g) / 2;
    }

    public final void j(daad daadVar) {
        if (!daadVar.j()) {
            if ((!od.ae(this) && (g() || !this.x)) || isInEditMode()) {
                daadVar.h();
                daadVar.k();
                return;
            }
            measure(0, 0);
            AnimatorSet f = daadVar.f();
            f.addListener(new czzf(daadVar));
            for (Animator.AnimatorListener animatorListener : daadVar.b()) {
                f.addListener(animatorListener);
            }
            f.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.l || !TextUtils.isEmpty(getText()) || this.f == null) {
            return;
        }
        this.l = false;
        this.d.h();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.x = z;
    }

    public void setExtendMotionSpec(czur czurVar) {
        ((czza) this.e).b = czurVar;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(czur.g(getContext(), i));
    }

    public void setHideMotionSpec(czur czurVar) {
        ((czza) this.i).b = czurVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(czur.g(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.l || this.m) {
            return;
        }
        this.j = od.w(this);
        this.k = od.x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.l || this.m) {
            return;
        }
        this.j = i;
        this.k = i3;
    }

    public void setShowMotionSpec(czur czurVar) {
        ((czza) this.h).b = czurVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(czur.g(getContext(), i));
    }

    public void setShrinkMotionSpec(czur czurVar) {
        ((czza) this.d).b = czurVar;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(czur.g(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        k();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public void setExtended(boolean z) {
        if (this.l == z) {
            return;
        }
        daad daadVar = z ? this.e : this.d;
        if (daadVar.j()) {
            return;
        }
        daadVar.h();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.t
            r1 = r17
            android.content.Context r1 = defpackage.daib.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.c = r10
            czyy r1 = new czyy
            r1.<init>()
            r0.u = r1
            czzm r11 = new czzm
            r11.<init>(r0, r1)
            r0.h = r11
            czzl r12 = new czzl
            r12.<init>(r0, r1)
            r0.i = r12
            r13 = 1
            r0.l = r13
            r0.m = r10
            r0.x = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.w = r1
            int[] r3 = defpackage.daae.a
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = defpackage.daaz.a(r1, r2, r3, r4, r5, r6)
            r2 = 4
            czur r2 = defpackage.czur.f(r14, r1, r2)
            r3 = 3
            czur r3 = defpackage.czur.f(r14, r1, r3)
            r4 = 2
            czur r4 = defpackage.czur.f(r14, r1, r4)
            r5 = 5
            czur r5 = defpackage.czur.f(r14, r1, r5)
            r6 = -1
            int r6 = r1.getDimensionPixelSize(r10, r6)
            r0.v = r6
            int r6 = defpackage.od.w(r16)
            r0.j = r6
            int r6 = defpackage.od.x(r16)
            r0.k = r6
            czyy r6 = new czyy
            r6.<init>()
            czzk r15 = new czzk
            czzd r10 = new czzd
            r10.<init>(r0)
            r15.<init>(r0, r6, r10, r13)
            r0.e = r15
            czzk r10 = new czzk
            czze r13 = new czze
            r13.<init>(r0)
            r7 = 0
            r10.<init>(r0, r6, r13, r7)
            r0.d = r10
            czza r11 = (defpackage.czza) r11
            r11.b = r2
            czza r12 = (defpackage.czza) r12
            r12.b = r3
            czza r15 = (defpackage.czza) r15
            r15.b = r4
            czza r10 = (defpackage.czza) r10
            r10.b = r5
            r1.recycle()
            dadk r1 = defpackage.dadx.a
            r2 = r18
            dadw r1 = defpackage.dadx.c(r14, r2, r8, r9, r1)
            dadx r1 = r1.b()
            r0.setShapeAppearanceModel(r1)
            r16.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        k();
    }
}
