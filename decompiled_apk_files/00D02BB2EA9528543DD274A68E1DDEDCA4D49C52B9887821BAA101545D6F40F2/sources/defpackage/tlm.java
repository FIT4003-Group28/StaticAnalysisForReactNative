package defpackage;
/* compiled from: PG */
/* renamed from: tlm  reason: default package */
/* loaded from: classes7.dex */
public final class tlm extends tmc {
    public dbsg<String> a;
    private btlu c;
    private tme d;
    private dccx<String> e;
    private dcdc<String> f;
    private dcdn<String, tlv> g;

    public tlm() {
        this.a = dbpy.a;
    }

    @Override // defpackage.tmc
    public final tme a() {
        tme tmeVar = this.d;
        if (tmeVar != null) {
            return tmeVar;
        }
        throw new IllegalStateException("Property \"metadata\" has not been set");
    }

    @Override // defpackage.tmc
    public final dccx<String> b() {
        if (this.e == null) {
            if (this.f == null) {
                this.e = dcdc.F();
            } else {
                dccx<String> F = dcdc.F();
                this.e = F;
                F.i(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.tmc
    public final dcdc<String> c() {
        dccx<String> dccxVar = this.e;
        if (dccxVar != null) {
            return dccxVar.f();
        }
        if (this.f == null) {
            this.f = dcdc.e();
        }
        return this.f;
    }

    @Override // defpackage.tmc
    public final tmd d() {
        dccx<String> dccxVar = this.e;
        if (dccxVar != null) {
            this.f = dccxVar.f();
        } else if (this.f == null) {
            this.f = dcdc.e();
        }
        String str = this.c == null ? " account" : "";
        if (this.d == null) {
            str = str.concat(" metadata");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" groupsMap");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new tls(this.c, this.a, this.d, this.f, this.g);
    }

    @Override // defpackage.tmc
    public final void e(btlu btluVar) {
        if (btluVar != null) {
            this.c = btluVar;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.tmc
    public final void f(dcdn<String, tlv> dcdnVar) {
        if (dcdnVar != null) {
            this.g = dcdnVar;
            return;
        }
        throw new NullPointerException("Null groupsMap");
    }

    @Override // defpackage.tmc
    public final void g(tme tmeVar) {
        this.d = tmeVar;
    }

    public tlm(tmd tmdVar) {
        this.a = dbpy.a;
        this.c = tmdVar.a();
        this.a = tmdVar.b();
        this.d = tmdVar.c();
        this.f = tmdVar.d();
        this.g = tmdVar.e();
    }
}
