package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfu  reason: default package */
/* loaded from: classes7.dex */
public final class sfu implements degu<dvwm> {
    final /* synthetic */ sfy a;

    public sfu(sfy sfyVar) {
        this.a = sfyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.E(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dvwm dvwmVar) {
        dvwm dvwmVar2 = dvwmVar;
        if (dvwmVar2 == null) {
            this.a.E(new NullPointerException());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dvwl dvwlVar : dvwmVar2.a) {
            dopk dopkVar = dvwlVar.c;
            if (dopkVar == null) {
                dopkVar = dopk.x;
            }
            arrayList.add(dopkVar);
        }
        this.a.D(arrayList, ckem.NEARBY_STATIONS_FETCH);
    }
}
