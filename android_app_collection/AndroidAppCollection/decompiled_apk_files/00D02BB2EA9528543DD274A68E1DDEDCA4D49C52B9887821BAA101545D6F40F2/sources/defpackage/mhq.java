package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mhq  reason: default package */
/* loaded from: classes7.dex */
public final class mhq implements ksu {
    final /* synthetic */ mht a;

    public mhq(mht mhtVar) {
        this.a = mhtVar;
    }

    @Override // defpackage.ksu
    public final void a(ldm ldmVar) {
        akqq akqqVar;
        akqi akqiVar;
        int i = mht.k;
        mht mhtVar = this.a;
        if (ldmVar == mhtVar.f) {
            ilo iloVar = ldmVar.d;
            mhtVar.d.g(ldmVar);
            mht mhtVar2 = this.a;
            if (mhtVar2.g) {
                ilo iloVar2 = mhtVar2.f.d;
                if (iloVar2 != null && iloVar2.aj() != null) {
                    akqqVar = iloVar2.aj();
                    akqiVar = iloVar2.ai();
                } else {
                    amvh amvhVar = mhtVar2.f.h;
                    akqqVar = amvhVar.e;
                    akqiVar = amvhVar.d;
                }
                if (akqqVar != null) {
                    mhtVar2.a.a(akqiVar, akra.f(akqqVar));
                }
            }
            mhtVar2.l();
            this.a.k();
        }
    }
}
