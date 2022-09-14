package defpackage;
/* compiled from: PG */
/* renamed from: cuci  reason: default package */
/* loaded from: classes5.dex */
final class cuci extends ctzl {
    private final dbsg<String> a;
    private final dbsg<String> b;
    private final dbsg<String> c;
    private final dbsg<ctzf> d;
    private final long e;
    private final ctzc f;
    private final ctzc g;

    public cuci(dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<ctzf> dbsgVar4, long j, ctzc ctzcVar, ctzc ctzcVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
        this.e = j;
        this.f = ctzcVar;
        this.g = ctzcVar2;
    }

    @Override // defpackage.ctzl
    public final dbsg<String> a() {
        return this.a;
    }

    @Override // defpackage.ctzl
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.ctzl
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.ctzl
    public final dbsg<ctzf> d() {
        return this.d;
    }

    @Override // defpackage.ctzl
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzl) {
            ctzl ctzlVar = (ctzl) obj;
            if (this.a.equals(ctzlVar.a()) && this.b.equals(ctzlVar.b()) && this.c.equals(ctzlVar.c()) && this.d.equals(ctzlVar.d()) && this.e == ctzlVar.e() && this.f.equals(ctzlVar.g()) && this.g.equals(ctzlVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctzl
    public final ctzc g() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        long j = this.e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.ctzl
    public final ctzc i() {
        return this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        long j = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 173 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Action{traceId=");
        sb.append(valueOf);
        sb.append(", messageId=");
        sb.append(valueOf2);
        sb.append(", eventCallbackPayload=");
        sb.append(valueOf3);
        sb.append(", eventCallbackDestination=");
        sb.append(valueOf4);
        sb.append(", actionTriggeredLogId=");
        sb.append(j);
        sb.append(", actionPayload=");
        sb.append(valueOf5);
        sb.append(", eventCallbackFailureActionPayload=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
