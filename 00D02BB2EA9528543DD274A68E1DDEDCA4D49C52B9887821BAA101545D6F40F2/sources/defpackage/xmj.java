package defpackage;
/* compiled from: PG */
/* renamed from: xmj  reason: default package */
/* loaded from: classes7.dex */
public final class xmj extends xmp {
    private final xmx a;
    private final boolean b;
    private final boolean c;

    public xmj(xmx xmxVar, boolean z, boolean z2) {
        if (xmxVar != null) {
            this.a = xmxVar;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null viewModel");
    }

    @Override // defpackage.xmp
    public final xmx a() {
        return this.a;
    }

    @Override // defpackage.xmp
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.xmp
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xmp) {
            xmp xmpVar = (xmp) obj;
            if (this.a.equals(xmpVar.a()) && this.b == xmpVar.b() && this.c == xmpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("VehicleUpdate{viewModel=");
        sb.append(valueOf);
        sb.append(", isRendered=");
        sb.append(z);
        sb.append(", isImpressed=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
