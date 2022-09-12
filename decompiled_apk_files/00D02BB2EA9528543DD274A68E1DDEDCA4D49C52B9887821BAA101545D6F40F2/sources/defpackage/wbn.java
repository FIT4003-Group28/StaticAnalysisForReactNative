package defpackage;
/* compiled from: PG */
/* renamed from: wbn  reason: default package */
/* loaded from: classes7.dex */
final class wbn extends wbt {
    public final boolean a;
    public final int b;
    public final int c;

    public wbn(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.wbt
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.wbt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.wbt
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wbt) {
            wbt wbtVar = (wbt) obj;
            if (this.a == wbtVar.a() && this.b == wbtVar.b() && this.c == wbtVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String valueOf = String.valueOf(Integer.toString(this.c - 1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 99);
        sb.append("ParametersWrapper{enabledForDriving=");
        sb.append(z);
        sb.append(", originSnappingDistanceInMeters=");
        sb.append(i);
        sb.append(", buttonIcon=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
