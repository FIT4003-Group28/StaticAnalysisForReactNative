package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.czzp;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FloatingActionButton$BaseBehavior<T extends czzp> extends aji<T> {
    private Rect a;
    private boolean b;

    public FloatingActionButton$BaseBehavior() {
        this.b = true;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, daae.d);
        this.b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private static boolean s(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ajl) {
            return ((ajl) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean t(View view, czzp czzpVar) {
        return this.b && ((ajl) czzpVar.getLayoutParams()).f == view.getId() && czzpVar.d == 0;
    }

    private final boolean u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, czzp czzpVar) {
        if (!t(appBarLayout, czzpVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        daak.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.k()) {
            czzpVar.d();
            return true;
        }
        czzpVar.e();
        return true;
    }

    private final boolean v(View view, czzp czzpVar) {
        if (!t(view, czzpVar)) {
            return false;
        }
        if (view.getTop() < (czzpVar.getHeight() / 2) + ((ajl) czzpVar.getLayoutParams()).topMargin) {
            czzpVar.d();
            return true;
        }
        czzpVar.e();
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
        czzp czzpVar = (czzp) view;
        if (view2 instanceof AppBarLayout) {
            u(coordinatorLayout, (AppBarLayout) view2, czzpVar);
            return false;
        } else if (!s(view2)) {
            return false;
        } else {
            v(view2, czzpVar);
            return false;
        }
    }

    @Override // defpackage.aji
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        czzp czzpVar = (czzp) view;
        List<View> l = coordinatorLayout.l(czzpVar);
        int size = l.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = l.get(i3);
            if (!(view2 instanceof AppBarLayout)) {
                if (s(view2) && v(view2, czzpVar)) {
                    break;
                }
            } else if (u(coordinatorLayout, (AppBarLayout) view2, czzpVar)) {
                break;
            }
        }
        coordinatorLayout.h(czzpVar, i);
        Rect rect = czzpVar.c;
        if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
            return true;
        }
        ajl ajlVar = (ajl) czzpVar.getLayoutParams();
        int i4 = czzpVar.getRight() >= coordinatorLayout.getWidth() - ajlVar.rightMargin ? rect.right : czzpVar.getLeft() <= ajlVar.leftMargin ? -rect.left : 0;
        if (czzpVar.getBottom() >= coordinatorLayout.getHeight() - ajlVar.bottomMargin) {
            i2 = rect.bottom;
        } else if (czzpVar.getTop() <= ajlVar.topMargin) {
            i2 = -rect.top;
        }
        if (i2 != 0) {
            od.ag(czzpVar, i2);
        }
        if (i4 == 0) {
            return true;
        }
        od.ah(czzpVar, i4);
        return true;
    }

    @Override // defpackage.aji
    public final /* bridge */ /* synthetic */ boolean m(View view, Rect rect) {
        czzp czzpVar = (czzp) view;
        Rect rect2 = czzpVar.c;
        rect.set(czzpVar.getLeft() + rect2.left, czzpVar.getTop() + rect2.top, czzpVar.getRight() - rect2.right, czzpVar.getBottom() - rect2.bottom);
        return true;
    }
}
