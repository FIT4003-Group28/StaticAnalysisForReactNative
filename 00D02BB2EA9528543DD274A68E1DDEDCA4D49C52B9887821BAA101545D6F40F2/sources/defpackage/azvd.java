package defpackage;
/* compiled from: PG */
/* renamed from: azvd  reason: default package */
/* loaded from: classes3.dex */
public final class azvd extends azvc {
    public final azva a;
    public final azxa b;
    private final azvb c;

    public azvd(azvb azvbVar, @dzsi azva azvaVar, @dzsi azxa azxaVar) {
        if (azvbVar != null) {
            this.c = azvbVar;
            this.a = azvaVar;
            this.b = azxaVar;
            return;
        }
        throw new NullPointerException("Null operation");
    }

    @Override // defpackage.azvc
    public final azvb a() {
        return this.c;
    }

    @Override // defpackage.azvc
    @dzsi
    @Deprecated
    public final azva b() {
        return this.a;
    }

    @Override // defpackage.azvc
    @dzsi
    public final azxa c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azvc) {
            azvc azvcVar = (azvc) obj;
            if (this.c.equals(azvcVar.a()) && this.a.equals(azvcVar.b()) && this.b.equals(azvcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AliasUpdateResult{operation=");
        sb.append(valueOf);
        sb.append(", alias=");
        sb.append(valueOf2);
        sb.append(", placeAlias=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
