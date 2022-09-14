package defpackage;

import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: akza  reason: default package */
/* loaded from: classes.dex */
public final class akza {
    float a;
    @dzsi
    public akyz b;
    private volatile boolean c = false;
    @dzsi
    private final DisplayMetrics d;

    public akza(@dzsi DisplayMetrics displayMetrics, float f) {
        this.a = 65.0f;
        this.d = displayMetrics;
        this.a = f;
    }

    public static float d(float f) {
        if (Float.isNaN(f)) {
            return 2.0f;
        }
        return Math.max(2.0f, Math.min(f, 21.0f));
    }

    public static float e(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return (f % 360.0f) + (f < 0.0f ? 360 : 0);
    }

    public final alad a(alad aladVar) {
        alaa b = alad.b(aladVar);
        b(b);
        return b.a();
    }

    public final void b(alaa alaaVar) {
        akra akraVar = alaaVar.b;
        dbsk.s(akraVar);
        float c = c(alaaVar.c, akraVar);
        alaaVar.c = c;
        DisplayMetrics displayMetrics = this.d;
        if (displayMetrics != null) {
            int i = displayMetrics.heightPixels;
            float f = this.d.density;
            akraVar.a = akra.N(akraVar.a);
            int ceil = 536870912 - ((int) Math.ceil(((i / f) * 0.5f) * akqx.a(c)));
            if (ceil < 0) {
                ceil = 0;
            }
            int i2 = akraVar.b;
            if (i2 > ceil) {
                akraVar.b = ceil;
            } else {
                int i3 = -ceil;
                if (i2 < i3) {
                    akraVar.b = i3;
                }
            }
        } else {
            akraVar.a = akra.N(akraVar.a);
            akraVar.b = akra.O(akraVar.b);
        }
        alaaVar.d(akraVar);
        float f2 = 0.0f;
        float max = Math.max(0.0f, Math.min(alaaVar.d, f(c)));
        if (true != Float.isNaN(max)) {
            f2 = max;
        }
        alaaVar.d = f2;
        alaaVar.e = e(alaaVar.e);
        alaaVar.f = alae.e(alaaVar.f);
    }

    public final float c(float f, akra akraVar) {
        akyz akyzVar = this.b;
        float f2 = 2.0f;
        float f3 = 21.0f;
        if (akyzVar != null) {
            f3 = Math.min(21.0f, akyzVar.a(akraVar));
            f2 = Math.max(2.0f, this.b.b());
        }
        float max = Math.max(f2, Math.min(f, f3));
        return Float.isNaN(max) ? f2 : max;
    }

    public final float f(float f) {
        if (f >= 13.5f) {
            return this.a;
        }
        if (f > 11.75f) {
            return (((f - 11.75f) * (this.a - 45.0f)) / 1.75f) + 45.0f;
        }
        if (f <= 10.0f) {
            return 30.0f;
        }
        return (((f - 10.0f) * 15.0f) / 1.75f) + 30.0f;
    }
}
