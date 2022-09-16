package defpackage;
/* compiled from: PG */
/* renamed from: xbs  reason: default package */
/* loaded from: classes7.dex */
public final class xbs extends xbu {
    public String a;
    public dcdc<dpce> b;
    public amte c;
    private amvh d;
    private amvh e;
    private dspd f;
    private Boolean g;
    private Integer h;
    private Integer i;

    @Override // defpackage.xbu
    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.xbu
    public final void c(amvh amvhVar) {
        if (amvhVar != null) {
            this.e = amvhVar;
            return;
        }
        throw new NullPointerException("Null destination");
    }

    @Override // defpackage.xbu
    public final void d(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.xbu
    public final void e(dspd dspdVar) {
        if (dspdVar != null) {
            this.f = dspdVar;
            return;
        }
        throw new NullPointerException("Null routeToken");
    }

    @Override // defpackage.xbu
    public final void f(amvh amvhVar) {
        if (amvhVar != null) {
            this.d = amvhVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    @Override // defpackage.xbu
    public final void g(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.xbu
    public final xbv a() {
        String str = this.d == null ? " source" : "";
        if (this.e == null) {
            str = str.concat(" destination");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" routeToken");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" anchorDeparturesToPassedInDirections");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" tripIndex");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" initialTransitLegIndex");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new xbt(this.d, this.e, this.a, this.f, this.b, this.c, this.g.booleanValue(), this.h.intValue(), this.i.intValue());
    }
}
