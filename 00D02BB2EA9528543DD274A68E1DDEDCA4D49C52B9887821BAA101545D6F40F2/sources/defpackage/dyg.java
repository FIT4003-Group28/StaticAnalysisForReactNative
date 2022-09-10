package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyg  reason: default package */
/* loaded from: classes6.dex */
public final class dyg extends dxq {
    public akqi a;
    public String b;
    public akqi c;
    public String d;
    public akqi e;
    public String f;
    public dsza g;
    private Integer h;
    private Float i;
    private Double j;
    private Double k;
    private dcdc<dfmg> l;

    @Override // defpackage.dxq
    public final void b(dcdc<dfmg> dcdcVar) {
        if (dcdcVar != null) {
            this.l = dcdcVar;
            return;
        }
        throw new NullPointerException("Null levelChangePoints");
    }

    @Override // defpackage.dxq
    public final void c(double d) {
        this.k = Double.valueOf(d);
    }

    @Override // defpackage.dxq
    public final void d(double d) {
        this.j = Double.valueOf(d);
    }

    @Override // defpackage.dxq
    public final void e(float f) {
        this.i = Float.valueOf(f);
    }

    @Override // defpackage.dxq
    public final void f(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.dxq
    public final dxr a() {
        String str = this.h == null ? " numVenueBuildings" : "";
        if (this.i == null) {
            str = str.concat(" levelNumber");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" levelMinAltitudeMetersWgs84");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" levelMaxAltitudeMetersWgs84");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" levelChangePoints");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new dyh(this.a, this.b, this.h.intValue(), this.c, this.d, this.e, this.f, this.i.floatValue(), this.j.doubleValue(), this.k.doubleValue(), this.g, this.l);
    }
}
