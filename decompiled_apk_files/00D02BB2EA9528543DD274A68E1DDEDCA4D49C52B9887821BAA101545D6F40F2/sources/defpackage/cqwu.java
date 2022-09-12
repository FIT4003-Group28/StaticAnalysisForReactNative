package defpackage;
/* compiled from: PG */
/* renamed from: cqwu  reason: default package */
/* loaded from: classes5.dex */
final class cqwu extends cqyv {
    private dcen<String> a;
    private dcep<String> b;
    private dcen<String> c;
    private dcep<String> d;
    private dccx<Throwable> e;
    private dcdc<Throwable> f;

    public cqwu() {
    }

    public cqwu(cqyw cqywVar) {
        cqwv cqwvVar = (cqwv) cqywVar;
        this.b = cqwvVar.a;
        this.d = cqwvVar.b;
        this.f = cqwvVar.c;
    }

    @Override // defpackage.cqyv
    public final dcen<String> a() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = dcep.N();
            } else {
                dcen<String> N = dcep.N();
                this.a = N;
                N.i(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.cqyv
    public final dcen<String> b() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = dcep.N();
            } else {
                dcen<String> N = dcep.N();
                this.c = N;
                N.i(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.cqyv
    public final dccx<Throwable> c() {
        if (this.e == null) {
            if (this.f == null) {
                this.e = dcdc.F();
            } else {
                dccx<Throwable> F = dcdc.F();
                this.e = F;
                F.i(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.cqyv
    public final cqyw d() {
        dcen<String> dcenVar = this.a;
        if (dcenVar != null) {
            this.b = dcenVar.f();
        } else if (this.b == null) {
            this.b = dcmr.a;
        }
        dcen<String> dcenVar2 = this.c;
        if (dcenVar2 != null) {
            this.d = dcenVar2.f();
        } else if (this.d == null) {
            this.d = dcmr.a;
        }
        dccx<Throwable> dccxVar = this.e;
        if (dccxVar != null) {
            this.f = dccxVar.f();
        } else if (this.f == null) {
            this.f = dcdc.e();
        }
        return new cqwv(this.b, this.d, this.f);
    }
}
