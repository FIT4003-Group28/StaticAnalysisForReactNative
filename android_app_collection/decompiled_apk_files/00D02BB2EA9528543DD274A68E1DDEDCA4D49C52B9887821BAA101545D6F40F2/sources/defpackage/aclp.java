package defpackage;
/* compiled from: PG */
/* renamed from: aclp  reason: default package */
/* loaded from: classes.dex */
public final class aclp {
    public static cqtd a(cqss cqssVar, cqss cqssVar2, cqtv cqtvVar, cqtv cqtvVar2) {
        cqnw.d(cqssVar);
        cqnw.d(cqssVar2);
        cqnw.d(cqtvVar);
        cqnw.d(cqtvVar2);
        cqnw.d(cqssVar);
        cqnw.d(cqssVar2);
        cqnw.d(cqtvVar);
        cqnw.d(cqtvVar2);
        return new acln(new Object[]{cqssVar, cqssVar2, cqtvVar, cqtvVar2}, cqssVar, cqtvVar2, cqtvVar, cqssVar2);
    }

    public static cqtd b(cqss cqssVar, cqss cqssVar2, cqtv cqtvVar, cqtv cqtvVar2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        cqnw.d(cqssVar);
        cqnw.d(cqssVar2);
        cqnw.d(cqtvVar);
        cqnw.d(cqtvVar2);
        cqtv[] cqtvVarArr = new cqtv[4];
        cqtvVarArr[0] = bool.booleanValue() ? cqtvVar2 : cqrp.d(dcyn.a);
        cqtvVarArr[1] = bool2.booleanValue() ? cqtvVar2 : cqrp.d(dcyn.a);
        cqtvVarArr[2] = bool3.booleanValue() ? cqtvVar2 : cqrp.d(dcyn.a);
        if (!bool4.booleanValue()) {
            cqtvVar2 = cqrp.d(dcyn.a);
        }
        cqtvVarArr[3] = cqtvVar2;
        return new aclo(new Object[]{cqssVar, cqssVar2, cqtvVar, cqtvVarArr}, cqssVar, cqtvVarArr, cqtvVar, cqssVar2);
    }
}
