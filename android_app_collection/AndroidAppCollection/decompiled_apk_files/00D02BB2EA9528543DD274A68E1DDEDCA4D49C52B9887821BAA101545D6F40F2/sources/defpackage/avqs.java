package defpackage;
/* compiled from: PG */
/* renamed from: avqs  reason: default package */
/* loaded from: classes3.dex */
final class avqs extends avre {
    public final long a;

    public avqs(long j) {
        this.a = j;
    }

    @Override // defpackage.avre
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof avre) && this.a == ((avre) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("RetryAction{retryMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
