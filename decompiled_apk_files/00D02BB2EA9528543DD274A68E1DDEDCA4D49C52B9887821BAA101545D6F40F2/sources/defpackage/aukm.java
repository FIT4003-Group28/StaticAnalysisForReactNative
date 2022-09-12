package defpackage;
/* compiled from: PG */
/* renamed from: aukm  reason: default package */
/* loaded from: classes2.dex */
final class aukm extends aulc {
    private final int a;
    private final dbsg<String> b;
    private final cjtd c;
    private final boolean d;
    private final dbsg<ausn> e;

    public aukm(int i, dbsg<String> dbsgVar, cjtd cjtdVar, boolean z, dbsg<ausn> dbsgVar2) {
        this.a = i;
        this.b = dbsgVar;
        this.c = cjtdVar;
        this.d = z;
        this.e = dbsgVar2;
    }

    @Override // defpackage.aulc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aulc
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.aulc
    public final cjtd c() {
        return this.c;
    }

    @Override // defpackage.aulc
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.aulc
    public final dbsg<ausn> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aulc) {
            aulc aulcVar = (aulc) obj;
            if (this.a == aulcVar.a() && this.b.equals(aulcVar.b()) && this.c.equals(aulcVar.c()) && this.d == aulcVar.d() && this.e.equals(aulcVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 102 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChimeLoggingInfo{loggingId=");
        sb.append(i);
        sb.append(", tag=");
        sb.append(valueOf);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", autoCancelOnClick=");
        sb.append(z);
        sb.append(", backoffExtras=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
