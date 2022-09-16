package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qoi  reason: default package */
/* loaded from: classes7.dex */
public final class qoi implements cqkn<wpr> {
    final /* synthetic */ qoj a;
    private final amte b;
    private final int c;

    public qoi(qoj qojVar, amte amteVar, int i) {
        this.a = qojVar;
        dbsk.s(amteVar);
        this.b = amteVar;
        this.c = i;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(wpr wprVar, View view) {
        qbt a = this.a.d.a();
        amte amteVar = this.b;
        int i = this.c;
        dwbc dwbcVar = amteVar.a.a;
        dwaa dwaaVar = dwbcVar.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        dwaz dwazVar = (dwaz) dwbc.g.ca(dwbcVar);
        dvzz ca = dwaa.g.ca(dwaaVar);
        dvzo ca2 = dvzu.F.ca(dvzuVar);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        ((dvzu) ca2.b).e = dvzu.ck();
        ca2.e(dvzuVar.e.get(i));
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dvzu dvzuVar2 = (dvzu) ca2.b;
        dvzuVar2.a &= -3;
        dvzuVar2.g = 0;
        dvzuVar2.v = dvzu.ck();
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dvzu dvzuVar3 = (dvzu) ca2.b;
        int i2 = dvzuVar3.a & (-16385);
        dvzuVar3.a = i2;
        dvzuVar3.x = 0;
        dvzuVar3.a = i2 & (-5);
        dvzuVar3.h = 0;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwaa dwaaVar2 = (dwaa) ca.b;
        dvzu bK = ca2.bK();
        bK.getClass();
        dwaaVar2.b = bK;
        dwaaVar2.a |= 1;
        if (dwazVar.c) {
            dwazVar.bF();
            dwazVar.c = false;
        }
        dwbc dwbcVar2 = (dwbc) dwazVar.b;
        dwaa bK2 = ca.bK();
        bK2.getClass();
        dwbcVar2.b = bK2;
        dwbcVar2.a |= 1;
        amtd amtdVar = new amtd(amteVar);
        amtdVar.a = new amsy((dwbc) dwazVar.bK());
        qcs v = qct.v(amtdVar.a());
        v.b(0);
        v.d(qbs.TRANSIT_TRIP_DETAILS);
        v.f();
        v.c();
        a.m(v.a(this.a.d.a().e()));
    }
}
