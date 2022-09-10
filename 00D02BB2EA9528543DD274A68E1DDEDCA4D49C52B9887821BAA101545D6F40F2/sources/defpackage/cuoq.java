package defpackage;
/* compiled from: PG */
/* renamed from: cuoq  reason: default package */
/* loaded from: classes5.dex */
final class cuoq extends cupq {
    private final dcdc<cupp> a;

    public cuoq(dcdc<cupp> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cupq
    public final dcdc<cupp> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cupq)) {
            return false;
        }
        return dchl.m(this.a, ((cupq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("HorizontalLayoutButtons{verticalLayoutButtons=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
