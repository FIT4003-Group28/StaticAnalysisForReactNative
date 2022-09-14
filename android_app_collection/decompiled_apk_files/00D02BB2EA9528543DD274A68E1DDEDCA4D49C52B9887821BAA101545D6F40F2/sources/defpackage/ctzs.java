package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzs  reason: default package */
/* loaded from: classes5.dex */
public final class ctzs extends ctzz {
    private final String a;

    public ctzs(String str) {
        this.a = str;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.CUSTOM_ACTION;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.CUSTOM_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 28);
        sb.append("ActionPayload{customAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
