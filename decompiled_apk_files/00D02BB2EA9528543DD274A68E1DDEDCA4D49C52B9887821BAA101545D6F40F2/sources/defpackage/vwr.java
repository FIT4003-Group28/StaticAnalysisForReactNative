package defpackage;
/* compiled from: PG */
/* renamed from: vwr  reason: default package */
/* loaded from: classes7.dex */
public final class vwr extends vxt {
    public final dpbw a;
    public final boolean b;

    public vwr(dpbw dpbwVar, boolean z) {
        if (dpbwVar != null) {
            this.a = dpbwVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null realtimeStatus");
    }

    @Override // defpackage.vxt
    public final dpbw a() {
        return this.a;
    }

    @Override // defpackage.vxt
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxt) {
            vxt vxtVar = (vxt) obj;
            if (this.a.equals(vxtVar.a()) && this.b == vxtVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
        sb.append("RealtimeDataHolder{realtimeStatus=");
        sb.append(valueOf);
        sb.append(", hadRealtimeData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
