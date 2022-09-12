package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: rgw  reason: default package */
/* loaded from: classes7.dex */
public final class rgw {
    public static dbsg<rhj> a(String str, dnkh dnkhVar, dnkh dnkhVar2, Iterable<rhj> iterable) {
        dbsg dbsgVar = dbpy.a;
        Iterator<rhj> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rhj next = it.next();
            if (str.equals(next.b())) {
                dcdc z = dcbg.b(next.c()).s(rgu.a).z();
                if (dcft.r(z, dnkh.UNKNOWN_SEMANTIC_TYPE) != dnkhVar || dcft.t(z, dnkh.UNKNOWN_SEMANTIC_TYPE) != dnkhVar2) {
                    throw new rgs(3, "Trip has unexpected endpoints");
                }
                dbsgVar = dbsg.i(next);
            }
        }
        if (!dbsgVar.a()) {
            return dbpy.a;
        }
        rhj rhjVar = (rhj) dbsgVar.b();
        if (rhjVar.c().size() != 2) {
            String valueOf = String.valueOf(dnkhVar);
            String valueOf2 = String.valueOf(dnkhVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
            sb.append("Commute trip from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            sb.append(" does not have exactly 2 visits");
            throw new rgs(3, sb.toString());
        }
        return dbsg.i(rhjVar);
    }
}
