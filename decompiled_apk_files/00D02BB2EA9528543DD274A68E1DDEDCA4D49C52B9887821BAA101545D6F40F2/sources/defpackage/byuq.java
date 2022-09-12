package defpackage;
/* compiled from: PG */
/* renamed from: byuq  reason: default package */
/* loaded from: classes4.dex */
final class byuq implements degu<dopk> {
    final /* synthetic */ deig a;
    final /* synthetic */ byur b;

    public byuq(byur byurVar, deig deigVar) {
        this.b = byurVar;
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        if (dopkVar2 != null) {
            this.a.j(dopkVar2);
            return;
        }
        this.b.a.a(174);
        a(new NullPointerException());
    }
}
