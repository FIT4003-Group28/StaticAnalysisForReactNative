package defpackage;
/* compiled from: PG */
/* renamed from: aaqq  reason: default package */
/* loaded from: classes.dex */
public final class aaqq {
    public zdt a;
    public zeb b;
    private ampt c;

    public final void b(ampt amptVar) {
        if (amptVar != null) {
            this.c = amptVar;
            return;
        }
        throw new NullPointerException("Null isErrorRetryable");
    }

    public final aaqr a() {
        zeb zebVar;
        ampt amptVar = this.c;
        if (amptVar == null || (zebVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" isErrorRetryable");
            }
            if (this.b == null) {
                sb.append(" exponentialBackoff");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aaqr(amptVar, this.a, zebVar);
    }
}
