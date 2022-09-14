package defpackage;
/* compiled from: PG */
/* renamed from: aocv  reason: default package */
/* loaded from: classes2.dex */
final class aocv extends aoeb {
    private final aogq a;
    private final int b;

    public aocv(aogq aogqVar, int i) {
        if (aogqVar != null) {
            this.a = aogqVar;
            if (i != 0) {
                this.b = i;
                return;
            }
            throw new NullPointerException("Null segmentDurationType");
        }
        throw new NullPointerException("Null localDuration");
    }

    @Override // defpackage.aoeb
    public final aogq a() {
        return this.a;
    }

    @Override // defpackage.aoeb
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoeb) {
            aoeb aoebVar = (aoeb) obj;
            if (this.a.equals(aoebVar.a()) && this.b == aoebVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = aogz.a(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60 + a.length());
        sb.append("PartialSegmentDuration{localDuration=");
        sb.append(valueOf);
        sb.append(", segmentDurationType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
