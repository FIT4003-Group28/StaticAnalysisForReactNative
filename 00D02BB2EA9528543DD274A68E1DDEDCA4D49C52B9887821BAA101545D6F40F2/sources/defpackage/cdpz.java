package defpackage;
/* compiled from: PG */
/* renamed from: cdpz  reason: default package */
/* loaded from: classes4.dex */
class cdpz extends cdqr {
    private final bvrt<dmas> a;

    public cdpz(bvrt<dmas> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.cdqr
    public final bvrt<dmas> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdqr)) {
            return false;
        }
        return this.a.equals(((cdqr) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("OtherUserPostInfo{otherUserPostInfoSerializable=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
