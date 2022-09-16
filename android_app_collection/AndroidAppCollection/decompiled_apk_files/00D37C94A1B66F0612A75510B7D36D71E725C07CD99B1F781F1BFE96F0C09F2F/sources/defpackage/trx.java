package defpackage;
/* compiled from: PG */
/* renamed from: trx  reason: default package */
/* loaded from: classes4.dex */
public final class trx {
    public final boolean a;
    private final boolean b;
    private final boolean c;

    public trx() {
    }

    public trx(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.a = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trx) {
            trx trxVar = (trx) obj;
            if (this.b == trxVar.b && this.a == trxVar.a && this.c == trxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.a;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder(98);
        sb.append("ConstraintOverrides{requiresDeviceIdle=");
        sb.append(z);
        sb.append(", requiresCharging=");
        sb.append(z2);
        sb.append(", requiresBatteryNotLow=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
