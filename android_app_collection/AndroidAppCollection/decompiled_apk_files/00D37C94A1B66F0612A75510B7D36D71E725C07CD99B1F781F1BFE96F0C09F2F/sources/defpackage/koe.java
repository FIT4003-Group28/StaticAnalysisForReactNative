package defpackage;
/* compiled from: PG */
/* renamed from: koe  reason: default package */
/* loaded from: classes3.dex */
public final class koe extends koc {
    private final float f;

    public koe(aacz aaczVar) {
        float f;
        apyy b = aaczVar.b();
        asxj asxjVar = b.e;
        awbj awbjVar = (asxjVar == null ? asxj.a : asxjVar).v;
        if (((awbjVar == null ? awbj.a : awbjVar).b & 256) != 0) {
            asxj asxjVar2 = b.e;
            awbj awbjVar2 = (asxjVar2 == null ? asxj.a : asxjVar2).v;
            f = (awbjVar2 == null ? awbj.a : awbjVar2).h;
        } else {
            f = 0.2f;
        }
        this.f = f;
    }

    @Override // defpackage.koc
    public final boolean a() {
        float f = this.b;
        float f2 = this.a;
        float f3 = f > f2 ? (f - f2) / f : (f2 - f) / f2;
        return !this.d && this.e && this.c && ((f3 > 0.02f ? 1 : (f3 == 0.02f ? 0 : -1)) >= 0 && (f3 > this.f ? 1 : (f3 == this.f ? 0 : -1)) <= 0);
    }
}
