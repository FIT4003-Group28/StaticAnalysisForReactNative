package defpackage;
/* compiled from: PG */
/* renamed from: aejp  reason: default package */
/* loaded from: classes.dex */
final class aejp {
    final int a;
    final long b;
    long d;
    long g;
    long h;
    String l;
    final StringBuilder c = new StringBuilder();
    long e = -1;
    long f = -1;
    aepk i = aepk.a;
    long j = -1;
    long k = -1;

    public aejp(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.e;
        long j3 = this.g;
        long j4 = this.h;
        aepk aepkVar = this.i;
        long j5 = aepkVar.b;
        int i2 = aepkVar.c;
        long j6 = this.j;
        long j7 = this.k;
        String str = this.l;
        String valueOf = String.valueOf(this.c);
        long j8 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 420 + String.valueOf(valueOf).length());
        sb.append("RequestInfo requestNumber=");
        sb.append(i);
        sb.append(" startTimeMs=");
        sb.append(j);
        sb.append(" lengthBytes=");
        sb.append(j2);
        sb.append(" lastRecordedTime=");
        sb.append(j3);
        sb.append(" lastRecordedDataKB=");
        sb.append(j3);
        sb.append(" accumulatedBytes=");
        sb.append(j4);
        sb.append(" startBandwidthEstimateWithSource=(");
        sb.append(j5);
        sb.append(", ");
        sb.append(i2);
        sb.append(") durationMs=");
        sb.append(j6);
        sb.append(" connectTimeMs=");
        sb.append(j7);
        sb.append(" errorCode=");
        sb.append(str);
        sb.append(" encodedReadData=");
        sb.append(valueOf);
        sb.append(" mediaDurationMs=");
        sb.append(j8);
        return sb.toString();
    }
}
