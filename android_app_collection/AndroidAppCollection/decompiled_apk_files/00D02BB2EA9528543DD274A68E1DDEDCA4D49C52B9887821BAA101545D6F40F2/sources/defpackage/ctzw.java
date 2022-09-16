package defpackage;
/* compiled from: PG */
/* renamed from: ctzw  reason: default package */
/* loaded from: classes5.dex */
final class ctzw extends ctzz {
    private final String a;

    public ctzw(String str) {
        this.a = str;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.TOMBSTONE_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.TOMBSTONE_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.i())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final String i() {
        return this.a;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 31);
        sb.append("ActionPayload{tombstoneAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
