package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccessibilityLayerLayout extends FrameLayout {
    public int a;
    public final int b;
    public View c;
    public View d;
    private boolean e;
    private boolean f;

    public AccessibilityLayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.f = false;
        new yyg(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yzz.a);
        this.a = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.b = resourceId;
        obtainStyledAttributes.recycle();
        this.c = findViewById(this.a);
        this.d = findViewById(resourceId);
        lj.M(this, new yyf(this));
        lj.V(this, 1);
        setOnHierarchyChangeListener(new yyh(this));
    }

    public final void a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (d(childAt)) {
                lj.V(childAt, 0);
            } else {
                lj.V(childAt, 4);
            }
        }
    }

    public final void b(boolean z) {
        getContext();
        this.e = z;
    }

    public final void c(boolean z) {
        getContext();
        this.f = z;
    }

    public final boolean d(View view) {
        View view2;
        if (view == null) {
            return false;
        }
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                view2 = null;
                break;
            }
            view2 = getChildAt(childCount);
            if (view2.getVisibility() == 0 && (!this.f || view2 != this.d)) {
                break;
            }
        }
        return view == view2 || (this.e && view == this.c) || (this.f && view == this.d);
    }
}
