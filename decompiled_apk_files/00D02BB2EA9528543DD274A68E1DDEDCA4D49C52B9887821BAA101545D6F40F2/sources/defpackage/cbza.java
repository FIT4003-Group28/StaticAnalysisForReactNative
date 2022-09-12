package defpackage;
/* compiled from: PG */
/* renamed from: cbza  reason: default package */
/* loaded from: classes4.dex */
final class cbza extends cbzc {
    private final String a;
    private final Boolean b;

    public cbza(@dzsi String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    @Override // defpackage.cbzc
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cbzc
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbzc) {
            cbzc cbzcVar = (cbzc) obj;
            String str = this.a;
            if (str != null ? str.equals(cbzcVar.a()) : cbzcVar.a() == null) {
                if (this.b.equals(cbzcVar.b())) {
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
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(valueOf).length());
        sb.append("HashtagSearchOptions{parentEventId=");
        sb.append(str);
        sb.append(", clearBackStack=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
