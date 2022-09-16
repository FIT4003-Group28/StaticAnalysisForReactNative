package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cwa  reason: default package */
/* loaded from: classes3.dex */
public final class cwa {
    final cwb a;
    public final long b;
    public final long c;
    public final double d;

    public cwa(cwb cwbVar, long j, long j2, double d) {
        this.b = j;
        this.c = j2;
        this.d = d;
        this.a = cwbVar;
    }

    public cwa(cwb cwbVar, ByteBuffer byteBuffer) {
        if (cwbVar.s() == 1) {
            this.b = hy.J(byteBuffer);
            this.c = byteBuffer.getLong();
            this.d = hy.C(byteBuffer);
        } else {
            this.b = hy.I(byteBuffer);
            this.c = byteBuffer.getInt();
            this.d = hy.C(byteBuffer);
        }
        this.a = cwbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cwa cwaVar = (cwa) obj;
        return this.c == cwaVar.c && this.b == cwaVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        double d = this.d;
        StringBuilder sb = new StringBuilder(111);
        sb.append("Entry{segmentDuration=");
        sb.append(j);
        sb.append(", mediaTime=");
        sb.append(j2);
        sb.append(", mediaRate=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
