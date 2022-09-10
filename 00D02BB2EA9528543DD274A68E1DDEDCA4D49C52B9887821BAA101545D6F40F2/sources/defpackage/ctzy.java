package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzy  reason: default package */
/* loaded from: classes5.dex */
public final class ctzy extends ctzz {
    private final String a;

    public ctzy(String str) {
        this.a = str;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.WEB_ACTION;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.WEB_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.e())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("ActionPayload{webAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
