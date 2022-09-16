package defpackage;
/* compiled from: PG */
/* renamed from: cldt  reason: default package */
/* loaded from: classes5.dex */
public final class cldt extends clee {
    public final long a;

    public cldt(long j) {
        this.a = j;
    }

    @Override // defpackage.clee
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof clee) && this.a == ((clee) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("LogResponse{nextRequestWaitMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
