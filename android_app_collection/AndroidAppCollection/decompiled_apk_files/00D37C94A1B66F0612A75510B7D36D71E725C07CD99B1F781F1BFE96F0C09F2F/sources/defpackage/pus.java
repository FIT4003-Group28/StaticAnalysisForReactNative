package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: pus  reason: default package */
/* loaded from: classes4.dex */
public final class pus {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static long b(String str) {
        String[] aa = pxi.aa(str, "\\.");
        long j = 0;
        for (String str2 : pxi.Z(aa[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (aa.length == 2) {
            j2 += Long.parseLong(aa[1]);
        }
        return j2 * 1000;
    }

    public static void c(pwu pwuVar) {
        int i = pwuVar.b;
        String s = pwuVar.s();
        if (s == null || !s.startsWith("WEBVTT")) {
            pwuVar.G(i);
            String valueOf = String.valueOf(pwuVar.s());
            throw pjq.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
        }
    }
}
