package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afzk  reason: default package */
/* loaded from: classes2.dex */
public final class afzk implements agbi {
    final /* synthetic */ afzm a;

    public afzk(afzm afzmVar) {
        this.a = afzmVar;
    }

    @Override // defpackage.agbi
    public final void a() {
        agad agadVar = this.a.as;
        agadVar.e.b(false);
        cqhn cqhnVar = agadVar.a;
        cqkx.p(agadVar.e);
        agad agadVar2 = this.a.as;
        agadVar2.e.m(true);
        cqhn cqhnVar2 = agadVar2.a;
        cqkx.p(agadVar2.e);
        this.a.au.M();
        this.a.i(false);
    }

    @Override // defpackage.agbi
    public final void b() {
        agad agadVar = this.a.as;
        agadVar.e.b(true);
        cqhn cqhnVar = agadVar.a;
        cqkx.p(agadVar.e);
        agad agadVar2 = this.a.as;
        agadVar2.e.m(false);
        cqhn cqhnVar2 = agadVar2.a;
        cqkx.p(agadVar2.e);
        this.a.au.L();
        this.a.i(true);
        afzm afzmVar = this.a;
        if (afzmVar.av != null) {
            akyc e = akyt.e(this.a.av);
            e.b = 0;
            afzmVar.g.a().p(e);
        }
    }
}
