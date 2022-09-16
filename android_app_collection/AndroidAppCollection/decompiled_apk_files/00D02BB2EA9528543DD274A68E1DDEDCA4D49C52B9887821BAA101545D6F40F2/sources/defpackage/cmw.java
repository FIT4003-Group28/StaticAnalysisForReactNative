package defpackage;

import android.text.TextUtils;
import java.text.Normalizer;
import java.util.BitSet;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cmw  reason: default package */
/* loaded from: classes5.dex */
public final class cmw {
    private static final String[] a = {"the ", "an ", "a "};
    private static final BitSet b = new BitSet();

    static {
        for (char c : "\t #\"@$%&*(!`^):;'{}[]|\\/<>.,?~+-=_".toCharArray()) {
            b.set((int) c, true);
        }
    }

    public static String a(String str) {
        String str2;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            int i = 0;
            while (true) {
                if (i >= trim.length()) {
                    break;
                } else if (!b.get(trim.charAt(i))) {
                    trim = trim.substring(i);
                    break;
                } else {
                    i++;
                }
            }
            String lowerCase = trim.toLowerCase(Locale.US);
            String[] strArr = a;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    str2 = lowerCase;
                    break;
                }
                String str3 = strArr[i2];
                if (lowerCase.startsWith(str3)) {
                    str2 = lowerCase.substring(str3.length()).trim();
                    break;
                }
                i2++;
            }
            if (true != TextUtils.isEmpty(str2)) {
                lowerCase = str2;
            }
            StringBuilder sb = new StringBuilder(lowerCase);
            String substring = lowerCase.substring(0, 1);
            String replaceAll = Normalizer.normalize(substring, Normalizer.Form.NFD).replaceAll("[^a-z0-9]", "");
            if (TextUtils.isEmpty(replaceAll)) {
                sb.setCharAt(0, substring.toUpperCase(Locale.US).charAt(0));
            } else {
                sb.setCharAt(0, replaceAll.toUpperCase(Locale.US).charAt(0));
            }
            return sb.toString();
        }
        return trim;
    }
}
