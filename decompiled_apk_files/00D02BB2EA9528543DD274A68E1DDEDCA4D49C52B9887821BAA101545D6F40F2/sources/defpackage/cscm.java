package defpackage;

import android.graphics.Path;
/* compiled from: PG */
/* renamed from: cscm  reason: default package */
/* loaded from: classes5.dex */
public final class cscm extends cscn {
    public final void a(Path path, cscl csclVar, float f, float f2, float f3) {
        path.reset();
        float min = Math.min(f3, 1.0f) * f;
        if (f2 > 0.0f) {
            float f4 = (-0.5f) + f3;
            min += Math.max(f2 - (((f4 * f4) * f2) * 5.0f), 0.0f);
        }
        float f5 = csclVar.a;
        float f6 = (((f5 + 18.849556f) + csclVar.b) - f) * f3;
        if (f6 < f5) {
            float min2 = Math.min(f6 + min, f5);
            path.moveTo(0.0f, f6);
            path.lineTo(0.0f, min2);
            min -= min2 - f6;
        }
        float f7 = csclVar.a;
        if (f6 < f7 + 18.849556f && min > 0.0f) {
            float max = Math.max(0.0f, f6 - f7);
            float min3 = Math.min(18.849556f, max + min);
            float f8 = (max * 180.0f) / 18.849556f;
            float f9 = (min3 * 180.0f) / 18.849556f;
            if (!csclVar.c) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            float f10 = f9 - f8;
            float f11 = -6.0f;
            this.a.set(-6.0f, -6.0f, 6.0f, 6.0f);
            if (true != csclVar.c) {
                f11 = 6.0f;
            }
            this.a.offset(f11, csclVar.a);
            path.addArc(this.a, f8, f10);
            min -= min3 - max;
        }
        if (min > 0.0f) {
            float f12 = true != csclVar.c ? 12.0f : -12.0f;
            float f13 = csclVar.a;
            path.moveTo(f12, f13);
            path.lineTo(f12, f13 - min);
        }
    }
}
