package defpackage;
/* compiled from: PG */
/* renamed from: uog  reason: default package */
/* loaded from: classes4.dex */
public final class uog {
    public final amuk a;
    public final Runnable b;

    protected uog() {
    }

    public uog(amuk amukVar, Runnable runnable) {
        this.a = amukVar;
        this.b = runnable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uog) {
            uog uogVar = (uog) obj;
            if (amxp.v(this.a, uogVar.a) && this.b.equals(uogVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("CustomCancelableFeatureImpl{possibleCancelStringList=");
        sb.append(valueOf);
        sb.append(", onCancel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
