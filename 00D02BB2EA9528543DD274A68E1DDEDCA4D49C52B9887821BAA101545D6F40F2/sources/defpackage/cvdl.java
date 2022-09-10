package defpackage;
/* compiled from: PG */
/* renamed from: cvdl  reason: default package */
/* loaded from: classes5.dex */
final class cvdl extends cvdq {
    private final cvcy a;

    public cvdl(cvcy cvcyVar) {
        this.a = cvcyVar;
    }

    @Override // defpackage.cvdq, defpackage.cved
    public final cvcy a() {
        return this.a;
    }

    @Override // defpackage.cved
    public final cvec b() {
        return cvec.MESSAGE_BUBBLE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cved) {
            cved cvedVar = (cved) obj;
            if (cvec.MESSAGE_BUBBLE == cvedVar.b() && this.a.equals(cvedVar.a())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("MessageListCellViewModel{messageBubble=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
