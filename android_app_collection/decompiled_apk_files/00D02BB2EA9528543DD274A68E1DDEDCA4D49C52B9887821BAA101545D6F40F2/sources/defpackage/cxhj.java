package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxhj  reason: default package */
/* loaded from: classes5.dex */
public final class cxhj extends cxic {
    public final dslt a;
    public final long b;

    public cxhj(dslt dsltVar, long j) {
        if (dsltVar != null) {
            this.a = dsltVar;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null response");
    }

    @Override // defpackage.cxic
    public final dslt a() {
        return this.a;
    }

    @Override // defpackage.cxic
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxic) {
            cxic cxicVar = (cxic) obj;
            if (this.a.equals(cxicVar.a()) && this.b == cxicVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dslt dsltVar = this.a;
        int i = dsltVar.bC;
        if (i == 0) {
            i = dsst.a.b(dsltVar).c(dsltVar);
            dsltVar.bC = i;
        }
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("CachedGetActivityControlsSettingsResponse{response=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
