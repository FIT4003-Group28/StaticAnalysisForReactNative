package defpackage;
/* compiled from: PG */
/* renamed from: cvdo  reason: default package */
/* loaded from: classes5.dex */
final class cvdo extends cvdq {
    private final cvcy a;

    public cvdo(cvcy cvcyVar) {
        this.a = cvcyVar;
    }

    @Override // defpackage.cved
    public final cvec b() {
        return cvec.TOMBSTONE_BUBBLE;
    }

    @Override // defpackage.cvdq, defpackage.cved
    public final cvcy e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cved) {
            cved cvedVar = (cved) obj;
            if (cvec.TOMBSTONE_BUBBLE == cvedVar.b() && this.a.equals(cvedVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("MessageListCellViewModel{tombstoneBubble=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
