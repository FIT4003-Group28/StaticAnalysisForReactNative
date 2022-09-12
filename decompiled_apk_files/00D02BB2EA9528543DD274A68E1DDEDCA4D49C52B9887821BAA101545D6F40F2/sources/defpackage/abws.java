package defpackage;
/* compiled from: PG */
/* renamed from: abws  reason: default package */
/* loaded from: classes2.dex */
class abws extends abxz {
    public final int a;

    public abws(int i) {
        this.a = i;
    }

    @Override // defpackage.abxz
    protected final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof abxz) && this.a == ((abxz) obj).c();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("DimensionProperty{value=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
