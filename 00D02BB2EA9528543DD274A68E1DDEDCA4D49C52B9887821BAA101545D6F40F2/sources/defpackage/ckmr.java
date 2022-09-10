package defpackage;
/* compiled from: PG */
/* renamed from: ckmr  reason: default package */
/* loaded from: classes4.dex */
final class ckmr implements jkh {
    final /* synthetic */ cqat a;
    final /* synthetic */ cwsv b;
    final /* synthetic */ ckms c;
    final /* synthetic */ ckmm d;
    final /* synthetic */ ckmt e;

    public ckmr(ckmt ckmtVar, cqat cqatVar, cwsv cwsvVar, ckms ckmsVar, ckmm ckmmVar) {
        this.e = ckmtVar;
        this.a = cqatVar;
        this.b = cwsvVar;
        this.c = ckmsVar;
        this.d = ckmmVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
        ckmt ckmtVar = this.e;
        ckmtVar.c.removeCallbacks(ckmtVar.d);
        this.e.h = this.a.e();
        ckmt ckmtVar2 = this.e;
        ckmtVar2.g = jjnVar;
        if (ckmtVar2.f) {
            return;
        }
        dbsg<cwsv> a = ckmt.a(this.b, ckmtVar2.g, this.c);
        if (!a.a()) {
            return;
        }
        this.d.s(a.b());
        this.e.f = true;
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        this.e.h = this.a.e();
        ckmt ckmtVar = this.e;
        ckmtVar.c.removeCallbacks(ckmtVar.d);
        ckmt ckmtVar2 = this.e;
        ckmtVar2.c.postDelayed(ckmtVar2.d, 100L);
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        this.e.h = this.a.e();
    }
}
