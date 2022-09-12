package defpackage;
/* compiled from: PG */
/* renamed from: alci  reason: default package */
/* loaded from: classes2.dex */
public final class alci extends alcn {
    private final amtn a;
    private final boolean b;
    private final dgau c;

    public alci(amtn amtnVar, boolean z, dgau dgauVar) {
        if (amtnVar != null) {
            this.a = amtnVar;
            this.b = z;
            this.c = dgauVar;
            return;
        }
        throw new NullPointerException("Null landmark");
    }

    @Override // defpackage.alcn
    public final amtn a() {
        return this.a;
    }

    @Override // defpackage.alcn
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.alcn
    public final dgau c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alcn) {
            alcn alcnVar = (alcn) obj;
            if (this.a.equals(alcnVar.a()) && this.b == alcnVar.b() && this.c.equals(alcnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63 + String.valueOf(valueOf2).length());
        sb.append("LandmarkInfo{landmark=");
        sb.append(valueOf);
        sb.append(", isOnSelectedRoute=");
        sb.append(z);
        sb.append(", maneuverType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
