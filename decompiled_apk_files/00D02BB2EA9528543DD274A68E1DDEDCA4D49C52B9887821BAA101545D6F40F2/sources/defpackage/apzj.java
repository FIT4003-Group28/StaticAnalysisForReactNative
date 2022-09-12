package defpackage;
/* compiled from: PG */
/* renamed from: apzj  reason: default package */
/* loaded from: classes2.dex */
public final class apzj extends apzn {
    public final boolean a;
    private final int b;
    private final int c;
    private final boolean d;

    public apzj(int i, boolean z, int i2, boolean z2) {
        this.b = i;
        this.a = z;
        this.c = i2;
        this.d = z2;
    }

    @Override // defpackage.apzn
    public final int a() {
        return this.b;
    }

    @Override // defpackage.apzn
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.apzn
    public final int c() {
        return this.c;
    }

    @Override // defpackage.apzn
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apzn) {
            apzn apznVar = (apzn) obj;
            if (this.b == apznVar.a() && this.a == apznVar.b() && this.c == apznVar.c() && this.d == apznVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.b ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.a;
        int i2 = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(141);
        sb.append("BusinessMessagingData{merchantMessagingState=");
        sb.append(i);
        sb.append(", notificationsEnabled=");
        sb.append(z);
        sb.append(", disableReason=");
        sb.append(i2);
        sb.append(", isReadReceiptsEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
