package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cubk  reason: default package */
/* loaded from: classes5.dex */
public final class cubk extends cubs {
    @Override // defpackage.cuhq
    public final cuhs b() {
        return cuhs.ITALIC;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cuhq) {
            cuhq cuhqVar = (cuhq) obj;
            if (cuhs.ITALIC == cuhqVar.b() && cuhqVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cubs, defpackage.cuhq
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(23);
        sb.append("TextStyle{italic=");
        sb.append(true);
        sb.append("}");
        return sb.toString();
    }
}
