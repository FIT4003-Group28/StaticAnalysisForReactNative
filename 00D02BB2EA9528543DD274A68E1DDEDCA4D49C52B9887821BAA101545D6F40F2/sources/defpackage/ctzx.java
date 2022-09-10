package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzx  reason: default package */
/* loaded from: classes5.dex */
public final class ctzx extends ctzz {
    private final cuif a;

    public ctzx(cuif cuifVar) {
        this.a = cuifVar;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.URL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.URL_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.j())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final cuif j() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("ActionPayload{urlAction=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
