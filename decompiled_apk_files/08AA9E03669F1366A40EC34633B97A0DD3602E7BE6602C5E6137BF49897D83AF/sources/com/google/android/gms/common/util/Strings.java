package com.google.android.gms.common.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@VisibleForTesting
/* loaded from: classes.dex */
public class Strings {
    private static final Pattern zzaak = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    public static String capitalize(String str) {
        char charAt;
        char upperCase;
        if (str.length() == 0 || charAt == (upperCase = Character.toUpperCase((charAt = str.charAt(0))))) {
            return str;
        }
        String substring = str.substring(1);
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1);
        sb.append(upperCase);
        sb.append(substring);
        return sb.toString();
    }

    public static String emptyToNull(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String format(String str, Bundle bundle) {
        Matcher matcher = zzaak.matcher(str);
        if (matcher.find()) {
            StringBuffer stringBuffer = new StringBuffer();
            do {
                String group = matcher.group(1);
                Object obj = bundle.get(group);
                matcher.appendReplacement(stringBuffer, obj != null ? obj.toString() : bundle.containsKey(group) ? "null" : "");
            } while (matcher.find());
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    public static boolean isEmptyOrWhitespace(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }

    public static String padEnd(String str, int i, char c2) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c2);
        }
        return sb.toString();
    }
}
