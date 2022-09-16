package defpackage;

import android.os.SystemClock;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aevo  reason: default package */
/* loaded from: classes.dex */
public final class aevo implements oun {
    final long a;
    final long b;
    final long c = SystemClock.elapsedRealtime() * 1000;
    final boolean d;
    final pcw e;

    public aevo(long j, long j2, pcw pcwVar, boolean z, byte[] bArr) {
        this.a = j;
        this.b = j2;
        this.e = pcwVar;
        this.d = z;
    }

    @Override // defpackage.oun
    public final long[] a(long[] jArr) {
        if (jArr == null) {
            jArr = new long[2];
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.c;
        jArr[0] = this.d ? this.a + elapsedRealtime : this.a;
        jArr[1] = this.b + elapsedRealtime;
        return jArr;
    }

    @Override // defpackage.oun
    public final long[] b() {
        long[] a = a(null);
        a[0] = a[0] / 1000;
        a[1] = a[1] / 1000;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aevo)) {
            return false;
        }
        aevo aevoVar = (aevo) obj;
        return aevoVar.e == this.e && aevoVar.c == this.c && aevoVar.a == this.a && aevoVar.b == this.b && aevoVar.d == this.d;
    }

    public final int hashCode() {
        return ((((((((int) this.c) + 527) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        long[] a = a(null);
        return String.format(Locale.getDefault(), "SlidingTimeRange [%d, %d]", Long.valueOf(a[0]), Long.valueOf(a[1]));
    }
}
