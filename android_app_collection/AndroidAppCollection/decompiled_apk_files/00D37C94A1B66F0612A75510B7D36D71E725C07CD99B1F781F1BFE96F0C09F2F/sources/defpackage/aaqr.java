package defpackage;
/* compiled from: PG */
/* renamed from: aaqr  reason: default package */
/* loaded from: classes.dex */
public final class aaqr {
    private static final zea d = new zea(100, 10000, 3);
    private static final ampt e = zto.f;
    public final ampt a;
    public final zdt b;
    public final zeb c;

    public aaqr() {
    }

    public aaqr(ampt amptVar, zdt zdtVar, zeb zebVar) {
        this.a = amptVar;
        this.b = zdtVar;
        this.c = zebVar;
    }

    public static aaqq a(zdz zdzVar) {
        aaqq aaqqVar = new aaqq();
        aaqqVar.b = zdzVar.b(d);
        aaqqVar.b(e);
        return aaqqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        zdt zdtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaqr) {
            aaqr aaqrVar = (aaqr) obj;
            if (this.a.equals(aaqrVar.a) && ((zdtVar = this.b) != null ? zdtVar.equals(aaqrVar.b) : aaqrVar.b == null) && this.c.equals(aaqrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        zdt zdtVar = this.b;
        return ((hashCode ^ (zdtVar == null ? 0 : zdtVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("InnerTubeRetryPolicy{isErrorRetryable=");
        sb.append(valueOf);
        sb.append(", uriMutator=");
        sb.append(valueOf2);
        sb.append(", exponentialBackoff=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
