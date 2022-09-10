package defpackage;
/* compiled from: PG */
/* renamed from: vwq  reason: default package */
/* loaded from: classes7.dex */
final class vwq extends vxf {
    public final amuq a;
    public final int b;

    public vwq(@dzsi amuq amuqVar, int i) {
        this.a = amuqVar;
        this.b = i;
    }

    @Override // defpackage.vxf
    @dzsi
    public final amuq a() {
        return this.a;
    }

    @Override // defpackage.vxf
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxf) {
            vxf vxfVar = (vxf) obj;
            amuq amuqVar = this.a;
            if (amuqVar != null ? amuqVar.equals(vxfVar.a()) : vxfVar.a() == null) {
                if (this.b == vxfVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        amuq amuqVar = this.a;
        return (((amuqVar == null ? 0 : amuqVar.hashCode()) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("StepGroupAndTransitIndex{stepGroup=");
        sb.append(valueOf);
        sb.append(", transitIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
