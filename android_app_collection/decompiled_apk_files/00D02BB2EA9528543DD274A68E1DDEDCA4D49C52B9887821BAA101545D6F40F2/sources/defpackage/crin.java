package defpackage;
/* compiled from: PG */
/* renamed from: crin  reason: default package */
/* loaded from: classes5.dex */
public final class crin extends cris {
    private final dbsg<dqkr> a;
    private final boolean b;
    private final aryv c;

    public crin(dbsg<dqkr> dbsgVar, boolean z, aryv aryvVar) {
        this.a = dbsgVar;
        this.b = z;
        if (aryvVar != null) {
            this.c = aryvVar;
            return;
        }
        throw new NullPointerException("Null speedLimit");
    }

    @Override // defpackage.cris
    public final dbsg<dqkr> a() {
        return this.a;
    }

    @Override // defpackage.cris
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cris
    public final aryv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cris) {
            cris crisVar = (cris) obj;
            if (this.a.equals(crisVar.a()) && this.b == crisVar.b() && this.c.equals(crisVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 83 + String.valueOf(valueOf2).length());
        sb.append("ReportIncidentWithoutLocationEvent{typeOptional=");
        sb.append(valueOf);
        sb.append(", cooloffActive=");
        sb.append(z);
        sb.append(", speedLimit=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
