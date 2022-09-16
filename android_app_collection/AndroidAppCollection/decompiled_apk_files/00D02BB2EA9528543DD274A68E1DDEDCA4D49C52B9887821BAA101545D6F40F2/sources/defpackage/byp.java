package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: byp  reason: default package */
/* loaded from: classes.dex */
public final class byp {
    static final int a;
    final Context b;
    final ActivityManager c;
    public float d = 2.0f;
    public float e;
    final byq f;

    static {
        a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public byp(Context context) {
        this.e = a;
        this.b = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.c = activityManager;
        this.f = new byq(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.e = 0.0f;
    }

    public final byr a() {
        return new byr(this);
    }
}
