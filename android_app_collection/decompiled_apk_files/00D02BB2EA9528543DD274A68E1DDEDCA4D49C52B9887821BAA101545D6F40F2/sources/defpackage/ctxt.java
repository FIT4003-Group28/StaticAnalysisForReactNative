package defpackage;
/* compiled from: PG */
/* renamed from: ctxt  reason: default package */
/* loaded from: classes5.dex */
final class ctxt extends ctyb {
    private final String a;
    private final dbsg<Integer> b;
    private final dbsg<Integer> c;
    private final int d;
    private final dbsg<Integer> e;

    public ctxt(String str, dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2, int i, dbsg<Integer> dbsgVar3) {
        this.a = str;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = i;
        this.e = dbsgVar3;
    }

    @Override // defpackage.ctyb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctyb
    public final dbsg<Integer> b() {
        return this.b;
    }

    @Override // defpackage.ctyb
    public final dbsg<Integer> c() {
        return this.c;
    }

    @Override // defpackage.ctyb
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ctyb
    public final dbsg<Integer> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctyb) {
            ctyb ctybVar = (ctyb) obj;
            if (this.a.equals(ctybVar.a()) && this.b.equals(ctybVar.b()) && this.c.equals(ctybVar.c()) && this.d == ctybVar.d() && this.e.equals(ctybVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChipLog{chipsId=");
        sb.append(str);
        sb.append(", chipId=");
        sb.append(valueOf);
        sb.append(", chipPosition=");
        sb.append(valueOf2);
        sb.append(", renderStyle=");
        sb.append(i);
        sb.append(", actionType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
