package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubo  reason: default package */
/* loaded from: classes5.dex */
public final class cubo extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.SUPERSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.SUPERSCRIPT == cuhqVar.b() && cuhqVar.k()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean k() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("TextStyle{superscript=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
