package defpackage;
/* compiled from: PG */
/* renamed from: bkdk  reason: default package */
/* loaded from: classes3.dex */
final class bkdk extends bkel {
    private final CharSequence a;
    private final dgis b;

    public bkdk(CharSequence charSequence, dgis dgisVar) {
        if (charSequence != null) {
            this.a = charSequence;
            if (dgisVar != null) {
                this.b = dgisVar;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.bkel
    public final CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bkel
    public final dgis b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkel) {
            bkel bkelVar = (bkel) obj;
            if (this.a.equals(bkelVar.a()) && this.b.equals(bkelVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        dgis dgisVar = this.b;
        int i = dgisVar.bC;
        if (i == 0) {
            i = dsst.a.b(dgisVar).c(dgisVar);
            dgisVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(valueOf2).length());
        sb.append("SuggestedAnswer{text=");
        sb.append(valueOf);
        sb.append(", url=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
