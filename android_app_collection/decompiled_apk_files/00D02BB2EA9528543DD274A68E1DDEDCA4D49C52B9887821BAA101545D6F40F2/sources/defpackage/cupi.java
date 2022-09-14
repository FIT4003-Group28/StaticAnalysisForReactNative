package defpackage;
/* compiled from: PG */
/* renamed from: cupi  reason: default package */
/* loaded from: classes5.dex */
final class cupi extends cuqk {
    private final dcdc<cuqq> a;

    public cupi(dcdc<cuqq> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cuqk
    public final dcdc<cuqq> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuqk)) {
            return false;
        }
        return dchl.m(this.a, ((cuqk) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("StackComponent{elements=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
