package defpackage;
/* compiled from: PG */
/* renamed from: wux  reason: default package */
/* loaded from: classes7.dex */
final class wux extends wuz {
    private final long a;
    private final akqi b;
    private final dvvo c;
    private final String d;

    public wux(long j, akqi akqiVar, dvvo dvvoVar, String str) {
        this.a = j;
        this.b = akqiVar;
        if (dvvoVar != null) {
            this.c = dvvoVar;
            if (str != null) {
                this.d = str;
                return;
            }
            throw new NullPointerException("Null timezoneId");
        }
        throw new NullPointerException("Null busyness");
    }

    @Override // defpackage.wuz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.wuz
    public final akqi b() {
        return this.b;
    }

    @Override // defpackage.wuz
    public final dvvo c() {
        return this.c;
    }

    @Override // defpackage.wuz
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wuz) {
            wuz wuzVar = (wuz) obj;
            if (this.a == wuzVar.a() && this.b.equals(wuzVar.b()) && this.c.equals(wuzVar.c()) && this.d.equals(wuzVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dvvo dvvoVar = this.c;
        int i = dvvoVar.bC;
        if (i == 0) {
            i = dsst.a.b(dvvoVar).c(dvvoVar);
            dvvoVar.bC = i;
        }
        return this.d.hashCode() ^ ((hashCode ^ i) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(valueOf2).length() + str.length());
        sb.append("BusynessData{expireTimestamp=");
        sb.append(j);
        sb.append(", featureId=");
        sb.append(valueOf);
        sb.append(", busyness=");
        sb.append(valueOf2);
        sb.append(", timezoneId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
