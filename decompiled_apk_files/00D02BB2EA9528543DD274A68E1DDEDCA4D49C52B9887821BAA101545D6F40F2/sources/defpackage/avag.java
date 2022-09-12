package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avag  reason: default package */
/* loaded from: classes2.dex */
public final class avag extends avfa {
    public final avfb a;
    public final avzg b;

    public avag(avfb avfbVar, avzg avzgVar) {
        this.a = avfbVar;
        if (avzgVar != null) {
            this.b = avzgVar;
            return;
        }
        throw new NullPointerException("Null offlineInstanceInfo");
    }

    @Override // defpackage.avfa
    public final avfb a() {
        return this.a;
    }

    @Override // defpackage.avfa
    public final avzg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avfa) {
            avfa avfaVar = (avfa) obj;
            if (this.a.equals(avfaVar.a()) && this.b.equals(avfaVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("ActionTarget{lazyInfrastructure=");
        sb.append(valueOf);
        sb.append(", offlineInstanceInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
