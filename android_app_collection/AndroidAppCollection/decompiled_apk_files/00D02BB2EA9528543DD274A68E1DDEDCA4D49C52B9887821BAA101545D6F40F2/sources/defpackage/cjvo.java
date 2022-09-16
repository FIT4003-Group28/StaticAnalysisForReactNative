package defpackage;
/* compiled from: PG */
/* renamed from: cjvo  reason: default package */
/* loaded from: classes4.dex */
final class cjvo extends cjvu {
    private final String a;
    private final cjtk b;

    public cjvo(String str, cjtk cjtkVar) {
        if (str != null) {
            this.a = str;
            if (cjtkVar != null) {
                this.b = cjtkVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null accountKey");
    }

    @Override // defpackage.cjvu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cjvu
    public final cjtk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjvu) {
            cjvu cjvuVar = (cjvu) obj;
            if (this.a.equals(cjvuVar.a()) && this.b.equals(cjvuVar.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 35 + String.valueOf(valueOf).length());
        sb.append("RecoveredEvent{accountKey=");
        sb.append(str);
        sb.append(", event=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
