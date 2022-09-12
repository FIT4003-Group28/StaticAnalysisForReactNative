package defpackage;
/* compiled from: PG */
/* renamed from: bzct  reason: default package */
/* loaded from: classes4.dex */
public final class bzct extends bzdf {
    private final bzdg b;
    private final String c;
    private final eaow d;
    private final boolean e;
    private final int f;
    private final double g;
    private final dowa h;

    public bzct(bzdg bzdgVar, String str, eaow eaowVar, boolean z, int i, double d, @dzsi dowa dowaVar) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            if (str != null) {
                this.c = str;
                this.d = eaowVar;
                this.e = z;
                this.f = i;
                this.g = d;
                this.h = dowaVar;
                return;
            }
            throw new NullPointerException("Null destinationText");
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    @Override // defpackage.bzdh
    public final String d() {
        return this.c;
    }

    @Override // defpackage.bzdh
    public final eaow e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dowa dowaVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzdf) {
            bzdf bzdfVar = (bzdf) obj;
            if (this.b.equals(bzdfVar.b()) && this.c.equals(bzdfVar.d()) && this.d.equals(bzdfVar.e()) && this.e == bzdfVar.o() && this.f == bzdfVar.f() && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(bzdfVar.g()) && ((dowaVar = this.h) != null ? dowaVar.equals(bzdfVar.h()) : bzdfVar.h() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzdf
    public final int f() {
        return this.f;
    }

    @Override // defpackage.bzdf
    public final double g() {
        return this.g;
    }

    @Override // defpackage.bzdf
    @dzsi
    public final dowa h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003;
        dowa dowaVar = this.h;
        return hashCode ^ (dowaVar == null ? 0 : dowaVar.hashCode());
    }

    @Override // defpackage.bzdh
    public final boolean o() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        boolean z = this.e;
        int i = this.f;
        double d = this.g;
        String valueOf3 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length + 197 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TravellingState{stage=");
        sb.append(valueOf);
        sb.append(", destinationText=");
        sb.append(str);
        sb.append(", remainingDuration=");
        sb.append(valueOf2);
        sb.append(", toFinalDestination=");
        sb.append(z);
        sb.append(", distanceRemainingMeters=");
        sb.append(i);
        sb.append(", totalMetersTraveled=");
        sb.append(d);
        sb.append(", recommendedDistanceUnits=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
