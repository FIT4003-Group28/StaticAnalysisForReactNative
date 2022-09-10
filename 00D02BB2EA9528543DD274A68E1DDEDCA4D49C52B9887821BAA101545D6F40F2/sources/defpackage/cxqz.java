package defpackage;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cxqz  reason: default package */
/* loaded from: classes5.dex */
public final class cxqz {
    private static final dbrb a = dbrb.n('.');
    private static final dbtm b = dbtm.a('.');
    private static final dbtm c = dbtm.a('@');

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r7) {
        /*
            dbra r0 = defpackage.dbra.b
            boolean r0 = r0.g(r7)
            r1 = 0
            if (r0 == 0) goto L97
            dbtm r0 = defpackage.cxqz.c
            java.util.List r0 = r0.i(r7)
            int r2 = r0.size()
            r3 = 2
            if (r2 == r3) goto L17
            return r1
        L17:
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 1
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L97
            char r4 = r2.charAt(r1)
            r5 = 46
            if (r4 == r5) goto L97
            int r4 = r2.length()
            int r4 = r4 + (-1)
            char r4 = r2.charAt(r4)
            if (r4 == r5) goto L97
            java.lang.String r4 = ".."
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L47
            goto L97
        L47:
            dbtm r2 = defpackage.cxqz.b
            java.util.List r0 = r2.i(r0)
            int r2 = r0.size()
            if (r2 >= r3) goto L54
            return r1
        L54:
            java.util.Iterator r2 = r0.iterator()
        L58:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L7e
            char r5 = r4.charAt(r1)
            r6 = 45
            if (r5 == r6) goto L7e
            int r5 = r4.length()
            int r5 = r5 + (-1)
            char r4 = r4.charAt(r5)
            if (r4 != r6) goto L58
        L7e:
            return r1
        L7f:
            java.lang.Object r0 = defpackage.dcft.s(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 >= r3) goto L8c
            return r1
        L8c:
            java.util.regex.Pattern r0 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r7 = r7.matches()
            return r7
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxqz.a(java.lang.String):boolean");
    }

    public static boolean b(String str, String str2, Context context) {
        if (str == null || !str.equals(str2)) {
            String formatNumberToE164 = PhoneNumberUtils.formatNumberToE164(str, f(context));
            return formatNumberToE164 != null && formatNumberToE164.equals(PhoneNumberUtils.formatNumberToE164(str2, f(context)));
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        return e(str).equals(e(str2));
    }

    public static String d(String str, Context context) {
        String formatNumber = PhoneNumberUtils.formatNumber(str, f(context));
        return formatNumber == null ? str : formatNumber;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase(Locale.getDefault());
        if (!lowerCase.endsWith("@gmail.com") && !lowerCase.endsWith("@googlemail.com")) {
            return lowerCase;
        }
        StringBuilder sb = new StringBuilder(lowerCase.length());
        sb.append(a.h(lowerCase.substring(0, lowerCase.lastIndexOf(64))));
        sb.append("@gmail.com");
        return sb.toString();
    }

    public static String f(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || TextUtils.isEmpty(telephonyManager.getSimCountryIso())) {
            return Locale.getDefault().getCountry();
        }
        return new Locale(Locale.getDefault().getLanguage(), telephonyManager.getSimCountryIso()).getCountry();
    }
}
