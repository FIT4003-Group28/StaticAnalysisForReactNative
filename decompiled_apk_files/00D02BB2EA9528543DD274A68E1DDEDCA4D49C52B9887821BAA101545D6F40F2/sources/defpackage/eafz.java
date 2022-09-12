package defpackage;

import java.net.ProtocolException;
/* compiled from: PG */
/* renamed from: eafz  reason: default package */
/* loaded from: classes6.dex */
public final class eafz {
    public final eaeh a;
    public final int b;
    public final String c;

    public eafz(eaeh eaehVar, int i, String str) {
        this.a = eaehVar;
        this.b = i;
        this.c = str;
    }

    public static eafz a(eaep eaepVar) {
        return new eafz(eaepVar.b, eaepVar.c, eaepVar.d);
    }

    public static eafz b(String str) {
        eaeh eaehVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                eaehVar = eaeh.HTTP_1_0;
            } else if (charAt == 1) {
                eaehVar = eaeh.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            eaehVar = eaeh.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                } else {
                    str2 = str.substring(i + 4);
                }
                return new eafz(eaehVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
        throw new ProtocolException("Unexpected status line: " + str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == eaeh.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
