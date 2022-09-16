package defpackage;
/* compiled from: PG */
/* renamed from: afxa  reason: default package */
/* loaded from: classes2.dex */
final class afxa extends afyd {
    private final String a;
    private final String b;

    public afxa(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null toLanguage");
        }
        throw new NullPointerException("Null fromLanguage");
    }

    @Override // defpackage.afyd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.afyd
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyd) {
            afyd afydVar = (afyd) obj;
            if (this.a.equals(afydVar.a()) && this.b.equals(afydVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 51 + str2.length());
        sb.append("LensTranslationMetadata{fromLanguage=");
        sb.append(str);
        sb.append(", toLanguage=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
