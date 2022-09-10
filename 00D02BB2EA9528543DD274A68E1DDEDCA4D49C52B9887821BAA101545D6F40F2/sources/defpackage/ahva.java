package defpackage;
/* compiled from: PG */
/* renamed from: ahva  reason: default package */
/* loaded from: classes2.dex */
final class ahva extends ahvz {
    private final btlu a;
    private final long b;
    private final int c;

    public ahva(btlu btluVar, long j, int i) {
        this.a = btluVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.ahvz
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ahvz
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ahvz
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvz) {
            ahvz ahvzVar = (ahvz) obj;
            if (this.a.equals(ahvzVar.a()) && this.b == ahvzVar.b() && this.c == ahvzVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
        sb.append("HistoricalRecord{account=");
        sb.append(valueOf);
        sb.append(", completionTime=");
        sb.append(j);
        sb.append(", tosCheckResult=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
