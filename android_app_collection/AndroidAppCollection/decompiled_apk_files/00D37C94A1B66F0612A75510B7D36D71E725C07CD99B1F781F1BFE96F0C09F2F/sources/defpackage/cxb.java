package defpackage;
/* compiled from: PG */
/* renamed from: cxb  reason: default package */
/* loaded from: classes3.dex */
public final class cxb {
    public long a;
    public final long b;

    public cxb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(61);
        sb.append("Entry{count=");
        sb.append(j);
        sb.append(", delta=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
