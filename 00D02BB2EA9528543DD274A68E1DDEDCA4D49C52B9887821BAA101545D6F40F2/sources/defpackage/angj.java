package defpackage;
/* compiled from: PG */
/* renamed from: angj  reason: default package */
/* loaded from: classes2.dex */
final class angj extends anhf {
    private final dbsg<aoha> a;

    public angj(dbsg<aoha> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.anhf
    public final dbsg<aoha> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhf)) {
            return false;
        }
        return this.a.equals(((anhf) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("SegmentAddingResult{segmentIdentifier=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
