package defpackage;
/* compiled from: PG */
/* renamed from: auec  reason: default package */
/* loaded from: classes2.dex */
public final class auec extends auei {
    public final String a;
    public final String b;

    public auec(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null darkSvgUrl");
        }
        throw new NullPointerException("Null lightSvgUrl");
    }

    @Override // defpackage.auei
    public final String a() {
        return this.a;
    }

    @Override // defpackage.auei
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auei) {
            auei aueiVar = (auei) obj;
            if (this.a.equals(aueiVar.a()) && this.b.equals(aueiVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
        sb.append("IconUrl{lightSvgUrl=");
        sb.append(str);
        sb.append(", darkSvgUrl=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
