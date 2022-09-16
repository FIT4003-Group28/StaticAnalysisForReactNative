package defpackage;
/* compiled from: PG */
/* renamed from: cliv  reason: default package */
/* loaded from: classes5.dex */
final class cliv extends cljx {
    private final long a;

    public cliv(long j) {
        this.a = j;
    }

    @Override // defpackage.cljx
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cljx) && this.a == ((cljx) obj).a();
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(49);
        sb.append("DownloadResult{bytesWritten=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
