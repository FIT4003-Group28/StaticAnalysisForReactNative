package defpackage;
/* compiled from: PG */
/* renamed from: bmwi  reason: default package */
/* loaded from: classes3.dex */
final class bmwi extends bmxa {
    private final dcdc<String> a;
    private final boolean b;

    public bmwi(dcdc<String> dcdcVar, boolean z) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null lines");
    }

    @Override // defpackage.bmxa
    public final dcdc<String> a() {
        return this.a;
    }

    @Override // defpackage.bmxa
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmxa) {
            bmxa bmxaVar = (bmxa) obj;
            if (dchl.m(this.a, bmxaVar.a()) && this.b == bmxaVar.b()) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("Label{lines=");
        sb.append(valueOf);
        sb.append(", isEmphasized=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
