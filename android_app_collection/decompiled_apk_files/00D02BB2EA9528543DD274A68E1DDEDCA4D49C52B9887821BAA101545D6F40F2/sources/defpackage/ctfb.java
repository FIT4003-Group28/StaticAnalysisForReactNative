package defpackage;
/* compiled from: PG */
/* renamed from: ctfb  reason: default package */
/* loaded from: classes5.dex */
public final class ctfb extends ctga {
    private final cuih a;

    public ctfb(cuih cuihVar) {
        this.a = cuihVar;
    }

    @Override // defpackage.ctga
    public final cuih a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctga)) {
            return false;
        }
        return this.a.equals(((ctga) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("SetUserPropertiesResult{userProperties=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
