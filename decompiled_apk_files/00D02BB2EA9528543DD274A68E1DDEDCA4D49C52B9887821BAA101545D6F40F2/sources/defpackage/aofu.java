package defpackage;
/* compiled from: PG */
/* renamed from: aofu  reason: default package */
/* loaded from: classes2.dex */
public final class aofu extends aogl {
    private final dcdc<akqq> a;
    private final dcdc<aogk> b;

    public aofu(dcdc<akqq> dcdcVar, dcdc<aogk> dcdcVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dcdcVar2 != null) {
                this.b = dcdcVar2;
                return;
            }
            throw new NullPointerException("Null edges");
        }
        throw new NullPointerException("Null vertices");
    }

    @Override // defpackage.aogl
    public final dcdc<akqq> a() {
        return this.a;
    }

    @Override // defpackage.aogl
    public final dcdc<aogk> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogl) {
            aogl aoglVar = (aogl) obj;
            if (dchl.m(this.a, aoglVar.a()) && dchl.m(this.b, aoglVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("PolylineData{vertices=");
        sb.append(valueOf);
        sb.append(", edges=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
