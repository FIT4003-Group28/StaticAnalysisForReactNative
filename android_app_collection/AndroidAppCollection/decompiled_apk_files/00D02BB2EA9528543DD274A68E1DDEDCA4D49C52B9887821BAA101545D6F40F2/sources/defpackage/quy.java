package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: quy  reason: default package */
/* loaded from: classes7.dex */
public abstract class quy implements Serializable {
    public static quy c(qjn qjnVar, domy domyVar) {
        return new qum(qjnVar, domyVar);
    }

    private static boolean f(@dzsi azva azvaVar, @dzsi azva azvaVar2) {
        if (dbsd.a(azvaVar, azvaVar2)) {
            return true;
        }
        return azvaVar != null && azvaVar2 != null && azvaVar.q() == azvaVar2.q() && dbsd.a(azvaVar.e, azvaVar2.e) && dbsd.a(azvaVar.c, azvaVar2.c);
    }

    @dzsi
    private static azva g(@dzsi azxa azxaVar) {
        decq decqVar = null;
        if (azxaVar == null) {
            return null;
        }
        dojz dojzVar = azxaVar.k().f;
        if (dojzVar == null) {
            dojzVar = dojz.c;
        }
        long j = dojzVar.b;
        dndr g = azxaVar.g();
        dndl dndlVar = azxaVar.k().b;
        if (dndlVar == null) {
            dndlVar = dndl.d;
        }
        Long valueOf = Long.valueOf(dndlVar.c);
        akqi b = azxaVar.b();
        String c = azxaVar.c();
        akqq d = azxaVar.d();
        String str = azxaVar.k().d;
        if ((azxaVar.k().a & 2) != 0) {
            decqVar = decq.a(azxaVar.k().c);
        }
        return new azva("", j, 0L, g, valueOf, b, c, d, str, decqVar);
    }

    public abstract qjn a();

    public abstract domy b();

    @dzsi
    public final azva d() {
        azva a = a().a();
        return a != null ? a : g(a().e());
    }

    @dzsi
    public final azva e() {
        azva b = a().b();
        return b != null ? b : g(a().f());
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof quy) {
            quy quyVar = (quy) obj;
            if (b() == quyVar.b() && f(d(), quyVar.d()) && f(e(), quyVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        azva d = d();
        azva e = e();
        Object[] objArr = new Object[5];
        objArr[0] = b();
        akqq akqqVar = null;
        objArr[1] = d != null ? Long.valueOf(d.q()) : null;
        objArr[2] = d != null ? d.e : null;
        objArr[3] = e != null ? Long.valueOf(e.q()) : null;
        if (e != null) {
            akqqVar = e.e;
        }
        objArr[4] = akqqVar;
        return Arrays.hashCode(objArr);
    }
}
