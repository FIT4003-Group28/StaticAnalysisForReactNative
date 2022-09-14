package c.d.j.d;

import android.app.ActivityManager;
import android.os.Build;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class i implements c.d.d.d.l<q> {

    /* renamed from: b  reason: collision with root package name */
    private static final long f3227b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f3228a;

    public i(ActivityManager activityManager) {
        this.f3228a = activityManager;
    }

    private int a() {
        int min = Math.min(this.f3228a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return min / 4;
        }
        return 8388608;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.d.l
    /* renamed from: get */
    public q mo139get() {
        return new q(a(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f3227b);
    }
}
