package defpackage;
/* compiled from: PG */
/* renamed from: axvu  reason: default package */
/* loaded from: classes3.dex */
final class axvu extends axwt {
    private final String b;
    private final boolean c;

    public axvu(String str, boolean z) {
        if (str != null) {
            this.b = str;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null gdprMessage");
    }

    @Override // defpackage.axwt
    public final String a() {
        return this.b;
    }

    @Override // defpackage.axwt
    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axwt) {
            axwt axwtVar = (axwt) obj;
            if (this.b.equals(axwtVar.a()) && this.c == axwtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 74);
        sb.append("PersonalPlacesGdprMessageValue{gdprMessage=");
        sb.append(str);
        sb.append(", gdprMessageIsAvailable=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
