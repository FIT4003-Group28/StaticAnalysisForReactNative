package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctzr  reason: default package */
/* loaded from: classes5.dex */
public final class ctzr extends ctzz {
    private final ctzi a;

    public ctzr(ctzi ctziVar) {
        this.a = ctziVar;
    }

    @Override // defpackage.ctzc
    public final ctzd a() {
        return ctzd.COMPOSED_OVERLAY_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzc) {
            ctzc ctzcVar = (ctzc) obj;
            if (ctzd.COMPOSED_OVERLAY_ACTION == ctzcVar.a() && this.a.equals(ctzcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctzz, defpackage.ctzc
    public final ctzi f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("ActionPayload{composedOverlayAction=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
