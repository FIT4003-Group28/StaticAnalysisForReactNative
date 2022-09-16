package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: dvs  reason: default package */
/* loaded from: classes6.dex */
public final class dvs implements daj {
    private final dua a;
    private final dvv b;
    private final dwc c;
    private final dwa d;
    private final dwi e;
    private final Activity f;
    private final czz g;

    /* JADX WARN: Multi-variable type inference failed */
    public dvs(dvv dvvVar, dwa dwaVar, dwc dwcVar, Activity activity, czz czzVar) {
        this.b = dvvVar;
        this.d = dwaVar;
        this.c = dwcVar;
        this.f = activity;
        this.g = czzVar;
        dbsk.l(true);
        this.a = ((dxj) czzVar).g;
        this.e = new dwi(czzVar);
    }

    @Override // defpackage.daj
    public final dan a() {
        return this.e;
    }

    @Override // defpackage.daj
    public final daf b(dbrn<akqq, akse> dbrnVar, cze czeVar) {
        dvv dvvVar = this.b;
        dua duaVar = this.a;
        czd czdVar = duc.b;
        czd czdVar2 = duc.c;
        dvh a = dvvVar.a.a();
        dvv.a(a, 1);
        dvv.a(duaVar, 2);
        dvv.a(dbrnVar, 3);
        dvv.a(czeVar, 4);
        dvv.a(czdVar, 5);
        dvv.a(czdVar2, 6);
        dvu dvuVar = new dvu(a, duaVar, dbrnVar, czeVar, czdVar, czdVar2);
        this.a.a(dvuVar);
        return dvuVar;
    }

    @Override // defpackage.daj
    public final dfen c(cze czeVar) {
        dwa dwaVar = this.d;
        dua duaVar = this.a;
        czd czdVar = duc.d;
        czd czdVar2 = duc.e;
        dvh a = dwaVar.a.a();
        dwa.a(a, 1);
        dwa.a(duaVar, 2);
        dwa.a(czeVar, 3);
        dwa.a(czdVar, 4);
        dwa.a(czdVar2, 5);
        dvz dvzVar = new dvz(a, duaVar, czeVar, czdVar, czdVar2);
        this.a.a(dvzVar);
        return dvzVar;
    }

    @Override // defpackage.daj
    public final dai d(cze czeVar) {
        dwc dwcVar = this.c;
        Activity activity = this.f;
        czz czzVar = this.g;
        dua duaVar = this.a;
        czd czdVar = duc.a;
        czd czdVar2 = duc.c;
        czd czdVar3 = duc.f;
        czw a = dwcVar.a.a();
        dwc.a(a, 1);
        dui a2 = dwcVar.b.a();
        dwc.a(a2, 2);
        dwg a3 = dwcVar.c.a();
        dwc.a(a3, 3);
        dwc.a(activity, 4);
        dwc.a(czzVar, 5);
        dwc.a(duaVar, 6);
        dwc.a(czeVar, 7);
        dwc.a(czdVar, 8);
        dwc.a(czdVar2, 9);
        dwc.a(czdVar3, 10);
        return new dwb(a, a2, a3, activity, czzVar, duaVar, czeVar, czdVar, czdVar2, czdVar3);
    }

    @Override // defpackage.daj
    public final dfer e(dfhj dfhjVar) {
        throw new UnsupportedOperationException("Not implemented for Sceneform");
    }

    @Override // defpackage.daj
    public final dfjb f(dfga dfgaVar) {
        throw new UnsupportedOperationException("Not implemented for Sceneform");
    }
}
