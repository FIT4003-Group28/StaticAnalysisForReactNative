package defpackage;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: zav  reason: default package */
/* loaded from: classes4.dex */
public final class zav {
    public static final Animator.AnimatorListener a(zaq zaqVar) {
        return new zau(zaqVar);
    }

    public static final lo b(zaq zaqVar) {
        return new zat(zaqVar);
    }

    public static void c(View view, Drawable drawable) {
        view.getClass();
        int i = lj.i(view);
        int paddingTop = view.getPaddingTop();
        int h = lj.h(view);
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(drawable);
        lj.Y(view, i, paddingTop, h, paddingBottom);
    }

    public static void d(View view, Drawable drawable) {
        view.getClass();
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        int i = lj.i(view);
        int paddingTop = view.getPaddingTop();
        int h = lj.h(view);
        int paddingBottom = view.getPaddingBottom();
        view.setForeground(drawable);
        lj.Y(view, i, paddingTop, h, paddingBottom);
    }

    public static final void e(String str) {
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null) {
            zep.b("HttpsEnforcer: unexpected null host");
        } else if (!"https".equalsIgnoreCase(scheme)) {
            throw new yue();
        }
    }

    public static String f(int i) {
        switch (i - 1) {
            case 0:
                return "GET";
            case 1:
                return "POST";
            case 2:
                return "PUT";
            case 3:
                return "DELETE";
            case 4:
                return "HEAD";
            case 5:
                return "OPTIONS";
            case 6:
                return "TRACE";
            default:
                return "PATCH";
        }
    }
}
