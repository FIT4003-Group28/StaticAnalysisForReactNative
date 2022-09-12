package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azf  reason: default package */
/* loaded from: classes3.dex */
public final class azf {
    public static final azl a;
    static final Property<View, Float> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view, float f) {
        a.a(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(View view) {
        return a.b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, int i) {
        a.h(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, int i, int i2, int i3, int i4) {
        a.g(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azr e(View view) {
        return new azr(view);
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new azk();
        } else {
            a = Build.VERSION.SDK_INT >= 23 ? new azj() : Build.VERSION.SDK_INT >= 22 ? new azi() : new azh();
        }
        b = new azd(Float.class);
        new aze(Rect.class);
    }
}
