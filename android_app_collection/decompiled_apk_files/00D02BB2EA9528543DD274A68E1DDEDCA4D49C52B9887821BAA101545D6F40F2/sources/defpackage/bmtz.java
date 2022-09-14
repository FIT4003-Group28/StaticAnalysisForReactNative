package defpackage;
/* compiled from: PG */
/* renamed from: bmtz  reason: default package */
/* loaded from: classes3.dex */
final class bmtz extends bmum {
    private final int a;
    private final eapg b;

    public bmtz(int i, eapg eapgVar) {
        this.a = i;
        if (eapgVar != null) {
            this.b = eapgVar;
            return;
        }
        throw new NullPointerException("Null colloquialDay");
    }

    @Override // defpackage.bmum
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bmum
    public final eapg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmum) {
            bmum bmumVar = (bmum) obj;
            if (this.a == bmumVar.a() && this.b.equals(bmumVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
        sb.append("DayWithVisitIndex{visitIndex=");
        sb.append(i);
        sb.append(", colloquialDay=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
