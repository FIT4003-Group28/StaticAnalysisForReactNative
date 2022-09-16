package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amah  reason: default package */
/* loaded from: classes.dex */
public final class amah implements amcm {
    final /* synthetic */ amaw a;

    public amah(amaw amawVar) {
        this.a = amawVar;
    }

    @Override // defpackage.amcm
    public final void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            for (amcn amcnVar : this.a.g.a()) {
                amcnVar.b(alyhVar, alygVar, alygVar2);
            }
            return;
        }
        throw null;
    }
}
