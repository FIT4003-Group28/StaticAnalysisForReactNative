package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyov  reason: default package */
/* loaded from: classes6.dex */
final class dyov implements dyhn<Long> {
    @Override // defpackage.dyhn
    public final /* bridge */ /* synthetic */ Long a(String str) {
        TimeUnit timeUnit;
        dbsk.b(str.length() > 0, "empty timeout");
        dbsk.b(str.length() <= 9, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            timeUnit = TimeUnit.HOURS;
        } else if (charAt == 'M') {
            timeUnit = TimeUnit.MINUTES;
        } else if (charAt == 'S') {
            timeUnit = TimeUnit.SECONDS;
        } else if (charAt == 'u') {
            timeUnit = TimeUnit.MICROSECONDS;
        } else if (charAt != 'm') {
            if (charAt != 'n') {
                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
            }
            return Long.valueOf(parseLong);
        } else {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return Long.valueOf(timeUnit.toNanos(parseLong));
    }

    @Override // defpackage.dyhn
    public final /* bridge */ /* synthetic */ String b(Long l) {
        StringBuilder sb;
        String str;
        Long l2 = l;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (l2.longValue() >= 0) {
            if (l2.longValue() < 100000000) {
                String valueOf = String.valueOf(l2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1);
                sb2.append(valueOf);
                sb2.append("n");
                return sb2.toString();
            }
            int i = (l2.longValue() > 100000000000L ? 1 : (l2.longValue() == 100000000000L ? 0 : -1));
            long longValue = l2.longValue();
            if (i < 0) {
                long micros = timeUnit.toMicros(longValue);
                sb = new StringBuilder(21);
                sb.append(micros);
                str = "u";
            } else {
                int i2 = (longValue > 100000000000000L ? 1 : (longValue == 100000000000000L ? 0 : -1));
                long longValue2 = l2.longValue();
                if (i2 < 0) {
                    long millis = timeUnit.toMillis(longValue2);
                    sb = new StringBuilder(21);
                    sb.append(millis);
                    str = "m";
                } else {
                    int i3 = (longValue2 > 100000000000000000L ? 1 : (longValue2 == 100000000000000000L ? 0 : -1));
                    long longValue3 = l2.longValue();
                    if (i3 < 0) {
                        long seconds = timeUnit.toSeconds(longValue3);
                        sb = new StringBuilder(21);
                        sb.append(seconds);
                        str = "S";
                    } else {
                        int i4 = (longValue3 > 6000000000000000000L ? 1 : (longValue3 == 6000000000000000000L ? 0 : -1));
                        long longValue4 = l2.longValue();
                        if (i4 < 0) {
                            long minutes = timeUnit.toMinutes(longValue4);
                            sb = new StringBuilder(21);
                            sb.append(minutes);
                            str = "M";
                        } else {
                            long hours = timeUnit.toHours(longValue4);
                            sb = new StringBuilder(21);
                            sb.append(hours);
                            str = "H";
                        }
                    }
                }
            }
            sb.append(str);
            return sb.toString();
        }
        throw new IllegalArgumentException("Timeout too small");
    }
}
