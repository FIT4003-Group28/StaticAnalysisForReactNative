package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzv  reason: default package */
/* loaded from: classes5.dex */
public final class ctzv extends ctzz {
    private final ctzk a;

    public ctzv(ctzk ctzkVar) {
        this.a = ctzkVar;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.SEND_MESSAGE;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final ctzk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.SEND_MESSAGE == ctzcVar.a() && this.a.equals(ctzcVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("ActionPayload{sendMessage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
