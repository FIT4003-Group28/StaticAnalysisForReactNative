package defpackage;
/* compiled from: PG */
/* renamed from: udf  reason: default package */
/* loaded from: classes7.dex */
final class udf implements brlm {
    final /* synthetic */ deig a;
    final /* synthetic */ udg b;

    public udf(udg udgVar, deig deigVar) {
        this.b = udgVar;
        this.a = deigVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        this.b.f.e(brlnVar.e);
        this.b.f.b(brlnVar, brlnVar.e.d);
        this.a.j(brlnVar);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        this.b.f.c(brlnVar);
        this.a.k(new btzz(btzy.f(bttqVar)));
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        this.a.k(new btzz(btzy.d));
    }
}
