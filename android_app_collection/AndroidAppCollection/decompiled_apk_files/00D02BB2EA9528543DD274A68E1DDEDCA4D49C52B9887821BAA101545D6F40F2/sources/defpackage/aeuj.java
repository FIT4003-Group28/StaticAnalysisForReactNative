package defpackage;
/* compiled from: PG */
/* renamed from: aeuj  reason: default package */
/* loaded from: classes2.dex */
final class aeuj extends aeuk {
    private final String a;
    private final String b;
    private final String c;

    public aeuj(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null locationPlusCode");
            }
            throw new NullPointerException("Null address");
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.aeuk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aeuk
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aeuk
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeuk) {
            aeuk aeukVar = (aeuk) obj;
            if (this.a.equals(aeukVar.a()) && this.b.equals(aeukVar.b()) && this.c.equals(aeukVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 52 + str2.length() + str3.length());
        sb.append("RevealedLocation{name=");
        sb.append(str);
        sb.append(", address=");
        sb.append(str2);
        sb.append(", locationPlusCode=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
