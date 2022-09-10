package defpackage;
/* compiled from: PG */
/* renamed from: gko  reason: default package */
/* loaded from: classes.dex */
final class gko implements alht {
    final /* synthetic */ gkq a;

    public gko(gkq gkqVar) {
        this.a = gkqVar;
    }

    @Override // defpackage.alht
    public final boolean a(alhr alhrVar) {
        gkq gkqVar = this.a;
        if (gkqVar.g) {
            gkqVar.c();
        } else {
            gkqVar.e();
        }
        cjqy cjqyVar = this.a.c;
        cjql cjqlVar = cjql.a;
        cjte cjteVar = new cjte(deaf.TAP);
        gkq gkqVar2 = this.a;
        cjqyVar.n(cjqlVar, cjteVar, gkqVar2.g ? gkqVar2.d : gkqVar2.e);
        return true;
    }
}
