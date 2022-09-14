package defpackage;
/* compiled from: PG */
/* renamed from: yvd  reason: default package */
/* loaded from: classes7.dex */
final class yvd extends yvk {
    private final String a;
    private final dcdc<dvzn> b;
    private final dcdc<drij> c;
    private final int d;

    public yvd(String str, dcdc<dvzn> dcdcVar, dcdc<drij> dcdcVar2, int i) {
        this.a = str;
        this.b = dcdcVar;
        this.c = dcdcVar2;
        this.d = i;
    }

    @Override // defpackage.yvk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.yvk
    public final dcdc<dvzn> b() {
        return this.b;
    }

    @Override // defpackage.yvk
    public final dcdc<drij> c() {
        return this.c;
    }

    @Override // defpackage.yvk
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yvk) {
            yvk yvkVar = (yvk) obj;
            if (this.a.equals(yvkVar.a()) && dchl.m(this.b, yvkVar.b()) && dchl.m(this.c, yvkVar.c())) {
                int i = this.d;
                int d = yvkVar.d();
                if (i == 0) {
                    throw null;
                }
                if (i == d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        int i = this.d;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        String valueOf3 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Vehicle{vehicleToken=");
        sb.append(str);
        sb.append(", polylineSegments=");
        sb.append(valueOf);
        sb.append(", transitStops=");
        sb.append(valueOf2);
        sb.append(", polylineType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
