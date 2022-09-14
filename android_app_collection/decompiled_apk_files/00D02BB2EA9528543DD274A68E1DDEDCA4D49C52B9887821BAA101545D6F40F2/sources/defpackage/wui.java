package defpackage;
/* compiled from: PG */
/* renamed from: wui  reason: default package */
/* loaded from: classes7.dex */
final class wui extends wur {
    private final String a;
    private final String b;

    public wui(@dzsi String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.wur
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wur
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wur) {
            wur wurVar = (wur) obj;
            String str = this.a;
            if (str != null ? str.equals(wurVar.a()) : wurVar.a() == null) {
                if (this.b.equals(wurVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + str2.length());
        sb.append("Category{name=");
        sb.append(str);
        sb.append(", iconUrl=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
