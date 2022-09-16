package defpackage;
/* compiled from: PG */
/* renamed from: ufr  reason: default package */
/* loaded from: classes4.dex */
public final class ufr {
    public final aoqu a;
    public final aoqu b;
    public final Throwable c;
    public final boolean d;

    public ufr() {
    }

    public ufr(aoqu aoquVar, aoqu aoquVar2, Throwable th, boolean z) {
        this.a = aoquVar;
        this.b = aoquVar2;
        this.c = th;
        this.d = z;
    }

    public static ufr a(aoqu aoquVar, ujf ujfVar) {
        ufq c = c();
        c.a = aoquVar;
        c.b = ujfVar.a;
        c.c = ujfVar.b;
        c.b(ujfVar.c);
        return c.a();
    }

    public static ufq c() {
        ufq ufqVar = new ufq();
        ufqVar.b(true);
        return ufqVar;
    }

    public final boolean b() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufr) {
            ufr ufrVar = (ufr) obj;
            aoqu aoquVar = this.a;
            if (aoquVar != null ? aoquVar.equals(ufrVar.a) : ufrVar.a == null) {
                aoqu aoquVar2 = this.b;
                if (aoquVar2 != null ? aoquVar2.equals(ufrVar.b) : ufrVar.b == null) {
                    Throwable th = this.c;
                    if (th != null ? th.equals(ufrVar.c) : ufrVar.c == null) {
                        if (this.d == ufrVar.d) {
                            return true;
                        }
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
        aoqu aoquVar2 = this.b;
        int hashCode2 = (hashCode ^ (aoquVar2 == null ? 0 : aoquVar2.hashCode())) * 1000003;
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChimeRpc{request=");
        sb.append(valueOf);
        sb.append(", response=");
        sb.append(valueOf2);
        sb.append(", error=");
        sb.append(valueOf3);
        sb.append(", isRetryableError=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
