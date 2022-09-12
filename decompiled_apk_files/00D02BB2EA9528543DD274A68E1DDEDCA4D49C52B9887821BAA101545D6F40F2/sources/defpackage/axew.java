package defpackage;
/* compiled from: PG */
/* renamed from: axew  reason: default package */
/* loaded from: classes3.dex */
final class axew extends axfk {
    private final dbsg<Integer> a;
    private final int b;

    public axew(int i, dbsg<Integer> dbsgVar) {
        this.b = i;
        if (dbsgVar != null) {
            this.a = dbsgVar;
            return;
        }
        throw new NullPointerException("Null count");
    }

    @Override // defpackage.axfk
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.axfk
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axfk) {
            axfk axfkVar = (axfk) obj;
            if (this.b == axfkVar.b() && this.a.equals(axfkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b != 1 ? "TERMINAL" : "VALID";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(valueOf).length());
        sb.append("CountValue{state=");
        sb.append(str);
        sb.append(", count=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
