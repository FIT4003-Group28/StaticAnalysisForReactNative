package defpackage;
/* compiled from: PG */
/* renamed from: mbo  reason: default package */
/* loaded from: classes7.dex */
final class mbo implements kqn {
    final /* synthetic */ mbp a;

    public mbo(mbp mbpVar) {
        this.a = mbpVar;
    }

    @Override // defpackage.kqn
    public final boolean a(ldm ldmVar, mnz mnzVar) {
        deaf deafVar;
        for (int i = 0; i < this.a.x.d(); i++) {
            mfd c = this.a.x.c(i);
            if (c.c().q(ldmVar)) {
                cjtd g = c.g();
                cjql D = c.D();
                if (D != null) {
                    cjqy cjqyVar = this.a.e;
                    if (mnzVar.a()) {
                        deafVar = deaf.INPUT_VOICE;
                    } else {
                        deafVar = deaf.USER;
                    }
                    cjqyVar.n(D, new cjte(deafVar), g);
                }
                mbp mbpVar = this.a;
                aryr b = c.b();
                ldm c2 = c.c();
                ncf a = c.a();
                kdk kdkVar = kdk.NAVIGATE;
                mbp mbpVar2 = this.a;
                mbpVar.l(b, c2, a, kdkVar, mbpVar2.m, mbpVar2.x.d() == 1);
                return true;
            }
        }
        return false;
    }
}
