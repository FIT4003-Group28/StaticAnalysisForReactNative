package defpackage;
/* compiled from: PG */
/* renamed from: aumm  reason: default package */
/* loaded from: classes2.dex */
public final class aumm extends aumq {
    private final aumo a;
    private final aumo b;

    public aumm(aumo aumoVar, aumo aumoVar2) {
        if (aumoVar != null) {
            this.a = aumoVar;
            if (aumoVar2 != null) {
                this.b = aumoVar2;
                return;
            }
            throw new NullPointerException("Null notUsefulAction");
        }
        throw new NullPointerException("Null usefulAction");
    }

    @Override // defpackage.aumq
    public final aumo a() {
        return this.a;
    }

    @Override // defpackage.aumq
    public final aumo b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aumq) {
            aumq aumqVar = (aumq) obj;
            if (this.a.equals(aumqVar.a()) && this.b.equals(aumqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("NotificationInlineFeedbackActionPair{usefulAction=");
        sb.append(valueOf);
        sb.append(", notUsefulAction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
