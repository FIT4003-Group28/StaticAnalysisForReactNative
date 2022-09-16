package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaRouter;
import android.os.Build;
import android.util.Log;
import android.view.ActionMode;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kz  reason: default package */
/* loaded from: classes3.dex */
public final class kz {
    public kz() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        return view.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(View view) {
        return view.getZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mb e(View view, mb mbVar, Rect rect) {
        WindowInsets s = mbVar.s();
        if (s != null) {
            return mb.r(view.computeSystemWindowInsets(s, rect), view);
        }
        rect.setEmpty();
        return mbVar;
    }

    public static mb f(View view) {
        if (!lq.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = lq.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) lq.b.get(obj);
            Rect rect2 = (Rect) lq.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            lr lrVar = new lr();
            lrVar.b(gz.c(rect));
            lrVar.c(gz.c(rect2));
            mb a = lrVar.a();
            a.v(a);
            a.t(view.getRootView());
            return a;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(View view, kj kjVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, kjVar);
        }
        if (kjVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ky(view, kjVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static ActionMode.Callback o(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof nf) || callback == null) ? callback : new nf(callback, textView);
    }

    public static void p(TextView textView, int i) {
        int i2;
        hz.e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i <= Math.abs(i2)) {
            return;
        }
        textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
    }

    public static void q(TextView textView, int i) {
        int i2;
        hz.e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void r(TextView textView, int i) {
        hz.e(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void s(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static void t(TextView textView, int i, int i2) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, i2, 0);
    }

    public static void u(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, (Drawable) null);
    }

    public static Display v(Object obj) {
        try {
            return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
            return null;
        }
    }
}
