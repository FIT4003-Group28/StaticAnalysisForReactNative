package defpackage;
/* compiled from: PG */
/* renamed from: cdqa  reason: default package */
/* loaded from: classes4.dex */
class cdqa extends cdqs {
    private final bvrt<dmau> a;

    public cdqa(bvrt<dmau> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.cdqs
    public final bvrt<dmau> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdqs)) {
            return false;
        }
        return this.a.equals(((cdqs) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("OwnPostInfo{ownPostInfoSerializable=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
