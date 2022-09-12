package defpackage;

import java.io.PrintStream;
/* compiled from: PG */
/* renamed from: dcum  reason: default package */
/* loaded from: classes.dex */
public final class dcum {
    private dcum() {
    }

    public static <T> T a(String str, Class<T> cls) {
        String str2;
        try {
            str2 = System.getProperty(str, null);
        } catch (SecurityException e) {
            b("cannot read property name %s: %s", str, e);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        int indexOf = str2.indexOf(35);
        if (indexOf <= 0 || indexOf == str2.length() - 1) {
            b("invalid getter (expected <class>#<method>): %s\n", str2);
            return null;
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        try {
            return cls.cast(Class.forName(substring).getMethod(substring2, new Class[0]).invoke(null, new Object[0]));
        } catch (ClassCastException e2) {
            b("cannot cast result of calling '%s#%s' to '%s': %s\n", substring, substring2, cls.getName(), e2);
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e3) {
            b("cannot call expected no-argument static method '%s#%s': %s\n", substring, substring2, e3);
            return null;
        }
    }

    private static void b(String str, Object... objArr) {
        PrintStream printStream = System.err;
        String valueOf = String.valueOf(dcum.class);
        String format = String.format(str, objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(format).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(format);
        printStream.println(sb.toString());
    }
}
