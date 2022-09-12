package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aofz  reason: default package */
/* loaded from: classes2.dex */
public final class aofz extends aogy {
    private final aogf a;
    private final int b;

    public aofz(aogf aogfVar, int i) {
        if (aogfVar != null) {
            this.a = aogfVar;
            if (i != 0) {
                this.b = i;
                return;
            }
            throw new NullPointerException("Null segmentDurationType");
        }
        throw new NullPointerException("Null localDuration");
    }

    @Override // defpackage.aogy
    public final aogf a() {
        return this.a;
    }

    @Override // defpackage.aogy
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogy) {
            aogy aogyVar = (aogy) obj;
            if (this.a.equals(aogyVar.a()) && this.b == aogyVar.b()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + a.length());
        sb.append("SegmentDuration{localDuration=");
        sb.append(valueOf);
        sb.append(", segmentDurationType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
