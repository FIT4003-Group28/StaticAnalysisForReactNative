package defpackage;
/* compiled from: PG */
/* renamed from: cvdm  reason: default package */
/* loaded from: classes5.dex */
final class cvdm extends cvdq {
    private final cvcy a;

    public cvdm(cvcy cvcyVar) {
        this.a = cvcyVar;
    }

    @Override // defpackage.cved
    public final cvec b() {
        return cvec.RICH_CARD_BUBBLE;
    }

    @Override // defpackage.cvdq, defpackage.cved
    public final cvcy c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cved) {
            cved cvedVar = (cved) obj;
            if (cvec.RICH_CARD_BUBBLE == cvedVar.b() && this.a.equals(cvedVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("MessageListCellViewModel{richCardBubble=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
