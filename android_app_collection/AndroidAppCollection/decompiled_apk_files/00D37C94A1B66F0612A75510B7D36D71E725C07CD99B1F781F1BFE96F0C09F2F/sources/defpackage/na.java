package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: na  reason: default package */
/* loaded from: classes3.dex */
public class na {
    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static int e(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & PrivateKeyType.INVALID) / 255.0f;
        float g = g(((i >> 16) & PrivateKeyType.INVALID) / 255.0f);
        float g2 = g(((i >> 8) & PrivateKeyType.INVALID) / 255.0f);
        float g3 = g((i & PrivateKeyType.INVALID) / 255.0f);
        float g4 = g(((i2 >> 16) & PrivateKeyType.INVALID) / 255.0f);
        float g5 = g(((i2 >> 8) & PrivateKeyType.INVALID) / 255.0f);
        float g6 = g((i2 & PrivateKeyType.INVALID) / 255.0f);
        return (Math.round((f2 + (f * ((((i2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f2))) * 255.0f) << 24) | (Math.round(h(g + ((g4 - g) * f)) * 255.0f) << 16) | (Math.round(h(g2 + ((g5 - g2) * f)) * 255.0f) << 8) | Math.round(h(g3 + ((g6 - g3) * f)) * 255.0f);
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    private static float g(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float h(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public EdgeEffect d(RecyclerView recyclerView, int i) {
        return new EdgeEffect(recyclerView.getContext());
    }
}
