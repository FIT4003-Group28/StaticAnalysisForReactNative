package com.google.firebase.crashlytics.c.k;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f9028a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(String str) {
        Matcher matcher = f9028a.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new c(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
            a2.a("Could not parse map entry: " + str);
            return null;
        }
    }
}
