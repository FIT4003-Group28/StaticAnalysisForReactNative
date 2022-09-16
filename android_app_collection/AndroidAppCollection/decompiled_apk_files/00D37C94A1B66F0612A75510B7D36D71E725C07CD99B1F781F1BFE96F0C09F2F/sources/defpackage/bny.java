package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* compiled from: PG */
/* renamed from: bny  reason: default package */
/* loaded from: classes2.dex */
final class bny {
    static final Property a;
    public static final adj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        return b.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i, int i2, int i3, int i4) {
        b.d(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, float f) {
        b.e(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, int i) {
        b.f(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boi e(View view) {
        return new boi(view);
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            b = new bod();
        } else {
            b = Build.VERSION.SDK_INT >= 23 ? new boc() : Build.VERSION.SDK_INT >= 22 ? new bob() : new boa();
        }
        a = new bnw(Float.class);
        new bnx(Rect.class);
    }
}
