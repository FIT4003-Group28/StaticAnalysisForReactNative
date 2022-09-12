package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: oyf  reason: default package */
/* loaded from: classes7.dex */
public final class oyf {
    @dzsi
    public static jic a(@dzsi dtkq dtkqVar) {
        String str = null;
        if (dtkqVar == null) {
            return null;
        }
        if ((dtkqVar.a & 2) != 0) {
            str = dtkqVar.c;
        }
        int a = dtkp.a(dtkqVar.d);
        if (a == 0) {
            a = 1;
        }
        return new jic(str, jfv.c(a), oxa.f(dtkqVar), 250);
    }

    @dzsi
    public static cjtd b(@dzsi String str, String str2, @dzsi ddho ddhoVar, @dzsi dvnp dvnpVar, @dzsi decs decsVar) {
        if (str2 == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.g(str2);
        b.b = str;
        b.d = ddhoVar;
        b.f = dvnpVar;
        b.g = decsVar;
        return b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static cqss c(dtjf dtjfVar, Resources resources) {
        Integer b = dtjfVar == null ? null : owy.b(resources, dtjfVar);
        if (b != null) {
            return cqta.d(b.intValue());
        }
        return null;
    }
}
