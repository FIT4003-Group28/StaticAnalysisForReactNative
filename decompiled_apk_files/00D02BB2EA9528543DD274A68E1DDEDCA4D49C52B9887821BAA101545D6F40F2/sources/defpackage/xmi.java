package defpackage;
/* compiled from: PG */
/* renamed from: xmi  reason: default package */
/* loaded from: classes7.dex */
public final class xmi extends xmq {
    public final dcdc<xmp> a;
    public final dcdc<String> b;

    public xmi(dcdc<xmp> dcdcVar, dcdc<String> dcdcVar2) {
        this.a = dcdcVar;
        this.b = dcdcVar2;
    }

    @Override // defpackage.xmq
    public final dcdc<xmp> a() {
        return this.a;
    }

    @Override // defpackage.xmq
    public final dcdc<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xmq) {
            xmq xmqVar = (xmq) obj;
            if (dchl.m(this.a, xmqVar.a()) && dchl.m(this.b, xmqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("UpdateMetadata{vehicles=");
        sb.append(valueOf);
        sb.append(", removedVehicles=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
