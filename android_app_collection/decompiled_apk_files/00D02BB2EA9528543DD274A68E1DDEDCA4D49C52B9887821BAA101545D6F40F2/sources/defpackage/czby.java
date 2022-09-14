package defpackage;
/* compiled from: PG */
/* renamed from: czby  reason: default package */
/* loaded from: classes5.dex */
final class czby extends czcl {
    private final dcdc<cywi> b;
    private final cyes c;
    private final boolean d;

    public czby(dcdc<cywi> dcdcVar, cyes cyesVar, boolean z) {
        this.b = dcdcVar;
        this.c = cyesVar;
        this.d = z;
    }

    @Override // defpackage.czcl
    public final dcdc<cywi> a() {
        return this.b;
    }

    @Override // defpackage.czcl
    public final cyes b() {
        return this.c;
    }

    @Override // defpackage.czcl
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czcl) {
            czcl czclVar = (czcl) obj;
            if (dchl.m(this.b, czclVar.a()) && this.c.equals(czclVar.b()) && this.d == czclVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("LivePeopleApiResult{items=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append(", containsPartialResults=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
