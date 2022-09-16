package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czyv  reason: default package */
/* loaded from: classes.dex */
public final class czyv {
    public final boolean a;
    private final int b;
    private final int c;
    private final float d;

    public czyv(Context context) {
        this.a = dacz.d(context, R.attr.elevationOverlayEnabled, false);
        this.b = czxb.a(context, R.attr.elevationOverlayColor, 0);
        this.c = czxb.a(context, R.attr.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i, float f) {
        if (!this.a || kc.f(i, 255) != this.c) {
            return i;
        }
        float f2 = this.d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return kc.f(czxb.b(kc.f(i, 255), this.b, f3), Color.alpha(i));
    }
}
