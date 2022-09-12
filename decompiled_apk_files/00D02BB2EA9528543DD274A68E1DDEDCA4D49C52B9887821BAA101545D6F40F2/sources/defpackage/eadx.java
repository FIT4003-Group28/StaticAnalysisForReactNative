package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: eadx  reason: default package */
/* loaded from: classes6.dex */
public final class eadx {
    private final String[] a;

    public eadx(eadw eadwVar) {
        List<String> list = eadwVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(eafa.v("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31) {
                    if (charAt != '\t') {
                        throw new IllegalArgumentException(eafa.v("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                    }
                    charAt = '\t';
                }
                if (charAt >= 127) {
                    throw new IllegalArgumentException(eafa.v("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }

    @dzsi
    public final String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final int b() {
        return this.a.length >> 1;
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    public final eadw e() {
        eadw eadwVar = new eadw();
        Collections.addAll(eadwVar.a, this.a);
        return eadwVar;
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof eadx) && Arrays.equals(((eadx) obj).a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(c(i));
            sb.append(": ");
            sb.append(d(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
