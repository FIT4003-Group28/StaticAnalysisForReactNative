package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aywa  reason: default package */
/* loaded from: classes3.dex */
public final class aywa implements degu<baad> {
    final /* synthetic */ aywb a;

    public aywa(aywb aywbVar) {
        this.a = aywbVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(baad baadVar) {
        baad baadVar2 = baadVar;
        aywb aywbVar = this.a;
        if (!aywbVar.a.aZ) {
            return;
        }
        ayrr ayrrVar = aywbVar.q.a;
        if (ayrrVar.J() != null) {
            ayrrVar.Nw(baadVar2);
        }
        aywb aywbVar2 = this.a;
        if (aywbVar2.m) {
            return;
        }
        aywbVar2.a.g().f();
        ayfk ayfkVar = this.a.d;
        if (ayfkVar.j == null) {
            return;
        }
        dcpd<azxb> it = ayfkVar.d.c().iterator();
        while (it.hasNext()) {
            azxb next = it.next();
            baad baadVar3 = ayfkVar.j;
            dbsk.s(baadVar3);
            if (!baadVar3.h(next)) {
                ayfkVar.d.n(next);
            }
        }
    }
}
