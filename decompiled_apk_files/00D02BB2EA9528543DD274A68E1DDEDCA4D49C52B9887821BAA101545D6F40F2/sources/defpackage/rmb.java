package defpackage;
/* compiled from: PG */
/* renamed from: rmb  reason: default package */
/* loaded from: classes7.dex */
public final class rmb extends roi {
    private final sbe a;
    private final int b;

    public rmb(sbe sbeVar, int i) {
        this.a = sbeVar;
        this.b = i;
    }

    @Override // defpackage.roi
    public final sbe a() {
        return this.a;
    }

    @Override // defpackage.roi
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof roi) {
            roi roiVar = (roi) obj;
            if (this.a.equals(roiVar.a()) && this.b == roiVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
        sb.append("FragmentResult{route=");
        sb.append(valueOf);
        sb.append(", legIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
