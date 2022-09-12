package defpackage;
/* compiled from: PG */
/* renamed from: amds  reason: default package */
/* loaded from: classes2.dex */
public final class amds extends amdw {
    private final boolean a;

    public amds(boolean z) {
        this.a = z;
    }

    @Override // defpackage.amdw
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof amdw) && this.a == ((amdw) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(31);
        sb.append("FifeAnnotation{zeroRated=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
