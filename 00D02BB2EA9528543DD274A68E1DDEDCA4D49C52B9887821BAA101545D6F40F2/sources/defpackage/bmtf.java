package defpackage;
/* compiled from: PG */
/* renamed from: bmtf  reason: default package */
/* loaded from: classes3.dex */
final class bmtf extends bmtl {
    private final dcdc<bmtr> a;
    private final boolean b;

    public bmtf(dcdc<bmtr> dcdcVar, boolean z) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null nonIncreasingSlots");
    }

    @Override // defpackage.bmtl
    public final dcdc<bmtr> a() {
        return this.a;
    }

    @Override // defpackage.bmtl
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmtl) {
            bmtl bmtlVar = (bmtl) obj;
            if (dchl.m(this.a, bmtlVar.a()) && this.b == bmtlVar.b()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("RectilinearPath{nonIncreasingSlots=");
        sb.append(valueOf);
        sb.append(", showDaysOfWeek=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
