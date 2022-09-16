package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acyd  reason: default package */
/* loaded from: classes.dex */
public final class acyd implements aeaw {
    final /* synthetic */ acyf a;

    public acyd(acyf acyfVar) {
        this.a = acyfVar;
    }

    @Override // defpackage.aeaw
    public final aeav b() {
        return aeav.EXPLORE_TAB_BELOW_FOLD;
    }

    @Override // defpackage.aeaw
    public final void c(deig<Boolean> deigVar, deig<Void> deigVar2) {
        aebb a = this.a.c.a();
        aegc h = this.a.h();
        if (!this.a.ba || a == null || a.a() != dktk.EXPLORE || h == null || h.d() <= this.a.aM() || a.j()) {
            deigVar.j(false);
            return;
        }
        acyf acyfVar = this.a;
        acyfVar.bk = deigVar;
        acyfVar.bl = deigVar2;
        a.l(true, ckfe.PREFETCH);
        this.a.ai.a().j(awwm.GOLDFINGER_BELOW_FOLD_PREFETCH);
    }

    @Override // defpackage.aeaw
    public final int d() {
        return this.a.al.a().ab;
    }

    @Override // defpackage.aeaw
    public final dbsg e() {
        return dbpy.a;
    }
}
