package com.google.firebase.auth.v0.a;

import java.util.Locale;
/* loaded from: classes.dex */
public final class m2 {
    public static String a() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        a(sb, locale);
        if (!locale.equals(Locale.US)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            a(sb, Locale.US);
        }
        return sb.toString();
    }

    private static void a(StringBuilder sb, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country == null) {
                return;
            }
            sb.append("-");
            sb.append(country);
        }
    }
}
