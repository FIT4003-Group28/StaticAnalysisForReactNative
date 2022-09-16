package defpackage;
/* compiled from: PG */
/* renamed from: dpy  reason: default package */
/* loaded from: classes6.dex */
public final class dpy implements degu<ilo> {
    final /* synthetic */ dehn a;
    final /* synthetic */ ilo b;
    final /* synthetic */ dqb c;

    public dpy(dqb dqbVar, dehn dehnVar, ilo iloVar) {
        this.c = dqbVar;
        this.a = dehnVar;
        this.b = iloVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dehn<ilo> dehnVar = this.a;
        dqb dqbVar = this.c;
        if (dehnVar == dqbVar.b) {
            dqbVar.b(this.b);
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(ilo iloVar) {
        ilo iloVar2 = iloVar;
        dehn<ilo> dehnVar = this.a;
        dqb dqbVar = this.c;
        if (dehnVar == dqbVar.b) {
            dqbVar.c = iloVar2;
            dqbVar.b(dqbVar.c);
        }
    }
}
