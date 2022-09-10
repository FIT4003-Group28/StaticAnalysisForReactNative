package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aoyj  reason: default package */
/* loaded from: classes2.dex */
public abstract class aoyj implements Serializable {
    public static aoyj f() {
        return h(aoyi.BY_LAST_VISIT_TIME_DESCENDING, 3, dbpy.a, dbpy.a);
    }

    public static aoyj g(ilo iloVar) {
        return h(aoyi.BY_LAST_VISIT_TIME_DESCENDING, 3, dbpy.a, dbsg.i(iloVar));
    }

    public static aoyj h(aoyi aoyiVar, int i, dbsg<aoxp> dbsgVar, dbsg<ilo> dbsgVar2) {
        aoxg aoxgVar = new aoxg();
        aoxgVar.c(aoyiVar);
        aoxgVar.b = i;
        aoxgVar.b(dbsgVar);
        aoxgVar.a = dbsgVar2;
        return aoxgVar.a();
    }

    public abstract aoyi a();

    public abstract dbsg<aoxp> b();

    public abstract dbsg<ilo> c();

    public abstract aoyh d();

    public abstract int e();
}
