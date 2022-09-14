package android.support.v4.h;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f438a = new Locale("", "");

    public static int a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f438a)) {
            return 0;
        }
        String a2 = a.a(locale);
        if (a2 == null) {
            return b(locale);
        }
        return (a2.equalsIgnoreCase("Arab") || a2.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    private static int b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }
}
