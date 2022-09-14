package defpackage;
/* compiled from: PG */
/* renamed from: bydd  reason: default package */
/* loaded from: classes4.dex */
final class bydd extends bydi {
    public final String a;
    private final String b;

    public bydd(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null dateDescription");
        }
        throw new NullPointerException("Null dateString");
    }

    @Override // defpackage.bydi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bydi
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bydi) {
            bydi bydiVar = (bydi) obj;
            if (this.a.equals(bydiVar.a()) && this.b.equals(bydiVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 50 + str2.length());
        sb.append("DateWithDescription{dateString=");
        sb.append(str);
        sb.append(", dateDescription=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
