package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kt  reason: default package */
/* loaded from: classes3.dex */
public class kt {
    public static float B(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static int C(Context context) {
        int G = G(context, R.attr.mediaRouteTheme);
        return G == 0 ? E(context) : G;
    }

    public static int D(Context context, int i) {
        return gy.a(-1, F(context, i, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static int E(Context context) {
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) ? D(context, 0) == -570425344 ? 2132083873 : 2132083870 : D(context, 0) == -570425344 ? 2132083871 : 2132083872;
    }

    public static int F(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int G(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static Context H(Context context, int i, boolean z) {
        if (i == 0) {
            i = G(context, true != z ? R.attr.dialogTheme : R.attr.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return G(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, E(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static void I(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int D = D(context, 0);
        if (Color.alpha(D) != 255) {
            D = gy.e(D, ((Integer) view.getTag()).intValue());
        }
        if (mediaRouteVolumeSlider.a != D) {
            if (Color.alpha(D) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(D));
            }
            mediaRouteVolumeSlider.a = D;
        }
        if (mediaRouteVolumeSlider.b != D) {
            if (Color.alpha(D) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(D));
            }
            mediaRouteVolumeSlider.b = D;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static Interpolator o(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public void A(bhc bhcVar, int i) {
        v();
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s(bhc bhcVar) {
    }

    public void t(bhc bhcVar) {
    }

    public void u(bhc bhcVar) {
    }

    @Deprecated
    public void v() {
    }

    public void w(bhc bhcVar) {
    }

    public void x(bhm bhmVar) {
    }

    public void y(bhc bhcVar, int i) {
        z();
    }

    @Deprecated
    public void z() {
    }
}
