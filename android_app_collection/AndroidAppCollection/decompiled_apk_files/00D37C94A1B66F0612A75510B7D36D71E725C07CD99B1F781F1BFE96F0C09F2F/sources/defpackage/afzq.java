package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: afzq  reason: default package */
/* loaded from: classes.dex */
public final class afzq {
    private static final Pattern a = Pattern.compile("age=(\\d*)");
    private final snc b;

    public afzq(snc sncVar) {
        this.b = sncVar;
    }

    public final long a(String str) {
        long j;
        long c = this.b.c();
        if (str != null) {
            if (str.contains("no-cache")) {
                return c;
            }
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                try {
                    j = Long.parseLong(matcher.group(1), 10) * 1000;
                } catch (NumberFormatException unused) {
                }
                return c + j;
            }
        }
        j = 604800000;
        return c + j;
    }
}
