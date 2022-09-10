package defpackage;
/* compiled from: PG */
/* renamed from: awvq  reason: default package */
/* loaded from: classes3.dex */
public final class awvq extends awwk {
    private final dcep<awvv<?>> a;
    private final int b;

    public awvq(int i, dcep<awvv<?>> dcepVar) {
        this.b = i;
        this.a = dcepVar;
    }

    @Override // defpackage.awwk
    public final dcep<awvv<?>> a() {
        return this.a;
    }

    @Override // defpackage.awwk
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awwk)) {
            return false;
        }
        awwk awwkVar = (awwk) obj;
        int i = this.b;
        int b = awwkVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a.equals(awwkVar.a());
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
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("PassiveAssistPrefetchOptions{prefetchType=");
        sb.append(valueOf);
        sb.append(", contentTypes=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
