package defpackage;
/* compiled from: PG */
/* renamed from: ahvx  reason: default package */
/* loaded from: classes.dex */
final class ahvx extends ahwj {
    private final long a;
    private final long b;

    public ahvx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.ahwj
    public long a() {
        return this.b;
    }

    @Override // defpackage.ahwj
    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwj) {
            ahwj ahwjVar = (ahwj) obj;
            if (this.a == ahwjVar.b() && this.b == ahwjVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(90);
        sb.append("PlaybackLoopRunningEvent{startTimeMs=");
        sb.append(j);
        sb.append(", endTimeMs=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
