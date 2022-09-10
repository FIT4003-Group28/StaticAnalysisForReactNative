package defpackage;
/* compiled from: PG */
/* renamed from: axia  reason: default package */
/* loaded from: classes3.dex */
final class axia implements degu<diak> {
    final /* synthetic */ deig a;

    public axia(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(diak diakVar) {
        dqam dqamVar = diakVar.f;
        if (dqamVar == null) {
            dqamVar = dqam.g;
        }
        dqal dqalVar = dqamVar.b == 1 ? (dqal) dqamVar.c : dqal.e;
        if ((dqalVar.a & 4) == 0) {
            this.a.cancel(true);
            return;
        }
        deig deigVar = this.a;
        dqaa dqaaVar = dqalVar.d;
        if (dqaaVar == null) {
            dqaaVar = dqaa.d;
        }
        deigVar.j(dqaaVar);
    }
}
