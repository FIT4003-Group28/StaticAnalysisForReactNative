package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import defpackage.daff;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: daff  reason: default package */
/* loaded from: classes.dex */
public class daff<B extends daff<B>> {
    private static final int[] a = {R.attr.snackbarStyle};
    static final Handler b = new Handler(Looper.getMainLooper(), new daes());
    public static final /* synthetic */ int n = 0;
    public final ViewGroup c;
    public final Context d;
    public final dafe e;
    public final dafg f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public List<dafb<B>> l;
    private Rect p;
    private final AccessibilityManager q;
    private final Runnable o = new daet(this);
    public final daew m = new daew(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public daff(Context context, ViewGroup viewGroup, View view, dafg dafgVar) {
        if (viewGroup != null) {
            if (view == null) {
                throw new IllegalArgumentException("Transient bottom bar must have non-null content");
            }
            if (dafgVar != null) {
                this.c = viewGroup;
                this.f = dafgVar;
                this.d = context;
                daaz.d(context);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                dafe dafeVar = (dafe) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
                this.e = dafeVar;
                if (view instanceof SnackbarContentLayout) {
                    SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                    float f = dafeVar.b;
                    if (f != 1.0f) {
                        snackbarContentLayout.b.setTextColor(czxb.b(dacz.c(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.b.getCurrentTextColor(), f));
                    }
                }
                dafeVar.addView(view);
                ViewGroup.LayoutParams layoutParams = dafeVar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                od.v(dafeVar, 1);
                od.m(dafeVar, 1);
                od.N(dafeVar, true);
                od.O(dafeVar, new daeu(this));
                od.c(dafeVar, new daev(this));
                this.q = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    public final void a() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.p) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.h;
        marginLayoutParams.leftMargin = this.p.left + this.i;
        marginLayoutParams.rightMargin = this.p.right + this.j;
        this.e.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.k <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
        if (!(layoutParams2 instanceof ajl) || !(((ajl) layoutParams2).a instanceof SwipeDismissBehavior)) {
            return;
        }
        this.e.removeCallbacks(this.o);
        this.e.post(this.o);
    }

    public int b() {
        return this.g;
    }

    public final void c() {
        dafn a2 = dafn.a();
        int b2 = b();
        daew daewVar = this.m;
        synchronized (a2.a) {
            if (a2.g(daewVar)) {
                dafm dafmVar = a2.c;
                dafmVar.b = b2;
                a2.b.removeCallbacksAndMessages(dafmVar);
                a2.d(a2.c);
                return;
            }
            if (a2.h(daewVar)) {
                a2.d.b = b2;
            } else {
                a2.d = new dafm(b2, daewVar);
            }
            dafm dafmVar2 = a2.c;
            if (dafmVar2 != null && a2.c(dafmVar2, 4)) {
                return;
            }
            a2.c = null;
            a2.b();
        }
    }

    public final void d() {
        e(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i) {
        dafm dafmVar;
        dafn a2 = dafn.a();
        daew daewVar = this.m;
        synchronized (a2.a) {
            if (a2.g(daewVar)) {
                dafmVar = a2.c;
            } else if (a2.h(daewVar)) {
                dafmVar = a2.d;
            }
            a2.c(dafmVar, i);
        }
    }

    public final boolean f() {
        boolean g;
        dafn a2 = dafn.a();
        daew daewVar = this.m;
        synchronized (a2.a) {
            g = a2.g(daewVar);
        }
        return g;
    }

    public final void g() {
        if (k()) {
            this.e.post(new daej(this));
            return;
        }
        this.e.setVisibility(0);
        j();
    }

    public final ValueAnimator h(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(czum.a);
        ofFloat.addUpdateListener(new daem(this));
        return ofFloat;
    }

    public final int i() {
        int height = this.e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        dafn a2 = dafn.a();
        daew daewVar = this.m;
        synchronized (a2.a) {
            if (a2.g(daewVar)) {
                a2.d(a2.c);
            }
        }
        List<dafb<B>> list = this.l;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                this.l.get(size).c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.q.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void l(dafb<B> dafbVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(dafbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        dafn a2 = dafn.a();
        daew daewVar = this.m;
        synchronized (a2.a) {
            if (a2.g(daewVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.b();
                }
            }
        }
        List<dafb<B>> list = this.l;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.l.get(size).a(this);
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }
}
