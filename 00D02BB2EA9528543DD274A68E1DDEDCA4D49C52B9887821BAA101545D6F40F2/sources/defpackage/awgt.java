package defpackage;
/* compiled from: PG */
/* renamed from: awgt  reason: default package */
/* loaded from: classes3.dex */
final class awgt extends awhc {
    private final akqs a;
    private final boolean b;
    private final int c;

    public awgt(akqs akqsVar, boolean z, int i) {
        this.a = akqsVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.awhc
    public final akqs a() {
        return this.a;
    }

    @Override // defpackage.awhc
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.awhc
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awhc) {
            awhc awhcVar = (awhc) obj;
            if (this.a.equals(awhcVar.a()) && this.b == awhcVar.b() && this.c == awhcVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97);
        sb.append("OfflineabilityCheckResult{bounds=");
        sb.append(valueOf);
        sb.append(", fullyOfflineable=");
        sb.append(z);
        sb.append(", numberOfOfflineablePoints=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
