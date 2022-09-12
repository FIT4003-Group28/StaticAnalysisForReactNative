package defpackage;
/* compiled from: PG */
/* renamed from: dyj  reason: default package */
/* loaded from: classes6.dex */
final class dyj extends dyf {
    private final dxr a;
    private final dxr b;
    private final dye c;
    private final dcep<dfmg> d;

    public dyj(dxr dxrVar, dxr dxrVar2, dye dyeVar, dcep<dfmg> dcepVar) {
        this.a = dxrVar;
        this.b = dxrVar2;
        this.c = dyeVar;
        this.d = dcepVar;
    }

    @Override // defpackage.dyf
    public final dxr a() {
        return this.a;
    }

    @Override // defpackage.dyf
    public final dxr b() {
        return this.b;
    }

    @Override // defpackage.dyf
    public final dye c() {
        return this.c;
    }

    @Override // defpackage.dyf
    public final dcep<dfmg> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyf) {
            dyf dyfVar = (dyf) obj;
            if (this.a.equals(dyfVar.a()) && this.b.equals(dyfVar.b()) && this.c.equals(dyfVar.c()) && this.d.equals(dyfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 80 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ArVenueState{current=");
        sb.append(valueOf);
        sb.append(", destination=");
        sb.append(valueOf2);
        sb.append(", transitionType=");
        sb.append(valueOf3);
        sb.append(", closestLevelChangePoints=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
