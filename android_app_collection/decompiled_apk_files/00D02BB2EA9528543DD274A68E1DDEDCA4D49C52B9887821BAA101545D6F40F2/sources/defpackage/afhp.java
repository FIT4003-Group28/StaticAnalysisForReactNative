package defpackage;
/* compiled from: PG */
/* renamed from: afhp  reason: default package */
/* loaded from: classes2.dex */
public final class afhp extends afhu {
    public final afia a;

    public afhp(afia afiaVar) {
        this.a = afiaVar;
    }

    @Override // defpackage.afhu
    public final afia a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afhu)) {
            return false;
        }
        return this.a.equals(((afhu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("DirectionsIntentAction{action=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
