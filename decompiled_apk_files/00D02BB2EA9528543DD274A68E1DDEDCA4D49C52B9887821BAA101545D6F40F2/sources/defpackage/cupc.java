package defpackage;
/* compiled from: PG */
/* renamed from: cupc  reason: default package */
/* loaded from: classes5.dex */
final class cupc extends cuqd {
    private final dcdc<cuql> a;

    public cupc(dcdc<cuql> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cuqd
    public final dcdc<cuql> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuqd)) {
            return false;
        }
        return dchl.m(this.a, ((cuqd) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("StackCard{components=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
