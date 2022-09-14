package defpackage;
/* compiled from: PG */
/* renamed from: wvk  reason: default package */
/* loaded from: classes7.dex */
public final class wvk extends wvv {
    public drhj a;
    public String b;
    private dpjb c;
    private dcdc<dpce> d;
    private String e;
    private dgaw f;
    private String g;
    private String h;
    private Long i;
    private String j;

    @Override // defpackage.wvv
    public final void b(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null departureStationFeatureId");
    }

    @Override // defpackage.wvv
    public final void c(long j) {
        this.i = Long.valueOf(j);
    }

    @Override // defpackage.wvv
    public final void d(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null headsign");
    }

    @Override // defpackage.wvv
    public final void e(dcdc<dpce> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null lineRenderables");
    }

    @Override // defpackage.wvv
    public final void f(dgaw dgawVar) {
        if (dgawVar != null) {
            this.f = dgawVar;
            return;
        }
        throw new NullPointerException("Null scheduledTime");
    }

    @Override // defpackage.wvv
    public final void g(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null tripToken");
    }

    @Override // defpackage.wvv
    public final void h(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null ved");
    }

    @Override // defpackage.wvv
    public final void i(dpjb dpjbVar) {
        if (dpjbVar != null) {
            this.c = dpjbVar;
            return;
        }
        throw new NullPointerException("Null vehicleAttributes");
    }

    @Override // defpackage.wvv
    public final wvw a() {
        String str = this.c == null ? " vehicleAttributes" : "";
        if (this.d == null) {
            str = str.concat(" lineRenderables");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" headsign");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" scheduledTime");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" tripToken");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" ved");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" firstStationDepartureTimestampSeconds");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" departureStationFeatureId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new wvl(this.c, this.d, this.e, this.f, this.g, this.a, this.h, this.i.longValue(), this.j, this.b);
    }
}
