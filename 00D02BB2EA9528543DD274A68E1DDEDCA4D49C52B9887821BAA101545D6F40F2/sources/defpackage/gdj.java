package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gdj  reason: default package */
/* loaded from: classes6.dex */
public class gdj {
    public static final gdi a = gdi.d(null, false);
    public static final gdi b = gdi.d(cqta.g(), false);
    public static final gdi c = gdi.d(iva.c(R.color.quantum_white_100, R.color.mod_google_grey900), false);
    public static final gdi d = gdi.d(cqtt.g(cqta.g()), true);
    public static final cqtd e;
    public static final gdi f;

    static {
        cqtd f2 = cqrt.f(2131231620);
        e = f2;
        f = gdi.d(f2, true);
    }

    public static cqtd a() {
        return d(f(), null, c);
    }

    public static cqtd b() {
        return d(f(), null, a);
    }

    public static cqtd c(int i, int i2, @dzsi gdi gdiVar) {
        return d(cqrt.c(i), i2 == 0 ? null : cqrt.c(i2), gdiVar);
    }

    public static cqtd d(@dzsi cqss cqssVar, @dzsi cqss cqssVar2, @dzsi gdi gdiVar) {
        return new gdh(new Object[]{cqssVar, cqssVar2, gdiVar}, gdiVar, cqssVar2, cqssVar);
    }

    public static int e(Context context, @dzsi cqss cqssVar) {
        if (cqssVar == null) {
            return 0;
        }
        return cqssVar.b(context);
    }

    private static final iuv f() {
        return iva.c(R.color.quantum_grey200, R.color.mod_google_grey800);
    }
}
