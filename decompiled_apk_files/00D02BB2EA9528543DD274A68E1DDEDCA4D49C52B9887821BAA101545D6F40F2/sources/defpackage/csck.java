package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: csck  reason: default package */
/* loaded from: classes5.dex */
public final class csck extends cscn {
    public static final float b(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    public static final float c(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 0.66f) / 0.33999997f;
    }

    public static final float d(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    public static final void e(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    public final void a(float f, float f2) {
        float b = b(f2, f);
        this.e = d(b, f);
        e(this.a, b, 1.0f);
        this.c.addOval(this.a, Path.Direction.CW);
        e(this.a, b, 0.95f);
        this.c.addOval(this.a, Path.Direction.CW);
    }
}
