package defpackage;
/* compiled from: PG */
/* renamed from: cuav  reason: default package */
/* loaded from: classes5.dex */
final class cuav extends cuax {
    private final cugq a;

    public cuav(cugq cugqVar) {
        this.a = cugqVar;
    }

    @Override // defpackage.cugr
    public final cugt a() {
        return cugt.OVERLAY;
    }

    @Override // defpackage.cuax, defpackage.cugr
    public final cugq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cugr) {
            cugr cugrVar = (cugr) obj;
            if (cugt.OVERLAY == cugrVar.a() && this.a.equals(cugrVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("RenderingDetails{overlay=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
