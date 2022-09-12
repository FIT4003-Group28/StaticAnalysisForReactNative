package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cofz  reason: default package */
/* loaded from: classes5.dex */
public final class cofz {
    static {
        Pattern.compile(" *([A-Za-z]{2,3})(?:-([A-Za-z]{4}))?(?:-([A-Za-z]{2}|[0-9]{3}))?(?:-((?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3})(?:-(?:[A-Za-z0-9]{5,8}|[0-9][A-Za-z0-9]{3}))*))?(?:-(?:[0-9A-WY-Za-wy-z](?:-[A-Za-z0-9]{2,8})+))?(?:-(?:x(?:-[A-Za-z0-9]{1,8})+))? *");
    }

    public static Locale a(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        return forLanguageTag != null ? forLanguageTag : new Locale("");
    }

    public static String b(Locale locale) {
        String languageTag = locale.toLanguageTag();
        return languageTag != null ? languageTag : "und";
    }
}
