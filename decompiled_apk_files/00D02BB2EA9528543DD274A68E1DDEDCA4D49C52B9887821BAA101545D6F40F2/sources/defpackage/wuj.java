package defpackage;
/* compiled from: PG */
/* renamed from: wuj  reason: default package */
/* loaded from: classes7.dex */
final class wuj extends wus {
    private final String a;
    private final String b;

    public wuj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.wus
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wus
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wus) {
            wus wusVar = (wus) obj;
            if (this.a.equals(wusVar.a()) && this.b.equals(wusVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 30 + str2.length());
        sb.append("FareAnnotation{text=");
        sb.append(str);
        sb.append(", iconId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
