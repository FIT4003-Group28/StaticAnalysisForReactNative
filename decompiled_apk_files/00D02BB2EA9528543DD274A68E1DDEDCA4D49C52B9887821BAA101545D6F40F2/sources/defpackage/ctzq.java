package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzq  reason: default package */
/* loaded from: classes5.dex */
public final class ctzq extends ctzz {
    private final String a;

    public ctzq(String str) {
        this.a = str;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.CALL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.CALL_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append("ActionPayload{callAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
