package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: vxc  reason: default package */
/* loaded from: classes7.dex */
public final class vxc {
    public static CharSequence a(Resources resources, dquj dqujVar) {
        double d = dqujVar.b;
        double d2 = dqujVar.c;
        if (d != d2) {
            try {
                return resources.getString(R.string.DIRECTIONS_FARE_ESTIMATE_PREFORMATTED, Currency.getInstance(dqujVar.e).getSymbol(Locale.getDefault()), c(d, dqujVar.e, false), c(d2, dqujVar.e, false));
            } catch (IllegalArgumentException unused) {
                return dqujVar.d;
            }
        }
        return dqujVar.d;
    }

    public static CharSequence b(Resources resources, dquj dqujVar) {
        int i = dqujVar.a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 8) == 0) {
            return "";
        }
        double d = dqujVar.b;
        double d2 = dqujVar.c;
        if (d != d2) {
            String c = c(d, dqujVar.e, true);
            String c2 = c(d2, dqujVar.e, true);
            if (c == null || c2 == null) {
                NumberFormat numberInstance = NumberFormat.getNumberInstance();
                return resources.getString(R.string.DIRECTIONS_ACCESSIBILITY_FARE_ESTIMATE_FALLBACK, numberInstance.format(d), numberInstance.format(d2), dqujVar.e);
            }
            return resources.getString(R.string.DIRECTIONS_ACCESSIBILITY_FARE_ESTIMATE_PREFORMATTED, c, c2);
        }
        return a(resources, dqujVar);
    }

    @dzsi
    public static String c(double d, String str, boolean z) {
        return d(BigDecimal.valueOf(d), str, z);
    }

    @dzsi
    public static String d(BigDecimal bigDecimal, String str, boolean z) {
        try {
            duhg a = cpg.a(bigDecimal, Currency.getInstance(str));
            cpe d = cpf.d(Locale.getDefault());
            d.c(z);
            return cpg.b(a, d.a());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
