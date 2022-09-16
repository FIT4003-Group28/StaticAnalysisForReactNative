package defpackage;
/* compiled from: PG */
/* renamed from: zii  reason: default package */
/* loaded from: classes4.dex */
public final class zii {
    public final long a;
    public final String b;

    public zii(long j, String str) {
        this.a = j;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null cpid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zii) {
            zii ziiVar = (zii) obj;
            if (this.a == ziiVar.a && this.b.equals(ziiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 57);
        sb.append("DataPlanIdentifier{carrierId=");
        sb.append(j);
        sb.append(", cpid=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public zii() {
    }
}
