package defpackage;
/* compiled from: PG */
/* renamed from: crim  reason: default package */
/* loaded from: classes5.dex */
public final class crim extends crir {
    private final dqkr a;
    private final long b;
    private final int c;

    public crim(int i, dqkr dqkrVar, long j) {
        this.c = i;
        if (dqkrVar != null) {
            this.a = dqkrVar;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.crir
    public final dqkr a() {
        return this.a;
    }

    @Override // defpackage.crir
    public final long b() {
        return this.b;
    }

    @Override // defpackage.crir
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crir) {
            crir crirVar = (crir) obj;
            if (this.c == crirVar.c() && this.a.equals(crirVar.a()) && this.b == crirVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toString(this.c - 1));
        String valueOf2 = String.valueOf(this.a);
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76 + String.valueOf(valueOf2).length());
        sb.append("IncidentReportSentEvent{reportType=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(valueOf2);
        sb.append(", incidentId=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
