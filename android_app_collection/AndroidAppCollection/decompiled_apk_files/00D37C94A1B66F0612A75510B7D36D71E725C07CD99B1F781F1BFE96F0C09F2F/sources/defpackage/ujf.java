package defpackage;
/* compiled from: PG */
/* renamed from: ujf  reason: default package */
/* loaded from: classes4.dex */
public final class ujf {
    public final aoqu a;
    public final Throwable b;
    public final boolean c;

    public ujf() {
    }

    public ujf(aoqu aoquVar, Throwable th, boolean z) {
        this.a = aoquVar;
        this.b = th;
        this.c = z;
    }

    public static ujd a() {
        ujd ujdVar = new ujd();
        ujdVar.b(true);
        return ujdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujf) {
            ujf ujfVar = (ujf) obj;
            aoqu aoquVar = this.a;
            if (aoquVar != null ? aoquVar.equals(ujfVar.a) : ujfVar.a == null) {
                Throwable th = this.b;
                if (th != null ? th.equals(ujfVar.b) : ujfVar.b == null) {
                    if (this.c == ujfVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aoqu aoquVar = this.a;
        int i = 0;
        int hashCode = ((aoquVar == null ? 0 : aoquVar.hashCode()) ^ 1000003) * 1000003;
        Throwable th = this.b;
        if (th != null) {
            i = th.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59 + String.valueOf(valueOf2).length());
        sb.append("ChimeRpcResponse{response=");
        sb.append(valueOf);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
