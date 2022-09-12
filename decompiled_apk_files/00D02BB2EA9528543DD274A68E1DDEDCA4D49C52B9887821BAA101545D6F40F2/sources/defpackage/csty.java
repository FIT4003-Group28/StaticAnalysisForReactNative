package defpackage;
/* compiled from: PG */
/* renamed from: csty  reason: default package */
/* loaded from: classes5.dex */
final class csty extends csur {
    private final int a;

    public csty(int i) {
        this.a = i;
    }

    @Override // defpackage.csur
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csur)) {
            return false;
        }
        int i = this.a;
        if (i != ((csur) obj).a()) {
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
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NEED_VERIFY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        StringBuilder sb = new StringBuilder(str.length() + 23);
        sb.append("RegisterResult{status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
