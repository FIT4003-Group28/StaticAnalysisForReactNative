package defpackage;
/* compiled from: PG */
/* renamed from: uol  reason: default package */
/* loaded from: classes4.dex */
public final class uol {
    private final vgh a;

    public uol() {
    }

    public uol(vgh vghVar, byte[] bArr, byte[] bArr2) {
        this.a = vghVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uol)) {
            return false;
        }
        return this.a.equals(((uol) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("LogoViewFeature{logoViewInflater=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
