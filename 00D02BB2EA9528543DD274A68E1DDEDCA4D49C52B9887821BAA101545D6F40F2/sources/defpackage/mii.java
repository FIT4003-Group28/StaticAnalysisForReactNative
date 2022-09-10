package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mii  reason: default package */
/* loaded from: classes7.dex */
public final class mii implements ksu {
    final /* synthetic */ mio a;

    public mii(mio mioVar) {
        this.a = mioVar;
    }

    @Override // defpackage.ksu
    public final void a(ldm ldmVar) {
        if (ldmVar == this.a.s) {
            ilo iloVar = ldmVar.d;
            dccx F = dcdc.F();
            F.g(ldmVar);
            F.i(this.a.r);
            dcdc<ldm> f = F.f();
            mio mioVar = this.a;
            ksu ksuVar = mioVar.F;
            ksr ksrVar = mioVar.e;
            vup vupVar = mioVar.f;
            dbsk.l(!f.isEmpty());
            ldm ldmVar2 = f.get(0);
            if (ldmVar2.u() == 1) {
                ksrVar.d(f, ksuVar, vupVar);
            } else {
                ksuVar.a(ldmVar2);
            }
            this.a.t.m(ldmVar);
            this.a.k();
        }
    }
}
