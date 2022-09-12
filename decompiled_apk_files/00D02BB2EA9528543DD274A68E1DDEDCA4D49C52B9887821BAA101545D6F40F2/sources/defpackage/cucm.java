package defpackage;
/* compiled from: PG */
/* renamed from: cucm  reason: default package */
/* loaded from: classes5.dex */
final class cucm extends ctzk {
    private final String a;
    private final String b;

    public cucm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ctzk
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctzk
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctzk) {
            ctzk ctzkVar = (ctzk) obj;
            if (this.a.equals(ctzkVar.a()) && this.b.equals(ctzkVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(str2).length());
        sb.append("ReplyActionPayload{text=");
        sb.append(str);
        sb.append(", messageCallbackPayload=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
