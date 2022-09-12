package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: clbm  reason: default package */
/* loaded from: classes5.dex */
public final class clbm {
    public static int a(Rect rect) {
        return rect.width() * rect.height();
    }

    public static void b(Rect rect, float f, float f2) {
        rect.set(c(rect.left * f), c(rect.top * f2), d(rect.right * f), d(rect.bottom * f2));
    }

    private static int c(float f) {
        return (int) Math.floor(f);
    }

    private static int d(float f) {
        return (int) Math.ceil(f);
    }
}
