package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: boyo  reason: default package */
/* loaded from: classes3.dex */
public final class boyo implements boyw {
    final /* synthetic */ boys a;

    public boyo(boys boysVar) {
        this.a = boysVar;
    }

    @Override // defpackage.boyw
    public final void a() {
        boys boysVar = this.a;
        if (!boysVar.aB) {
            boysVar.d.a();
            if (!boysVar.e.g.equals(bpuh.INITIAL) && boysVar.aC.isEmpty()) {
                dhjz dhjzVar = boysVar.ad;
                if (dhjzVar == null || boysVar.g == null) {
                    boysVar.c.h(bpuh.INITIAL);
                } else {
                    akqq j = akqq.j(dhjzVar);
                    dpsn dpsnVar = boysVar.g;
                    dbsk.s(dpsnVar);
                    boysVar.w(j, dbsg.i(dpsnVar), false);
                }
            }
            if (!boysVar.aC.isEmpty()) {
                boysVar.aR(boysVar.aC);
            }
            boysVar.aB = true;
        }
    }

    @Override // defpackage.boyw
    public final void b() {
        boys boysVar = this.a;
        boysVar.aJ();
        if (boysVar.aB) {
            boysVar.d.b();
            boysVar.d.c();
            boysVar.aB = false;
        }
    }
}
