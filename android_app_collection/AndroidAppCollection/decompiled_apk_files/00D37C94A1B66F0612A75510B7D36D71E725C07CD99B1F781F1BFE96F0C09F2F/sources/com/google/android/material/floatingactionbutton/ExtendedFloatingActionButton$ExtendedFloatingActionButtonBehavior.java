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
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends ajc {
    private Rect a;
    private boolean b;
    private boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alkv.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    private static boolean v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ajf) {
            return ((ajf) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean w(View view, alkf alkfVar) {
        return (this.b || this.c) && ((ajf) alkfVar.getLayoutParams()).f == view.getId();
    }

    private final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, alkf alkfVar) {
        if (!w(appBarLayout, alkfVar)) {
            return false;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        alkz.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.e()) {
            u(alkfVar);
            return true;
        }
        t(alkfVar);
        return true;
    }

    private final boolean y(View view, alkf alkfVar) {
        if (!w(view, alkfVar)) {
            return false;
        }
        if (view.getTop() < (alkfVar.getHeight() / 2) + ((ajf) alkfVar.getLayoutParams()).topMargin) {
            u(alkfVar);
            return true;
        }
        t(alkfVar);
        return true;
    }

    @Override // defpackage.ajc
    public final void a(ajf ajfVar) {
        if (ajfVar.h == 0) {
            ajfVar.h = 80;
        }
    }

    @Override // defpackage.ajc
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        alkf alkfVar = (alkf) view;
        if (view2 instanceof AppBarLayout) {
            x(coordinatorLayout, (AppBarLayout) view2, alkfVar);
            return false;
        } else if (!v(view2)) {
            return false;
        } else {
            y(view2, alkfVar);
            return false;
        }
    }

    @Override // defpackage.ajc
    public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        alkf alkfVar = (alkf) view;
        List h = coordinatorLayout.h(alkfVar);
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) h.get(i2);
            if (view2 instanceof AppBarLayout) {
                if (x(coordinatorLayout, (AppBarLayout) view2, alkfVar)) {
                    break;
                }
            } else {
                if (v(view2) && y(view2, alkfVar)) {
                    break;
                }
            }
        }
        coordinatorLayout.l(alkfVar, i);
        return true;
    }

    @Override // defpackage.ajc
    public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
        alkf alkfVar = (alkf) view;
        return false;
    }

    protected final void t(alkf alkfVar) {
        if (this.c) {
            int i = alkf.f;
            alku alkuVar = alkfVar.c;
        } else {
            int i2 = alkf.f;
            alku alkuVar2 = alkfVar.d;
        }
        throw null;
    }

    protected final void u(alkf alkfVar) {
        if (this.c) {
            int i = alkf.f;
            alku alkuVar = alkfVar.b;
        } else {
            int i2 = alkf.f;
            alku alkuVar2 = alkfVar.e;
        }
        throw null;
    }
}
