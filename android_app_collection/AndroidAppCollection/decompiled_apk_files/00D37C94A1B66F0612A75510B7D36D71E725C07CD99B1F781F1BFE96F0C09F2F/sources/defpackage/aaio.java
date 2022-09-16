package defpackage;
/* compiled from: PG */
/* renamed from: aaio  reason: default package */
/* loaded from: classes.dex */
final class aaio {
    public final String a;
    public final amvn b;
    private final String c;

    public aaio(String str, String str2, amvn amvnVar) {
        this.c = str;
        if (str2 != null) {
            this.a = str2;
            if (amvnVar != null) {
                this.b = amvnVar;
                return;
            }
            throw new NullPointerException("Null indexFingerprints");
        }
        throw new NullPointerException("Null rawCreateStatement");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aaio a(String str, String str2, amvn amvnVar) {
        return new aaio(str, str2, amvnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaio) {
            aaio aaioVar = (aaio) obj;
            if (this.c.equals(aaioVar.c) && this.a.equals(aaioVar.a) && this.b.equals(aaioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 69 + str2.length() + String.valueOf(valueOf).length());
        sb.append("TableFingerprint{tableName=");
        sb.append(str);
        sb.append(", rawCreateStatement=");
        sb.append(str2);
        sb.append(", indexFingerprints=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public aaio() {
    }
}
