package defpackage;
/* compiled from: PG */
/* renamed from: ctef  reason: default package */
/* loaded from: classes5.dex */
public final class ctef extends ctfd {
    private final long a;
    private final int b;

    public ctef(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.ctfd
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ctfd
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfd) {
            ctfd ctfdVar = (ctfd) obj;
            if (this.a == ctfdVar.a()) {
                int i = this.b;
                int b = ctfdVar.b();
                if (i == 0) {
                    throw null;
                }
                if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = this.b;
        if (i2 != 0) {
            return i2 ^ i;
        }
        throw null;
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        String str = i != 1 ? i != 2 ? "null" : "SUCCESS" : "UNSUPPORTED";
        StringBuilder sb = new StringBuilder(str.length() + 69);
        sb.append("DeleteConversationResult{timestampUsec=");
        sb.append(j);
        sb.append(", status=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
