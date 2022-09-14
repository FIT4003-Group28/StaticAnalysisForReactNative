package defpackage;
/* compiled from: PG */
/* renamed from: bvgv  reason: default package */
/* loaded from: classes4.dex */
final class bvgv extends bvho {
    private final cqtc a;
    private final boolean b;

    public bvgv(cqtc cqtcVar, boolean z) {
        this.a = cqtcVar;
        this.b = z;
    }

    @Override // defpackage.bvho
    public final cqtc a() {
        return this.a;
    }

    @Override // defpackage.bvho
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvho) {
            bvho bvhoVar = (bvho) obj;
            if (this.a.equals(bvhoVar.a()) && this.b == bvhoVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("Options{layoutHeightDimension=");
        sb.append(valueOf);
        sb.append(", fillParentHeight=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
