package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: byuh  reason: default package */
/* loaded from: classes4.dex */
public abstract class byuh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byug e() {
        return new bysr();
    }

    public static byuh f(axwq axwqVar) {
        byug e = e();
        for (azva azvaVar : (List) deha.s(axwqVar.m())) {
            akqq akqqVar = azvaVar.e;
            if (dndr.HOME == azvaVar.a) {
                bysr bysrVar = (bysr) e;
                bysrVar.a = dbsg.i(bkkc.c(azvaVar.c));
                if (akqqVar != null) {
                    bysrVar.c = dbsg.i(akqqVar);
                }
            }
            if (dndr.WORK == azvaVar.a) {
                bysr bysrVar2 = (bysr) e;
                bysrVar2.b = dbsg.i(bkkc.c(azvaVar.c));
                if (akqqVar != null) {
                    bysrVar2.d = dbsg.i(akqqVar);
                }
            }
        }
        return e.a();
    }

    public abstract dbsg<String> a();

    public abstract dbsg<String> b();

    public abstract dbsg<akqq> c();

    public abstract dbsg<akqq> d();
}
