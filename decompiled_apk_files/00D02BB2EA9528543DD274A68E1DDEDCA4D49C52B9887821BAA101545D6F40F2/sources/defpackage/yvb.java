package defpackage;
/* compiled from: PG */
/* renamed from: yvb  reason: default package */
/* loaded from: classes7.dex */
public final class yvb extends yvi {
    private final dcdc<yvk> a;

    public yvb(dcdc<yvk> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.yvi
    public final dcdc<yvk> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yvi)) {
            return false;
        }
        return dchl.m(this.a, ((yvi) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Response{vehicles=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
