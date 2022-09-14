package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: diz  reason: default package */
/* loaded from: classes6.dex */
public final class diz {
    private static final czm a = diy.a;
    private final czw b;
    private final btvo c;
    private final dag d;
    private final dcvg e;
    private final czk f;

    public diz(dbsg<czw> dbsgVar, btvo btvoVar, dag dagVar, dcvg dcvgVar, czk czkVar) {
        this.c = btvoVar;
        this.d = dagVar;
        this.f = czkVar;
        this.e = dcvgVar;
        dbsk.a(dbsgVar.a());
        this.b = dbsgVar.b();
    }

    public final czk a() {
        return this.f;
    }

    public final dbsg<czm> b(@dzsi Location location) {
        dte dteVar = this.b.a().b;
        if (dteVar == null) {
            dteVar = dte.w;
        }
        if (!dteVar.i) {
            return dbsg.i(a);
        }
        if (location == null || !this.e.h(dcvs.b(location.getLatitude(), location.getLongitude()).k())) {
            return dbpy.a;
        }
        dhlz dhlzVar = this.c.getNavigationParametersProto().aJ;
        if (dhlzVar == null) {
            dhlzVar = dhlz.n;
        }
        if (dhlzVar.e) {
            return dbsg.i(this.d.a(location));
        }
        return dbsg.i(a);
    }
}
