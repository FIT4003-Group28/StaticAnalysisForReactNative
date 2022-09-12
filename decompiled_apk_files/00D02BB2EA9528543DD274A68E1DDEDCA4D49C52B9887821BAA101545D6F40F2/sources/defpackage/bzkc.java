package defpackage;
/* compiled from: PG */
/* renamed from: bzkc  reason: default package */
/* loaded from: classes4.dex */
final class bzkc extends bzlf {
    private final String a;
    private final String b;

    public bzkc(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null skeleton24h");
        }
        throw new NullPointerException("Null skeleton12h");
    }

    @Override // defpackage.bzlf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bzlf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzlf) {
            bzlf bzlfVar = (bzlf) obj;
            if (this.a.equals(bzlfVar.a()) && this.b.equals(bzlfVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 42 + str2.length());
        sb.append("TimeFormatSpec{skeleton12h=");
        sb.append(str);
        sb.append(", skeleton24h=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
