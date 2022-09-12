package defpackage;

import android.net.Uri;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cjxr  reason: default package */
/* loaded from: classes4.dex */
public final class cjxr {
    public static final /* synthetic */ int a = 0;
    private static final dcep<String> b = dcep.G("en-GB", "fr-CA", "pt-BR", "pt-PT", "ro-MD", "sr-ME", "zh-CN", "zh-TW");

    public static String a(Locale locale) {
        return String.format("https://www.google.com/intl/%s/help/terms_maps/", y(locale));
    }

    public static String b(Locale locale) {
        return String.format("https://www.google.com/history?hl=%s", locale);
    }

    @Deprecated
    public static String c(Locale locale) {
        String y = y(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(y).length() + 46);
        sb.append("https://myaccount.google.com/privacypolicy");
        sb.append("&hl=");
        sb.append(y);
        return sb.toString();
    }

    public static String d(Locale locale) {
        return String.format("https://policies.google.com/terms?hl=%s", y(locale));
    }

    public static String e(Locale locale) {
        return String.format("https://policies.google.com/privacy?hl=%s", y(locale));
    }

    public static String f(String str) {
        return String.format("https://www.google.com/intl/%s/local/guides/rules/", str);
    }

    public static String g() {
        return w("https://support.google.com/gmm/topic/6011919");
    }

    public static String h(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().a;
        return !str.isEmpty() ? str : "https://www.google.com/help/legalnotices_maps.html";
    }

    public static String i(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().b;
        if (true == str.isEmpty()) {
            str = "https://support.google.com/gmm/?p=location_history";
        }
        return w(str);
    }

    public static String j(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().c;
        if (true == str.isEmpty()) {
            str = "https://support.google.com/gmm/answer/3131570";
        }
        return w(str);
    }

    public static String k(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().g;
        if (true == str.isEmpty()) {
            str = "https://support.google.com/maps/answer/6258979";
        }
        return w(str);
    }

    public static String l() {
        return "https://www.google.com/intl/ko/policies/terms/location/";
    }

    public static String m(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().h;
        if (true == str.isEmpty()) {
            str = "http://wikipedia.org/wiki/Template:COVID-19_pandemic_data";
        }
        return w(str);
    }

    public static String n(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().i;
        if (true == str.isEmpty()) {
            str = "https://www.nytimes.com/interactive/2020/us/coronavirus-us-cases.html";
        }
        return w(str);
    }

    public static String o(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().k;
        if (true == str.isEmpty()) {
            str = "https://github.com/CSSEGISandData/COVID-19";
        }
        return w(str);
    }

    public static String p(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().l;
        if (true == str.isEmpty()) {
            str = "https://stopcoronavirus.mcgm.gov.in";
        }
        return w(str);
    }

    public static String q(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().j;
        if (true == str.isEmpty()) {
            str = "https://support.google.com/websearch/answer/9814707?p=cvd19_statistics";
        }
        return w(str);
    }

    public static String r() {
        return "https://support.google.com/maps?p=change_language";
    }

    public static Uri s(String str) {
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? "https://play.google.com/store/apps/details?id=".concat(valueOf) : new String("https://play.google.com/store/apps/details?id="));
    }

    public static Uri t(String str) {
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? "market://details?id=".concat(valueOf) : new String("market://details?id="));
    }

    public static String u(btvo btvoVar) {
        String str = btvoVar.getClientUrlParameters().d;
        if (true == str.isEmpty()) {
            str = "https://support.google.com/gmm/?p=questions_help";
        }
        return w(str);
    }

    public static Locale v() {
        return Locale.getDefault();
    }

    public static String w(String str) {
        return Uri.parse(str).buildUpon().appendQueryParameter("hl", y(Locale.getDefault())).build().toString();
    }

    public static String x(btvo btvoVar) {
        return btvoVar.getClientUrlParameters().e;
    }

    public static String y(Locale locale) {
        String language = locale.getLanguage();
        String upperCase = locale.getCountry().toUpperCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(upperCase).length());
        sb.append(language);
        sb.append("-");
        sb.append(upperCase);
        String sb2 = sb.toString();
        return b.contains(sb2) ? sb2 : language;
    }
}
