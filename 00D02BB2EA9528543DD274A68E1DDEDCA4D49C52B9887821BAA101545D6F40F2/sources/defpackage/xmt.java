package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: xmt  reason: default package */
/* loaded from: classes7.dex */
final class xmt extends xmw {
    private final int a;
    private final akrk b;
    private final dcdc<drij> c;
    private final akrk d;
    private final dcdc<drij> e;

    public xmt(int i, @dzsi akrk akrkVar, @dzsi dcdc<drij> dcdcVar, @dzsi akrk akrkVar2, @dzsi dcdc<drij> dcdcVar2) {
        this.a = i;
        this.b = akrkVar;
        this.c = dcdcVar;
        this.d = akrkVar2;
        this.e = dcdcVar2;
    }

    @Override // defpackage.xmw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.xmw
    @dzsi
    public final akrk b() {
        return this.b;
    }

    @Override // defpackage.xmw
    @dzsi
    public final dcdc<drij> c() {
        return this.c;
    }

    @Override // defpackage.xmw
    @dzsi
    public final akrk d() {
        return this.d;
    }

    @Override // defpackage.xmw
    @dzsi
    public final dcdc<drij> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        akrk akrkVar;
        dcdc<drij> dcdcVar;
        akrk akrkVar2;
        dcdc<drij> dcdcVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xmw) {
            xmw xmwVar = (xmw) obj;
            if (this.a == xmwVar.a() && ((akrkVar = this.b) != null ? akrkVar.equals(xmwVar.b()) : xmwVar.b() == null) && ((dcdcVar = this.c) != null ? dchl.m(dcdcVar, xmwVar.c()) : xmwVar.c() == null) && ((akrkVar2 = this.d) != null ? akrkVar2.equals(xmwVar.d()) : xmwVar.d() == null) && ((dcdcVar2 = this.e) != null ? dchl.m(dcdcVar2, xmwVar.e()) : xmwVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        akrk akrkVar = this.b;
        int i2 = 0;
        int hashCode = (i ^ (akrkVar == null ? 0 : akrkVar.hashCode())) * 1000003;
        dcdc<drij> dcdcVar = this.c;
        int hashCode2 = (hashCode ^ (dcdcVar == null ? 0 : dcdcVar.hashCode())) * 1000003;
        akrk akrkVar2 = this.d;
        int hashCode3 = (hashCode2 ^ (akrkVar2 == null ? 0 : akrkVar2.hashCode())) * 1000003;
        dcdc<drij> dcdcVar2 = this.e;
        if (dcdcVar2 != null) {
            i2 = dcdcVar2.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionModeOverlay + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("TransitDeparturePolylineData{lineColor=");
        sb.append(i);
        sb.append(", leadingPolyline=");
        sb.append(valueOf);
        sb.append(", leadingStops=");
        sb.append(valueOf2);
        sb.append(", trailingPolyline=");
        sb.append(valueOf3);
        sb.append(", trailingStops=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
