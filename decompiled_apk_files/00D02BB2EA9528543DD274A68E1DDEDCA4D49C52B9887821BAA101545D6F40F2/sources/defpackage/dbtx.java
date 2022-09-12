package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dbtx  reason: default package */
/* loaded from: classes.dex */
public final class dbtx {
    public static String a(String str, int i) {
        dbsk.s(str);
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Required array size too large: ");
            sb.append(j);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length < i3) {
                System.arraycopy(cArr, 0, cArr, length, length);
                length += length;
            } else {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
        }
    }

    public static String b(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf2 = String.valueOf(sb3);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf2.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf2) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + String.valueOf(name2).length());
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb5 = new StringBuilder(valueOf.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = valueOf.indexOf("%s", i3)) == -1) {
                break;
            }
            sb5.append((CharSequence) valueOf, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) valueOf, i3, valueOf.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
