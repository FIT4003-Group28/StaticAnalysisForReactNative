package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: puj  reason: default package */
/* loaded from: classes4.dex */
final class puj {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final pwu c = new pwu();
    public final StringBuilder d = new StringBuilder();

    public static String a(pwu pwuVar, StringBuilder sb) {
        sb.setLength(0);
        int i = pwuVar.b;
        int i2 = pwuVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c = (char) pwuVar.a[i];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    i++;
                    sb.append(c);
                }
            }
        }
        pwuVar.H(i - pwuVar.b);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(pwu pwuVar, StringBuilder sb) {
        c(pwuVar);
        if (pwuVar.a() == 0) {
            return null;
        }
        String a2 = a(pwuVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        int i = pwuVar.i();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) i);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(pwu pwuVar) {
        while (true) {
            for (boolean z = true; pwuVar.a() > 0 && z; z = false) {
                int i = pwuVar.b;
                byte[] bArr = pwuVar.a;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    pwuVar.H(1);
                } else {
                    int i2 = pwuVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i3 + 1;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i4 = i5 + 1;
                                        i2 = i4;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                pwuVar.H(i2 - pwuVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
