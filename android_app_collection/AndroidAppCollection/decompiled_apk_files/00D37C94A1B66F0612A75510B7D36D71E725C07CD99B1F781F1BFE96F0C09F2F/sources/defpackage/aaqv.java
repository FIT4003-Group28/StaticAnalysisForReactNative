package defpackage;
/* compiled from: PG */
/* renamed from: aaqv  reason: default package */
/* loaded from: classes.dex */
public final class aaqv {
    public final int a;
    public final amuk b;

    public aaqv() {
    }

    public aaqv(int i, amuk amukVar) {
        this.a = i;
        this.b = amukVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaqv) {
            aaqv aaqvVar = (aaqv) obj;
            if (this.a == aaqvVar.a && amxp.v(this.b, aaqvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
        sb.append("NetworkErrorResponseInfo{rpcStatusCode=");
        sb.append(i);
        sb.append(", rpcTypeUrls=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
