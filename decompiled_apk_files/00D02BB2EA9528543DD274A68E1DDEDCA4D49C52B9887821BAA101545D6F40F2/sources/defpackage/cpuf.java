package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cpuf  reason: default package */
/* loaded from: classes5.dex */
public final class cpuf implements cpug {
    public float a = 0.1f;
    public float b = 0.5f;

    private static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    @Override // defpackage.cpug
    public final boolean a(Path path, boolean z, boolean z2, float f, float f2, float f3, float f4, boolean z3, float f5, float f6, float f7, boolean z4, int i, int i2, int i3, int i4) {
        float f8 = f7 / 2.0f;
        float f9 = this.a;
        float max = f9 > 1.0f ? Math.max(f9, f7) : f7 * f9;
        float f10 = this.b * max;
        float f11 = f3 + f8;
        float f12 = f11 - max;
        int min = (int) Math.min(i, f12);
        if (z4) {
            path.moveTo(c(z2 ? f : f3 - f8, min, i2), f4);
        }
        if (z3) {
            float f13 = i2;
            path.lineTo(Math.min(f12, f13), f4);
            if (f12 > f13) {
                return true;
            }
            path.cubicTo(f12 + f10, f4, f11 - f10, f6, f11, f6);
            return true;
        }
        path.lineTo(c(f11, min, i2), f4);
        return true;
    }

    @Override // defpackage.cpug
    public final boolean b(Path path, boolean z, float f, float f2, float f3, float f4, boolean z2, float f5, float f6, boolean z3, int i, int i2, int i3, int i4) {
        float f7 = f6 / 2.0f;
        float f8 = this.a;
        float max = f8 > 1.0f ? Math.max(f8, f6) : f6 * f8;
        float f9 = this.b * max;
        float f10 = f3 + f7;
        float f11 = f10 - max;
        int min = (int) Math.min(i, f11);
        float f12 = i2;
        if (f11 < f12) {
            if (z3) {
                path.lineTo(true != z ? f10 : f, f2);
            }
            path.cubicTo(f10 - f9, f2, f9 + f11, f4, f11, f4);
        } else if (z3) {
            path.lineTo(f12, f4);
        }
        path.lineTo(Math.max(min, f3 - f7), f4);
        return true;
    }
}
