package defpackage;
/* compiled from: PG */
/* renamed from: uoe  reason: default package */
/* loaded from: classes4.dex */
public final class uoe {
    public final uok a;
    public final adtz b;

    public uoe() {
    }

    public uoe(adtz adtzVar, uok uokVar) {
        this.b = adtzVar;
        this.a = uokVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoe) {
            uoe uoeVar = (uoe) obj;
            if (this.b.equals(uoeVar.b) && this.a.equals(uoeVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length());
        sb.append("ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=");
        sb.append(valueOf);
        sb.append(", features=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
