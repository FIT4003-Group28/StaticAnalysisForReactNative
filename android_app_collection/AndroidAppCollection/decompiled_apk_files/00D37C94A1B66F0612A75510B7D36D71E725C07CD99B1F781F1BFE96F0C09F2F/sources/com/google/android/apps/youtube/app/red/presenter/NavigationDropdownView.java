package com.google.android.apps.youtube.app.red.presenter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.SmoothHeightResizeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationDropdownView extends SmoothHeightResizeLayout {
    public TextView d;
    public TextView e;
    public ImageView f;
    public ktt g;
    public aqrf h;
    public ValueAnimator i;
    public ktu j;
    public kts k;
    public boolean l;
    public boolean m;
    private ViewGroup n;
    private ViewGroup o;
    private RecyclerView p;
    private bnr q;
    private boolean r;

    public NavigationDropdownView(Context context) {
        super(context);
        f(zhn.n(context, null, 0), null);
    }

    private final void f(Context context, AttributeSet attributeSet) {
        if (this.n != null) {
            return;
        }
        inflate(context, R.layout.navigation_dropdown_layout, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dropdown_wrapper);
        this.n = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.dropdown_header);
        this.o = viewGroup2;
        this.d = (TextView) viewGroup2.findViewById(R.id.collapsed_title);
        this.e = (TextView) this.o.findViewById(R.id.expanded_title);
        this.f = (ImageView) this.o.findViewById(R.id.expand_button);
        this.p = (RecyclerView) this.n.findViewById(R.id.dropdown_items);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ktw.a);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        if (colorStateList == null) {
            colorStateList = this.d.getTextColors();
        }
        if (colorStateList2 == null) {
            colorStateList2 = this.e.getTextColors();
        }
        this.k = new kts(new ktq(this, 1), colorStateList, colorStateList2);
        this.p.setNestedScrollingEnabled(false);
        this.p.ag(new LinearLayoutManager());
        this.p.ad(this.k);
        this.o.setOnClickListener(new ktq(this));
        this.r = true;
        this.l = true;
        this.m = false;
    }

    public final void b(boolean z) {
        if (!this.r) {
            d(z);
        }
    }

    public final void c(boolean z) {
        this.l = z;
        e();
    }

    public final void d(boolean z) {
        ViewGroup viewGroup;
        if (!this.l || !this.m) {
            return;
        }
        int i = 1;
        this.r = !this.r;
        if (z) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                this.i.cancel();
            }
            this.a = true;
            this.c = getMeasuredHeight();
            this.b = 0.0f;
            requestLayout();
            if (this.q == null) {
                bnr bnrVar = new bnr();
                this.q = bnrVar;
                long j = bnrVar.b;
                frd frdVar = new frd();
                frdVar.z(this.f);
                bne bneVar = new bne();
                bneVar.z(this.d);
                bneVar.z(this.e);
                bnr bnrVar2 = this.q;
                bnrVar2.f(frdVar);
                bnrVar2.f(bneVar);
                bnrVar2.e(new ktr(this, j));
            }
            ViewParent parent = getParent();
            if (parent == null) {
                viewGroup = this;
            } else {
                ViewParent parent2 = parent.getParent();
                if (true == (parent2 instanceof ViewGroup)) {
                    parent = parent2;
                }
                viewGroup = (ViewGroup) parent;
            }
            bno.b(viewGroup, this.q);
        }
        this.f.setRotation(true != this.r ? 180.0f : 360.0f);
        this.f.setPressed(true);
        zag.o(this.d, this.r);
        zag.o(this.e, !this.r);
        if (this.k.b() > 1) {
            RecyclerView recyclerView = this.p;
            if (true != this.r) {
                i = -2;
            }
            zgd.t(recyclerView, zgd.h(i), ViewGroup.LayoutParams.class);
        }
        RecyclerView recyclerView2 = this.p;
        lj.Y(recyclerView2, recyclerView2.getPaddingStart(), this.p.getPaddingTop(), this.p.getPaddingEnd(), this.r ? 0 : getResources().getDimensionPixelSize(R.dimen.navigation_dropdown_expanded_recyclerview_bottom_padding));
    }

    public final void e() {
        boolean z = false;
        if (this.l && this.m) {
            z = true;
        }
        zag.o(this.p, z);
        zag.o(this.f, z);
        this.o.setClickable(z);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(zhn.n(context, attributeSet, 0), attributeSet);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f(zhn.n(context, attributeSet, 0), attributeSet);
    }
}
