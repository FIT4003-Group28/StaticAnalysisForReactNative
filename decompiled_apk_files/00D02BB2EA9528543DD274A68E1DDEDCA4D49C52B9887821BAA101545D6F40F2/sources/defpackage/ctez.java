package defpackage;
/* compiled from: PG */
/* renamed from: ctez  reason: default package */
/* loaded from: classes5.dex */
public final class ctez extends ctfy {
    private final dbsg<Long> a;
    private final int b;

    public ctez(int i, dbsg<Long> dbsgVar) {
        this.b = i;
        this.a = dbsgVar;
    }

    @Override // defpackage.ctfy
    public final dbsg<Long> a() {
        return this.a;
    }

    @Override // defpackage.ctfy
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctfy)) {
            return false;
        }
        ctfy ctfyVar = (ctfy) obj;
        int i = this.b;
        int b = ctfyVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a.equals(ctfyVar.a());
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
        String str = i != 1 ? i != 2 ? "null" : "SUCCESS" : "UNKNOWN";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 44 + String.valueOf(valueOf).length());
        sb.append("SendMessageResult{status=");
        sb.append(str);
        sb.append(", serverTimestamp=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
