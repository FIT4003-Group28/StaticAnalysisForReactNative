package defpackage;
/* compiled from: PG */
/* renamed from: cril  reason: default package */
/* loaded from: classes5.dex */
public final class cril extends crip {
    private final dcdc<dqts> a;

    public cril(dcdc<dqts> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null dynamicClosures");
    }

    @Override // defpackage.crip
    public final dcdc<dqts> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof crip)) {
            return false;
        }
        return dchl.m(this.a, ((crip) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("DynamicClosureConfirmationEvent{dynamicClosures=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
