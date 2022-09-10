package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abwl  reason: default package */
/* loaded from: classes2.dex */
public final class abwl implements jkh {
    final /* synthetic */ abwn a;

    public abwl(abwn abwnVar) {
        this.a = abwnVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        if (jjnVar != jjn.FULLY_EXPANDED) {
            alae alaeVar = new alae(0.0f, -(jkjVar.U() / this.a.ad.af().getHeight()));
            alad n = this.a.ad.n();
            alaa b = alad.b(n);
            b.f = alaeVar;
            alad a = b.a();
            akzn akznVar = new akzn(this.a.a);
            akznVar.a(n, a);
            akznVar.p(0L);
            this.a.ad.r(akznVar);
        }
    }
}
