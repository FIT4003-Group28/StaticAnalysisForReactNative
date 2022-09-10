package defpackage;
/* compiled from: PG */
/* renamed from: ajso  reason: default package */
/* loaded from: classes2.dex */
final class ajso extends ajtb {
    private final btlu a;
    private final long b;
    private final int c;

    public ajso(btlu btluVar, long j, int i) {
        if (btluVar != null) {
            this.a = btluVar;
            this.b = j;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.ajtb
    public final btlu a() {
        return this.a;
    }

    @Override // defpackage.ajtb
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ajtb
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtb) {
            ajtb ajtbVar = (ajtb) obj;
            if (this.a.equals(ajtbVar.a()) && this.b == ajtbVar.b() && this.c == ajtbVar.c()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83);
        sb.append("HistoricalRecord{account=");
        sb.append(valueOf);
        sb.append(", completionTime=");
        sb.append(j);
        sb.append(", result=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
