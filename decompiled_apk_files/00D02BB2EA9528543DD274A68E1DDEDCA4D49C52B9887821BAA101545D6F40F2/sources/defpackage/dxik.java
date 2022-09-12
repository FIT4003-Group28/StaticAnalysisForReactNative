package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxik  reason: default package */
/* loaded from: classes6.dex */
public final class dxik {
    public final String a;
    public final int b;
    private final String c;

    public dxik(dxij dxijVar) {
        b(dxijVar.b, false);
        b(dxijVar.c, false);
        this.a = dxijVar.d;
        this.b = dxijVar.a();
        List<String> list = dxijVar.f;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? b(next, false) : null);
        }
        Collections.unmodifiableList(arrayList);
        this.c = dxijVar.toString();
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static String b(String str, boolean z) {
        return d(str, str.length(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(char c) {
        if (c < '0' || c > '9') {
            if (c >= 'a' && c <= 'f') {
                return c - 'W';
            }
            if (c >= 'A' && c <= 'F') {
                return c - '7';
            }
            return -1;
        }
        return c - '0';
    }

    public static String d(String str, int i, boolean z) {
        int i2 = 0;
        while (i2 < i) {
            if (str.charAt(i2) == '%') {
                eaiz eaizVar = new eaiz();
                eaizVar.R(str, 0, i2);
                while (i2 < i) {
                    int codePointAt = str.codePointAt(i2);
                    if (codePointAt == 37) {
                        int i3 = i2 + 2;
                        if (i3 < i) {
                            int c = c(str.charAt(i2 + 1));
                            int c2 = c(str.charAt(i3));
                            if (c == -1 || c2 == -1) {
                                codePointAt = 37;
                                eaizVar.S(codePointAt);
                                i2 += Character.charCount(codePointAt);
                            } else {
                                eaizVar.M((c << 4) + c2);
                                i2 = i3;
                                codePointAt = 37;
                                i2 += Character.charCount(codePointAt);
                            }
                        } else {
                            codePointAt = 37;
                        }
                    }
                    eaizVar.S(codePointAt);
                    i2 += Character.charCount(codePointAt);
                }
                return eaizVar.p();
            }
            i2++;
        }
        return str.substring(0, i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dxik) && ((dxik) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
