package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cwkv  reason: default package */
/* loaded from: classes5.dex */
public final class cwkv implements csit {
    final /* synthetic */ Context a;

    public cwkv(Context context) {
        this.a = context;
    }

    @Override // defpackage.csit
    public final String a(csgc csgcVar) {
        return "ONEGOOGLE_MOBILE";
    }

    @Override // defpackage.csit
    public final dehn<dssj> b(csgc csgcVar, dehn<csfs> dehnVar) {
        dtgc bZ = dtgd.c.bZ();
        dtga bZ2 = dtgb.g.bZ();
        String packageName = this.a.getPackageName();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtgb dtgbVar = (dtgb) bZ2.b;
        packageName.getClass();
        dtgbVar.a |= 64;
        dtgbVar.f = packageName;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtgd dtgdVar = (dtgd) bZ.b;
        dtgb bK = bZ2.bK();
        bK.getClass();
        dtgdVar.b = bK;
        dtgdVar.a |= 1;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.csit
    public final dbsg c(csgc csgcVar) {
        return dbpy.a;
    }

    @Override // defpackage.csit
    public final dehn d(dehn dehnVar) {
        throw null;
    }

    @Override // defpackage.csit
    public final int e(csgc csgcVar) {
        return 1;
    }

    @Override // defpackage.csit
    public final dehn f() {
        return csis.b();
    }
}
