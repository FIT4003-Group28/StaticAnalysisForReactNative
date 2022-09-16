package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ezv  reason: default package */
/* loaded from: classes3.dex */
public final class ezv {
    public static final Bitmap a(Resources resources, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int min = Math.min(height, (int) (width / resources.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1)));
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_icon_size) / min;
        Matrix matrix = new Matrix();
        matrix.setScale(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        return Bitmap.createBitmap(bitmap, (width - min) / 2, (height - min) / 2, min, min, matrix, false);
    }

    public static String b(String str, afvn afvnVar) {
        return c(str, afvnVar.c().d());
    }

    public static String c(String str, String str2) {
        return String.format(Locale.US, str.length() != 0 ? "%s:".concat(str) : new String("%s:"), str2);
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.endsWith("bollard_enabled");
    }

    public static Uri e(Context context) {
        return yhr.a(context, "watch", "backupwatchstorage.pb");
    }

    public static String f(PlayerResponseModel playerResponseModel) {
        String A = playerResponseModel.A();
        return A == null ? "" : A;
    }

    public static String g(PlayerResponseModel playerResponseModel) {
        String B = playerResponseModel.B();
        return (B == null || B.isEmpty()) ? "https://www.youtube.com" : zgt.h(B).toString();
    }

    public static aafo h(aafo aafoVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return new gnr(aafoVar, hashMap);
    }

    public static ajrt i() {
        final HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 2);
        return new ajrt() { // from class: gnp
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                ajrsVar.g(hashMap);
            }
        };
    }

    public static int j(int i, int i2, float f) {
        return (int) (i + ((i2 - i) * f) + 0.5f);
    }

    public static View k(View view, Point point, ampt amptVar) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view;
            for (View view2 : new Iterable() { // from class: gho
                @Override // java.lang.Iterable
                public final Iterator iterator() {
                    return new ghp(viewGroup);
                }
            }) {
                View k = k(view2, new Point(point.x - (view2.getLeft() + ((int) view2.getTranslationX())), point.y - (view2.getTop() + ((int) view2.getTranslationY()))), amptVar);
                if (k != null) {
                    return k;
                }
            }
        }
        if (point.x >= 0 && point.x < view.getWidth() && point.y >= 0 && point.y < view.getHeight() && amptVar.a(view)) {
            return view;
        }
        return null;
    }

    public static View l(View view, int i, Class cls) {
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        try {
            return (View) cls.cast(findViewById);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static AccessibilityLayerLayout m(Activity activity) {
        View findViewById = activity.findViewById(R.id.accessibility_layer_container);
        if (findViewById instanceof AccessibilityLayerLayout) {
            return (AccessibilityLayerLayout) findViewById;
        }
        return null;
    }

    public static void n(Point point, View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            point.x = (int) (point.x - (view.getLeft() + view.getTranslationX()));
            point.y = (int) (point.y - (view.getTop() + view.getTranslationY()));
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                point.x += viewPager.getScrollX();
                point.y += viewPager.getScrollY();
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                point.x -= iArr[0];
                point.y -= iArr[1];
                return;
            }
        }
    }

    public static void o(Rect rect, Rect rect2, Rect rect3, float f) {
        rect.set(j(rect2.left, rect3.left, f), j(rect2.top, rect3.top, f), j(rect2.right, rect3.right, f), j(rect2.bottom, rect3.bottom, f));
    }

    public static void p(Activity activity, boolean z) {
        AccessibilityLayerLayout m = m(activity);
        if (m != null) {
            m.b(z);
        }
    }

    public static void q(Activity activity, boolean z) {
        AccessibilityLayerLayout m = m(activity);
        if (m != null) {
            m.c(z);
        }
    }

    public static int r(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 86400.0d);
    }

    public static int s(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 3600.0d);
    }

    public static int t(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) Math.ceil(d / 60.0d);
    }
}
