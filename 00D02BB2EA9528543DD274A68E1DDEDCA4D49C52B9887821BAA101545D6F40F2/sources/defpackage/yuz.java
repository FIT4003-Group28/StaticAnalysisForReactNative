package defpackage;
/* compiled from: PG */
/* renamed from: yuz  reason: default package */
/* loaded from: classes7.dex */
public final class yuz extends yvg {
    public final dcdc<String> a;

    public yuz(dcdc<String> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.yvg
    public final dcdc<String> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yvg)) {
            return false;
        }
        return dchl.m(this.a, ((yvg) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Request{vehicleTokens=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
