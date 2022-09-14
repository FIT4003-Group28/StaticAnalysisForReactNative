package defpackage;
/* compiled from: PG */
/* renamed from: awgs  reason: default package */
/* loaded from: classes3.dex */
final class awgs extends awhb {
    private final boolean a;
    private final long b;

    public awgs(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // defpackage.awhb
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.awhb
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awhb) {
            awhb awhbVar = (awhb) obj;
            if (this.a == awhbVar.a() && this.b == awhbVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        boolean z = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(70);
        sb.append("GetRegionSizeResult{accurateSize=");
        sb.append(z);
        sb.append(", sizeInMb=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
