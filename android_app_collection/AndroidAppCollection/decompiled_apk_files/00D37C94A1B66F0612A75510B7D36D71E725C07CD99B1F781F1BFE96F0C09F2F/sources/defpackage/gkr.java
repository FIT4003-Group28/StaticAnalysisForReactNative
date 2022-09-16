package defpackage;
/* compiled from: PG */
/* renamed from: gkr  reason: default package */
/* loaded from: classes3.dex */
public final class gkr {
    public final ampq a;
    public final boolean b;

    public gkr(ampq ampqVar, boolean z) {
        if (ampqVar != null) {
            this.a = ampqVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null snapshot");
    }

    public static gkr a(ampq ampqVar, boolean z) {
        return new gkr(ampqVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkr) {
            gkr gkrVar = (gkr) obj;
            if (this.a.equals(gkrVar.a) && this.b == gkrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AsyncResolutionResult{snapshot=");
        sb.append(valueOf);
        sb.append(", shouldCompleteResolve=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public gkr() {
    }
}
