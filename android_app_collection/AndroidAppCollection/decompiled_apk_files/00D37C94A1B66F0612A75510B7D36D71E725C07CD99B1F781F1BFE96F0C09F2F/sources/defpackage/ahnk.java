package defpackage;
/* compiled from: PG */
/* renamed from: ahnk  reason: default package */
/* loaded from: classes.dex */
public final class ahnk extends ahlb implements ahng, ahlx {
    private static final float b = ahom.a(40.0f);
    private static final float[] c = {0.266f, 0.266f, 0.266f, 0.7f};
    private static final float e = ahom.a(15.0f);
    public final ahnh a;
    private final ahjv f;
    private final ahjv g;

    public ahnk(ahne ahneVar, ahoo ahooVar, azqb azqbVar, ahjj ahjjVar, float f) {
        ahon a = ahon.a(1.0f, 1.0f, ahon.c);
        ahoo clone = ahooVar.clone();
        float[] fArr = c;
        ahjv ahjvVar = new ahjv(a, clone, ahjv.s(fArr, a.f), azqbVar);
        this.f = ahjvVar;
        ahjvVar.t();
        float f2 = e;
        float f3 = f2 / 2.0f;
        float f4 = f2 / 2.0f;
        ahon ahonVar = new ahon(new float[]{f3, f4, 0.0f, 0.0f, -f4, 0.0f, -f3, f4, 0.0f}, new float[]{1.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f}, 5);
        ahjv ahjvVar2 = new ahjv(ahonVar, ahooVar.clone(), ahjv.s(fArr, ahonVar.f), azqbVar);
        this.g = ahjvVar2;
        ahjvVar2.t();
        float f5 = b;
        ahjvVar2.n(0.0f, -((f5 / 2.0f) + (f2 / 2.0f)), 0.0f);
        ahnh a2 = ahneVar.a(ahooVar.clone(), ahom.a(100.0f), ahom.a(20.0f));
        this.a = a2;
        a2.z(-1);
        a2.A(2.0f);
        a2.B(true, true);
        a2.g(this);
        q(ahjvVar);
        q(ahjvVar2);
        q(a2);
        n(0.0f, f + (f5 / 2.0f) + (f2 / 2.0f), 0.0f);
        ahjjVar.a(new ahly(this, 0.0f, 1.0f));
    }

    @Override // defpackage.ahng
    public final void a(float f, float f2) {
        this.f.rT(f + ahom.a(20.0f), b, 1.0f);
    }

    @Override // defpackage.ahlx
    public final void l(float f) {
        this.f.c = f;
        this.a.c = f;
        this.g.c = f;
    }
}
