package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubn  reason: default package */
/* loaded from: classes5.dex */
public final class cubn extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.SUBSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.SUBSCRIPT == cuhqVar.b() && cuhqVar.j()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean j() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("TextStyle{subscript=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
