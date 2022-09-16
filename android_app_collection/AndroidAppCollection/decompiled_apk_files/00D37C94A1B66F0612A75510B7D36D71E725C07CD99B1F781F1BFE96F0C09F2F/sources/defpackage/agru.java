package defpackage;
/* compiled from: PG */
/* renamed from: agru  reason: default package */
/* loaded from: classes.dex */
public final class agru {
    public static final agru a;
    public static final agru b;
    public static final agru c;
    private static final amuk g = amuk.q();
    public final boolean d;
    public final amuk e;
    public final int f;

    static {
        agrt a2 = a();
        a2.a = 2;
        a = a2.a();
        agrt a3 = a();
        a3.a = 3;
        a3.c(true);
        b = a3.a();
        agrt a4 = a();
        a4.a = 3;
        c = a4.a();
    }

    public agru() {
    }

    public agru(int i, boolean z, amuk amukVar) {
        this.f = i;
        this.d = z;
        this.e = amukVar;
    }

    public static agrt a() {
        agrt agrtVar = new agrt();
        agrtVar.c(false);
        agrtVar.b(g);
        return agrtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agru)) {
            return false;
        }
        agru agruVar = (agru) obj;
        int i = this.f;
        int i2 = agruVar.f;
        if (i == 0) {
            throw null;
        }
        return i == i2 && this.d == agruVar.d && amxp.v(this.e, agruVar.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return ((((i ^ 1000003) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.f;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        boolean z = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 87 + String.valueOf(valueOf).length());
        sb.append("EntityControllerResult{orchestrationActionResult=");
        sb.append(num);
        sb.append(", retryable=");
        sb.append(z);
        sb.append(", additionalActions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
