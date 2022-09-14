package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axnu  reason: default package */
/* loaded from: classes3.dex */
public final class axnu implements degu<dicu> {
    final /* synthetic */ axnw a;

    public axnu(axnw axnwVar) {
        this.a = axnwVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        deig<List<diyq>> deigVar = this.a.c;
        dbsk.s(deigVar);
        deigVar.k(th);
        this.a.c = null;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dicu dicuVar) {
        dicu dicuVar2 = dicuVar;
        axnw axnwVar = this.a;
        diyr diyrVar = dicuVar2.a;
        if (diyrVar == null) {
            diyrVar = diyr.d;
        }
        for (diyq diyqVar : diyrVar.b) {
            axnwVar.b.add(new axnv(diyqVar));
        }
        axnwVar.a = (diyrVar.a & 1) != 0 ? diyrVar.c : null;
        deig<List<diyq>> deigVar = this.a.c;
        dbsk.s(deigVar);
        diyr diyrVar2 = dicuVar2.a;
        if (diyrVar2 == null) {
            diyrVar2 = diyr.d;
        }
        deigVar.j(diyrVar2.b);
        this.a.c = null;
    }
}
