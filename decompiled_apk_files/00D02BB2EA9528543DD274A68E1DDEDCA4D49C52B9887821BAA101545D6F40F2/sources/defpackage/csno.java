package defpackage;
/* compiled from: PG */
/* renamed from: csno  reason: default package */
/* loaded from: classes5.dex */
final class csno extends csnv {
    private final boolean a;
    private final int b;

    public csno(boolean z, @dzsi int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.csnv
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.csnv
    @dzsi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csnv) {
            csnv csnvVar = (csnv) obj;
            if (this.a == csnvVar.a() && (this.b != 0 ? csnvVar.b() == 1 : csnvVar.b() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.b == 0) {
            i = 0;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b != 1 ? "null" : "UNSCHEDULED";
        StringBuilder sb = new StringBuilder(str.length() + 55);
        sb.append("LookupParams{forceRefreshCache=");
        sb.append(z);
        sb.append(", syncContextType=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
