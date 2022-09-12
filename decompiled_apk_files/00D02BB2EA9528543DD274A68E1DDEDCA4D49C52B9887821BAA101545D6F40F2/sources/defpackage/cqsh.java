package defpackage;
/* compiled from: PG */
/* renamed from: cqsh  reason: default package */
/* loaded from: classes5.dex */
public final class cqsh extends cqsm {
    public final CharSequence a;

    public cqsh(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.cqsm
    public final CharSequence b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cqsm)) {
            return false;
        }
        return this.a.equals(((cqsm) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("ConstantValue{charSequence=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
