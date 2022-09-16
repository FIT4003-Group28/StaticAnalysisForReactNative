package defpackage;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bvom  reason: default package */
/* loaded from: classes.dex */
public final class bvom {
    private static final Pattern a = Pattern.compile("([a-zA-Z0-9]{2,3})_([a-zA-Z0-9]{2,3})?_[a-zA-Z0-9_]*#([a-zA-Z0-9]{4})");

    public static String a(Locale locale) {
        Matcher matcher = a.matcher(locale.toString());
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            StringBuilder sb = new StringBuilder();
            sb.append(group);
            sb.append("-");
            sb.append(group3);
            if (!dbsj.d(group2)) {
                sb.append("-");
                sb.append(group2);
            }
            return sb.toString();
        } else if (!locale.getCountry().isEmpty()) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb2 = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
            sb2.append(language);
            sb2.append("-");
            sb2.append(country);
            return sb2.toString();
        } else {
            return locale.getLanguage();
        }
    }

    public static Locale b(String str) {
        return Locale.forLanguageTag(str);
    }
}
