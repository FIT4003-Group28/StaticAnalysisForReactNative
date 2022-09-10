package defpackage;
/* compiled from: PG */
/* renamed from: cfls  reason: default package */
/* loaded from: classes4.dex */
public final class cfls extends cflv {
    private final akra a;
    private final cflx b;

    public cfls(akra akraVar, cflx cflxVar) {
        if (akraVar != null) {
            this.a = akraVar;
            if (cflxVar != null) {
                this.b = cflxVar;
                return;
            }
            throw new NullPointerException("Null segmentPair");
        }
        throw new NullPointerException("Null point");
    }

    @Override // defpackage.cflv
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.cflv
    public final cflx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cflv) {
            cflv cflvVar = (cflv) obj;
            if (this.a.equals(cflvVar.a()) && this.b.equals(cflvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("PointOnSegment{point=");
        sb.append(valueOf);
        sb.append(", segmentPair=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
