package defpackage;
/* compiled from: PG */
/* renamed from: bmub  reason: default package */
/* loaded from: classes3.dex */
final class bmub extends bmvc {
    private final bmug a;
    private final eapd b;
    private final int c;

    public bmub(bmug bmugVar, int i, eapd eapdVar) {
        this.a = bmugVar;
        this.c = i;
        this.b = eapdVar;
    }

    @Override // defpackage.bmvc
    public final bmug a() {
        return this.a;
    }

    @Override // defpackage.bmvc
    public final eapd b() {
        return this.b;
    }

    @Override // defpackage.bmvc
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmvc) {
            bmvc bmvcVar = (bmvc) obj;
            if (this.a.equals(bmvcVar.a()) && this.c == bmvcVar.c() && this.b.equals(bmvcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.c != 1 ? "NOT_HERE" : "I_AM_HERE";
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84 + str.length() + String.valueOf(valueOf2).length());
        sb.append("AtPlacePendingOperation{optimisticPlaceHistoryForRendering=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(str);
        sb.append(", userActionTime=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
