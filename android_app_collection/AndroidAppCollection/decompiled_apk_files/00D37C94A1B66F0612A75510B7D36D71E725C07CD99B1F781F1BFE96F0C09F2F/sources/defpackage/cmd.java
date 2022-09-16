package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cmd  reason: default package */
/* loaded from: classes2.dex */
public final class cmd {
    static final int a;
    final ActivityManager b;
    float d;
    final cme h;
    float c = 2.0f;
    public float e = 0.4f;
    public float f = 0.33f;
    public int g = 4194304;

    static {
        a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public cmd(Context context) {
        this.d = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.h = new cme(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }

    public final cmf a() {
        return new cmf(this);
    }

    public final void b(float f) {
        hy.O(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
        this.d = f;
    }

    public final void c(float f) {
        hy.O(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
        this.c = f;
    }
}
