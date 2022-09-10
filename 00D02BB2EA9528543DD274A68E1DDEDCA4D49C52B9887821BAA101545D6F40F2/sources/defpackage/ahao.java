package defpackage;
/* compiled from: PG */
/* renamed from: ahao  reason: default package */
/* loaded from: classes2.dex */
final class ahao extends ahdh {
    private final jic a;

    public ahao(jic jicVar) {
        this.a = jicVar;
    }

    @Override // defpackage.agwt
    public jic a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahdh)) {
            return false;
        }
        return this.a.equals(((ahdh) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ImageViewModelImpl{image=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
