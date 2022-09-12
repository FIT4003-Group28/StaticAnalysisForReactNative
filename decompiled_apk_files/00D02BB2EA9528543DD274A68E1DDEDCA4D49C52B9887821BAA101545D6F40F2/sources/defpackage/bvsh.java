package defpackage;
/* compiled from: PG */
/* renamed from: bvsh  reason: default package */
/* loaded from: classes4.dex */
final class bvsh extends bvsq {
    private final bvsp a;
    private final int b;

    public bvsh(bvsp bvspVar, int i) {
        if (bvspVar != null) {
            this.a = bvspVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null units");
    }

    @Override // defpackage.bvsq
    public final bvsp a() {
        return this.a;
    }

    @Override // defpackage.bvsq
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvsq) {
            bvsq bvsqVar = (bvsq) obj;
            if (this.a.equals(bvsqVar.a()) && this.b == bvsqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("RoundedDistance{units=");
        sb.append(valueOf);
        sb.append(", valueE3=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
