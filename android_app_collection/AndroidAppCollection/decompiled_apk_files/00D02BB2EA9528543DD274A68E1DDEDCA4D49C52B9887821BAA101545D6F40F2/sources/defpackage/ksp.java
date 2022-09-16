package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksp  reason: default package */
/* loaded from: classes7.dex */
public abstract class ksp implements ksq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ksp d(dcdc<ldm> dcdcVar) {
        int i = ksr.h;
        dccx F = dcdc.F();
        for (ldm ldmVar : dcdcVar) {
            F.g(ldmVar.h);
        }
        return new ksf(F.f(), dcdc.e());
    }

    @Override // defpackage.ksq
    public abstract dcdc<amvf> b();

    @Override // defpackage.ksq
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ksq
    public abstract dcdc<amvh> e();
}
