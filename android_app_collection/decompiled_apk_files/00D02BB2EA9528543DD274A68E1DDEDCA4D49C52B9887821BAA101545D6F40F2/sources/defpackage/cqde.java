package defpackage;
/* compiled from: PG */
/* renamed from: cqde  reason: default package */
/* loaded from: classes5.dex */
final class cqde extends cqes {
    public final cqeo a;
    public final boolean b;
    public final boolean c;

    public cqde(cqeo cqeoVar, boolean z, boolean z2) {
        if (cqeoVar != null) {
            this.a = cqeoVar;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null promotability");
    }

    @Override // defpackage.cqes
    public final cqeo a() {
        return this.a;
    }

    @Override // defpackage.cqes
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cqes
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqes) {
            cqes cqesVar = (cqes) obj;
            if (this.a.equals(cqesVar.a()) && this.b == cqesVar.b() && this.c == cqesVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
        sb.append("SettingState{promotability=");
        sb.append(valueOf);
        sb.append(", isHistoryEnabled=");
        sb.append(z);
        sb.append(", isReportingEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
