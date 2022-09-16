package defpackage;
/* compiled from: PG */
/* renamed from: zja  reason: default package */
/* loaded from: classes4.dex */
final class zja {
    public final Object a;
    private final long b;
    private final Long c;

    public zja(Object obj, long j, Long l) {
        if (obj != null) {
            this.a = obj;
            this.b = j;
            this.c = l;
            return;
        }
        throw new NullPointerException("Null model");
    }

    public final boolean a(snc sncVar) {
        Long l = this.c;
        return (l == null || l.longValue() == 0 || this.c.longValue() + this.b > sncVar.d()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zja) {
            zja zjaVar = (zja) obj;
            if (this.a.equals(zjaVar.a) && this.b == zjaVar.b) {
                Long l = this.c;
                Long l2 = zjaVar.c;
                if (l != null ? l.equals(l2) : l2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.c;
        return i ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63 + String.valueOf(valueOf2).length());
        sb.append("ModelWrapper{model=");
        sb.append(valueOf);
        sb.append(", timestampMs=");
        sb.append(j);
        sb.append(", expiry=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zja() {
    }
}
