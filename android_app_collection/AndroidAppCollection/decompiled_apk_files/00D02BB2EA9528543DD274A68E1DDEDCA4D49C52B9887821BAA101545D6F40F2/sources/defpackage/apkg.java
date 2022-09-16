package defpackage;

import android.app.Application;
import java.util.List;
/* compiled from: PG */
/* renamed from: apkg  reason: default package */
/* loaded from: classes2.dex */
public final class apkg implements apkf {
    private final Application a;
    private final axwq b;

    public apkg(Application application, axwq axwqVar) {
        this.a = application;
        this.b = axwqVar;
    }

    @dzsi
    private final String d(akqi akqiVar, akqq akqqVar, String str, boolean z, dbsg<dndj> dbsgVar) {
        dbsg<azva> l;
        boolean z2;
        dndr dndrVar;
        String str2;
        List<azvo> e = dcdc.e();
        if (akqi.d(akqiVar)) {
            l = this.b.k(akqiVar);
        } else {
            l = this.b.l(akqqVar);
        }
        azva f = l.f();
        if (f == null || (f.a != dndr.HOME && f.a != dndr.WORK)) {
            e = this.b.o(akqiVar);
        }
        String str3 = null;
        if (l.a()) {
            dndrVar = l.b().a;
            str2 = l.b().f;
            z2 = true;
        } else {
            z2 = false;
            dndrVar = null;
            str2 = null;
        }
        Application application = this.a;
        if (!z2) {
            if (dbsgVar.a()) {
                dndl dndlVar = dbsgVar.b().b;
                if (dndlVar == null) {
                    dndlVar = dndl.d;
                }
                dndrVar = dndr.b(dndlVar.b);
                if (dndrVar == null) {
                    dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
                }
            } else {
                dndrVar = null;
            }
        }
        if (!z2) {
            str2 = dbsgVar.a() ? dbsgVar.b().c : null;
        }
        if (z) {
            str3 = dbsj.f(str);
        }
        return dbsj.f(axxz.a(application, dndrVar, str2, e, str3));
    }

    @Override // defpackage.apkf
    @dzsi
    public final String a(akqi akqiVar, String str, dpum dpumVar) {
        return d(akqiVar, akqq.f(dpumVar), str, false, dbpy.a);
    }

    @Override // defpackage.apkf
    @dzsi
    public final String b(dvyw dvywVar, String str) {
        dbsg<dndj> dbsgVar;
        try {
            akqi b = akqi.b(dvywVar.g);
            dhjz dhjzVar = dvywVar.e;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqq j = akqq.j(dhjzVar);
            boolean z = akqi.d(b) && !dvywVar.an;
            if ((dvywVar.b & 4194304) != 0) {
                dndn dndnVar = dvywVar.ah;
                if (dndnVar == null) {
                    dndnVar = dndn.c;
                }
                dndj dndjVar = dndnVar.b;
                if (dndjVar == null) {
                    dndjVar = dndj.e;
                }
                dbsgVar = dbsg.i(dndjVar);
            } else {
                dbsgVar = dbpy.a;
            }
            return d(b, j, str, z, dbsgVar);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.apkf
    public final dbsg<dndr> c(dbsg<akqi> dbsgVar, dbsg<akqq> dbsgVar2) {
        dbsk.b(true, "Either featureId or latLng must be provided");
        dbsu dbsuVar = (dbsu) dbsgVar;
        if (akqi.d((akqi) dbsuVar.a)) {
            dbsg<azva> k = this.b.k((akqi) dbsuVar.a);
            if (k.a()) {
                return dbsg.i(k.b().a);
            }
        }
        dbsg<azva> l = this.b.l((akqq) ((dbsu) dbsgVar2).a);
        return l.a() ? dbsg.i(l.b().a) : dbpy.a;
    }
}
