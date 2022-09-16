package defpackage;
/* compiled from: PG */
/* renamed from: kod  reason: default package */
/* loaded from: classes3.dex */
public final class kod extends koc {
    private final float f;
    private final float g;

    public kod(aacz aaczVar) {
        float f;
        this.f = eog.Y(aaczVar);
        apyy b = aaczVar.b();
        asxj asxjVar = b.e;
        awbj awbjVar = (asxjVar == null ? asxj.a : asxjVar).v;
        if (((awbjVar == null ? awbj.a : awbjVar).b & 4) != 0) {
            asxj asxjVar2 = b.e;
            awbj awbjVar2 = (asxjVar2 == null ? asxj.a : asxjVar2).v;
            f = (awbjVar2 == null ? awbj.a : awbjVar2).e;
        } else {
            f = 1.7f;
        }
        this.g = f;
    }

    @Override // defpackage.koc
    public final boolean a() {
        float f = this.g;
        float f2 = this.b;
        float f3 = this.f;
        float f4 = this.a;
        return !this.d && this.e && this.c && f <= f2 && f3 <= f4 && 1.02f * f2 <= f4;
    }
}
