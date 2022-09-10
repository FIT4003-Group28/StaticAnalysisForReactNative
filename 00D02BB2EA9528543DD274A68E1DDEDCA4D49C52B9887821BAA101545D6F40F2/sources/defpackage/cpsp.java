package defpackage;
/* compiled from: PG */
/* renamed from: cpsp  reason: default package */
/* loaded from: classes5.dex */
public final class cpsp<D> implements cpsk {
    public cpsl<D> a;
    public cpsf<Integer> b;
    public float c;
    public cpsm d;
    public float e;
    private float f;
    private boolean g;
    private float h;
    private float i;

    public cpsp() {
        this.a = new cpsl<>();
        this.b = new cpsf<>(0, 1);
        this.c = 1.0f;
        this.f = 0.0f;
        this.d = cpsm.b();
        this.g = true;
    }

    public final void a() {
        float f;
        float k = this.a.d() > 0 ? this.c * (k() / this.a.d()) : 0.0f;
        cpsm cpsmVar = this.d;
        int i = cpsmVar.b - 1;
        if (i == 1) {
            f = (float) cpsmVar.a;
        } else if (i == 3 || i == 4) {
            f = ((float) cpsmVar.a) * k;
        } else if (i != 5) {
            throw new IllegalStateException("rangeBandType is bad, must not be NO_RANGE_BAND or FIXED_DOMAIN_RANGE_BAND");
        } else {
            f = Math.max(0.0f, k - ((float) cpsmVar.a));
        }
        this.e = k;
        this.i = f;
        this.h = k / 2.0f;
        if (this.b.a.intValue() > this.b.b.intValue()) {
            this.e = -this.e;
            this.h = -this.h;
        }
        this.g = false;
    }

    @Override // defpackage.cpsk
    public final void c(cpsm cpsmVar) {
        cpwl.h(cpsmVar, "rangeBandConfig");
        int i = cpsmVar.b;
        boolean z = false;
        if (i != 3 && i != 1) {
            z = true;
        }
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FIXED_PIXEL_SPACE_FROM_STEP" : "STYLE_ASSIGNED_PERCENT_OF_STEP" : "FIXED_PERCENT_OF_STEP" : "FIXED_DOMAIN" : "FIXED_PIXEL" : "NONE";
        cpwl.c(z, str.length() != 0 ? "OrdinalScales cannot have a rangeBandType of ".concat(str) : new String("OrdinalScales cannot have a rangeBandType of "));
        this.d = cpsmVar;
        this.g = true;
    }

    @Override // defpackage.cpsk
    public final void d(cpsq cpsqVar) {
        cpwl.h(cpsqVar, "stepSizeConfig");
        int i = cpsqVar.a;
        cpwl.c(true, "Ordinal scales only support StepSizeConfig of type Auto");
    }

    @Override // defpackage.cpsk
    public final void e(cpsf<Integer> cpsfVar) {
        this.b = cpsfVar;
        this.g = true;
    }

    @Override // defpackage.cpso
    public final cpsf<Integer> f() {
        return this.b;
    }

    @Override // defpackage.cpsk
    public final void i(float f, float f2) {
        this.c = f;
        this.f = Math.min(0.0f, Math.max(k() * (1.0f - f), f2));
        this.g = true;
    }

    @Override // defpackage.cpsk
    public final void j() {
        cpsl<D> cpslVar = this.a;
        cpslVar.a.clear();
        cpslVar.b.clear();
        this.g = true;
    }

    @Override // defpackage.cpso
    public final int k() {
        return Math.abs(this.b.a.intValue() - this.b.b.intValue());
    }

    @Override // defpackage.cpso
    public final float l() {
        if (this.g) {
            a();
        }
        return this.i;
    }

    @Override // defpackage.cpsk
    public final void m(D d) {
        n(d);
    }

    @Override // defpackage.cpsk
    public final void n(D d) {
        cpsl<D> cpslVar = this.a;
        if (!cpslVar.a.containsKey(d)) {
            cpslVar.a.put(d, Integer.valueOf(cpslVar.b.size()));
            cpslVar.b.add(d);
        }
        this.g = true;
    }

    @Override // defpackage.cpso
    public final /* bridge */ /* synthetic */ cpsk o() {
        return new cpsp(this);
    }

    @Override // defpackage.cpso
    public final int p(D d) {
        if (this.a.a(d) == null || this.b == null) {
            return -1;
        }
        float s = s(d);
        if (s < Math.min(this.b.a.intValue(), this.b.b.intValue())) {
            return -1;
        }
        return s > ((float) Math.max(this.b.a.intValue(), this.b.b.intValue())) ? 1 : 0;
    }

    @Override // defpackage.cpso
    public final boolean q(D d) {
        return this.a.a(d) != null;
    }

    @Override // defpackage.cpso
    public final float r(D d, D d2) {
        return s(d);
    }

    @Override // defpackage.cpso
    public final float s(D d) {
        if (this.g) {
            a();
        }
        Integer a = this.a.a(d);
        if (a != null) {
            return this.f + this.b.a.intValue() + this.h + (this.e * a.intValue());
        }
        return 0.0f;
    }

    protected cpsp(cpsp<D> cpspVar) {
        this.a = new cpsl<>();
        this.b = new cpsf<>(0, 1);
        this.c = 1.0f;
        this.f = 0.0f;
        this.d = cpsm.b();
        this.g = true;
        cpsl<D> cpslVar = cpspVar.a;
        cpsl<D> cpslVar2 = new cpsl<>();
        cpslVar2.a.putAll(cpslVar.a);
        cpslVar2.b.addAll(cpslVar.b);
        this.a = cpslVar2;
        this.b = cpspVar.b.a();
        this.c = cpspVar.c;
        this.f = cpspVar.f;
        this.d = cpspVar.d;
    }
}
