package defpackage;
/* compiled from: PG */
/* renamed from: zog  reason: default package */
/* loaded from: classes4.dex */
final class zog extends zpk {
    private final ampq a;
    private final ampq b;

    public zog(ampq ampqVar, ampq ampqVar2) {
        this.a = ampqVar;
        this.b = ampqVar2;
    }

    @Override // defpackage.zpk
    public ampq a() {
        return this.a;
    }

    @Override // defpackage.zpk
    public ampq b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpk) {
            zpk zpkVar = (zpk) obj;
            if (this.a.equals(zpkVar.a()) && this.b.equals(zpkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + String.valueOf(valueOf2).length());
        sb.append("SavedStateEvent{stateEvent=");
        sb.append(valueOf);
        sb.append(", stateEventFile=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
