package defpackage;
/* compiled from: PG */
/* renamed from: bqcq  reason: default package */
/* loaded from: classes4.dex */
final class bqcq extends bqcv {
    private final akqq a;
    private final Long b;

    public bqcq(akqq akqqVar, @dzsi Long l) {
        if (akqqVar != null) {
            this.a = akqqVar;
            this.b = l;
            return;
        }
        throw new NullPointerException("Null latLng");
    }

    @Override // defpackage.bqcv
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.bqcv
    @dzsi
    public final Long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqcv) {
            bqcv bqcvVar = (bqcv) obj;
            if (this.a.equals(bqcvVar.a()) && ((l = this.b) != null ? l.equals(bqcvVar.b()) : bqcvVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Long l = this.b;
        return hashCode ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("RmrMultiRoadGraphIntersection{latLng=");
        sb.append(valueOf);
        sb.append(", fprint=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
