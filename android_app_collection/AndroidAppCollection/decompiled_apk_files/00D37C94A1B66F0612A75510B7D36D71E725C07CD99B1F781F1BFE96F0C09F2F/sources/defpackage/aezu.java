package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aezu  reason: default package */
/* loaded from: classes.dex */
final class aezu implements aeys {
    private static final Pattern c = Pattern.compile("(\\d+)(?:\\(r=(\\d+)\\))?,");
    public final long a;
    public final long[] b;
    private final TreeMap d = new TreeMap();

    public aezu(int[] iArr) {
        this.b = new long[iArr.length];
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 >= 0) {
                this.b[i] = j;
                this.d.put(Long.valueOf(j), Integer.valueOf(i));
                j += TimeUnit.MILLISECONDS.toMicros(iArr[i]);
            } else {
                StringBuilder sb = new StringBuilder(40);
                sb.append("chunk.");
                sb.append(i);
                sb.append(";durationMs.");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aezu b(aeui aeuiVar) {
        int i;
        Integer b = aeuiVar.b("Segment-Count");
        if (b == null) {
            throw pjq.a("Key Segment-Count is missing from OTF EmbeddedMetadata", null);
        }
        if (b.intValue() <= 0) {
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Segment-Count equals ");
            sb.append(valueOf);
            sb.append(" is invalid.");
            throw pjq.a(sb.toString(), null);
        }
        int intValue = b.intValue() + 1;
        int[] iArr = new int[intValue];
        String d = aeuiVar.d("Segment-Durations-Ms");
        if (d == null) {
            throw pjq.a("Key Segment-Durations-Ms is missing from OTF EmbeddedMetadata", null);
        }
        Matcher matcher = c.matcher(d);
        int i2 = 1;
        while (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                String group = matcher.group(2);
                int i3 = 0;
                if (group != null) {
                    i = Integer.parseInt(group);
                    if (i <= 0) {
                        String valueOf2 = String.valueOf(matcher.group(0));
                        throw pjq.a(valueOf2.length() != 0 ? "Invalid repeated segment ".concat(valueOf2) : new String("Invalid repeated segment "), null);
                    }
                } else {
                    i = 0;
                    continue;
                }
                while (true) {
                    if (i3 <= i) {
                        if (i2 < intValue) {
                            iArr[i2] = parseInt;
                            i3++;
                            i2++;
                        } else {
                            String valueOf3 = String.valueOf(b);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                            sb2.append("Expected ");
                            sb2.append(valueOf3);
                            sb2.append(" segments, but found more in the list");
                            throw pjq.a(sb2.toString(), null);
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                throw pjq.d(e);
            }
        }
        int i4 = i2 - 1;
        if (i4 < b.intValue()) {
            String valueOf4 = String.valueOf(b);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 63);
            sb3.append("Expected ");
            sb3.append(valueOf4);
            sb3.append(" segments, but only found ");
            sb3.append(i4);
            sb3.append(" segments in list");
            throw pjq.a(sb3.toString(), null);
        }
        try {
            return new aezu(iArr);
        } catch (IllegalArgumentException e2) {
            throw pjq.d(e2);
        }
    }

    @Override // defpackage.aeys
    public final long A(long j) {
        Map.Entry floorEntry;
        if (j < 0 || j > this.a || (floorEntry = this.d.floorEntry(Long.valueOf(j))) == null) {
            return -1L;
        }
        return ((Integer) floorEntry.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        if (j >= 0) {
            long[] jArr = this.b;
            if (j < jArr.length) {
                return jArr[(int) j];
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aezu)) {
            return false;
        }
        return Arrays.equals(this.b, ((aezu) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        Locale locale = Locale.US;
        double d = this.a;
        Double.isNaN(d);
        return String.format(locale, "OtfManifest (numChunks = %d, duration = %.1f sec)", Integer.valueOf(this.b.length), Double.valueOf(d / 1000000.0d));
    }
}
