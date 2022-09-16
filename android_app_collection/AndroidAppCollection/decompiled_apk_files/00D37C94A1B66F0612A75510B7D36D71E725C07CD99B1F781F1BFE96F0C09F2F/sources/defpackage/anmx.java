package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anmx  reason: default package */
/* loaded from: classes.dex */
final class anmx implements Comparable {
    private final byte[] a;

    public anmx(byte[] bArr) {
        this.a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        anmx anmxVar = (anmx) obj;
        int length = this.a.length;
        int length2 = anmxVar.a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = anmxVar.a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anmx)) {
            return false;
        }
        return Arrays.equals(this.a, ((anmx) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return sb.toString();
    }
}
