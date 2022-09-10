package defpackage;
/* compiled from: PG */
/* renamed from: ksd  reason: default package */
/* loaded from: classes7.dex */
final class ksd extends ksk {
    private final amvh a;

    public ksd(amvh amvhVar) {
        if (amvhVar != null) {
            this.a = amvhVar;
            return;
        }
        throw new NullPointerException("Null waypoint");
    }

    @Override // defpackage.ksk
    public final amvh a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ksk)) {
            return false;
        }
        return this.a.equals(((ksk) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("DaisyChainPrefetchKey{waypoint=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
