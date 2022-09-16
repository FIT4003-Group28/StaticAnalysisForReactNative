package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: sgf  reason: default package */
/* loaded from: classes4.dex */
final class sgf {
    public final RectF a = new RectF();
    public final sgh b;

    public sgf(sgh sghVar) {
        sho.h(sghVar);
        this.b = sghVar;
    }

    public static float a(float f, float f2, float f3) {
        float abs = Math.abs(f - f2);
        if (abs < f3) {
            float f4 = f3 - abs;
            return f3 - ((float) Math.sqrt((f3 * f3) - (f4 * f4)));
        }
        return 0.0f;
    }

    public static float b(Paint paint) {
        if (e(paint)) {
            return paint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public static void c(Paint paint, float f, float f2) {
        paint.setStrokeWidth(Math.min(paint.getStrokeWidth(), Math.abs(f - f2)));
    }

    public static boolean d(Paint paint) {
        return paint.getStyle() == Paint.Style.FILL || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }

    public static boolean e(Paint paint) {
        return paint.getStyle() == Paint.Style.STROKE || paint.getStyle() == Paint.Style.FILL_AND_STROKE;
    }
}
