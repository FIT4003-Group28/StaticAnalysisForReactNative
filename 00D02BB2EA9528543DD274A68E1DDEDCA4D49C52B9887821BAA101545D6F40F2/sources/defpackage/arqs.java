package defpackage;

import android.content.pm.ResolveInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arqs  reason: default package */
/* loaded from: classes2.dex */
public final class arqs implements dbty<aryb> {
    final /* synthetic */ arqu a;

    public arqs(arqu arquVar) {
        this.a = arquVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ aryb a() {
        arqu arquVar = this.a;
        if (!arquVar.s() || (!arquVar.o() && arquVar.i.a().isEmpty())) {
            this.a.f.h();
        } else {
            arqu arquVar2 = this.a;
            arxn<arxx> arxnVar = arquVar2.g;
            dccx F = dcdc.F();
            if (arquVar2.o()) {
                arwa arwaVar = arquVar2.h;
                dbsk.s(arwaVar);
                aryb arybVar = arquVar2.f;
                F.g(new arvz(arwaVar.a, arybVar, arybVar.i(), arwaVar.b, arwaVar.c));
            }
            dcpd<ResolveInfo> it = arquVar2.i.a().values().iterator();
            while (it.hasNext()) {
                ResolveInfo next = it.next();
                arvn arvnVar = arquVar2.e;
                aryb arybVar2 = arquVar2.f;
                cqkn<aryj> i = arybVar2.i();
                aruq a = arvnVar.a.a();
                arvn.a(a, 1);
                arxy a2 = arvnVar.b.a();
                arvn.a(a2, 2);
                arvn.a(arybVar2, 3);
                arvn.a(i, 4);
                arvn.a(next, 5);
                F.g(new arux(a, a2, arybVar2, i, next));
            }
            arxnVar.a(F.f(), new arqr(this));
        }
        return this.a.f;
    }
}
