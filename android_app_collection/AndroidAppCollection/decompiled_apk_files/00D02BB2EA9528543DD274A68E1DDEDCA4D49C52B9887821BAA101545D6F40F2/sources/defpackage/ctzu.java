package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzu  reason: default package */
/* loaded from: classes5.dex */
public final class ctzu extends ctzz {
    private final ctzk a;

    public ctzu(ctzk ctzkVar) {
        this.a = ctzkVar;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.PREFILL_MESSAGE;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final ctzk c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.PREFILL_MESSAGE == ctzcVar.a() && this.a.equals(ctzcVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("ActionPayload{prefillMessage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
