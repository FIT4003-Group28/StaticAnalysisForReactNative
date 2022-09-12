package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cpuk  reason: default package */
/* loaded from: classes5.dex */
public final class cpuk implements cpug {
    public boolean a = true;

    private static float c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    private static float d(float f, float f2, float f3, float f4) {
        return Math.max(f2 - 50.0f, Math.min(f3 + 50.0f, f));
    }

    @Override // defpackage.cpug
    public final boolean b(Path path, boolean z, float f, float f2, float f3, float f4, boolean z2, float f5, float f6, boolean z3, int i, int i2, int i3, int i4) {
        float f7 = f6 / 2.0f;
        float f8 = (f6 > 0.0f || !z) ? f3 + f7 : f;
        float f9 = f3 - f7;
        float f10 = i2;
        if (f9 <= f10) {
            float f11 = i;
            if (f8 < f11) {
                return false;
            }
            float c = c(f, f11, f10);
            float c2 = c(f8, f11, f10);
            float c3 = c(f9, f11, f10);
            float f12 = i3;
            float f13 = i4;
            float d = d(f4, f12, f13, 50.0f);
            float d2 = d(f5, f12, f13, 50.0f);
            if (z3) {
                if (true != z) {
                    c = c2;
                }
                path.lineTo(c, d);
            }
            path.lineTo(c3, d);
            if (z2 && c3 >= f11) {
                path.lineTo(c3, d2);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cpug
    public final boolean a(Path path, boolean z, boolean z2, float f, float f2, float f3, float f4, boolean z3, float f5, float f6, float f7, boolean z4, int i, int i2, int i3, int i4) {
        float f8;
        cpuk cpukVar;
        int i5;
        boolean z5;
        float floor = (float) Math.floor(f7 / 2.0f);
        float f9 = f7 - floor;
        float f10 = f3 - floor;
        if (f7 > 0.0f || !z3) {
            f8 = f3 + f9;
            cpukVar = this;
        } else {
            cpukVar = this;
            f8 = f5;
        }
        if (cpukVar.a || z) {
            i5 = i;
            z5 = true;
        } else {
            i5 = i;
            z5 = false;
        }
        float f11 = i5;
        if (f8 >= f11) {
            float f12 = i2;
            if (f10 <= f12) {
                float c = c(f, f11, f12);
                float c2 = c(f10, f11, f12);
                float c3 = c(f8, f11, f12);
                float d = d(f4, i3, i4, 50.0f);
                if (!z4 || !z2) {
                    c = c2;
                }
                if (!z5 || z4) {
                    path.moveTo(c, d);
                } else if (z2) {
                    path.lineTo(c, d);
                }
                path.lineTo(c3, d);
                return true;
            }
        }
        return false;
    }
}
