package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rye  reason: default package */
/* loaded from: classes4.dex */
public final class rye implements ankb {
    final /* synthetic */ String a;
    final /* synthetic */ ryh b;

    public rye(ryh ryhVar, String str) {
        this.b = ryhVar;
        this.a = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ryh ryhVar = this.b;
        rzo rzoVar = ryhVar.k;
        ryl rylVar = ryhVar.e;
        anlz.A(rzoVar.a(rylVar.e, rylVar.c, rylVar.i, rylVar.n), new ryf(ryhVar, th), anjk.a);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aofe aofeVar = (aofe) obj;
        this.b.j.i(false);
        this.b.i(aots.STATE_COMPLETE);
        this.b.k(rwd.h(this.a));
    }
}
