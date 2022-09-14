package defpackage;
/* compiled from: PG */
/* renamed from: amsk  reason: default package */
/* loaded from: classes2.dex */
final class amsk extends amsi {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public amsk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.amsi
    public final int a() {
        return this.a;
    }

    @Override // defpackage.amsi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.amsi
    public final int c() {
        return this.c;
    }

    @Override // defpackage.amsi
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amsi) {
            amsi amsiVar = (amsi) obj;
            if (this.a == amsiVar.a() && this.b == amsiVar.b() && this.c == amsiVar.c() && this.d == amsiVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(129);
        sb.append("AssistedDrivingInterval{offsetMeters=");
        sb.append(i);
        sb.append(", offsetSeconds=");
        sb.append(i2);
        sb.append(", lengthMeters=");
        sb.append(i3);
        sb.append(", lengthSeconds=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
