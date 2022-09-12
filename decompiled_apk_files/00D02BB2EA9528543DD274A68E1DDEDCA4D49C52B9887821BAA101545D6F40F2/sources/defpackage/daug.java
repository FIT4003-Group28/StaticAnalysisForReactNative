package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: daug  reason: default package */
/* loaded from: classes5.dex */
public final class daug implements Serializable {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");
    public static final Pattern b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;
    private final long c;
    private final boolean d;
    private final int e;

    public daug(boolean z, long j, Integer num) {
        int offset;
        this.d = z;
        this.c = j;
        if (z) {
            offset = 0;
        } else {
            offset = num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
        }
        this.e = offset;
    }

    private static void b(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(this.c + (this.e * 60000));
        b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        b(sb, gregorianCalendar.get(5), 2);
        if (!this.d) {
            sb.append('T');
            b(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            b(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            b(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                b(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.e;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                b(sb, i / 60, 2);
                sb.append(':');
                b(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof daug)) {
            return false;
        }
        daug daugVar = (daug) obj;
        return this.d == daugVar.d && this.c == daugVar.c && this.e == daugVar.e;
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.c;
        jArr[1] = true != this.d ? 0L : 1L;
        jArr[2] = this.e;
        return Arrays.hashCode(jArr);
    }

    public final String toString() {
        return a();
    }
}
