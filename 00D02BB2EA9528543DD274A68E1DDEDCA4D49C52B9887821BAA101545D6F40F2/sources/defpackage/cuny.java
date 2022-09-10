package defpackage;
/* compiled from: PG */
/* renamed from: cuny  reason: default package */
/* loaded from: classes5.dex */
final class cuny extends cunz {
    private final cuqf a;

    public cuny(cuqf cuqfVar) {
        this.a = cuqfVar;
    }

    @Override // defpackage.cupx
    public final cupw b() {
        return cupw.STANDALONE_CARD;
    }

    @Override // defpackage.cunz, defpackage.cupx
    public final cuqf d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cupx) {
            cupx cupxVar = (cupx) obj;
            if (cupw.STANDALONE_CARD == cupxVar.b() && this.a.equals(cupxVar.d())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("RichCard{standaloneCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
