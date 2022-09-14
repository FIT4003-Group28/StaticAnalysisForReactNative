package defpackage;
/* compiled from: PG */
/* renamed from: alvg  reason: default package */
/* loaded from: classes.dex */
public final class alvg extends alyk {
    public dfpo a;
    public akqi b;
    public dxdm c;
    public dniu d;
    public dnbh e;
    public dmxh f;
    public String g;
    public drkg h;
    private dniu i;
    private dccx<Integer> j;
    private dcdc<Integer> k;
    private String l;
    private String m;
    private String n;
    private Boolean o;

    public alvg() {
    }

    public alvg(alyl alylVar) {
        this.a = alylVar.a();
        this.b = alylVar.b();
        this.c = alylVar.c();
        this.d = alylVar.d();
        this.i = alylVar.e();
        this.e = alylVar.f();
        this.k = alylVar.g();
        this.f = alylVar.h();
        this.l = alylVar.i();
        this.m = alylVar.j();
        this.n = alylVar.k();
        this.o = Boolean.valueOf(alylVar.l());
        this.g = alylVar.m();
        this.h = alylVar.n();
    }

    @Override // defpackage.alyk
    public final dccx<Integer> a() {
        if (this.j == null) {
            if (this.k == null) {
                this.j = dcdc.F();
            } else {
                dccx<Integer> F = dcdc.F();
                this.j = F;
                F.i(this.k);
                this.k = null;
            }
        }
        return this.j;
    }

    @Override // defpackage.alyk
    public final alyl b() {
        dccx<Integer> dccxVar = this.j;
        if (dccxVar != null) {
            this.k = dccxVar.f();
        } else if (this.k == null) {
            this.k = dcdc.e();
        }
        String str = this.n == null ? " apiMapId" : "";
        if (this.o == null) {
            str = str.concat(" isMapModeServerStyleableByMapsApi");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new alvu(this.a, this.b, this.c, this.d, this.i, this.e, this.k, this.f, this.l, this.m, this.n, this.o.booleanValue(), this.g, this.h);
    }

    @Override // defpackage.alyk
    public final void c(String str) {
        if (str != null) {
            this.n = str;
            return;
        }
        throw new NullPointerException("Null apiMapId");
    }

    @Override // defpackage.alyk
    public final void d(@dzsi String str) {
        this.m = str;
    }

    @Override // defpackage.alyk
    public final void e(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.alyk
    public final void f(@dzsi String str) {
        this.g = str;
    }

    @Override // defpackage.alyk
    public final void g(@dzsi String str) {
        this.l = str;
    }
}
