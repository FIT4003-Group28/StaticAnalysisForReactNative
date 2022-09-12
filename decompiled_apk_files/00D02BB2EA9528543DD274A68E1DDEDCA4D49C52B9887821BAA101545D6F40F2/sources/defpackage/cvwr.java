package defpackage;
/* compiled from: PG */
/* renamed from: cvwr  reason: default package */
/* loaded from: classes5.dex */
public final class cvwr<AccountT> extends cvwn<AccountT> {
    private final cvwm<AccountT> a;
    private final m b;

    public cvwr(cvwm<AccountT> cvwmVar, m mVar) {
        if (cvwmVar != null) {
            this.a = cvwmVar;
            if (mVar != null) {
                this.b = mVar;
                return;
            }
            throw new NullPointerException("Null lifecycleOwner");
        }
        throw new NullPointerException("Null accountParticleCounter");
    }

    @Override // defpackage.cvwn
    public final cvwm<AccountT> a() {
        return this.a;
    }

    @Override // defpackage.cvwn
    public final m b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvwn) {
            cvwn cvwnVar = (cvwn) obj;
            if (this.a.equals(cvwnVar.a()) && this.b.equals(cvwnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82 + String.valueOf(valueOf2).length());
        sb.append("AccountParticleCounterWithLifecycleOwner{accountParticleCounter=");
        sb.append(valueOf);
        sb.append(", lifecycleOwner=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
