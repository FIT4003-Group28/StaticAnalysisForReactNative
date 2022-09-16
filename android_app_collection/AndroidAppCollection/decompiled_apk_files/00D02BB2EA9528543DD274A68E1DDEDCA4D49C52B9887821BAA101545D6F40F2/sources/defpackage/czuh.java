package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: czuh  reason: default package */
/* loaded from: classes.dex */
public final class czuh implements Interpolator {
    private static final String a = "czuh";
    private TimeInterpolator b;

    public czuh() {
        try {
            this.b = (TimeInterpolator) Class.forName("android.view.animation.PathInterpolator").getConstructor(Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE).newInstance(Float.valueOf(0.4f), Float.valueOf(0.0f), Float.valueOf(0.2f), Float.valueOf(1.0f));
        } catch (Throwable unused) {
            String str = a;
            Object[] objArr = {"Device does not support PathInterpolator. Falling back to ", "AccelerateDecelerateInterpolator."};
            if (czuf.c(Level.ALL)) {
                czuf.d(str, objArr);
            }
        }
        if (this.b == null) {
            this.b = new czug();
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.b.getInterpolation(f);
    }
}
