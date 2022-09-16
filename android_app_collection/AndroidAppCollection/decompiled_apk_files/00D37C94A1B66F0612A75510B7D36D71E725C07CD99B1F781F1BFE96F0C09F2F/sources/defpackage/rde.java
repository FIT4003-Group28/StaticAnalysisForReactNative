package defpackage;
/* compiled from: PG */
/* renamed from: rde  reason: default package */
/* loaded from: classes4.dex */
public final class rde {
    private final int a;

    public rde() {
    }

    public rde(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a == 1;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rde)) {
            return false;
        }
        int i = this.a;
        if (i != ((rde) obj).a) {
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
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DO_NOT_ENFORCE" : "UNKNOWN" : "NOT_SET" : "ENFORCE";
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(str);
        return sb.toString();
    }
}
