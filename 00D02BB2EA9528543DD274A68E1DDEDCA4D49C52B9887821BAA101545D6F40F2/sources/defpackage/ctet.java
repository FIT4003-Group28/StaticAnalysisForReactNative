package defpackage;
/* compiled from: PG */
/* renamed from: ctet  reason: default package */
/* loaded from: classes5.dex */
final class ctet extends ctfr {
    private final dbsg<ctrg> a;
    private final dbsg<String> b;

    public ctet(dbsg<ctrg> dbsgVar, dbsg<String> dbsgVar2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
    }

    @Override // defpackage.ctfr
    public final dbsg<ctrg> a() {
        return this.a;
    }

    @Override // defpackage.ctfr
    public final dbsg<String> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfr) {
            ctfr ctfrVar = (ctfr) obj;
            if (this.a.equals(ctfrVar.a()) && this.b.equals(ctfrVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("ReceiveMessagesResult{tachyonMessage=");
        sb.append(valueOf);
        sb.append(", ackId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
