package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmir  reason: default package */
/* loaded from: classes5.dex */
public final class cmir {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static void a(cmnk cmnkVar) {
        int i = cmnkVar.b;
        String C = cmnkVar.C();
        if (C == null || !C.startsWith("WEBVTT")) {
            cmnkVar.f(i);
            String valueOf = String.valueOf(cmnkVar.C());
            throw new clob(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "));
        }
    }

    public static long b(String str) {
        String[] v = cmny.v(str, "\\.");
        long j = 0;
        for (String str2 : cmny.u(v[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (v.length == 2) {
            j2 += Long.parseLong(v[1]);
        }
        return j2 * 1000;
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
