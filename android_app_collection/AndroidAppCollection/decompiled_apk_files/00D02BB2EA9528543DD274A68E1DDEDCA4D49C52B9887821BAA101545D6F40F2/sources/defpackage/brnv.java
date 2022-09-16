package defpackage;
/* compiled from: PG */
/* renamed from: brnv  reason: default package */
/* loaded from: classes4.dex */
final class brnv extends brob {
    private final int b;
    private final int c;

    public brnv(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    @Override // defpackage.brob
    public final int a() {
        return this.b;
    }

    @Override // defpackage.brob
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brob) {
            brob brobVar = (brob) obj;
            if (this.c == brobVar.b() && this.b == brobVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "HAS_VISIBLE_FULLY_FETCHED" : "HAS_VISIBLE_MOSTLY_FETCHED" : "HAS_VISIBLE_PARTIALLY_FETCHED" : "HAS_VISIBLE_NON_FETCHED" : "NO_VISIBLE" : "PENDING";
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 58);
        sb.append("StreamingResultsCacheState{name=");
        sb.append(str);
        sb.append(", resultsHash=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
