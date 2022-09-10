package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubr  reason: default package */
/* loaded from: classes5.dex */
public final class cubr extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.UNKNOWN == cuhqVar.b() && cuhqVar.n()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean n() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(24);
        sb.append("TextStyle{unknown=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
