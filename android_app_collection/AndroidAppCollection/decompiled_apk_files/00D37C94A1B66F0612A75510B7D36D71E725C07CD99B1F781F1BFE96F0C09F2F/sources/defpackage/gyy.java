package defpackage;

import android.graphics.Bitmap;
import android.view.View;
/* compiled from: PG */
/* renamed from: gyy  reason: default package */
/* loaded from: classes3.dex */
public final class gyy {
    public static boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void b(View view, boolean z) {
        if (z) {
            c(view);
        } else {
            d(view);
        }
    }

    public static void c(View... viewArr) {
        for (View view : viewArr) {
            if (view != null && (view.getVisibility() != 0 || view.getAlpha() != 1.0f)) {
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().alpha(1.0f).setDuration(100L).start();
            }
        }
    }

    public static void d(View... viewArr) {
        for (View view : viewArr) {
            if (view != null && view.getVisibility() == 0) {
                view.animate().cancel();
                view.animate().alpha(0.0f).setDuration(100L).withEndAction(new gys(view)).start();
            }
        }
    }

    public static void e(View view, boolean z) {
        if (!z) {
            View[] viewArr = {view};
            for (int i = 0; i <= 0; i++) {
                View view2 = viewArr[i];
                if (view2 != null && view2.getVisibility() == 0) {
                    view2.animate().cancel();
                    view2.animate().alpha(0.0f).setStartDelay(100L).setDuration(100L).withEndAction(new gys(view2, 2)).start();
                    view2.animate().scaleX(0.9f).setDuration(200L).start();
                    view2.animate().scaleY(0.9f).setDuration(200L).start();
                }
            }
            return;
        }
        View[] viewArr2 = {view};
        for (int i2 = 0; i2 <= 0; i2++) {
            View view3 = viewArr2[i2];
            if (view3 != null && (view3.getVisibility() != 0 || view3.getAlpha() != 1.0f || view3.getScaleX() != 1.0f || view3.getScaleY() != 1.0f)) {
                view3.animate().cancel();
                view3.setVisibility(0);
                view3.setScaleX(0.9f);
                view3.setScaleY(0.9f);
                view3.animate().alpha(1.0f).setDuration(100L).start();
                view3.animate().scaleX(1.0f).setDuration(200L).start();
                view3.animate().scaleY(1.0f).setDuration(200L).start();
            }
        }
    }

    public static Bitmap f(Bitmap bitmap, double d) {
        int i;
        int i2;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d2 = height;
        double d3 = width;
        Double.isNaN(d2);
        Double.isNaN(d3);
        if (d2 / d3 > d) {
            Double.isNaN(d3);
            i2 = (int) (d3 * d);
            i = width;
        } else {
            Double.isNaN(d2);
            i = (int) (d2 / d);
            i2 = height;
        }
        return Bitmap.createBitmap(bitmap, (width - i) / 2, (height - i2) / 2, i, i2);
    }
}
