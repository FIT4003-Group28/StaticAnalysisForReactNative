package defpackage;
/* compiled from: PG */
/* renamed from: avkk  reason: default package */
/* loaded from: classes3.dex */
public final class avkk extends avko {
    private final avkw a;

    public avkk(avkw avkwVar) {
        if (avkwVar != null) {
            this.a = avkwVar;
            return;
        }
        throw new NullPointerException("Null dynamicPaddingCoverageStateProto");
    }

    @Override // defpackage.avko
    public final avkw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avko)) {
            return false;
        }
        return this.a.equals(((avko) obj).a());
    }

    public final int hashCode() {
        avkw avkwVar = this.a;
        int i = avkwVar.bC;
        if (i == 0) {
            i = dsst.a.b(avkwVar).c(avkwVar);
            avkwVar.bC = i;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("DynamicPaddingCoverageState{dynamicPaddingCoverageStateProto=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
