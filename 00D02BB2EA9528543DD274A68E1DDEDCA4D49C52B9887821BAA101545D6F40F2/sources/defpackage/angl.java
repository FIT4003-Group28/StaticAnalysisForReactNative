package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: angl  reason: default package */
/* loaded from: classes2.dex */
public final class angl extends anho {
    private final bvrt<dpop> a;
    private final aogy b;

    public angl(bvrt<dpop> bvrtVar, aogy aogyVar) {
        this.a = bvrtVar;
        if (aogyVar != null) {
            this.b = aogyVar;
            return;
        }
        throw new NullPointerException("Null segmentDuration");
    }

    @Override // defpackage.anho
    public final bvrt<dpop> a() {
        return this.a;
    }

    @Override // defpackage.anho
    public final aogy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anho) {
            anho anhoVar = (anho) obj;
            if (this.a.equals(anhoVar.a()) && this.b.equals(anhoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62 + String.valueOf(valueOf2).length());
        sb.append("SegmentDurationEstimate{confidenceInterval=");
        sb.append(valueOf);
        sb.append(", segmentDuration=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
