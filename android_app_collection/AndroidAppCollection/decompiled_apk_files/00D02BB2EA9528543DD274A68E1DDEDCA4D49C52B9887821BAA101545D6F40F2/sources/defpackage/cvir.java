package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvir  reason: default package */
/* loaded from: classes5.dex */
public final class cvir extends cviw {
    private final Throwable b;
    private final int c;

    public cvir(int i, @dzsi Throwable th) {
        this.c = i;
        this.b = th;
    }

    @Override // defpackage.cviw
    @dzsi
    public final Throwable a() {
        return this.b;
    }

    @Override // defpackage.cviw
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cviw)) {
            return false;
        }
        cviw cviwVar = (cviw) obj;
        int i = this.c;
        int b = cviwVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && ((th = this.b) != null ? th.equals(cviwVar.a()) : cviwVar.a() == null);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            int i2 = (i ^ 1000003) * 1000003;
            Throwable th = this.b;
            return i2 ^ (th == null ? 0 : th.hashCode());
        }
        throw null;
    }

    public final String toString() {
        int i = this.c;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS";
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(valueOf).length());
        sb.append("Result{code=");
        sb.append(str);
        sb.append(", error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
