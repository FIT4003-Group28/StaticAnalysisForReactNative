package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: aljw  reason: default package */
/* loaded from: classes.dex */
public final class aljw {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public aljw(Context context) {
        boolean n = almu.n(context, R.attr.elevationOverlayEnabled, false);
        int y = amxp.y(context, R.attr.elevationOverlayColor, 0);
        int y2 = amxp.y(context, R.attr.elevationOverlayAccentColor, 0);
        int y3 = amxp.y(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = n;
        this.d = y;
        this.e = y2;
        this.b = y3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (!this.a || gy.f(i, PrivateKeyType.INVALID) != this.b) {
            return i;
        }
        float f2 = this.f;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int z = amxp.z(gy.f(i, PrivateKeyType.INVALID), this.d, min);
        if (min > 0.0f && (i2 = this.e) != 0) {
            z = gy.e(gy.f(i2, c), z);
        }
        return gy.f(z, alpha);
    }
}
