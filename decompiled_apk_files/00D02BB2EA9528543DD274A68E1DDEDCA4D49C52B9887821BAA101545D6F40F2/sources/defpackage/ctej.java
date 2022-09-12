package defpackage;
/* compiled from: PG */
/* renamed from: ctej  reason: default package */
/* loaded from: classes5.dex */
final class ctej extends ctfh {
    private final dbsg<ctqu> a;
    private final int b;

    public ctej(int i, dbsg<ctqu> dbsgVar) {
        this.b = i;
        this.a = dbsgVar;
    }

    @Override // defpackage.ctfh
    public final dbsg<ctqu> a() {
        return this.a;
    }

    @Override // defpackage.ctfh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctfh)) {
            return false;
        }
        ctfh ctfhVar = (ctfh) obj;
        int i = this.b;
        int b = ctfhVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a.equals(ctfhVar.a());
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
        String str = i != 1 ? i != 2 ? "null" : "SUCCESS" : "UNSUPPORTED";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(valueOf).length());
        sb.append("GetProfileResult{status=");
        sb.append(str);
        sb.append(", profileInfo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
