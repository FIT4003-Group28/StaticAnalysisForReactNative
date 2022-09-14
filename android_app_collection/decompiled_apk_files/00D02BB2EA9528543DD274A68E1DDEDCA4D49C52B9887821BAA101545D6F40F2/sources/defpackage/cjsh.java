package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjsh  reason: default package */
/* loaded from: classes.dex */
public abstract class cjsh implements Serializable {
    public static cjsh d(dbsg<cjrc> dbsgVar, dbsg<cjsg> dbsgVar2, dbsg<Integer> dbsgVar3) {
        return new cjrp(dbsgVar, dbsgVar2, dbsgVar3);
    }

    public static cjsh e(cjrc cjrcVar, int i, dbsg<Integer> dbsgVar) {
        return d(dbsg.i(cjrcVar), dbsg.i(cjsg.b(i)), dbsgVar);
    }

    public abstract dbsg<cjrc> a();

    public abstract dbsg<cjsg> b();

    public abstract dbsg<Integer> c();

    public final int f() {
        dbsk.l(b().a());
        return b().b().a();
    }

    public final boolean g() {
        dbsk.l(b().a());
        return f() == 0;
    }

    public final boolean h(String str) {
        dbsk.l(a().a());
        return a().equals(cjrc.a(str));
    }
}
