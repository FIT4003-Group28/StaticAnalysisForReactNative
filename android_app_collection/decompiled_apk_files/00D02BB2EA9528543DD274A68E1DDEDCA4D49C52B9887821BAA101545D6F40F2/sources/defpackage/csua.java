package defpackage;
/* compiled from: PG */
/* renamed from: csua  reason: default package */
/* loaded from: classes5.dex */
final class csua extends csut {
    private final int a;

    public csua(int i) {
        this.a = i;
    }

    @Override // defpackage.csut
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csut)) {
            return false;
        }
        int i = this.a;
        if (i != ((csut) obj).a()) {
            z = false;
        }
        if (i == 0) {
            throw null;
        }
        return z;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? "null" : "FAILURE" : "SUCCESS";
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("UnregisterResult{status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
