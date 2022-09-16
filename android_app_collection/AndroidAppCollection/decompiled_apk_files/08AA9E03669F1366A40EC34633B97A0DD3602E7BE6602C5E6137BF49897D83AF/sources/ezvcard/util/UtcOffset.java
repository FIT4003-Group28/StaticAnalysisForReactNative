package ezvcard.util;

import java.util.TimeZone;
/* loaded from: classes.dex */
public final class UtcOffset {

    /* renamed from: a  reason: collision with root package name */
    private final long f5597a;

    private static long a(long j) {
        return j * 60 * 60 * 1000;
    }

    private static long b(long j) {
        return j * 60 * 1000;
    }

    public UtcOffset(boolean z, int i, int i2) {
        this.f5597a = (z ? 1 : -1) * (a(Math.abs(i)) + b(Math.abs(i2)));
    }

    public UtcOffset(long j) {
        this.f5597a = j;
    }

    public static UtcOffset a(String str) {
        int i;
        boolean z;
        String substring;
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt == '-') {
            i = 1;
            z = false;
        } else {
            i = charAt == '+' ? 1 : 0;
            z = true;
        }
        int i3 = i + 4;
        int indexOf = str.indexOf(58, i);
        if (indexOf >= 0) {
            i3++;
        }
        if (str.length() > i3) {
            throw ezvcard.b.INSTANCE.d(40, str);
        }
        String str2 = null;
        if (indexOf < 0) {
            substring = str.substring(i);
            int length = substring.length() - 2;
            if (length > 0) {
                str2 = substring.substring(length);
                substring = substring.substring(0, length);
            }
        } else {
            substring = str.substring(i, indexOf);
            if (indexOf < str.length() - 1) {
                str2 = str.substring(indexOf + 1);
            }
        }
        try {
            int parseInt = Integer.parseInt(substring);
            if (str2 != null) {
                i2 = Integer.parseInt(str2);
            }
            return new UtcOffset(z, parseInt, i2);
        } catch (NumberFormatException unused) {
            throw ezvcard.b.INSTANCE.d(40, str);
        }
    }

    public static UtcOffset a(TimeZone timeZone) {
        return new UtcOffset(timeZone.getOffset(System.currentTimeMillis()));
    }

    public long a() {
        return this.f5597a;
    }

    public String toString() {
        return a(false);
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = this.f5597a >= 0;
        long abs = Math.abs(c(this.f5597a));
        long abs2 = Math.abs(d(this.f5597a));
        sb.append(z2 ? '+' : '-');
        if (abs < 10) {
            sb.append('0');
        }
        sb.append(abs);
        if (z) {
            sb.append(':');
        }
        if (abs2 < 10) {
            sb.append('0');
        }
        sb.append(abs2);
        return sb.toString();
    }

    public int hashCode() {
        return 31 + ((int) (this.f5597a ^ (this.f5597a >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f5597a == ((UtcOffset) obj).f5597a;
    }

    private static long c(long j) {
        return ((j / 1000) / 60) / 60;
    }

    private static long d(long j) {
        return ((j / 1000) / 60) % 60;
    }
}
