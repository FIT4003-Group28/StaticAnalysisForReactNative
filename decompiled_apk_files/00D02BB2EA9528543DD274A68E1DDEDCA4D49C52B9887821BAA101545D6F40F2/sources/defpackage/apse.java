package defpackage;
/* compiled from: PG */
/* renamed from: apse  reason: default package */
/* loaded from: classes2.dex */
final class apse<T> extends apsi<T> {
    private final T a;
    private final int b;

    public apse(int i, T t) {
        this.b = i;
        this.a = t;
    }

    @Override // defpackage.apsi
    public final T a() {
        return this.a;
    }

    @Override // defpackage.apsi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof apsi)) {
            return false;
        }
        apsi apsiVar = (apsi) obj;
        int i = this.b;
        int b = apsiVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a.equals(apsiVar.a());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "FRESH" : "STALE_FAILURE" : "STALE_PENDING";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 25 + String.valueOf(valueOf).length());
        sb.append("Resource{status=");
        sb.append(str);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
