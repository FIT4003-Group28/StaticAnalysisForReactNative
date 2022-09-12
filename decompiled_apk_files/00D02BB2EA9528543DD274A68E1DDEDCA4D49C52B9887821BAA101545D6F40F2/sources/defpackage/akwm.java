package defpackage;
/* compiled from: PG */
/* renamed from: akwm  reason: default package */
/* loaded from: classes.dex */
final class akwm extends akww {
    private Boolean a;
    private Float b;
    private Integer c;
    private Boolean d;
    private Boolean e;
    private dwkm f;
    private Integer g;
    private Integer h;
    private Integer i;

    @Override // defpackage.akww
    public final void b(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.akww
    public final void c(float f) {
        this.b = Float.valueOf(f);
    }

    @Override // defpackage.akww
    public final void d(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.akww
    public final void e(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.akww
    public final void f(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.akww
    public final void g(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    @Override // defpackage.akww
    public final void h(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.akww
    public final void i(dwkm dwkmVar) {
        if (dwkmVar != null) {
            this.f = dwkmVar;
            return;
        }
        throw new NullPointerException("Null tileTypeExpirationParametersProto");
    }

    @Override // defpackage.akww
    public final void j(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.akww
    public final akwx a() {
        String str = this.a == null ? " renderBuildingsWithoutClippingEnabled" : "";
        if (this.b == null) {
            str = str.concat(" imageMagnificationRatio");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" trafficTileRefreshPeriodSec");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" offlineBorderTiles");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" disableBaseTileMemoryCache");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" tileTypeExpirationParametersProto");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" psmPertileDurationInMinutes");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" pertileDurationInMinutes");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" staleOffroadDurationInMinutes");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new akwn(this.a.booleanValue(), this.b.floatValue(), this.c.intValue(), this.d.booleanValue(), this.e.booleanValue(), this.f, this.g.intValue(), this.h.intValue(), this.i.intValue());
    }
}
