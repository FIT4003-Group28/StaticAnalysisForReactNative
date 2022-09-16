package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aloe  reason: default package */
/* loaded from: classes.dex */
public class aloe {
    public static final String b = "aloe";
    public final ViewGroup c;
    public final Context d;
    public final alod e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public BaseTransientBottomBar$Behavior k;
    public final SnackbarContentLayout l;
    private Rect p;
    private final AccessibilityManager q;
    private static final int[] n = {R.attr.snackbarStyle};
    static final Handler a = new Handler(Looper.getMainLooper(), new alnt());
    private final Runnable o = new alob(this, 1);
    public final alnw m = new alnw(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public aloe(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.c = viewGroup;
                this.l = snackbarContentLayout;
                this.d = context;
                alli.b(context);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                alod alodVar = (alod) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
                this.e = alodVar;
                float f = alodVar.b;
                if (f != 1.0f) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    snackbarContentLayout2.b.setTextColor(amxp.z(almu.k(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
                }
                alodVar.addView(view);
                ViewGroup.LayoutParams layoutParams = alodVar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                lj.au(alodVar);
                lj.V(alodVar, 1);
                lj.T(alodVar, true);
                lj.X(alodVar, new alnu(this));
                lj.M(alodVar, new alnv(this));
                this.q = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public int a() {
        throw null;
    }

    public final int b() {
        int height = this.e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(alhv.a);
        ofFloat.addUpdateListener(new alnq(this, 1));
        return ofFloat;
    }

    public final void d() {
        e(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i) {
        aloj alojVar;
        alok a2 = alok.a();
        alnw alnwVar = this.m;
        synchronized (a2.a) {
            if (a2.g(alnwVar)) {
                alojVar = a2.c;
            } else if (a2.h(alnwVar)) {
                alojVar = a2.d;
            }
            a2.d(alojVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        alok a2 = alok.a();
        alnw alnwVar = this.m;
        synchronized (a2.a) {
            if (a2.g(alnwVar)) {
                a2.b(a2.c);
            }
        }
    }

    public final void g() {
        alok a2 = alok.a();
        int a3 = a();
        alnw alnwVar = this.m;
        synchronized (a2.a) {
            if (a2.g(alnwVar)) {
                aloj alojVar = a2.c;
                alojVar.b = a3;
                a2.b.removeCallbacksAndMessages(alojVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(alnwVar)) {
                a2.d.b = a3;
            } else {
                a2.d = new aloj(a3, alnwVar);
            }
            aloj alojVar2 = a2.c;
            if (alojVar2 != null && a2.d(alojVar2, 4)) {
                return;
            }
            a2.c = null;
            a2.c();
        }
    }

    public final void h() {
        if (j()) {
            this.e.post(new alob(this));
            return;
        }
        if (this.e.getParent() != null) {
            this.e.setVisibility(0);
        }
        f();
    }

    public final void i() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.p) == null) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.g;
        marginLayoutParams.leftMargin = this.p.left + this.h;
        marginLayoutParams.rightMargin = this.p.right + this.i;
        this.e.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.j <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
        if (!(layoutParams2 instanceof ajf) || !(((ajf) layoutParams2).a instanceof SwipeDismissBehavior)) {
            return;
        }
        this.e.removeCallbacks(this.o);
        this.e.post(this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        AccessibilityManager accessibilityManager = this.q;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        alok a2 = alok.a();
        alnw alnwVar = this.m;
        synchronized (a2.a) {
            if (a2.g(alnwVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }

    public final void l() {
        this.e.a = 1;
    }
}
