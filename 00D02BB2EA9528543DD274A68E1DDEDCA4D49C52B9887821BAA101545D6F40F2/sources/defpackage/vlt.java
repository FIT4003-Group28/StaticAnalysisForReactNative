package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vlt  reason: default package */
/* loaded from: classes7.dex */
public final class vlt extends vow {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final dcdc<akqq> e;

    public vlt(boolean z, boolean z2, int i, int i2, dcdc<akqq> dcdcVar) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null vehiclePositionsToFrame");
    }

    @Override // defpackage.vow
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.vow
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.vow
    public final int c() {
        return this.c;
    }

    @Override // defpackage.vow
    public final int d() {
        return this.d;
    }

    @Override // defpackage.vow
    public final dcdc<akqq> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vow) {
            vow vowVar = (vow) obj;
            if (this.a == vowVar.a() && this.b == vowVar.b() && this.c == vowVar.c() && this.d == vowVar.d() && dchl.m(this.e, vowVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        int i2 = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 161);
        sb.append("ViewportUpdateType{shouldUpdateViewport=");
        sb.append(z);
        sb.append(", shouldFrameFullRoute=");
        sb.append(z2);
        sb.append(", framePathIndex=");
        sb.append(i);
        sb.append(", frameStepGroupIndex=");
        sb.append(i2);
        sb.append(", vehiclePositionsToFrame=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
