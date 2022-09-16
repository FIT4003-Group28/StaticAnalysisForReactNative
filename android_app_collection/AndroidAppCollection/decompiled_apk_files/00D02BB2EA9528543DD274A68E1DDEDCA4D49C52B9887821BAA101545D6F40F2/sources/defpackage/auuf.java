package defpackage;
/* compiled from: PG */
/* renamed from: auuf  reason: default package */
/* loaded from: classes2.dex */
final class auuf extends auuh {
    private final String a;
    private final int b;

    public auuf(@dzsi String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.auuh
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.auuh
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auuh) {
            auuh auuhVar = (auuh) obj;
            String str = this.a;
            if (str != null ? str.equals(auuhVar.a()) : auuhVar.a() == null) {
                if (this.b == auuhVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("StatusKey{tag=");
        sb.append(str);
        sb.append(", id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
