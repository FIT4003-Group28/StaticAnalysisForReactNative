package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: xbc  reason: default package */
/* loaded from: classes7.dex */
public final class xbc extends xbe {
    private final akqi a;
    private final String b;
    private final String c;
    private final zvb d;
    private final akqq e;
    private final Runnable f;
    private final cjtd g;

    public xbc(akqi akqiVar, String str, @dzsi String str2, zvb zvbVar, akqq akqqVar, Runnable runnable, @dzsi cjtd cjtdVar) {
        if (akqiVar != null) {
            this.a = akqiVar;
            if (str != null) {
                this.b = str;
                this.c = str2;
                this.d = zvbVar;
                this.e = akqqVar;
                this.f = runnable;
                this.g = cjtdVar;
                return;
            }
            throw new NullPointerException("Null stationName");
        }
        throw new NullPointerException("Null stationFeatureId");
    }

    @Override // defpackage.xbe
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.xbe
    public final String b() {
        return this.b;
    }

    @Override // defpackage.xbe
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xbe
    public final zvb d() {
        return this.d;
    }

    @Override // defpackage.xbe
    public final akqq e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        cjtd cjtdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xbe) {
            xbe xbeVar = (xbe) obj;
            if (this.a.equals(xbeVar.a()) && this.b.equals(xbeVar.b()) && ((str = this.c) != null ? str.equals(xbeVar.c()) : xbeVar.c() == null) && this.d.equals(xbeVar.d()) && this.e.equals(xbeVar.e()) && this.f.equals(xbeVar.f()) && ((cjtdVar = this.g) != null ? cjtdVar.equals(xbeVar.g()) : xbeVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xbe
    public final Runnable f() {
        return this.f;
    }

    @Override // defpackage.xbe
    @dzsi
    public final cjtd g() {
        return this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length());
        sb.append("StationCalloutData{stationFeatureId=");
        sb.append(valueOf);
        sb.append(", stationName=");
        sb.append(str);
        sb.append(", distanceText=");
        sb.append(str2);
        sb.append(", lineRenderableComponents=");
        sb.append(valueOf2);
        sb.append(", latLng=");
        sb.append(valueOf3);
        sb.append(", onClick=");
        sb.append(valueOf4);
        sb.append(", ue3Params=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        cjtd cjtdVar = this.g;
        if (cjtdVar != null) {
            i = cjtdVar.hashCode();
        }
        return hashCode2 ^ i;
    }
}
