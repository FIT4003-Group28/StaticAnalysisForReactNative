package defpackage;
/* compiled from: PG */
/* renamed from: eauk  reason: default package */
/* loaded from: classes6.dex */
public final class eauk {
    private static final double a = Math.log(10.0d);

    public static void a(StringBuffer stringBuffer, int i, int i2) {
        int log;
        if (i < 0) {
            stringBuffer.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i2 > 10) {
                    stringBuffer.append('0');
                    i2--;
                }
                stringBuffer.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i2 > 1) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append((char) (i + 48));
        } else if (i < 100) {
            while (i2 > 2) {
                stringBuffer.append('0');
                i2--;
            }
            int i3 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i3 + 48));
            stringBuffer.append((char) (((i - (i3 << 3)) - (i3 + i3)) + 48));
        } else {
            if (i < 1000) {
                log = 3;
            } else {
                log = i < 10000 ? 4 : ((int) (Math.log(i) / a)) + 1;
            }
            while (i2 > log) {
                stringBuffer.append('0');
                i2--;
            }
            stringBuffer.append(Integer.toString(i));
        }
    }

    public static void b(StringBuffer stringBuffer, int i) {
        if (i < 0) {
            stringBuffer.append('-');
            if (i == Integer.MIN_VALUE) {
                stringBuffer.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            stringBuffer.append((char) (i + 48));
        } else if (i < 100) {
            int i2 = ((i + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i2 + 48));
            stringBuffer.append((char) (((i - (i2 << 3)) - (i2 + i2)) + 48));
        } else {
            stringBuffer.append(Integer.toString(i));
        }
    }

    public static int c(long j) {
        int log;
        if (j < 0) {
            log = c(-j);
        } else if (j < 10) {
            return 1;
        } else {
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            log = (int) (Math.log(j) / a);
        }
        return log + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(String str, int i) {
        int charAt = str.charAt(i) - '0';
        return (((charAt << 3) + (charAt + charAt)) + str.charAt(i + 1)) - 48;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str, int i) {
        int i2 = i + 32;
        String concat = str.length() <= i2 + 3 ? str : str.substring(0, i2).concat("...");
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 18);
            sb.append("Invalid format: \"");
            sb.append(concat);
            sb.append('\"');
            return sb.toString();
        } else if (i >= str.length()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 31);
            sb2.append("Invalid format: \"");
            sb2.append(concat);
            sb2.append("\" is too short");
            return sb2.toString();
        } else {
            String substring = concat.substring(i);
            StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 37 + String.valueOf(substring).length());
            sb3.append("Invalid format: \"");
            sb3.append(concat);
            sb3.append("\" is malformed at \"");
            sb3.append(substring);
            sb3.append('\"');
            return sb3.toString();
        }
    }
}
