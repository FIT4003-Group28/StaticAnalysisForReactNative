package defpackage;
/* compiled from: PG */
/* renamed from: abyt  reason: default package */
/* loaded from: classes2.dex */
public final class abyt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbsg<acej> a(dkeh dkehVar) {
        dbsg dbsgVar;
        if ((dkehVar.a & 2) != 0) {
            dwfl dwflVar = dkehVar.c;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            if ((dkehVar.a & 4) != 0) {
                dqlo dqloVar = dkehVar.d;
                if (dqloVar == null) {
                    dqloVar = dqlo.d;
                }
                dbsgVar = dbsg.i(dqloVar);
            } else {
                dbsgVar = dbpy.a;
            }
            return dbsg.i(acej.c(dwflVar, dbsgVar));
        }
        return dbpy.a;
    }
}
