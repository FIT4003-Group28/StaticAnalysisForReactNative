package defpackage;
/* compiled from: PG */
/* renamed from: wuy  reason: default package */
/* loaded from: classes7.dex */
final class wuy extends wva {
    private final long a;
    private final dopk b;
    private final qdv c;

    public wuy(long j, dopk dopkVar, qdv qdvVar) {
        this.a = j;
        if (dopkVar != null) {
            this.b = dopkVar;
            if (qdvVar != null) {
                this.c = qdvVar;
                return;
            }
            throw new NullPointerException("Null params");
        }
        throw new NullPointerException("Null station");
    }

    @Override // defpackage.wva
    public final long a() {
        return this.a;
    }

    @Override // defpackage.wva
    public final dopk b() {
        return this.b;
    }

    @Override // defpackage.wva
    public final qdv c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wva) {
            wva wvaVar = (wva) obj;
            if (this.a == wvaVar.a() && this.b.equals(wvaVar.b()) && this.c.equals(wvaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        dopk dopkVar = this.b;
        int i2 = dopkVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dopkVar).c(dopkVar);
            dopkVar.bC = i2;
        }
        return this.c.hashCode() ^ ((i ^ i2) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
        sb.append("StationData{expireTimestamp=");
        sb.append(j);
        sb.append(", station=");
        sb.append(valueOf);
        sb.append(", params=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
