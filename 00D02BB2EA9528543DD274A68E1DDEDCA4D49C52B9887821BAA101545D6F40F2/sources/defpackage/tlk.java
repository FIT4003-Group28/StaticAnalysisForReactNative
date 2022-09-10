package defpackage;
/* compiled from: PG */
/* renamed from: tlk  reason: default package */
/* loaded from: classes7.dex */
public final class tlk extends tlu {
    public dbsg<tli> a;
    private Integer b;
    private Integer c;
    private dccx<Integer> d;
    private dcdc<Integer> e;
    private tme f;
    private String g;
    private tlw h;
    private tly i;
    private dcdg<Integer, amve> j;
    private dcdn<Integer, amve> k;
    private Integer l;
    private Boolean m;

    public tlk() {
        this.a = dbpy.a;
    }

    public tlk(tlv tlvVar) {
        this.a = dbpy.a;
        this.b = Integer.valueOf(tlvVar.a());
        this.c = Integer.valueOf(tlvVar.b());
        this.e = tlvVar.c();
        this.f = tlvVar.d();
        this.g = tlvVar.e();
        this.i = tlvVar.f();
        this.k = tlvVar.g();
        this.l = Integer.valueOf(tlvVar.h());
        this.m = Boolean.valueOf(tlvVar.i());
        this.a = tlvVar.j();
    }

    @Override // defpackage.tlu
    public final dccx<Integer> a() {
        if (this.d == null) {
            if (this.e == null) {
                this.d = dcdc.F();
            } else {
                dccx<Integer> F = dcdc.F();
                this.d = F;
                F.i(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    @Override // defpackage.tlu
    public final String b() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"id\" has not been set");
    }

    @Override // defpackage.tlu
    public final tlw c() {
        if (this.h == null) {
            tly tlyVar = this.i;
            if (tlyVar == null) {
                this.h = tly.j();
            } else {
                this.h = tlyVar.i();
                this.i = null;
            }
        }
        return this.h;
    }

    @Override // defpackage.tlu
    public final dcdg<Integer, amve> d() {
        if (this.j == null) {
            if (this.k == null) {
                this.j = dcdn.p();
            } else {
                dcdg<Integer, amve> p = dcdn.p();
                this.j = p;
                p.c(this.k);
                this.k = null;
            }
        }
        return this.j;
    }

    @Override // defpackage.tlu
    public final tlv e() {
        dccx<Integer> dccxVar = this.d;
        if (dccxVar != null) {
            this.e = dccxVar.f();
        } else if (this.e == null) {
            this.e = dcdc.e();
        }
        tlw tlwVar = this.h;
        if (tlwVar != null) {
            this.i = tlwVar.a();
        } else if (this.i == null) {
            this.i = tly.j().a();
        }
        dcdg<Integer, amve> dcdgVar = this.j;
        if (dcdgVar != null) {
            this.k = dcdgVar.b();
        } else if (this.k == null) {
            this.k = dcmn.a;
        }
        String str = this.b == null ? " primaryTripIndex" : "";
        if (this.c == null) {
            str = str.concat(" initialPrimaryTripIndex");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" storedDirectionsMetadata");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" id");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" maxNumTripsToDisplayWithoutExpansion");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" allowListExpansion");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new tlp(this.b.intValue(), this.c.intValue(), this.e, this.f, this.g, this.i, this.k, this.l.intValue(), this.m.booleanValue(), this.a);
    }

    @Override // defpackage.tlu
    public final void f(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.tlu
    public final void g(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.tlu
    public final void h(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.tlu
    public final void i(int i) {
        this.l = Integer.valueOf(i);
    }

    @Override // defpackage.tlu
    public final void j(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.tlu
    public final void k(tme tmeVar) {
        if (tmeVar != null) {
            this.f = tmeVar;
            return;
        }
        throw new NullPointerException("Null storedDirectionsMetadata");
    }
}
