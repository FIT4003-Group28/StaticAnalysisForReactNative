package defpackage;
/* compiled from: PG */
/* renamed from: cvth  reason: default package */
/* loaded from: classes5.dex */
public final class cvth extends cvtn {
    private final boolean a;
    private final cvtm b;

    public cvth(boolean z, @dzsi cvtm cvtmVar) {
        this.a = z;
        this.b = cvtmVar;
    }

    @Override // defpackage.cvtn
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cvtn
    @dzsi
    public final cvtm b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        cvtm cvtmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvtn) {
            cvtn cvtnVar = (cvtn) obj;
            if (this.a == cvtnVar.a() && ((cvtmVar = this.b) != null ? cvtmVar.equals(cvtnVar.b()) : cvtnVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        cvtm cvtmVar = this.b;
        return i ^ (cvtmVar == null ? 0 : cvtmVar.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("InterceptionResult{isIntercepted=");
        sb.append(z);
        sb.append(", dropReason=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
