package defpackage;
/* compiled from: PG */
/* renamed from: alew  reason: default package */
/* loaded from: classes2.dex */
final class alew extends alfo {
    private final String a;
    private final Integer b;

    public alew(String str, Integer num) {
        if (str != null) {
            this.a = str;
            this.b = num;
            return;
        }
        throw new NullPointerException("Null iconUrl");
    }

    @Override // defpackage.alfo
    public final String a() {
        return this.a;
    }

    @Override // defpackage.alfo
    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alfo) {
            alfo alfoVar = (alfo) obj;
            if (this.a.equals(alfoVar.a()) && this.b.equals(alfoVar.b())) {
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
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 31 + String.valueOf(valueOf).length());
        sb.append("IconParameters{iconUrl=");
        sb.append(str);
        sb.append(", size=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
