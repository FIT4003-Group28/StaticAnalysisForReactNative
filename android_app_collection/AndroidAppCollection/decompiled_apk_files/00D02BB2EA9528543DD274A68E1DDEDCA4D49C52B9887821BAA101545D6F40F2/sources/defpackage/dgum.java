package defpackage;
/* compiled from: PG */
/* renamed from: dgum  reason: default package */
/* loaded from: classes6.dex */
public final class dgum {
    public static final int a;

    static {
        String property = System.getProperty("java.version");
        int i = 1;
        try {
            String[] split = property.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1) {
                i = parseInt;
            } else if (split.length > 1) {
                i = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        a = i;
    }
}
