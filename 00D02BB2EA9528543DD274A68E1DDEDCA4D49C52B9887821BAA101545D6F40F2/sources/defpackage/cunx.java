package defpackage;
/* compiled from: PG */
/* renamed from: cunx  reason: default package */
/* loaded from: classes5.dex */
final class cunx extends cunz {
    private final cuqd a;

    public cunx(cuqd cuqdVar) {
        this.a = cuqdVar;
    }

    @Override // defpackage.cupx
    public final cupw b() {
        return cupw.STACK_CARD;
    }

    @Override // defpackage.cunz, defpackage.cupx
    public final cuqd c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cupx) {
            cupx cupxVar = (cupx) obj;
            if (cupw.STACK_CARD == cupxVar.b() && this.a.equals(cupxVar.c())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("RichCard{stackCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
