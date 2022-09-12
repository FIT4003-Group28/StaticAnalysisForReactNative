package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmif  reason: default package */
/* loaded from: classes5.dex */
final class cmif {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final cmnk b = new cmnk();
    public final StringBuilder c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(cmnk cmnkVar) {
        while (true) {
            for (boolean z = true; cmnkVar.d() > 0 && z; z = false) {
                int i = cmnkVar.b;
                byte[] bArr = cmnkVar.a;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    cmnkVar.h(1);
                } else {
                    int i2 = cmnkVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
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
                                cmnkVar.h(i2 - cmnkVar.b);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(cmnk cmnkVar, StringBuilder sb) {
        a(cmnkVar);
        if (cmnkVar.d() == 0) {
            return null;
        }
        String c = c(cmnkVar, sb);
        if (!"".equals(c)) {
            return c;
        }
        int l = cmnkVar.l();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) l);
        return sb2.toString();
    }

    public static String c(cmnk cmnkVar, StringBuilder sb) {
        sb.setLength(0);
        int i = cmnkVar.b;
        int i2 = cmnkVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c = (char) cmnkVar.a[i];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    i++;
                    sb.append(c);
                }
            }
        }
        cmnkVar.h(i - cmnkVar.b);
        return sb.toString();
    }
}
