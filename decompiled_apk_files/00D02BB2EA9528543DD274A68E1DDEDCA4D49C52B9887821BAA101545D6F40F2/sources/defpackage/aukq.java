package defpackage;
/* compiled from: PG */
/* renamed from: aukq  reason: default package */
/* loaded from: classes2.dex */
final class aukq extends aulf {
    private final int a;
    private final String b;
    private final aulg c;

    public aukq(int i, String str, aulg aulgVar) {
        this.a = i;
        this.b = str;
        this.c = aulgVar;
    }

    @Override // defpackage.aulf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aulf
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aulf
    public final aulg c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aulf) {
            aulf aulfVar = (aulf) obj;
            if (this.a == aulfVar.a() && this.b.equals(aulfVar.b()) && this.c.equals(aulfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length());
        sb.append("NotificationAction{actionIndex=");
        sb.append(i);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", intent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
