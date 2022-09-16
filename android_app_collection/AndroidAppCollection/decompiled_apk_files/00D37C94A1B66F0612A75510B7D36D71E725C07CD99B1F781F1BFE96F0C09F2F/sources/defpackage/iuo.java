package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iuo  reason: default package */
/* loaded from: classes3.dex */
public final class iuo {
    public final ezx a;
    public final boolean b;
    public final assn c;

    public iuo() {
    }

    public iuo(ezx ezxVar, boolean z, assn assnVar) {
        this.a = ezxVar;
        this.b = z;
        this.c = assnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iun a() {
        iun iunVar = new iun();
        iunVar.c(ezx.NONE);
        iunVar.b(false);
        return iunVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iuo) {
            iuo iuoVar = (iuo) obj;
            if (this.a.equals(iuoVar.a) && this.b == iuoVar.b) {
                assn assnVar = this.c;
                assn assnVar2 = iuoVar.c;
                if (assnVar != null ? assnVar.equals(assnVar2) : assnVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        assn assnVar = this.c;
        return hashCode ^ (assnVar == null ? 0 : assnVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58 + String.valueOf(valueOf2).length());
        sb.append("Model{playerViewMode=");
        sb.append(valueOf);
        sb.append(", isEnabled=");
        sb.append(z);
        sb.append(", liveChatRenderer=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
