package defpackage;
/* compiled from: PG */
/* renamed from: cqza  reason: default package */
/* loaded from: classes5.dex */
final class cqza extends cqzb {
    private final String a;
    private final long b;

    public cqza(String str, long j) {
        if (str != null) {
            this.a = str;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.cqzb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqzb
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqzb) {
            cqzb cqzbVar = (cqzb) obj;
            if (this.a.equals(cqzbVar.a()) && this.b == cqzbVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 53);
        sb.append("ElementId{key=");
        sb.append(str);
        sb.append(", timestampMicros=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
