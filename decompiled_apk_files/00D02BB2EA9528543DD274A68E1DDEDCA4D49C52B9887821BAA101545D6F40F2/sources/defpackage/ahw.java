package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: ahw  reason: default package */
/* loaded from: classes.dex */
public final class ahw {
    public static final float c(ahv ahvVar) {
        return ((ahx) ahvVar.a).b;
    }

    public static final float d(ahv ahvVar) {
        return ((ahx) ahvVar.a).a;
    }

    public static final void e(ahv ahvVar, ColorStateList colorStateList) {
        ahx ahxVar = (ahx) ahvVar.a;
        ahxVar.a(colorStateList);
        ahxVar.invalidateSelf();
    }

    public final void a(ahv ahvVar, float f) {
        Drawable drawable = ahvVar.a;
        boolean a = ahvVar.a();
        boolean b = ahvVar.b();
        ahx ahxVar = (ahx) drawable;
        if (f != ahxVar.b || ahxVar.c != a || ahxVar.d != b) {
            ahxVar.b = f;
            ahxVar.c = a;
            ahxVar.d = b;
            ahxVar.b(null);
            ahxVar.invalidateSelf();
        }
        b(ahvVar);
    }

    public final void b(ahv ahvVar) {
        if (!ahvVar.a()) {
            ahvVar.c(0, 0, 0, 0);
            return;
        }
        float c = c(ahvVar);
        float d = d(ahvVar);
        int ceil = (int) Math.ceil(ahy.b(c, d, ahvVar.b()));
        int ceil2 = (int) Math.ceil(ahy.a(c, d, ahvVar.b()));
        ahvVar.c(ceil, ceil2, ceil, ceil2);
    }
}
