package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: dejz  reason: default package */
/* loaded from: classes6.dex */
public final class dejz {
    private static final Pattern a = Pattern.compile("([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+)(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?(?:(\nCaused by: )([^:^\n]+).*((?:\n\\s*at [^:~\n]*:?~?[0-9]*[^\n]*)+))?");

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        deki.c(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(stringWriter2);
        if (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount() && matcher.group(i) != null; i++) {
                sb.append(matcher.group(i));
            }
        }
        return sb.toString();
    }
}
