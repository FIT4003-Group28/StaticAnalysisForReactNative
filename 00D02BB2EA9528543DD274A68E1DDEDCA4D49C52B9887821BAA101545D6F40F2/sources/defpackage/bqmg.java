package defpackage;
/* compiled from: PG */
/* renamed from: bqmg  reason: default package */
/* loaded from: classes4.dex */
final class bqmg implements bqlb {
    final /* synthetic */ akqi a;
    final /* synthetic */ bqmi b;
    final /* synthetic */ bqml c;

    public bqmg(bqml bqmlVar, akqi akqiVar, bqmi bqmiVar) {
        this.c = bqmlVar;
        this.a = akqiVar;
        this.b = bqmiVar;
    }

    @Override // defpackage.bqlb
    public final void d(bqlf bqlfVar) {
        this.c.b(this.a);
        this.b.b().d(bqlfVar);
    }

    @Override // defpackage.bqlb
    public final void e() {
        this.c.b(this.a);
        this.b.b().e();
    }
}
