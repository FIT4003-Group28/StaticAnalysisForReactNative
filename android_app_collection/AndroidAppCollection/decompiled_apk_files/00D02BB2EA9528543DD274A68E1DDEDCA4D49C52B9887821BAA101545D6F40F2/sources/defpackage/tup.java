package defpackage;
/* compiled from: PG */
/* renamed from: tup  reason: default package */
/* loaded from: classes7.dex */
final class tup extends tuq {
    private final int a;
    private final boolean b;

    public tup(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tuq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.tuq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tuq) {
            tuq tuqVar = (tuq) obj;
            if (this.a == tuqVar.a() && this.b == tuqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(94);
        sb.append("ResultListLoggingParams{numberOfCardsAboveTheFold=");
        sb.append(i);
        sb.append(", isSheetExpandedByDefault=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
