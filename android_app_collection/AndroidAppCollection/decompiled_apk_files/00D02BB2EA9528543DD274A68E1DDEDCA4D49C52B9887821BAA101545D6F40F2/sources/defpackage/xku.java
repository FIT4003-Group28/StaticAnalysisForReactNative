package defpackage;
/* compiled from: PG */
/* renamed from: xku  reason: default package */
/* loaded from: classes7.dex */
final class xku extends xmf {
    public final ddda a;
    public final ddho b;
    public final ddho c;
    public final eaow d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public xku(ddda dddaVar, ddho ddhoVar, ddho ddhoVar2, int i, eaow eaowVar, boolean z, boolean z2) {
        if (dddaVar != null) {
            this.a = dddaVar;
            this.b = ddhoVar;
            this.c = ddhoVar2;
            this.g = i;
            this.d = eaowVar;
            this.e = z;
            this.f = z2;
            return;
        }
        throw new NullPointerException("Null vehicleRenderedRequestType");
    }

    @Override // defpackage.xmf
    public final ddda a() {
        return this.a;
    }

    @Override // defpackage.xmf
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.xmf
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.xmf
    public final eaow d() {
        return this.d;
    }

    @Override // defpackage.xmf
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xmf) {
            xmf xmfVar = (xmf) obj;
            if (this.a.equals(xmfVar.a()) && this.b.equals(xmfVar.b()) && this.c.equals(xmfVar.c()) && this.g == xmfVar.g() && this.d.equals(xmfVar.d()) && this.e == xmfVar.e() && this.f == xmfVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xmf
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.xmf
    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(Integer.toString(this.g - 1));
        String valueOf5 = String.valueOf(this.d);
        boolean z = this.e;
        boolean z2 = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 211 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("VehiclesRenderingConfig{vehicleRenderedRequestType=");
        sb.append(valueOf);
        sb.append(", vehicleVisibleVeType=");
        sb.append(valueOf2);
        sb.append(", vehicleCalloutVeType=");
        sb.append(valueOf3);
        sb.append(", displaySurface=");
        sb.append(valueOf4);
        sb.append(", maxVisiblePastDeparture=");
        sb.append(valueOf5);
        sb.append(", shouldHideVehiclesAtLowZoom=");
        sb.append(z);
        sb.append(", shouldAvoidStationPlacemark=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
