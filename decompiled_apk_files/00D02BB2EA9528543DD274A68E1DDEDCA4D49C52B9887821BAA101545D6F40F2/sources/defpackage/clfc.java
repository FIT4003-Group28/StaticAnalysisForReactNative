package defpackage;
/* compiled from: PG */
/* renamed from: clfc  reason: default package */
/* loaded from: classes5.dex */
public final class clfc extends clfh {
    private final long a;
    private final int b;

    public clfc(int i, long j) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.clfh
    public final long a() {
        return this.a;
    }

    @Override // defpackage.clfh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clfh) {
            clfh clfhVar = (clfh) obj;
            if (this.b == clfhVar.b() && this.a == clfhVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        long j = this.a;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
        long j = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("BackendResponse{status=");
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
