package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: itf  reason: default package */
/* loaded from: classes.dex */
public final class itf implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int c = 0;
    public boolean a;
    private final View d;
    private final cjqq e;
    public final Point b = new Point();
    private final int[] f = new int[2];

    public itf(View view, cjqq cjqqVar) {
        this.d = view;
        this.e = cjqqVar;
    }

    @Deprecated
    public static void a(View view) {
        itf itfVar = (itf) view.getTag(R.id.impression_logger);
        if (itfVar != null) {
            view.setTag(R.id.impression_logger, null);
            b(view);
            view.removeOnAttachStateChangeListener(itfVar);
        }
    }

    private static void b(View view) {
        cjqg.d(view, null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        cjtd k;
        if (!this.a && (k = cjqg.k(this.d)) != null && !k.equals(cjtd.c)) {
            int width = this.d.getWidth();
            int height = this.d.getHeight();
            if (k.f() != ddhj.VISIBILITY_VISIBLE || (width != 0 && height != 0)) {
                this.d.getLocationOnScreen(this.f);
                int[] iArr = this.f;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = width == 0 ? i : (width + i) - 1;
                int i4 = height == 0 ? i2 : (height + i2) - 1;
                if (i3 >= 0 && i < this.b.x && i4 >= 0 && i2 < this.b.y) {
                    cjqg.d(this.d, this.e.f(this.d).e(this.d));
                    this.a = true;
                }
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a = false;
        ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getSize(this.b);
        view.getViewTreeObserver().addOnPreDrawListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        b(this.d);
    }
}
