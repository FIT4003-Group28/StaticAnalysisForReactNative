package defpackage;
/* compiled from: PG */
/* renamed from: dcvt  reason: default package */
/* loaded from: classes5.dex */
public final class dcvt extends dcvv {
    public dcvt(dcuu dcuuVar, dcva dcvaVar) {
        super(dcuuVar, dcvaVar);
    }

    public static dcvt d() {
        return new dcvt(dcuu.a(), dcva.d());
    }

    @Override // defpackage.dcvv
    public final dcuu a() {
        return new dcuu(this.a);
    }

    @Override // defpackage.dcvv
    public final dcva b() {
        return new dcva(this.b);
    }

    public final dcvu c() {
        return new dcvu(new dcuu(this.a), new dcva(this.b));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new dcvu(o(), p());
    }

    public final void f(dcvu dcvuVar) {
        this.a.i(dcvuVar.a);
        this.b.n(dcvuVar.b);
    }

    public dcvt(dcvv dcvvVar) {
        dcuu dcuuVar = this.a;
        dcuu dcuuVar2 = dcvvVar.a;
        dcuuVar.a = dcuuVar2.a;
        dcuuVar.b = dcuuVar2.b;
        dcva dcvaVar = this.b;
        dcva dcvaVar2 = dcvvVar.b;
        dcvaVar.a(dcvaVar2.a, dcvaVar2.b, true);
    }

    public final void e(dcvs dcvsVar) {
        dcuu dcuuVar = this.a;
        double d = dcvsVar.f().b;
        if (dcuuVar.d()) {
            dcuuVar.a = d;
            dcuuVar.b = d;
        } else if (d < dcuuVar.a) {
            dcuuVar.a = d;
        } else if (d > dcuuVar.b) {
            dcuuVar.b = d;
        }
        dcva dcvaVar = this.b;
        double d2 = dcvsVar.h().b;
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        double d3 = d2;
        dcvaVar.n(new dcva(d3, d3, true));
    }
}
